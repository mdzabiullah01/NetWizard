package com.netwizard.daoimpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.identitymanagement.model.User;
import com.netwizard.dao.CommonDAO;
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
		List<Users> user = null;
		Query query =null;
		try {
			/*query = new Query(Criteria.where("email").is(username.toLowerCase()));
			user = this.mongoTemplate.findOne(query, Users.class, RequestConstans.Collections.COLLECTION_USERS);*/
			
			user=this.mongoTemplate.findAll(Users.class, RequestConstans.Collections.COLLECTION_USERS);
			
		} catch (Exception e) { /* for any other errors */
			logger.error("Error in loadUserByUserEmail.." + e);
			e.printStackTrace();
		}
		logger.debug("<< getAllUsers  user="+user);
		return user;
	}

}
