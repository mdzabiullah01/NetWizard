package com.netwizard.response;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.netwizard.util.AppConstants;


/**
 * Utility class for the service response generation related controllers
 * 
 * @author Rayulu Vemula
 * 
 */
@Component
public class ServiceControllerUtils {

	private static Logger logger = Logger.getLogger(ServiceControllerUtils.class);

	
	/**
	 * Prepares the error mobile response
	 * 
	 * @param mresponse
	 * @param errorCode
	 * @param statusMsg
	 * @param 
	 * @return
	 */
	public ServiceResponse prepareMobileResponseErrorStatus(ServiceResponse mresponse, String errorCode, String statusMsg) {
		mresponse.setStatus(AppConstants.ERRORCODE);
		mresponse.setErrorCode(errorCode);
		mresponse.setStatusMsg(statusMsg);
		return mresponse;
	}
	
	
	
	/**
	 * Prepares the error mobile response
	 * 
	 * @param mresponse
	 * @param errorCode
	 * @param statusMsg
	 * @param 
	 * @return
	 */
	public ServiceResponse prepareMobileResponseSessionInvalidStatus(ServiceResponse mresponse, String errorCode, String statusMsg) {
		mresponse.setStatus(AppConstants.SESSION_INVALID_CODE);
		mresponse.setErrorCode(errorCode);
		mresponse.setStatusMsg(statusMsg);
		return mresponse;
	}
	
	
	

	/**
	 * Prepares the success mobile response
	 * 
	 * @param mresponse
	 * @param statusMsg
	 * @param sessionStatus
	 * @return
	 */
	public ServiceResponse prepareMobileResponseSuccessStatus(ServiceResponse mresponse, String statusMsg) {
		mresponse.setStatus(AppConstants.SUCCESSCODE);
		mresponse.setStatusMsg(statusMsg);
		return mresponse;
	}

	
		
		
	

}
