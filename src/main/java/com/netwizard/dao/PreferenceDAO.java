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

	Category saveOrUpdateCategory(Category cat);

	List<Category> getAllCategories();
}
