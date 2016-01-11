package com.helloworld.server;

import gwtupload.server.UploadAction;
import gwtupload.server.exceptions.UploadActionException;
import gwtupload.shared.UConsts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.helloworld.client.view.ApplicationConstants;

public class ComponentJavaUploadServlet  extends UploadAction implements javax.servlet.Servlet {


	private static final long serialVersionUID = 1L;

	Hashtable<String, String> receivedContentTypes = new Hashtable<String, String>();
	/**
	 * Maintain a list with received files and their content types. 
	 */
	Hashtable<String, File> receivedFiles = new Hashtable<String, File>();

	/**
	 * Override executeAction to save the received files in a custom place
	 * and delete this items from session.  
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Go Get");
	}  	

	protected void doPost(HttpServletRequest request, HttpServletResponse resp)
			throws ServletException, IOException {
		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);

		try {
			List<FileItem> items = upload.parseRequest(request);
			String mypath = ApplicationConstants.UPLOADED_VIEWS_PACKAGE;
			String tmpValue = "";

			for (FileItem item : items) {
				if (!item.isFormField()) {
					int fInd = item.getName().indexOf(".");
					String fileExtension = item.getName().substring(fInd);
					int ind = tmpValue.lastIndexOf(".");
					String beanName = tmpValue.substring(ind+1);
					String fileName = ApplicationConstants.UPLOADED_VIEWS_NAME+fileExtension;
					File path = createFilePath(mypath);
					if (!path.exists()) {
						boolean status = path.mkdirs();
					}

					File file = new File(path + "/" + fileName);
					item.write(file);
					editFile(file, fileName, item.getName().substring(0, fInd));

					receivedFiles.put(item.getFieldName(), file);
					receivedContentTypes.put(item.getFieldName(), item.getContentType());
					PrintWriter responseHtml = resp.getWriter();
					responseHtml.write(fileName);
//					resp += "File saved as " + file.getAbsolutePath();
				}
			}

		} catch (Exception e) {
			throw new UploadActionException(e);
		}


	}


	private File createFilePath(String myPath) {

		String dir = System.getProperty("user.dir");
		int slashIndex = dir.lastIndexOf("\\");
		dir = dir.substring(0, slashIndex+1);
		String packageDir = myPath.replace(".","\\");
		dir =dir +"src\\"+ packageDir;
		File myPackage    = new File(dir);
		return myPackage;
	}

	/**
	 * Get the content of an uploaded file.
	 */
	@Override
	public void getUploadedFile(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String fieldName = request.getParameter(UConsts.PARAM_SHOW);
		File f = receivedFiles.get(fieldName);
		if (f != null) {
			response.setContentType(receivedContentTypes.get(fieldName));
			FileInputStream is = new FileInputStream(f);
			copyFromInputStreamToOutputStream(is, response.getOutputStream());
		} else {
			renderXmlResponse(request, response, XML_ERROR_ITEM_NOT_FOUND);
		}
	}

	/**
	 * Remove a file when the user sends a delete request.
	 */
	@Override
	public void removeItem(HttpServletRequest request, String fieldName)  throws UploadActionException {
		File file = receivedFiles.get(fieldName);
		receivedFiles.remove(fieldName);
		receivedContentTypes.remove(fieldName);
		if (file != null) {
			file.delete();
		}
	}
	
	public void editFile(File file1, String fileName, String beanName) throws IOException{
		try{
			 // Open the file that is the first
            // command line parameter
            FileInputStream fstream = new FileInputStream(file1.toString());
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            int fInd = fileName.indexOf(".");
            String className = fileName.substring(0, fInd); 
            StringBuilder fileContent = new StringBuilder();
            //Read File Line By Line
            while ((strLine = br.readLine()) != null) {
               
               
                if (strLine.length() > 0) {
                    if (strLine.contains(beanName)) {
                    	String newLine = strLine.replaceAll(beanName, className);
                    	fileContent.append(newLine);
                        fileContent.append("\n");
                    } 
                    else if(strLine.contains("package")){
                    	String newLine = "package "+ ApplicationConstants.UPLOADED_VIEWS_PACKAGE +";";
                    	fileContent.append(newLine);
                        fileContent.append("\n");
                    }
                   
                    else {
                        // update content as it is
                        fileContent.append(strLine);
                        fileContent.append("\n");
                    }
                }
            }
//            Object newObject = Class.forName("com.helloworld.server.FilesCreationHelper").newInstance();
            // Now fileContent will have updated content , which you can override into file
            FileWriter fstreamWrite = new FileWriter(file1.toString());
            BufferedWriter out = new BufferedWriter(fstreamWrite);
            out.write(fileContent.toString());
            out.close();
            //Close the input stream
//            in.close();
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
	}
}