/**
 *
 */
package com.netwizard.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.netwizard.model.Department;

/**
 * @author Gautam Joshi
 *
 */
@Service
public interface PreferenceService {

	/**
	 * save or update department.
	 * 
	 * @param assignGroupId
	 * 
	 * @param Department
	 */
	Department saveOrUpdateDept(Department dept, String assignGroupId);

	/**
	 * Get all the departments.
	 * 
	 * @return
	 */
	List<Department> getAllDepartments();

}
