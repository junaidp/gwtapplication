package com.mamallan.gwtapp.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class DynamicBeanEditorEvent extends GwtEvent<DynamicBeanEditorEventHandler> {

	public static Type<DynamicBeanEditorEventHandler> TYPE = new Type<DynamicBeanEditorEventHandler>();

	public DynamicBeanEditorEvent(){

	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<DynamicBeanEditorEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(DynamicBeanEditorEventHandler handler) {
		handler.onDynamicBeanEditor(this);

	}
}


