/**
 *
 */
package com.netwizard.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.netwizard.model.AssignGroup;
import com.netwizard.model.Department;

/**
 * @author Rayulu Vemula
 *
 */
@Component
public interface PreferenceDAO {

	/**
	 * 
	 * @param Department
	 * @return
	 */
	Department saveOrUpdateDept(Department dept);

	/**
	 * Get all the departments.
	 * 
	 * @return
	 */
	List<Department> getAllDepartments();

	AssignGroup getAssignGroup(String id);
}
