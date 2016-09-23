/**
 * 
 */
package com.abhi.robot.service.impl;

import com.abhi.robot.service.Scanner;

/**
 * @author Abhinav
 *
 */
public class RobotScanner implements Scanner{

	private String rawdata;
	
	/**
	 * @param rawdata
	 */
	public RobotScanner(String rawdata) {
		this.rawdata = rawdata;
	}
		
	/**
	 * @return the rawdata
	 */
	public String getRawdata() {
		return rawdata;
	}

	/**
	 * @param rawdata the rawdata to set
	 */
	public void setRawdata(String rawdata) {
		this.rawdata = rawdata;
	}
	
	
	/* (non-Javadoc)
	 * @see com.abhi.robot.service.Scanner#readBarCode(java.lang.String)
	 */
	@Override
	public String readBarCode() {

		if(rawdata == null || rawdata.isEmpty()){
			return "Scan Failure";
		}
		
		return rawdata;
	}

}
