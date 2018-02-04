/**
 *
 */
package com.netwizard.dao;

import org.springframework.stereotype.Component;

import com.netwizard.model.Department;
import com.netwizard.model.Users;

/**
 * @author Rayulu Vemula
 *
 */
@Component
public interface UserDAO {

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

	Department getDeptById(String id);
}
