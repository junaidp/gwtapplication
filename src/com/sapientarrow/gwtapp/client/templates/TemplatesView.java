package com.sapientarrow.gwtapp.client.templates;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.sapientarrow.gwtapp.client.templates.TemplatesPresenter.Display;

public class TemplatesView extends Composite implements Display {

    private static TemplatesViewUiBinder uiBinder = GWT.create(TemplatesViewUiBinder.class);

    interface TemplatesViewUiBinder extends UiBinder<Widget, TemplatesView> {
    }

    @UiField
    Button btnSelect;

    @UiField
    Button btnSelectMetro;

    public TemplatesView() {
	initWidget(uiBinder.createAndBindUi(this));
    }

    public TemplatesView(String firstName) {
	initWidget(uiBinder.createAndBindUi(this));

    }

    public Button getBtnSelect() {
	return btnSelect;
    }

    public Button getBtnSelectMetro() {
	return btnSelectMetro;
    }

}
