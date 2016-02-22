package com.mamallan.gwtapp.client.view.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;


public class XmlComponentAttachment extends VerticalPanel {
	private FormPanel form;
	private TextBox txt = new TextBox();
	private FileUpload defaultUploader;

	public XmlComponentAttachment(){
		
		VerticalPanel panel = new VerticalPanel();
		defaultUploader = new FileUpload();
		defaultUploader.setName("uploadFormElement");
		panel.add(defaultUploader);
		HorizontalPanel hpnl = new HorizontalPanel();
		hpnl.add(panel);
		txt.setName("beanName");
		txt.setVisible(false);
		hpnl.add(txt);
		form = new FormPanel();
		form.setWidget(hpnl);
		form.setEncoding(FormPanel.ENCODING_MULTIPART);
		form.setMethod(FormPanel.METHOD_POST);
//		form.setAction("xmlUploadServlet");
		form.setAction(GWT.getModuleBaseURL()+"xmlUpload");
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
