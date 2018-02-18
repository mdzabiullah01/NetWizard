/**
 *
 */
package com.netwizard.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.netwizard.model.Category;

/**
 * @author Gautam Joshi
 *
 */
@Service
public interface PreferenceService {

	Category saveOrUpdateCategory(String categoryName);

	List<Category> getAllCategories();

}
