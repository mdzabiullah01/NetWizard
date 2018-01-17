/**
 * 
 */
package com.netwizard.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

/**
 * @author Rayulu Vemula
 * 
 *
 */
public class UserNameCachingAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler{

	
	public static final String LAST_USERNAME_KEY = "LAST_USERNAME";
	public static final String LAST_PASSWORD_KEY = "LAST_PASSWORD";

    private UsernameAuthenticationFilter usernamePasswordAuthenticationFilter = new UsernameAuthenticationFilter();

    @Override
    public void onAuthenticationFailure(
            HttpServletRequest request, HttpServletResponse response,
            AuthenticationException exception)
            throws IOException, ServletException {

        super.onAuthenticationFailure(request, response, exception);

        String usernameParameter =
            usernamePasswordAuthenticationFilter.getUsernameParameter();
        
        String passwordParameter = 
        		usernamePasswordAuthenticationFilter.getPasswordParameter();
        
        String lastUserName = request.getParameter(usernameParameter);
        String lastPassword = request.getParameter(passwordParameter);

        HttpSession session = request.getSession(false);
        if (session != null || isAllowSessionCreation()) {
            request.getSession().setAttribute(LAST_USERNAME_KEY, lastUserName);
            request.getSession().setAttribute(LAST_PASSWORD_KEY, lastPassword);
        }
    }
    
}
