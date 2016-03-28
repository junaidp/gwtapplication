package com.mamallan.gwtapp.server;

import gwtupload.server.UploadAction;
import gwtupload.server.exceptions.UploadActionException;
import gwtupload.shared.UConsts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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

import com.mamallan.gwtapp.client.view.ApplicationConstants;

public class ComponentXmlUploadServlet  extends UploadAction implements javax.servlet.Servlet {




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
			String reqType = "";
			String className = ApplicationConstants.UPLOADED_VIEWS_NAME;
//			for (FileItem item : items) {
//				if (item.isFormField()) {
//					String name = item.getFieldName();
//					tmpValue = item.getString();
//					if (name.equalsIgnoreCase("beanName")){
//						int ind = tmpValue.lastIndexOf(".");
//						mypath= tmpValue.substring(0, ind);
//					}
//				}
//			}
			for (FileItem item : items) {
				if (item.isFormField()) {
					
					reqType = item.getFieldName();
				
				}
			}

			for (FileItem item : items) {
				if (!item.isFormField()) {
					int fInd = item.getName().indexOf(".");
					String fileExtension = item.getName().substring(fInd);
					int ind = tmpValue.lastIndexOf(".");
//					String beanName = tmpValue.substring(ind+1);
//					String fileName = beanName+fileExtension;
					
					String fileName = item.getName();
					if(! ApplicationConstants.BEAN_CREATION_FOR_BINDING.equals(reqType)){
						 fileName = className+fileExtension;
					}
					
					
					File path = createFilePath(mypath);
					if (!path.exists()) {
						boolean status = path.mkdirs();
					}

					File file = new File(path + "/" + fileName);
					item.write(file);

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
}