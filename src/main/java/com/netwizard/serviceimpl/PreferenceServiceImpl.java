/**
 *
 */
package com.netwizard.serviceimpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netwizard.dao.PreferenceDAO;
import com.netwizard.model.Category;
import com.netwizard.service.PreferenceService;
import com.netwizard.util.DateUtil;

/**
 * @author Rayulu Vemula
 *
 */
@Service
public class PreferenceServiceImpl implements PreferenceService {

	private static Logger logger = Logger.getLogger(PreferenceServiceImpl.class);

	@Autowired
	private PreferenceDAO preferenceDAO;

	@Override
	public Category saveOrUpdateCategory(String categoryName) {
		logger.debug(">> saveOrUpdateCategory" + categoryName);

		Category cat = new Category();
		cat.setCategoryName(categoryName);
		cat.setCreatedDate(DateUtil.getGMTDate());

		try {
			cat = preferenceDAO.saveOrUpdateCategory(cat);
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
			catList = preferenceDAO.getAllCategories();
		} catch (Exception e) {
			logger.error("Error in getAllCategories.." + e);
			e.printStackTrace();
			catList = null;
		}
		logger.debug("<< getAllCategories  catList=" + catList);
		return catList;
	}

	@Override
	public Category findCategoryById(String categoryId) {
		logger.debug(">> findCategoryById");
		Category category = null;
		try {
			category = preferenceDAO.findCategoryById(categoryId);
		} catch (Exception e) {
			logger.error("Error in findCategoryById.." + e);
			e.printStackTrace();
		}
		logger.debug("<< findCategoryById  category=" + category);
		return category;
	}

}
