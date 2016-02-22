package com.helloworld.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface AppBundle extends ClientBundle {

    @Source("intelligence.png")
    ImageResource myImage();

    public static final AppBundle INSTANCE = GWT.create(AppBundle.class);

}
