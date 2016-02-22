package com.helloworld.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.VerticalPanel;

		public class DashboardAccordionEvent extends GwtEvent<DashboardAccordionEventHandler> {
			
		public static Type<DashboardAccordionEventHandler> TYPE = new Type<DashboardAccordionEventHandler>();
		
		VerticalPanel center;
		
		public DashboardAccordionEvent(VerticalPanel center){
			this.center = center;
		}

		@Override
		public com.google.gwt.event.shared.GwtEvent.Type<DashboardAccordionEventHandler> getAssociatedType() {
		    return TYPE;
		}

		@Override
		protected void dispatch(DashboardAccordionEventHandler handler) {
		    handler.onDashboardAccordion(this);
			
		}

		public VerticalPanel getCenter() {
			return center;
		}

		public void setCenter(VerticalPanel center) {
			this.center = center;
		}

	}


