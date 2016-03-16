package com.mamallan.gwtapp.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.presenter.BindingsPresenter.Display;

public class BindingsView extends Composite implements Display{

	private static BindingsViewUiBinder uiBinder = GWT
			.create(BindingsViewUiBinder.class);

	interface BindingsViewUiBinder extends UiBinder<Widget, BindingsView> {
	}
	
	@UiField
	Button btnAddBinding;
	

	public BindingsView() {
		initWidget(uiBinder.createAndBindUi(this));
	}


	public Button getBtnAddBinding() {
		return btnAddBinding;
	}


	public void setBtnAddBinding(Button btnAddBinding) {
		this.btnAddBinding = btnAddBinding;
	}

}
