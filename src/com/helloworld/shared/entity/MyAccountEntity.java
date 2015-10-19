package com.helloworld.shared.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity

	@Table(name="myaccount")
	public class MyAccountEntity   implements Serializable {

		private static final long serialVersionUID = 1L;

		@Id 
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="myAccountId")
		private int myAccountId;
		
		@Column(name="monthlyPaymentPlan")
		private boolean monthlyPaymentPlan;
		
		@Column(name="quarterlyPaymentPlan")
		private boolean quarterlyPaymentPlan;
		
		@Column(name="yearlyPaymentPlan")
		private boolean yearlyPaymentPlan;

		public int getMyAccountId() {
			return myAccountId;
		}

		public void setMyAccountId(int myAccountId) {
			this.myAccountId = myAccountId;
		}

		public boolean isMonthlyPaymentPlan() {
			return monthlyPaymentPlan;
		}

		public void setMonthlyPaymentPlan(boolean monthlyPaymentPlan) {
			this.monthlyPaymentPlan = monthlyPaymentPlan;
		}

		public boolean isQuarterlyPaymentPlan() {
			return quarterlyPaymentPlan;
		}

		public void setQuarterlyPaymentPlan(boolean quarterlyPaymentPlan) {
			this.quarterlyPaymentPlan = quarterlyPaymentPlan;
		}

		public boolean isYearlyPaymentPlan() {
			return yearlyPaymentPlan;
		}

		public void setYearlyPaymentPlan(boolean yearlyPaymentPlan) {
			this.yearlyPaymentPlan = yearlyPaymentPlan;
		}
		
	

	
}
