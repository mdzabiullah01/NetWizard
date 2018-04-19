/**
 *
 */
package com.netwizard.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.netwizard.model.Category;

/**
 * @author Rayulu Vemula
 *
 */
@Service
public interface PreferenceService {

	/**
	 * 
	 * @param categoryName
	 * @return
	 */
	Category saveOrUpdateCategory(String categoryName);

	/**
	 * 
	 * @return
	 */
	List<Category> getAllCategories();

	/**
	 * 
	 * @param categoryId
	 * @return
	 */
	Category findCategoryById(String categoryId);

}
