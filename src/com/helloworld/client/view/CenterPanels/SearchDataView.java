package com.helloworld.client.view.CenterPanels;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.SearchDataPresenter.Display;

public class SearchDataView extends Composite implements Display {

	private static SearchDataViewUiBinder uiBinder = GWT
			.create(SearchDataViewUiBinder.class);

	interface SearchDataViewUiBinder extends UiBinder<Widget, SearchDataView> {
	}
	
	@UiField
	Label btnBack;
	
	public Label getBtnBack() {
		return btnBack;
	}

	public SearchDataView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
