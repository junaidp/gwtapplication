package com.helloworld.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.helloworld.shared.entity.UserEntity;

		public class ViewPlanEvent extends GwtEvent<ViewPlanEventHandler> {
			
		public static Type<ViewPlanEventHandler> TYPE = new Type<ViewPlanEventHandler>();
		private UserEntity user;
		

		public ViewPlanEvent(UserEntity user) {
			this.user = user;
		
		}

		@Override
		public com.google.gwt.event.shared.GwtEvent.Type<ViewPlanEventHandler> getAssociatedType() {
		    return TYPE;
		}

		@Override
		protected void dispatch(ViewPlanEventHandler handler) {
		    handler.onViewPlan(this);
			
		}

		public UserEntity getUser() {
			return user;
		}

		public void setUser(UserEntity user) {
			this.user = user;
		}

	
	}


