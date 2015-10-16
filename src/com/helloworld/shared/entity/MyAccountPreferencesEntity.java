package com.helloworld.shared.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity

	@Table(name="myaccountpreferences")
	public class MyAccountPreferencesEntity   implements Serializable {

		private static final long serialVersionUID = 1L;

		@Id 
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="myAccountPreferencesId")
		private int myAccountPreferencesId;
		
		@Column(name="showPlanType")
		private boolean showPlanType;
		
		@Column(name="showPaymentDetails")
		private boolean showPaymentDetails;

		public int getMyAccountPreferencesId() {
			return myAccountPreferencesId;
		}

		public void setMyAccountPreferencesId(int myAccountPreferencesId) {
			this.myAccountPreferencesId = myAccountPreferencesId;
		}

		public boolean isShowPlanType() {
			return showPlanType;
		}

		public void setShowPlanType(boolean showPlanType) {
			this.showPlanType = showPlanType;
		}

		public boolean isShowPaymentDetails() {
			return showPaymentDetails;
		}

		public void setShowPaymentDetails(boolean showPaymentDetails) {
			this.showPaymentDetails = showPaymentDetails;
		}

		
}
