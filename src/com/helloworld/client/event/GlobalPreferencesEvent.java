package com.helloworld.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.helloworld.shared.entity.UserEntity;

		public class GlobalPreferencesEvent extends GwtEvent<GlobalPreferencesEventHandler> {
			
		public static Type<GlobalPreferencesEventHandler> TYPE = new Type<GlobalPreferencesEventHandler>();
		
		public GlobalPreferencesEvent() {
			
		}

		@Override
		public com.google.gwt.event.shared.GwtEvent.Type<GlobalPreferencesEventHandler> getAssociatedType() {
		    return TYPE;
		}

		@Override
		protected void dispatch(GlobalPreferencesEventHandler handler) {
		    handler.onGlobalPreferences(this);
			
		}
		
	

	}


