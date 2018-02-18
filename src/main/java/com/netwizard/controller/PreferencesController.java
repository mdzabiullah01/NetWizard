/**
 * 
 */
package com.netwizard.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
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

import com.netwizard.model.Category;
import com.netwizard.model.Users;
import com.netwizard.request.model.CategoryRequest;
import com.netwizard.response.ServiceControllerUtils;
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
			@ModelAttribute("categoryRequest") CategoryRequest categoryRequest) {
		logger.info("Method to load all home pages dashboards---:");
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ModelAndView modelAndView = null;
		try {
			if (!RequestConstans.Anonymous.ANONYMOUS_USER.equals(principal)) {
				modelAndView = new ModelAndView(RequestConstans.PAGE.PREFERENCES);
				addUser(modelAndView, principal);
				addCategoryList(modelAndView);
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
	@RequestMapping(value = "/saveCategory", method = RequestMethod.POST)
	public ModelAndView saveCategory(@ModelAttribute("categoryRequest") CategoryRequest categoryRequest,
			BindingResult result, ModelMap model) {

		logger.info("Method to saave saveCategory---:");

		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ModelAndView modelAndView = null;
		try {
			if (!RequestConstans.Anonymous.ANONYMOUS_USER.equals(principal)) {
				modelAndView = new ModelAndView(RequestConstans.PAGE.PREFERENCES);
				preferenceService.saveOrUpdateCategory(categoryRequest.getCategoryName());
				addUser(modelAndView, principal);
				addCategoryList(modelAndView);
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

	private void addCategoryList(ModelAndView modelAndView) {
		List<Category> categoryList = preferenceService.getAllCategories();
		if (categoryList != null) {
			modelAndView.addObject("categoryList", categoryList);
		}
	}

	@ModelAttribute("allCategories")
	public List<Category> getAllCategories() {
		List<Category> categoryList = preferenceService.getAllCategories();
		return categoryList;
	}

}
