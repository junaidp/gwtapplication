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
package com.halcyonpro.gwtapp.client.view.widgets;

import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;


public class JavaComponentAttachment extends VerticalPanel {
	private FormPanel form;
	private TextBox txt = new TextBox();
	private FileUpload defaultUploader;

	public JavaComponentAttachment(){
	
  }
	
	public void setData(String reqType){
		
		VerticalPanel panel = new VerticalPanel();
		defaultUploader = new FileUpload();
		defaultUploader.setName("uploadFormElement");
		panel.add(defaultUploader);
		HorizontalPanel hpnl = new HorizontalPanel();
		hpnl.add(panel);
		txt.setName(reqType);
		txt.setVisible(false);
		hpnl.add(txt);
		form = new FormPanel();
		form.setWidget(hpnl);
		form.setEncoding(FormPanel.ENCODING_MULTIPART);
		form.setMethod(FormPanel.METHOD_POST);
//		form.setAction("xmlUploadServlet");
//		form.setAction(GWT.getModuleBaseURL()+"javaUpload");
		form.setAction("javaUpload");
		hpnl.setSpacing(10);
		add(form);
	}

	public void setBean(String path) {
		
		txt.setText(path);
		txt.setValue(path);
	}

//	  // Load the image in the document and in the case of success attach it to the viewer
//	  private IUploader.OnFinishUploaderHandler onFinishUploaderHandler = new IUploader.OnFinishUploaderHandler() {
//	    public void onFinish(IUploader uploader) {
//	      if (uploader.getStatus() == Status.SUCCESS) {
//
//	        new PreloadedImage(uploader.fileUrl(), showImage);
//	        UploadedInfo info = uploader.getServerInfo();
//	        
//	        
//	      }
//	    }
//	  };
//	  
//	  private OnLoadPreloadedImageHandler showImage = new OnLoadPreloadedImageHandler() {
//		    public void onLoad(PreloadedImage image) {
//		      image.setWidth("75px");
//		      add(image);
//		    }
//		  };
	
	public FormPanel getForm() {
		return form;
	}

	public void setForm(FormPanel form) {
		this.form = form;
	}

	public FileUpload getDefaultUploader() {
		return defaultUploader;
	}
	
}
