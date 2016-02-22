package com.mamallan.gwtapp.client.view.CenterPanels;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.presenter.SearchDataPresenter.Display;

public class SearchDataView extends Composite implements Display {

	private static SearchDataViewUiBinder uiBinder = GWT
			.create(SearchDataViewUiBinder.class);

	interface SearchDataViewUiBinder extends UiBinder<Widget, SearchDataView> {
	}
	
	public SearchDataView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
