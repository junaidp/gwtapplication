package com.helloworld.shared;

import java.util.ArrayList;

import com.helloworld.client.view.ApplicationConstants;

public class PackageInfo {
	
	public ArrayList<String> fetchPackages() throws Exception {
		Package[] packageslist = Package.getPackages();
		ArrayList<String> packagesList = new ArrayList<String>();
		for(int i=0; i< packageslist.length; i++){
			if(packageslist[i].getName().startsWith(ApplicationConstants.DEFAULT_PACKAGE)){
			packagesList.add(packageslist[i].getName());
			}
		}
		return packagesList	;
	}

}
