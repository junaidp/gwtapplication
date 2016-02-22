package com.mamallan.gwtapp.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class JavaBeanEditorEvent extends GwtEvent<JavaBeanEditorEventHandler> {

	public static Type<JavaBeanEditorEventHandler> TYPE = new Type<JavaBeanEditorEventHandler>();

	public JavaBeanEditorEvent(){

	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<JavaBeanEditorEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(JavaBeanEditorEventHandler handler) {
		handler.onJavaBeanEditor(this);

	}
}


