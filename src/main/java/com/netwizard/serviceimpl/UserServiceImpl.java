/**
 *
 */
package com.netwizard.serviceimpl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netwizard.dao.UserDAO;
import com.netwizard.model.Users;
import com.netwizard.service.UserService;

/**
 * @author Rayulu Vemula
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	private static Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserDAO userDAO;
	
	/**
	 * 
	 * @param username
	 * @return
	 */
	public Users loadUserByUserEmail(String username) {
		logger.debug(">> loadUserByUserEmail" + username);
		Users users = null;
		try {
			users = userDAO.loadUserByUserEmail(username);
		} catch (Exception e) { /* for any other errors */
			logger.error("Error in loadUserByUserEmail.." + e);
			e.printStackTrace();
		}
		logger.debug("<< loadUserByUserEmail  users="+users);
		return users;
	}

	/**
	 * 
	 * @param usersInfo
	 * @return
	 */
	public Users saveorUpdateUserInfo(Users usersInfo) {
		logger.debug(">> saveorUpdateUserInfo" + usersInfo);
		Users users = null;
		try {
			users = userDAO.saveorUpdateUserInfo(usersInfo);
		} catch (Exception e) { /* for any other errors */
			logger.error("Error in saveorUpdateUserInfo.." + e);
			e.printStackTrace();
		}
		logger.debug("<< saveorUpdateUserInfo  users="+users);
		return users;
	}
	
}
