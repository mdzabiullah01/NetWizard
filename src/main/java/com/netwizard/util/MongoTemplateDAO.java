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

		ApplicationContext ctx = new GenericXmlApplicationContext("netwizard-servlet.xml");
		
		MongoTemplate mongoTemplate = (MongoTemplate)ctx.getBean("mongoTemplate");
		
		System.out.println(mongoTemplate);
		Users user = new Users();
		
		user.setEmail("vara.t@techgene.com");
		user.setPassword(CommonUtils.Md5Encrypt("Care$123"));
		user.setFirstName("Vara");
		user.setLastName("Prasad");
		
		 List<String>  rolesList= new ArrayList<String>();
		 rolesList.add("ROLE_USER");
		user.setRolesList(rolesList);
		
		user.setCreatedDate(new Date());		
		
		
		mongoTemplate.save(user);
		
	}

}
