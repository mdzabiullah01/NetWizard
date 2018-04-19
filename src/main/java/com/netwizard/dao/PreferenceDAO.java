/**
 *
 */
package com.netwizard.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.netwizard.model.Category;

/**
 * @author Rayulu Vemula
 *
 */
@Component
public interface PreferenceDAO {

	/**
	 * 
	 * @param cat
	 * @return
	 */
	Category saveOrUpdateCategory(Category cat);

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
