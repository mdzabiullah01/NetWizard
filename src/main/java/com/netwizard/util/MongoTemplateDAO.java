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

import com.netwizard.model.AssignGroup;
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
	@SuppressWarnings("resource")
	public static void main(String[] args) throws NoSuchAlgorithmException {
		// insertAdmin();
		insertGroups();
	}

	private static MongoTemplate getMongoTemplate() {
		ApplicationContext ctx = new GenericXmlApplicationContext("netwizard-servlet.xml");

		return (MongoTemplate) ctx.getBean("mongoTemplate");

	}

	public static void insertAdmin() throws NoSuchAlgorithmException {
		MongoTemplate mongoTemplate = getMongoTemplate();
		Users user = new Users();

		user.setEmail("gvjoshi25@gmail.com");
		user.setPassword(CommonUtils.Md5Encrypt("gvjoshi25"));
		user.setFirstName("joshi");
		user.setLastName("gautam");

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
