package com.helloworld.client.view;

import gwtupload.client.IUploader;
import gwtupload.client.IUploader.UploadedInfo;
import gwtupload.client.MultiUploader;
import gwtupload.client.PreloadedImage;
import gwtupload.client.PreloadedImage.OnLoadPreloadedImageHandler;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import gwtupload.client.IUploadStatus.Status;


public class Attachment extends VerticalPanel {
	
	FormPanel form;

	public Attachment(){

//		form = new FormPanel();
//		form.setAction(GWT.getModuleBaseURL()+"upload");
//		form.setEncoding(FormPanel.ENCODING_MULTIPART);
//		form.setMethod(FormPanel.METHOD_POST);
	
		// Create a panel to hold all of the form widgets.
		VerticalPanel panel = new VerticalPanel();
//		form.setWidget(panel);

		// Create a TextBox, giving it a name so that it will be submitted.
		
		// Create a FileUpload widget.
//		FileUpload upload = new FileUpload();
		MultiUploader defaultUploader = new MultiUploader();
		
//		upload.setName("uploadFormElement");
		
		
		
		
		
		
		
		
		
		
		
		//////////////////////////////////////////
		
		
		
		
		
		panel.add(defaultUploader);

		// Add a 'submit' button.
		panel.add(new Button("Submit", new ClickHandler() {
			public void onClick(ClickEvent event) {
				form.submit();
			}
		}));
		HorizontalPanel hpnl = new HorizontalPanel();
//		hpnl.add(form);
		hpnl.add(panel);
		hpnl.setSpacing(10);
		add(hpnl);
	
		////////////////////////////////
		 defaultUploader.addOnFinishUploadHandler(onFinishUploaderHandler);
	  }

	  // Load the image in the document and in the case of success attach it to the viewer
	  private IUploader.OnFinishUploaderHandler onFinishUploaderHandler = new IUploader.OnFinishUploaderHandler() {
	    public void onFinish(IUploader uploader) {
	      if (uploader.getStatus() == Status.SUCCESS) {

	        new PreloadedImage(uploader.fileUrl(), showImage);
	        
	        // The server sends useful information to the client by default
	        UploadedInfo info = uploader.getServerInfo();
	        System.out.println("File name " + info.name);
	        System.out.println("File content-type " + info.ctype);
	        System.out.println("File size " + info.size);

	        // You can send any customized message and parse it 
	        System.out.println("Server message " + info.message);
	      }
	    }
	  };
	  
	  private OnLoadPreloadedImageHandler showImage = new OnLoadPreloadedImageHandler() {
		    public void onLoad(PreloadedImage image) {
		      image.setWidth("75px");
		      add(image);
		    }
		  };
	
	public FormPanel getForm() {
		return form;
	}

	public void setForm(FormPanel form) {
		this.form = form;
	}
}
