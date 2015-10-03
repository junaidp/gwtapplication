package com.helloworld.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.VerticalPanel;

		public class SearchDataEvent extends GwtEvent<SearchDataEventHandler> {
			
		public static Type<SearchDataEventHandler> TYPE = new Type<SearchDataEventHandler>();
		
		VerticalPanel center;
		
		public SearchDataEvent(VerticalPanel center){
			this.center = center;
		}

		@Override
		public com.google.gwt.event.shared.GwtEvent.Type<SearchDataEventHandler> getAssociatedType() {
		    return TYPE;
		}

		@Override
		protected void dispatch(SearchDataEventHandler handler) {
		    handler.onSearchData(this);
			
		}

		public VerticalPanel getCenter() {
			return center;
		}

		public void setCenter(VerticalPanel center) {
			this.center = center;
		}

	}


