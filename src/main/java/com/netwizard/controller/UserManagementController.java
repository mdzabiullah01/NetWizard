/**
 * 
 */
package com.netwizard.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.netwizard.model.Department;
import com.netwizard.model.Users;
import com.netwizard.request.model.UserRequest;
import com.netwizard.response.ServiceControllerUtils;
import com.netwizard.service.CommonService;
import com.netwizard.service.PreferenceService;
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

	@Autowired
	private PreferenceService preferenceService;

	/**
	 * @ USER MANAGEMENT
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/usermanagement", method = RequestMethod.GET)
	public ModelAndView userManagementHome(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("userRequest") UserRequest userRequest) {
		logger.info("Method to load all home pages dashboards---:");
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ModelAndView modelAndView = null;
		List<Users> userList = null;
		try {
			if (!RequestConstans.Anonymous.ANONYMOUS_USER.equals(principal)) {
				modelAndView = new ModelAndView(RequestConstans.PAGE.USERMANAGEMENT);
				userList = commonService.getAllUsers();
				User appUser = (User) principal;
				Users users = userService.loadUserByUserEmail(appUser.getUsername());
				if (users != null) {
					modelAndView.addObject("users", users);
				}
				if (userList != null) {
					modelAndView.addObject("userList", userList);
					modelAndView.addObject("usermanagementactive", "usermanagementsurveyactive");
					modelAndView.addObject("userRequest", userRequest);
				}
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return modelAndView;
	}

	/**
	 * @ USER MANAGEMENT
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @return
	 */
	@RequestMapping(value = "/saveUserInfo", method = RequestMethod.POST)
	public ModelAndView saveUserInfo(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("userRequest") UserRequest userRequest, BindingResult result, ModelMap model) {

		logger.info("Method to load all home pages dashboards---:");

		ModelMapper modelMapper = new ModelMapper();
		Users dto = modelMapper.map(userRequest, Users.class);

		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ModelAndView modelAndView = null;
		try {
			if (!RequestConstans.Anonymous.ANONYMOUS_USER.equals(principal)) {
				modelAndView = new ModelAndView(RequestConstans.PAGE.USERMANAGEMENT);
				userService.saveorUpdateUserInfo(dto, userRequest.getDepartmentId());
				List<Users> userList = commonService.getAllUsers();
				User appUser = (User) principal;
				Users users = userService.loadUserByUserEmail(appUser.getUsername());
				if (users != null) {
					modelAndView.addObject("users", users);
				}
				if (userList != null) {
					modelAndView.addObject("userList", userList);
					modelAndView.addObject("usermanagementactive", "usermanagementsurveyactive");
					modelAndView.addObject("userRequest", userRequest);
				}
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return modelAndView;
	}

	// @ModelAttribute("allDepartments")
	// public List<Department> populateDepartments() {
	// List<Department> departmentList = preferenceService.getAllDepartments();
	// return departmentList;
	// }
}
