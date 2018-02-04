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

import com.netwizard.model.AssignGroup;
import com.netwizard.model.Department;
import com.netwizard.model.DepartmentRequest;
import com.netwizard.model.Users;
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
public class PreferencesController {

	private static Logger logger = Logger.getLogger(ReportController.class);

	@Autowired
	private CommonService commonService;

	@Autowired
	private ServiceControllerUtils scutils;

	@Autowired
	private UserService userService;

	@Autowired
	private PreferenceService preferenceService;

	/**
	 * @ SURVEY
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/preferences", method = RequestMethod.GET)
	public ModelAndView preferencesHome(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("departmentRequest") DepartmentRequest departmentRequest) {
		logger.info("Method to load all home pages dashboards---:");
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ModelAndView modelAndView = null;
		try {
			if (!RequestConstans.Anonymous.ANONYMOUS_USER.equals(principal)) {
				modelAndView = new ModelAndView(RequestConstans.PAGE.PREFERENCES);
				addUser(modelAndView, principal);
				addDeptList(modelAndView);
				modelAndView.addObject("preferencesactive", "preferencesactive");
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
	@RequestMapping(value = "/saveDepartmentInfo", method = RequestMethod.POST)
	public ModelAndView saveDepartmentInfo(@ModelAttribute("departmentRequest") DepartmentRequest departmentRequest,
			BindingResult result, ModelMap model) {

		logger.info("Method to saave saveDepartmentInfo---:");

		ModelMapper modelMapper = new ModelMapper();
		Department dept = modelMapper.map(departmentRequest, Department.class);

		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ModelAndView modelAndView = null;
		try {
			if (!RequestConstans.Anonymous.ANONYMOUS_USER.equals(principal)) {
				modelAndView = new ModelAndView(RequestConstans.PAGE.PREFERENCES);
				preferenceService.saveOrUpdateDept(dept, departmentRequest.getAssignGroupId());
				addUser(modelAndView, principal);
				addDeptList(modelAndView);
				modelAndView.addObject("preferencesactive", "preferencesactive");
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return modelAndView;
	}

	private void addUser(ModelAndView modelAndView, Object principal) {
		User appUser = (User) principal;
		Users users = userService.loadUserByUserEmail(appUser.getUsername());
		if (users != null) {
			modelAndView.addObject("users", users);
		}
	}

	private void addDeptList(ModelAndView modelAndView) {
		List<Department> departmentList = preferenceService.getAllDepartments();
		if (departmentList != null) {
			modelAndView.addObject("departmentList", departmentList);
		}
	}

	@ModelAttribute("allDepartments")
	public List<Department> populateDepartments() {
		List<Department> departmentList = preferenceService.getAllDepartments();
		return departmentList;
	}

	@ModelAttribute("allGroups")
	public List<AssignGroup> populateGroups() {
		List<AssignGroup> gourpList = commonService.getAllGroups();
		return gourpList;
	}
}
