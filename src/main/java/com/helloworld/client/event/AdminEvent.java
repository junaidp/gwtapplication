package com.helloworld.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.VerticalPanel;

		public class AdminEvent extends GwtEvent<AdminEventHandler> {
			
		public static Type<AdminEventHandler> TYPE = new Type<AdminEventHandler>();
		
		
		
		public AdminEvent(){
			
		}

		@Override
		public com.google.gwt.event.shared.GwtEvent.Type<AdminEventHandler> getAssociatedType() {
		    return TYPE;
		}

		@Override
		protected void dispatch(AdminEventHandler handler) {
		    handler.onAdmin(this);
			
		}


	}


