/**
 *
 */
package com.netwizard.daoimpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.netwizard.dao.PreferenceDAO;
import com.netwizard.model.Category;
import com.netwizard.util.RequestConstans;

/**
 * @author Gautam Joshi
 *
 */
@Component
@Repository("preferenceDAO")
public class PreferenceDAOImpl implements PreferenceDAO {

	private static Logger logger = Logger.getLogger(PreferenceDAOImpl.class);

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public Category saveOrUpdateCategory(Category cat) {
		logger.debug(">> saveOrUpdateCategory" + cat);
		try {
			this.mongoTemplate.save(cat, RequestConstans.Collections.COLLECTION_CATEGORY);
		} catch (Exception e) {
			logger.error("Error in saveOrUpdateCategory.." + e);
			e.printStackTrace();
		}
		logger.debug("<< saveOrUpdateCategory  dept=" + cat);
		return cat;
	}


	@Override
	public List<Category> getAllCategories() {
		logger.debug(">> getAllCategories");
		List<Category> catList;
		try {
			catList = this.mongoTemplate.findAll(Category.class, RequestConstans.Collections.COLLECTION_CATEGORY);
		} catch (Exception e) {
			logger.error("Error in getAllCategories.." + e);
			e.printStackTrace();
			catList = null;
		}
		logger.debug("<< getAllCategories  dept List=" + catList);
		return catList;
	}

}
