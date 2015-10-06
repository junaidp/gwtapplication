package com.helloworld.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.helloworld.shared.entity.User;

		public class EditUserEvent extends GwtEvent<EditUserEventHandler> {
			
		public static Type<EditUserEventHandler> TYPE = new Type<EditUserEventHandler>();
		User user ;
		
		public EditUserEvent(User loggedInUser) {
			this.user = loggedInUser;
		}

		@Override
		public com.google.gwt.event.shared.GwtEvent.Type<EditUserEventHandler> getAssociatedType() {
		    return TYPE;
		}

		@Override
		protected void dispatch(EditUserEventHandler handler) {
		    handler.onEditUser(this);
			
		}
		
		public User getUser() {
			return user;
		}

	}


