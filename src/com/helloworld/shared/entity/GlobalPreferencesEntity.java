package com.helloworld.shared.entity;

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


	@Entity

	@Table(name="globalprefrences")
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
