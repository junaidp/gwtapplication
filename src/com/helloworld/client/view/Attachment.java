package com.helloworld.client.view;

import java.util.ArrayList;

import gwtupload.client.IUploader;
import gwtupload.client.IUploader.UploadedInfo;
import gwtupload.client.MultiUploader;
import gwtupload.client.PreloadedImage;
import gwtupload.client.PreloadedImage.OnLoadPreloadedImageHandler;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.helloworld.client.HelloService;
import com.helloworld.client.HelloServiceAsync;

import gwtupload.client.IUploadStatus.Status;


public class Attachment extends VerticalPanel {
	VerticalPanel vpnlFileNames = new VerticalPanel();
	FormPanel form;

	public Attachment(){

		VerticalPanel panel = new VerticalPanel();
		MultiUploader defaultUploader = new MultiUploader();
		panel.add(defaultUploader);
		// Add a 'submit' button.
		HorizontalPanel hpnl = new HorizontalPanel();
		hpnl.add(panel);
		hpnl.setSpacing(10);
		add(hpnl);
		vpnlFileNames.clear();
		displayUploadedFiles();
		defaultUploader.addOnFinishUploadHandler(onFinishUploaderHandler);
	  }

	  // Load the image in the document and in the case of success attach it to the viewer
	  private IUploader.OnFinishUploaderHandler onFinishUploaderHandler = new IUploader.OnFinishUploaderHandler() {
	    public void onFinish(IUploader uploader) {
	      if (uploader.getStatus() == Status.SUCCESS) {

	        new PreloadedImage(uploader.fileUrl(), showImage);
	        UploadedInfo info = uploader.getServerInfo();
	        System.out.println("File name " + info.name);
	        System.out.println("File content-type " + info.ctype);
	        System.out.println("File size " + info.size);
	        System.out.println("Server message " + info.message);
	        vpnlFileNames.clear();
	        displayUploadedFiles();
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
	
	public void displayUploadedFiles(){
		HelloServiceAsync rpcService = GWT.create(HelloService.class);
		rpcService.readUploadedFiles(new AsyncCallback<ArrayList<String>>() {
			
			@Override
			public void onSuccess(ArrayList<String> result) {
				Label lblFile = new Label("Already Uploaded files");
				lblFile.setStyleName("blue");
				vpnlFileNames.add(lblFile);
				for(int i=0; i< result.size(); i++){
					Label lbl = new Label();
					lbl.setText(result.get(i));
					vpnlFileNames.add(lbl);
				}
				
				add(vpnlFileNames);
			}
			
			@Override
			public void onFailure(Throwable caught) {
				Window.alert("reading uploaded files Failed:"+ caught.getLocalizedMessage());
			}
		});
	}
}
