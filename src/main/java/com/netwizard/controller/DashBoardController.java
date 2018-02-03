/**
 * 
 */
package com.netwizard.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
public class DashBoardController {

	private static Logger logger = Logger.getLogger(DashBoardController.class);

	@Autowired
	private CommonService commonService;
	
	@Autowired
	private ServiceControllerUtils scutils;
	
	@Autowired
	private UserService userService;
	
	/**
	 * DASHBAORD
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/dashboard", method = RequestMethod.GET)
	public ModelAndView dashboardHome(HttpServletRequest request,HttpServletResponse response) {
		logger.info("Method to load all home pages dashboards---:");
		User appUser = null;
		Users users = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ModelAndView modelAndView = null;
		try{
			if(!RequestConstans.Anonymous.ANONYMOUS_USER.equals(principal)){
				appUser = (User)principal;
				modelAndView=new ModelAndView(RequestConstans.PAGE.DASHBOARD);
				users = userService.loadUserByUserEmail(appUser.getUsername());
				if(users != null){
					modelAndView.addObject("users", users);
					modelAndView.addObject("dashboardactive", "dashboardactive");
				}
			}
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return modelAndView;
	}
}
