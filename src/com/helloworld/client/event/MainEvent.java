package com.helloworld.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.helloworld.shared.entity.UserEntity;

		public class MainEvent extends GwtEvent<MainEventHandler> {
			
		public static Type<MainEventHandler> TYPE = new Type<MainEventHandler>();
		private UserEntity user;

		public MainEvent(UserEntity user) {
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

		public UserEntity getUser() {
			return user;
		}

		public void setUser(UserEntity user) {
			this.user = user;
		}

	}


