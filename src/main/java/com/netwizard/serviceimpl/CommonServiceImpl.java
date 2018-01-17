package com.netwizard.serviceimpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netwizard.dao.CommonDAO;
import com.netwizard.dao.UserDAO;
import com.netwizard.model.Users;
import com.netwizard.service.CommonService;

/**
 * @author vara prasad
 *
 */
@Service
public class CommonServiceImpl implements CommonService {
	
private static Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Autowired
	private CommonDAO commonDAO;

	public List<Users> getAllUsers() {
		logger.debug(">> getAllUsers");
		List<Users> users = null;
		try {
			users = commonDAO.getAllUsers();
		} catch (Exception e) { /* for any other errors */
			logger.error("getAllUsers");
			e.printStackTrace();
		}
		logger.debug("<< getAllUsers="+users);
		return users;
	}
	

}
