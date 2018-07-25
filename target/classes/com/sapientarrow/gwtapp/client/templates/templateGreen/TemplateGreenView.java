package com.sapientarrow.gwtapp.client.templates.templateGreen;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.sapientarrow.gwtapp.client.templates.templateGreen.TemplateGreenPresenter.Display;

public class TemplateGreenView extends Composite implements Display {

    private static TemplateGreenViewUiBinder uiBinder = GWT.create(TemplateGreenViewUiBinder.class);

    interface TemplateGreenViewUiBinder extends UiBinder<Widget, TemplateGreenView> {
    }

    public TemplateGreenView() {
	initWidget(uiBinder.createAndBindUi(this));
    }

    public TemplateGreenView(String firstName) {
	initWidget(uiBinder.createAndBindUi(this));

    }

}
