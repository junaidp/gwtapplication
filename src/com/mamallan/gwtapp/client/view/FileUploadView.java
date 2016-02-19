package com.mamallan.gwtapp.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.presenter.FileUploadPresenter.Display;

public class FileUploadView extends Composite implements Display {

	private static FileUploadViewUiBinder uiBinder = GWT
			.create(FileUploadViewUiBinder.class);

	interface FileUploadViewUiBinder extends UiBinder<Widget, FileUploadView> {
	}

	public FileUploadView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
