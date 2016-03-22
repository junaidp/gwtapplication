package com.mamallan.gwtapp.shared.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Table(name="namespace")

	@Entity
	public class NameSpaceEntity   implements Serializable {

		private static final long serialVersionUID = 1L;

		@Id 
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="nameSpaceId")
		private int nameSpaceId;
		
		@Column(name="nameSpaceName")
		private String nameSpaceName;

		public int getNameSpaceId() {
			return nameSpaceId;
		}

		public void setNameSpaceId(int nameSpaceId) {
			this.nameSpaceId = nameSpaceId;
		}

		public String getNameSpaceName() {
			return nameSpaceName;
		}

		public void setNameSpaceName(String nameSpaceName) {
			this.nameSpaceName = nameSpaceName;
		}
}
