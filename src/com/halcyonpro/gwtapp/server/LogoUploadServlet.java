/*******************************************************************************
 * Copyright (c) 2015 Halcyon Technologies.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Affero GNU Public License
 *   which accompanies this distribution, and is available at
 *   https://en.wikipedia.org/wiki/Affero_General_Public_License
 *   
 *   Copyright:
 *       Halcyon Technologies llc
 *   
 *   This file is part of the Business Suite software of Halcyonpro.net.
 *   Copyright (C) 2012-2020 Halcyonpro.net
 *  
 *   The primary contact email is support@halcyonpro.net
 *  
 *   Version: AGPL
 *  
 *   Halcyon Technologies, Halcyon Information Systems, Halcyonpro along with their domain names,  
 *   etc and the names Acuity, Ingenuity, Derivo, Colander etc are copyright of
 *   Halcyon llc and usage of these without prior permission of the owner is strictly prohibited
 *    
 *  The contents of this file may be used under the terms of
 *   the Affero GNU General Public License Version (the "AGPL"),
 *   A copy of the AGPL v2.1 can be obtained from https://en.wikipedia.org/wiki/Affero_General_Public_License
 *   
 *   AGPL, in essence, means that this software requires a commercial license for use in or as a commercial application
 *******************************************************************************/
package com.halcyonpro.gwtapp.server;

import gwtupload.server.UploadAction;
import gwtupload.server.exceptions.UploadActionException;
import gwtupload.shared.UConsts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;


public class LogoUploadServlet extends UploadAction {

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
	  @Override
	  public String executeAction(HttpServletRequest request, List<FileItem> sessionFiles) throws UploadActionException {
	    String response = "";
	    for (FileItem item : sessionFiles) {
	      if (false == item.isFormField()) {
	        try {
	         	String fileName = item.getName();
	            String root = getServletContext().getRealPath("/");
//	            HttpSession session = request.getSession(true);
//	            File folder = new File(root+"/users");
//	            folder.mkdirs();
//	            int userId = (Integer) session.getAttribute("userId");
//                File userLogoFolder = new File(folder+"/"+userId+"/"+"logo");
	            File folder = new File(root+"/logo");
	            folder.mkdirs();
                File file = new File(folder, fileName);
                
                item.write(file);

	          receivedFiles.put(item.getFieldName(), file);
	          receivedContentTypes.put(item.getFieldName(), item.getContentType());
	          response += "File saved as " + file.getAbsolutePath();

	        } catch (Exception e) {
	          throw new UploadActionException(e);
	        }
	      }
	    }
	    
	    /// Remove files from session because we have a copy of them
	    removeSessionFileItems(request);
	    
	    /// Send your customized message to the client.
	    return response;
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