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
import com.netwizard.model.Survey;
import com.netwizard.model.Users;
import com.netwizard.request.model.SurveyRequest;
import com.netwizard.response.ServiceControllerUtils;
import com.netwizard.service.CommonService;
import com.netwizard.service.PreferenceService;
import com.netwizard.service.SurveyService;
import com.netwizard.service.UserService;
import com.netwizard.util.RequestConstans;

/**
 * @author Rayulu Vemula
 *
 */
@Controller
public class SurveyController {

	private static Logger logger = Logger.getLogger(DashBoardController.class);

	@Autowired
	private CommonService commonService;

	@Autowired
	private ServiceControllerUtils scutils;

	@Autowired
	private UserService userService;

	@Autowired
	private SurveyService surveyService;

	@Autowired
	private PreferenceService preferenceService;

	/**
	 * @ SURVEY
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/survey", method = RequestMethod.GET)
	public ModelAndView surveyHome(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("surveyRequest") SurveyRequest surveyRequest) {
		logger.info("Method to load all home pages dashboards---:");
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ModelAndView modelAndView = null;
		try {
			if (!RequestConstans.Anonymous.ANONYMOUS_USER.equals(principal)) {
				modelAndView = new ModelAndView(RequestConstans.PAGE.SURVEY);
				addUser(modelAndView, principal);
				addCategoryList(modelAndView);
				modelAndView.addObject("surveyactive", "surveyactive");
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return modelAndView;
	}

	/**
	 * @ SURVEY
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/addSurvey", method = RequestMethod.GET)
	public ModelAndView addSurvey(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("surveyRequest") SurveyRequest surveyRequest, BindingResult result, ModelMap model) {
		logger.info("Method to load all home pages dashboards---:");
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ModelAndView modelAndView = null;
		try {
			if (!RequestConstans.Anonymous.ANONYMOUS_USER.equals(principal)) {
				modelAndView = new ModelAndView(RequestConstans.PAGE.SURVEY);
				addUser(modelAndView, principal);
				addCategoryList(modelAndView);

				modelAndView.addObject("surveyactive", "surveyactive");
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return modelAndView;
	}

	public List<Survey> getSurveyList() {
		List<Survey> surveyList = surveyService.getAllSurveys();
		return surveyList;
	}

	@ModelAttribute("allCategories")
	public List<Category> getAllCategories() {
		List<Category> categoryList = preferenceService.getAllCategories();
		return categoryList;
	}

	private void addUser(ModelAndView modelAndView, Object principal) {
		User appUser = (User) principal;
		Users users = userService.loadUserByUserEmail(appUser.getUsername());
		if (users != null) {
			modelAndView.addObject("users", users);
		}
	}

	private void addCategoryList(ModelAndView modelAndView) {
		modelAndView.addObject("categoryList", getAllCategories());
	}

}
