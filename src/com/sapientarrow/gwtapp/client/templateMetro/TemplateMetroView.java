package com.sapientarrow.gwtapp.client.templateMetro;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.sapientarrow.gwtapp.client.templateMetro.TemplateMetroPresenter.Display;

public class TemplateMetroView extends Composite implements Display {

    private static TemplateMetroViewUiBinder uiBinder = GWT.create(TemplateMetroViewUiBinder.class);

    interface TemplateMetroViewUiBinder extends UiBinder<Widget, TemplateMetroView> {
    }

    public TemplateMetroView() {
	initWidget(uiBinder.createAndBindUi(this));
    }

    public TemplateMetroView(String firstName) {
	initWidget(uiBinder.createAndBindUi(this));

    }

}
