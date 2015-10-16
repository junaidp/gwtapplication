package com.helloworld.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.helloworld.shared.entity.UserEntity;

		public class GlobalPreferencesEvent extends GwtEvent<GlobalPreferencesEventHandler> {
			
		public static Type<GlobalPreferencesEventHandler> TYPE = new Type<GlobalPreferencesEventHandler>();
		UserEntity user ;
		
		public GlobalPreferencesEvent(UserEntity loggedInUser) {
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
		
		public UserEntity getUser() {
			return user;
		}

	}


