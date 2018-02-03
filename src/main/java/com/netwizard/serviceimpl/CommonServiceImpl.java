package com.netwizard.serviceimpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netwizard.dao.CommonDAO;
import com.netwizard.model.AssignGroup;
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
		} catch (Exception e) {
			logger.error("getAllUsers");
			e.printStackTrace();
		}
		logger.debug("<< getAllUsers=" + users);
		return users;
	}

	public List<AssignGroup> getAllGroups() {
		logger.debug(">> getAllGroups");
		List<AssignGroup> groupList = null;
		try {
			groupList = commonDAO.getAllGroups();
		} catch (Exception e) {
			logger.error("getAllGroups");
			e.printStackTrace();
		}
		logger.debug("<< getAllGroups=" + groupList);
		return groupList;

	}

}
