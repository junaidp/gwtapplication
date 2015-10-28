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
		
		@Column(name="viewPlanPaymentTerms")
		private boolean viewPaymentTerms;
		
		@Column(name="viewPlanMonthlyPayments")
		private boolean viewPlanMonthlyPayments;
		
		@Column(name="viewPlanQuarterlyPayments")
		private boolean viewPlanQuarterlyPayments;
		
		@Column(name="viewPlanYearlyPayments")
		private boolean viewPlanYearlyPayments;
		
		@Column(name="viewRegLastName")
		private boolean viewRegLastName;
		
		@Column(name="viewRegFirstName")
		private boolean viewRegFirstName;
		
		@Column(name="viewRegShowPanel")
		private boolean viewRegShowPanel;
		
		@Column(name="viewRegRegisteredTo")
		private boolean viewRegRegisteredTo;
		
		@Column(name="viewRegPassword")
		private boolean viewRegPassword;
		
		@Column(name="viewRegLastEdited")
		private boolean viewRegLastEdited;
		
		@Column(name="viewRegAllowEditing")
		private boolean viewRegAllowEditing;

		

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

		public boolean isViewPaymentTerms() {
			return viewPaymentTerms;
		}

		public void setViewPaymentTerms(boolean viewPaymentTerms) {
			this.viewPaymentTerms = viewPaymentTerms;
		}

		public boolean isViewPlanMonthlyPayments() {
			return viewPlanMonthlyPayments;
		}

		public void setViewPlanMonthlyPayments(boolean viewPlanMonthlyPayments) {
			this.viewPlanMonthlyPayments = viewPlanMonthlyPayments;
		}

		public boolean isViewPlanQuarterlyPayments() {
			return viewPlanQuarterlyPayments;
		}

		public void setViewPlanQuarterlyPayments(boolean viewPlanQuarterlyPayments) {
			this.viewPlanQuarterlyPayments = viewPlanQuarterlyPayments;
		}

		public boolean isViewPlanYearlyPayments() {
			return viewPlanYearlyPayments;
		}

		public void setViewPlanYearlyPayments(boolean viewPlanYearlyPayments) {
			this.viewPlanYearlyPayments = viewPlanYearlyPayments;
		}

		public boolean isViewRegLastName() {
			return viewRegLastName;
		}

		public void setViewRegLastName(boolean viewRegLastName) {
			this.viewRegLastName = viewRegLastName;
		}

		public boolean isViewRegFirstName() {
			return viewRegFirstName;
		}

		public void setViewRegFirstName(boolean viewRegFirstName) {
			this.viewRegFirstName = viewRegFirstName;
		}

		public boolean isViewRegShowPanel() {
			return viewRegShowPanel;
		}

		public void setViewRegShowPanel(boolean viewRegShowPanel) {
			this.viewRegShowPanel = viewRegShowPanel;
		}

		public boolean isViewRegRegisteredTo() {
			return viewRegRegisteredTo;
		}

		public void setViewRegRegisteredTo(boolean viewRegRegisteredTo) {
			this.viewRegRegisteredTo = viewRegRegisteredTo;
		}

		public boolean isViewRegPassword() {
			return viewRegPassword;
		}

		public void setViewRegPassword(boolean viewRegPassword) {
			this.viewRegPassword = viewRegPassword;
		}

		public boolean isViewRegLastEdited() {
			return viewRegLastEdited;
		}

		public void setViewRegLastEdited(boolean viewRegLastEdited) {
			this.viewRegLastEdited = viewRegLastEdited;
		}

		public boolean isViewRegAllowEditing() {
			return viewRegAllowEditing;
		}

		public void setViewRegAllowEditing(boolean viewRegAllowEditing) {
			this.viewRegAllowEditing = viewRegAllowEditing;
		}

		
		
}
