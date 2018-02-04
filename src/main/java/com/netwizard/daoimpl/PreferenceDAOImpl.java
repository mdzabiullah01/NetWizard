/**
 *
 */
package com.netwizard.daoimpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.netwizard.dao.PreferenceDAO;
import com.netwizard.model.AssignGroup;
import com.netwizard.model.Department;
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
	public Department saveOrUpdateDept(Department dept) {
		logger.debug(">> saveOrUpdateDept" + dept);
		try {
			this.mongoTemplate.save(dept, RequestConstans.Collections.COLLECTION_DEPARTMENT);
		} catch (Exception e) {
			logger.error("Error in saveOrUpdateDept.." + e);
			e.printStackTrace();
		}
		logger.debug("<< saveOrUpdateDept  dept=" + dept);
		return dept;
	}

	@Override
	public AssignGroup getAssignGroup(String id) {
		logger.debug(">> getAssignGroup" + id);
		AssignGroup assignGroup = null;
		Query query = null;
		try {
			query = new Query(Criteria.where("_id").is(id));
			assignGroup = this.mongoTemplate.findOne(query, AssignGroup.class,
					RequestConstans.Collections.COLLECTION_GROUP);
		} catch (Exception e) { /* for any other errors */
			logger.error("Error in getAssignGroup.." + e);
			e.printStackTrace();
		}
		logger.debug("<< getAssignGroup  AssignGroup=" + assignGroup);
		return assignGroup;
	}

	@Override
	public List<Department> getAllDepartments() {
		logger.debug(">> getAllDepartments");
		List<Department> deptList;
		try {
			deptList = this.mongoTemplate.findAll(Department.class, RequestConstans.Collections.COLLECTION_DEPARTMENT);
		} catch (Exception e) {
			logger.error("Error in getAllDepartments.." + e);
			e.printStackTrace();
			deptList = null;
		}
		logger.debug("<< getAllDepartments  dept List=" + deptList);
		return deptList;
	}

}
