/**
 * 
 */
package com.netwizard.util;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.netwizard.model.AssignGroup;
import com.netwizard.model.Department;
import com.netwizard.model.Users;

/**
 * @author rayulu
 *
 */
public class MongoTemplateDAO {

	/**
	 * @param args
	 * @throws NoSuchAlgorithmException
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException {
		insertAdmin();
		insertGroups();
	}

	@SuppressWarnings("resource")
	private static MongoTemplate getMongoTemplate() {
		ApplicationContext ctx = new GenericXmlApplicationContext("netwizard-servlet.xml");

		return (MongoTemplate) ctx.getBean("mongoTemplate");

	}

	public static void insertAdmin() throws NoSuchAlgorithmException {
		MongoTemplate mongoTemplate = getMongoTemplate();
		Users user = new Users();

		Query query = null;
		query = new Query(Criteria.where("_id").is("5a7704d15278ee1ed873790d"));
		Department dept = mongoTemplate.findOne(query, Department.class,
				RequestConstans.Collections.COLLECTION_DEPARTMENT);

		user.setEmail("admin");
		user.setPassword(CommonUtils.Md5Encrypt("password"));
		user.setFirstName("Super");
		user.setLastName("Admin");
		user.setDepartment(dept);

		List<String> rolesList = new ArrayList<String>();
		rolesList.add("ROLE_USER");
		user.setRolesList(rolesList);

		user.setCreatedDate(new Date());

		mongoTemplate.save(user);
	}

	private static void saveGroup(String text) {
		MongoTemplate mongoTemplate = getMongoTemplate();
		AssignGroup g1 = new AssignGroup();
		g1.setGroupName(text);
		mongoTemplate.save(g1);

	}

	public static void insertGroups() {
		saveGroup("Maharashtra Group");
		saveGroup("Gujarat Group");
		saveGroup("Delhi Group");
		saveGroup("Punjab Group");
		saveGroup("Kerala Group");
	}

}
