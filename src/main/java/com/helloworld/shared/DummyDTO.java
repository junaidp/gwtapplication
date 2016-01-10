package com.helloworld.shared;

import java.io.Serializable;

public class DummyDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 235961813840158681L;
	private int x=10;
	private int y=20;
	private int z=30;
	
	public DummyDTO(){
		
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

}
