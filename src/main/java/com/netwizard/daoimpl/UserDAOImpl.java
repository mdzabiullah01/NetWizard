/**
 *
 */
package com.netwizard.daoimpl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.netwizard.dao.UserDAO;
import com.netwizard.model.Department;
import com.netwizard.model.Users;
import com.netwizard.util.RequestConstans;

/**
 * @author Rayulu Vemula
 *
 */
@Component
@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	private static Logger logger = Logger.getLogger(UserDAOImpl.class);

	@Autowired
	private MongoTemplate mongoTemplate;

	/**
	 * 
	 * @param username
	 * @return
	 */
	public Users loadUserByUserEmail(String username) {
		logger.debug(">> loadUserByUserEmail" + username);
		Users user = null;
		Query query = null;
		try {
			query = new Query(Criteria.where("email").is(username.toLowerCase()));
			user = this.mongoTemplate.findOne(query, Users.class, RequestConstans.Collections.COLLECTION_USERS);
		} catch (Exception e) { /* for any other errors */
			logger.error("Error in loadUserByUserEmail.." + e);
			e.printStackTrace();
		}
		logger.debug("<< loadUserByUserEmail  user=" + user);
		return user;
	}

	/**
	 * 
	 * @param usersInfo
	 * @return
	 */
	public Users saveorUpdateUserInfo(Users usersInfo) {
		logger.debug(">> saveorUpdateUserInfo" + usersInfo);
		Users user = null;
		try {
			this.mongoTemplate.save(usersInfo, RequestConstans.Collections.COLLECTION_USERS);
		} catch (Exception e) {
			logger.error("Error in saveorUpdateUserInfo.." + e);
			e.printStackTrace();
		}
		logger.debug("<< saveorUpdateUserInfo  user=" + usersInfo);
		return user;
	}

	@Override
	public Department getDeptById(String id) {
		logger.debug(">> getDeptById" + id);
		Department dept;
		try {
			Query query = new Query(Criteria.where("_id").is(id));
			dept = this.mongoTemplate.findOne(query, Department.class,
					RequestConstans.Collections.COLLECTION_DEPARTMENT);
		} catch (Exception e) {
			logger.error("Error in getDeptById.." + e);
			e.printStackTrace();
			dept = null;
		}
		logger.debug("<< getDeptById  Department=" + dept);
		return dept;
	}

}
