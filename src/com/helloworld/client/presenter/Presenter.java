package com.helloworld.client.presenter;

import com.google.gwt.user.client.ui.HasWidgets;

public abstract interface Presenter {
	public abstract void go(final HasWidgets container);
	public void setHandlers();
}
