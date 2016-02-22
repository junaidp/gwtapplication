package com.helloworld.shared.dto;

import java.io.Serializable;

public class AnnotationsDTO implements Serializable {

	public AnnotationsDTO(){
		
	}
	
	private String name;
	private String importClass;
	private String annotationText;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImportClass() {
		return importClass;
	}
	public void setImportClass(String importClass) {
		this.importClass = importClass;
	}
	public String getAnnotationText() {
		return annotationText;
	}
	public void setAnnotationText(String annotationText) {
		this.annotationText = annotationText;
	}
}
