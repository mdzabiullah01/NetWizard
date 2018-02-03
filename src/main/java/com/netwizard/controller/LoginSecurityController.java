/**
 * 
 */
package com.netwizard.controller;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.netwizard.model.Users;
import com.netwizard.service.UserService;
import com.netwizard.util.RequestConstans;

/**
 * @author Rayulu Vemula
 *
 */
@Controller
public class LoginSecurityController {

	private static Logger logger = Logger.getLogger(LoginSecurityController.class);

	@Autowired
	private UserService userService;
	
	 /**
	  * 
	  * @param request
	  * @param response
	  * @return
	  */
	@RequestMapping(value="/welcometodashboards", method = RequestMethod.GET)
	public ModelAndView welcometodashboards(HttpServletRequest request,HttpServletResponse response) {
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

	 /**
	  * 
	  * @param request
	  * @return
	  * @throws JsonGenerationException
	  */
	@RequestMapping(value="/loginfailed", method=RequestMethod.GET)
	public @ResponseBody ModelAndView   loginError(HttpServletRequest request) throws JsonGenerationException {
		SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ModelAndView modelAndView = null;
		try {
			modelAndView = new ModelAndView(RequestConstans.PAGE.INDEX); 
			modelAndView.addObject("error", "Your Login Attempt was not Successful. Please Try Again.");
		}finally {
			if(request.getSession().getAttribute("LAST_USERNAME") != null){
				request.getSession().removeAttribute("LAST_USERNAME");
			}
			if(request.getSession().getAttribute("LAST_PASSWORD") != null){
				request.getSession().removeAttribute("LAST_PASSWORD");
			}
			request.getSession().invalidate();
		}
		return modelAndView;
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request,HttpServletResponse response) {
		logger.info("Method to load all home pages dashboards---:");
		ModelAndView modelAndView=new ModelAndView(RequestConstans.PAGE.INDEX);
		return modelAndView;
	}

	
	/**
	 * Method for accessDenied
	 * 
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonGenerationException 
	 * @throws AppServiceException 
	 * @throws Exception
	 *             the exception
	 */
	@RequestMapping(value="/accessdenied", method=RequestMethod.GET)
	public  @ResponseBody String accessFailed(HttpServletRequest request) throws JsonGenerationException, JsonMappingException, IOException{
		logger.info("Method to load all home pages 4---:");
		/*User appUser = (User)SecurityContextHolder.getContext().
				getAuthentication().getPrincipal();*/

		return new ObjectMapper().writeValueAsString("AccessDenied");

	}

	/**
	 * Method for accessDenied
	 * 
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonGenerationException 
	 * @throws AppServiceException 
	 * @throws Exception
	 *             the exception
	 */
	@RequestMapping(value="/accessdenied", method=RequestMethod.POST)
	public  @ResponseBody String accessdenied(HttpServletRequest request) throws JsonGenerationException, JsonMappingException, IOException{
		logger.info("Method to load all home pages 4---:");
		return new ObjectMapper().writeValueAsString(new Exception("AccessDenied"));

	}
}


