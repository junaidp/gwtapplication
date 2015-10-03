package com.helloworld.client.event;

import com.google.gwt.event.shared.GwtEvent;

		public class MainEvent extends GwtEvent<MainEventHandler> {
			
		public static Type<MainEventHandler> TYPE = new Type<MainEventHandler>();

		@Override
		public com.google.gwt.event.shared.GwtEvent.Type<MainEventHandler> getAssociatedType() {
		    return TYPE;
		}

		@Override
		protected void dispatch(MainEventHandler handler) {
		    handler.onMain(this);
			
		}

	}


