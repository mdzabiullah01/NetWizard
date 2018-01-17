package com.netwizard.response;

import java.util.HashMap;
import java.util.Map;


public class ServiceResponse {

	private int status;
	private String statusMsg;
	private String errorCode;
	//private String sessionStatus;
	private Map<String, Object> data = new HashMap<String, Object>(); 




	@Override
	public String toString() {

		return ServiceJsonUtil.prettyPrintBean(this);

	}




	/*public String getSessionStatus() {
		return sessionStatus;
	}
	public void setSessionStatus(String sessionStatus) {
		this.sessionStatus = sessionStatus;
	}*/
	public void addDataObject(String key, Object dataObject){
		data.put(key, dataObject);
	}
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getStatusMsg() {
		return statusMsg;
	}
	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

}
