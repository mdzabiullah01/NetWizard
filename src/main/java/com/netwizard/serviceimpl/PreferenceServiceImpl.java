/**
 *
 */
package com.netwizard.serviceimpl;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netwizard.dao.PreferenceDAO;
import com.netwizard.model.Department;
import com.netwizard.service.PreferenceService;

/**
 * @author Gautam Joshi
 *
 */
@Service
public class PreferenceServiceImpl implements PreferenceService {

	private static Logger logger = Logger.getLogger(PreferenceServiceImpl.class);

	@Autowired
	private PreferenceDAO preferenceDAO;

	@Override
	public Department saveOrUpdateDept(Department dept, String assignGroupId) {
		logger.debug(">> saveOrUpdateDept" + dept);
		try {
			dept.setAssignGroup(preferenceDAO.getAssignGroup(assignGroupId));
			dept.setCreatedDate(new Date());
			dept = preferenceDAO.saveOrUpdateDept(dept);
		} catch (Exception e) {
			logger.error("Error in saveorUpdateUserInfo.." + e);
			e.printStackTrace();
		}
		logger.debug("<< saveOrUpdateDept  dept=" + dept);
		return dept;
	}

	@Override
	public List<Department> getAllDepartments() {
		logger.debug(">> getAllDepartments");
		List<Department> deptList;
		try {
			deptList = preferenceDAO.getAllDepartments();
		} catch (Exception e) {
			logger.error("Error in saveorUpdateUserInfo.." + e);
			e.printStackTrace();
			deptList = null;
		}
		logger.debug("<< getAllDepartments  deptList=" + deptList);
		return deptList;
	}

}
