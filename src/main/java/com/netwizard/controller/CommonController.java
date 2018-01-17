package com.netwizard.controller;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.netwizard.model.Users;
import com.netwizard.response.ServiceControllerUtils;
import com.netwizard.response.ServiceJsonUtil;
import com.netwizard.response.ServiceResponse;
import com.netwizard.service.CommonService;
import com.netwizard.service.UserService;
import com.netwizard.util.AppConstants;
import com.netwizard.util.RequestConstans;

/**
 * 
 * @author Rayulu Vemula
 *
 */
@RestController
public class CommonController {
	
	private static Logger logger = Logger.getLogger(LoginSecurityController.class);

	@Autowired
	private CommonService commonService;
	
	@Autowired
	private ServiceControllerUtils scutils;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/getAllUsers", method = RequestMethod.GET)
	public ModelAndView getAllUsers(HttpServletRequest request,HttpServletResponse response) {
		logger.info("Method to load getAllUsers---:");
		User appUser = null;
		List<Users> users = null;
	//	Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ModelAndView modelAndView = null;
		try{
		//	if(!"anonymousUser".equals(principal)){
			//	appUser = (User)principal;
				modelAndView=new ModelAndView(RequestConstans.PAGE.WELCOMEBOARD);				
				users = commonService.getAllUsers();
				if(users != null){
					modelAndView.addObject("users", users);
				}
		//	}
		}catch(Exception exception){
			exception.printStackTrace();
		}
		
		return modelAndView;
	}
	
	/**
	 * @param email
	 * @return
	 * @throws AppServiceException
	 */
	@RequestMapping(value = "/getAccessToken", method = RequestMethod.POST, produces="application/json")
	public @ResponseBody String logout(@RequestParam final String email,HttpServletResponse response) {
		ServiceResponse restResponse = new ServiceResponse();
		String responseStr = null;
		 Runtime rt = Runtime.getRuntime();
		 String commandResult[] = null;
		 String completeToken=  null;
		 String accessToken = null;
	        try {
	        	System.out.println("Email----" + email);
	            Process proc = rt.exec("java -jar D:/NetWizard/NetWizard/src/main/resources/generateToken.jar --key=c9f3928f521c457687c4ba1e45543d9b --appID=5f9467.vidyo.io --userName=demoNaveen_12 --expiresInSecs=10000");
	            InputStream inputStream = proc.getInputStream();
	            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
		        StringBuffer buffer = new StringBuffer();
		        String line = null;
		        while ( (line = br.readLine()) != null) {
		            buffer.append(line);
		        }
		        if(buffer != null)
		        	commandResult = buffer.toString().split(":");
		        if(commandResult != null && commandResult.length > 0)
		        	completeToken = commandResult[commandResult.length-1];
		        if(completeToken != null)
		        	accessToken =   completeToken.substring(26, completeToken.length());
		        
		        System.out.println("AccessToken----" + accessToken);
		        response.setHeader("Access-Control-Allow-Origin", "*");
	        } catch (IOException e) {
	                    e.printStackTrace();
	        }
		restResponse.addDataObject("accessToken", accessToken);
		restResponse = scutils.prepareMobileResponseSuccessStatus(restResponse, "token generated successfully");
		responseStr = ServiceJsonUtil.convertToJson(restResponse);
		 System.out.println("AccessToken Token Generated----");
		return responseStr;

	}
	
}
