package com.helloworld.client.event;

import com.google.gwt.event.shared.GwtEvent;

		public class AssignEditorsEvent extends GwtEvent<AssignEditorsEventHandler> {
			
		public static Type<AssignEditorsEventHandler> TYPE = new Type<AssignEditorsEventHandler>();
		private String json;
		
		public AssignEditorsEvent(String json){
			this.json = json;
		}

		@Override
		public com.google.gwt.event.shared.GwtEvent.Type<AssignEditorsEventHandler> getAssociatedType() {
		    return TYPE;
		}

		@Override
		protected void dispatch(AssignEditorsEventHandler handler) {
		    handler.onAssignEditors(this);
			
		}

		public String getJson() {
			return json;
		}

		public void setJson(String json) {
			this.json = json;
		}


	}


