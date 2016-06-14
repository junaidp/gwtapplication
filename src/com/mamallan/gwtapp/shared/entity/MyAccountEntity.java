package com.mamallan.gwtapp.shared.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


	@Entity

	@Table(name="myaccount")
	public class MyAccountEntity   implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 5102552410931111137L;

		public MyAccountEntity(){}
		
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
		
		@Column(name="registeredTo")
		private String registeredTo;
		
		@Temporal(TemporalType.DATE)
		@Column(name="lastEdited")
		private Date lastEdited;
		
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

	
		public String getRegisteredTo() {
			return registeredTo;
		}

		public void setRegisteredTo(String registeredTo) {
			this.registeredTo = registeredTo;
		}

		public Date getLastEdited() {
			return lastEdited;
		}

		public void setLastEdited(Date lastEdited) {
			this.lastEdited = lastEdited;
		}

	
	

	
}
