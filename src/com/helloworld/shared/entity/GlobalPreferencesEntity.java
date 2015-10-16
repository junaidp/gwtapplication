package com.helloworld.shared.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
		private MyAccountPreferencesEntity myAccountPreferencesId;
		
		@Column(name="showPaymentDetails")
		private boolean showPaymentDetails;

		
		
}
