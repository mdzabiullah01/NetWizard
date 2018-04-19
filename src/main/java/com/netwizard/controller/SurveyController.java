/**
 * 
 */
package com.netwizard.controller;

import java.util.Date;
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
		List<Survey> surveys = null;
		try {
			if (!RequestConstans.Anonymous.ANONYMOUS_USER.equals(principal)) {
				modelAndView = new ModelAndView(RequestConstans.PAGE.SURVEY);
				addUser(modelAndView, principal);
				addCategoryList(modelAndView);
				surveys = surveyService.getAllSurveys();
				
				if(surveys.size() > 0)
					modelAndView.addObject("surveys", surveys);
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
	 * @param requestsurveyRequest
	 * 
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/addSurvey", method = RequestMethod.POST)
	public ModelAndView addSurvey(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("surveyRequest") SurveyRequest surveyRequest, BindingResult result, ModelMap model) {
		logger.info("Method to load all home pages dashboards---:");
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ModelAndView modelAndView = null;
		Survey survey = new Survey();
		List<Survey> surveys = null;
		Category category = null;
		try {
			if (!RequestConstans.Anonymous.ANONYMOUS_USER.equals(principal)) {
				modelAndView = new ModelAndView(RequestConstans.PAGE.SURVEY);
					if(surveyRequest.getCategoryId() != null)
				category = preferenceService.findCategoryById(surveyRequest.getCategoryId());
					
				survey.setCategory(category);
					
				if(surveyRequest.getSurveyName() != null)
					survey.setSurveyName(surveyRequest.getSurveyName());
				
				survey.setIssueDate(new Date());
				survey.setResponseMethod("Method #1");
				surveys =	surveyService.saveOrUpdateSurvey(survey);
				
				addUser(modelAndView, principal);
				addCategoryList(modelAndView);
				if(surveys.size() > 0)
					modelAndView.addObject("surveys", surveys);
				
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
