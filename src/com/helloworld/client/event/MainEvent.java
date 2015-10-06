package com.helloworld.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.helloworld.shared.entity.User;

		public class MainEvent extends GwtEvent<MainEventHandler> {
			
		public static Type<MainEventHandler> TYPE = new Type<MainEventHandler>();
		private User user;

		public MainEvent(User user) {
			this.user = user;
		}

		@Override
		public com.google.gwt.event.shared.GwtEvent.Type<MainEventHandler> getAssociatedType() {
		    return TYPE;
		}

		@Override
		protected void dispatch(MainEventHandler handler) {
		    handler.onMain(this);
			
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

	}


