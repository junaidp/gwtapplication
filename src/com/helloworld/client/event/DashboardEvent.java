package com.helloworld.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.VerticalPanel;

		public class DashboardEvent extends GwtEvent<DashboardEventHandler> {
			
		public static Type<DashboardEventHandler> TYPE = new Type<DashboardEventHandler>();
		
		VerticalPanel center;
		
		public DashboardEvent(VerticalPanel center){
			this.center = center;
		}

		@Override
		public com.google.gwt.event.shared.GwtEvent.Type<DashboardEventHandler> getAssociatedType() {
		    return TYPE;
		}

		@Override
		protected void dispatch(DashboardEventHandler handler) {
		    handler.onDashboard(this);
			
		}

		public VerticalPanel getCenter() {
			return center;
		}

		public void setCenter(VerticalPanel center) {
			this.center = center;
		}

	}


