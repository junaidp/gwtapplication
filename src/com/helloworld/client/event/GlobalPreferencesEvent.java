package com.helloworld.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.helloworld.shared.entity.User;

		public class GlobalPreferencesEvent extends GwtEvent<GlobalPreferencesEventHandler> {
			
		public static Type<GlobalPreferencesEventHandler> TYPE = new Type<GlobalPreferencesEventHandler>();
		User user ;
		
		public GlobalPreferencesEvent(User loggedInUser) {
			this.user = loggedInUser;
		}

		@Override
		public com.google.gwt.event.shared.GwtEvent.Type<GlobalPreferencesEventHandler> getAssociatedType() {
		    return TYPE;
		}

		@Override
		protected void dispatch(GlobalPreferencesEventHandler handler) {
		    handler.onGlobalPreferences(this);
			
		}
		
		public User getUser() {
			return user;
		}

	}


