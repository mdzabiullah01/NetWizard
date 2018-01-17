/**
 * 
 */
package com.netwizard.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.netwizard.model.UserRequest;
import com.netwizard.model.Users;
import com.netwizard.response.ServiceControllerUtils;
import com.netwizard.service.CommonService;
import com.netwizard.service.UserService;
import com.netwizard.util.RequestConstans;

/**
 * @author Rayulu Vemula
 *
 */
@Controller
public class UserManagementController {

	private static Logger logger = Logger.getLogger(UserManagementController.class);

	@Autowired
	private CommonService commonService;
	
	@Autowired
	private ServiceControllerUtils scutils;
	
	@Autowired
	private UserService userService;
	
	/**
	 * @ USER MANAGEMENT
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/usermanagement", method = RequestMethod.GET)
	public ModelAndView userManagementHome(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute("userRequest") UserRequest  userRequest) {
		logger.info("Method to load all home pages dashboards---:");
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ModelAndView modelAndView = null;
		User appUser = null;
		Users users = null;
		try{
			if(!"anonymousUser".equals(principal)){
				appUser = (User)principal;
				modelAndView =new ModelAndView(RequestConstans.PAGE.USERMANAGEMENT);
				users = userService.loadUserByUserEmail(appUser.getUsername());
				if(users != null){
					modelAndView.addObject("users", users);
					modelAndView.addObject("usermanagementactive", "usermanagementsurveyactive");
					modelAndView.addObject("userRequest", userRequest);
				}
			}
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return modelAndView;
	}
	
	/**
	 * @ USER MANAGEMENT
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/saveUserInfo", method = RequestMethod.POST)
	public ModelAndView saveUserInfo(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute("userRequest") UserRequest  userRequest) {
		logger.info("Method to load all home pages dashboards---:");
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ModelAndView modelAndView = null;
		User appUser = null;
		Users users = null;
		try{
			if(!"anonymousUser".equals(principal)){
				appUser = (User)principal;
				modelAndView =new ModelAndView(RequestConstans.PAGE.USERMANAGEMENT);
				
				/*@RequestParam(value = "FnRAY", required = false) String firstName,
				@RequestParam(value = "LnVEM", required = false) String lastName,
				@RequestParam(value = "DoCHE", required = false) Date dateofbirth,
				@RequestParam(value = "Natino", required = false) String nationality,
				@RequestParam(value = "DoFJoN", required = false) Date dateofjoing,
				@RequestParam(value = "assignGroup", required = false) String assignGroup*/
				System.out.println(userRequest.getFirstName());
				/*usersInfo.setFirstName(firstName);
				usersInfo.setLastName(lastName);
				usersInfo.setDateofbirth(dateofbirth);
				usersInfo.setNationality(nationality);
				usersInfo.setDateOfJoinging(new Date());
				usersInfo = userService.saveorUpdateUserInfo(usersInfo); 
				
				System.out.println(usersInfo);
				*///System.out.println(profilePic);
				users = userService.loadUserByUserEmail(appUser.getUsername());
				if(users != null){
					modelAndView.addObject("users", users);
					modelAndView.addObject("usermanagementactive", "usermanagementsurveyactive");
				}
			}
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return modelAndView;
	}
}
