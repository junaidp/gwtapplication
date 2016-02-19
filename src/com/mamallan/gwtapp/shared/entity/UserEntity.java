package com.mamallan.gwtapp.shared.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.eclipse.persistence.internal.dynamic.DynamicEntityImpl;
import org.eclipse.persistence.internal.dynamic.DynamicPropertiesManager;


	@Entity

	@Table(name="user")
	public class UserEntity implements Serializable {

		private static final long serialVersionUID = 1L;

		@Id 
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="userId")
		private int userId;
		
		@Column(name="username")
		private String userName;
		
		@Column(name="password")
		private String password;
		
		@Column(name="name")
		private String name;
		
		@Column(name="email")
		private String email;
		
		@Column(name="status")
		private int status;
		
		@Temporal(TemporalType.DATE)
		@Column(name="tokenGeneratedDate")
		private Date tokenGeneratedDate;
		
		@JoinColumn(name="myAccountId")
		@ManyToOne( fetch = FetchType.LAZY )
		private MyAccountEntity myAccountId;
		
		@Column(name="isAdmin")
		private boolean admin;
		
		@Column(name="token")
		private String token;
		
		@Transient
		private String userFetchStatus;

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

	
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public MyAccountEntity getMyAccountId() {
			return myAccountId;
		}

		public void setMyAccountId(MyAccountEntity myAccountId) {
			this.myAccountId = myAccountId;
		}

		public boolean isAdmin() {
			return admin;
		}

		public void setAdmin(boolean isAdmin) {
			this.admin = isAdmin;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		public Date getTokenGeneratedDate() {
			return tokenGeneratedDate;
		}

		public void setTokenGeneratedDate(Date tokenGeneratedDate) {
			this.tokenGeneratedDate = tokenGeneratedDate;
		}

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public String getUserFetchStatus() {
			return userFetchStatus;
		}

		public void setUserFetchStatus(String userFetchStatus) {
			this.userFetchStatus = userFetchStatus;
		}

	
}
