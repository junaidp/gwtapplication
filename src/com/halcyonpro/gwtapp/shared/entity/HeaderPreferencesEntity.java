package com.halcyonpro.gwtapp.shared.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

@Table(name="headerpreferences")
public class HeaderPreferencesEntity implements Serializable {

	

	@Id 
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="headerpreferencesId")
	private int headerPreferencesId;
	
	@Column(name="home")
	private boolean home;
	
	@Column(name="aboutus")
	private boolean aboutUs;
	
	@Column(name="contactus")
	private boolean contactUs;

	public int getHeaderPreferencesId() {
		return headerPreferencesId;
	}
	
	public HeaderPreferencesEntity(){
		
	}

	public void setHeaderPreferencesId(int headerPreferencesId) {
		this.headerPreferencesId = headerPreferencesId;
	}

	public boolean isHome() {
		return home;
	}

	public void setHome(boolean home) {
		this.home = home;
	}

	public boolean isAboutUs() {
		return aboutUs;
	}

	public void setAboutUs(boolean aboutUs) {
		this.aboutUs = aboutUs;
	}

	public boolean isContactUs() {
		return contactUs;
	}

	public void setContactUs(boolean contactUs) {
		this.contactUs = contactUs;
	}

}
