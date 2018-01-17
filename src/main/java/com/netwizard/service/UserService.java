/**
 *
 */
package com.netwizard.service;


import org.springframework.stereotype.Service;

import com.netwizard.model.Users;

/**
 * @author Rayulu Vemula
 *
 */
@Service
public interface UserService {

	/**
	 * 
	 * @param username
	 * @return
	 */
	Users loadUserByUserEmail(String username);

	/**
	 * 
	 * @param usersInfo
	 * @return
	 */
	Users saveorUpdateUserInfo(Users usersInfo); 
	
}
