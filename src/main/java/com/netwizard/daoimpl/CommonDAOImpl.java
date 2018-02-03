package com.netwizard.daoimpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.netwizard.dao.CommonDAO;
import com.netwizard.model.AssignGroup;
import com.netwizard.model.Users;
import com.netwizard.util.RequestConstans;

/**
 * @author vara prasad
 *
 */
@Component
@Repository("commonDAO")
public class CommonDAOImpl implements CommonDAO {

	private static Logger logger = Logger.getLogger(UserDAOImpl.class);

	@Autowired
	private MongoTemplate mongoTemplate;

	public List<Users> getAllUsers() {
		logger.debug(">> getAllUsers");
		List<Users> user;
		try {
			user = this.mongoTemplate.findAll(Users.class, RequestConstans.Collections.COLLECTION_USERS);
		} catch (Exception e) {
			logger.error("Error in getAllUsers.." + e);
			e.printStackTrace();
			user = null;
		}
		logger.debug("<< getAllUsers  user=" + user);
		return user;
	}

	public List<AssignGroup> getAllGroups() {
		logger.debug(">> getAllGroups");
		List<AssignGroup> groupList;
		try {
			groupList = this.mongoTemplate.findAll(AssignGroup.class, RequestConstans.Collections.COLLECTION_GROUP);
		} catch (Exception e) {
			logger.error("Error in getAllGroups.." + e);
			e.printStackTrace();
			groupList = null;
		}
		logger.debug("<< getAllGroups  group=" + groupList);
		return groupList;
	}

}
