package com.mamallan.gwtapp.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.VerticalPanel;

		public class IntelligencePackEvent extends GwtEvent<IntelligencePackEventHandler> {
			
		public static Type<IntelligencePackEventHandler> TYPE = new Type<IntelligencePackEventHandler>();
		
		VerticalPanel center;
		
		public IntelligencePackEvent(VerticalPanel center){
			this.center = center;
		}

		@Override
		public com.google.gwt.event.shared.GwtEvent.Type<IntelligencePackEventHandler> getAssociatedType() {
		    return TYPE;
		}

		@Override
		protected void dispatch(IntelligencePackEventHandler handler) {
		    handler.onIntelligencePack(this);
			
		}

		public VerticalPanel getCenter() {
			return center;
		}

		public void setCenter(VerticalPanel center) {
			this.center = center;
		}

	}


