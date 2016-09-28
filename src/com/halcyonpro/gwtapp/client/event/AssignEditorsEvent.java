/*******************************************************************************
 * Copyright (c) 2015 Halcyon Technologies.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Affero GNU Public License
 *   which accompanies this distribution, and is available at
 *   https://en.wikipedia.org/wiki/Affero_General_Public_License
 *   
 *   Copyright:
 *       Halcyon Technologies llc
 *   
 *   This file is part of the Business Suite software of Halcyonpro.net.
 *   Copyright (C) 2012-2020 Halcyonpro.net
 *  
 *   The primary contact email is support@halcyonpro.net
 *  
 *   Version: AGPL
 *  
 *   Halcyon Technologies, Halcyon Information Systems, Halcyonpro along with their domain names,  
 *   etc and the names Acuity, Ingenuity, Derivo, Colander etc are copyright of
 *   Halcyon llc and usage of these without prior permission of the owner is strictly prohibited
 *    
 *  The contents of this file may be used under the terms of
 *   the Affero GNU General Public License Version (the "AGPL"),
 *   A copy of the AGPL v2.1 can be obtained from https://en.wikipedia.org/wiki/Affero_General_Public_License
 *   
 *   AGPL, in essence, means that this software requires a commercial license for use in or as a commercial application
 *******************************************************************************/
package com.halcyonpro.gwtapp.client.event;

import com.google.gwt.event.shared.GwtEvent;

		public class AssignEditorsEvent extends GwtEvent<AssignEditorsEventHandler> {
			
		public static Type<AssignEditorsEventHandler> TYPE = new Type<AssignEditorsEventHandler>();
		private String json;
		private String beanType;
		
		public AssignEditorsEvent(String json, String beanType){
			this.beanType = beanType;
			this.json = json;
		}

		@Override
		public com.google.gwt.event.shared.GwtEvent.Type<AssignEditorsEventHandler> getAssociatedType() {
		    return TYPE;
		}

		@Override
		protected void dispatch(AssignEditorsEventHandler handler) {
		    handler.onAssignEditors(this);
			
		}

		public String getJson() {
			return json;
		}

		public void setJson(String json) {
			this.json = json;
		}

		public String getBeanType() {
			return beanType;
		}

		public void setBeanType(String beanType) {
			this.beanType = beanType;
		}


	}


