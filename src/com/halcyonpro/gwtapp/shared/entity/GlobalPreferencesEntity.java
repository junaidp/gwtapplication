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
package com.halcyonpro.gwtapp.shared.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="globalprefrences")

	@Entity
	public class GlobalPreferencesEntity   implements Serializable {

		private static final long serialVersionUID = 1L;

		@Id 
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="globalPrefrencesId")
		private int globalPrefrencesId;
		
				
		@JoinColumn(name="myAccountPreferencesId")
		@ManyToOne( fetch = FetchType.LAZY )
		private MyAccountPreferencesEntity myAccountPreferencesId;

		public int getGlobalPrefrencesId() {
			return globalPrefrencesId;
		}

		public void setGlobalPrefrencesId(int globalPrefrencesId) {
			this.globalPrefrencesId = globalPrefrencesId;
		}

		public MyAccountPreferencesEntity getMyAccountPreferencesId() {
			return myAccountPreferencesId;
		}

		public void setMyAccountPreferencesId(
				MyAccountPreferencesEntity myAccountPreferencesId) {
			this.myAccountPreferencesId = myAccountPreferencesId;
		}

	
		
}
