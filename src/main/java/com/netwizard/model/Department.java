/**
 *
 */
package com.netwizard.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.netwizard.util.RequestConstans;

/**
 * @author Gautam Joshi
 *
 */
@Document(collection = RequestConstans.Collections.COLLECTION_DEPARTMENT)
public class Department implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String _id;
	private String departmentName;
	private Date createdDate;
	private AssignGroup assignGroup;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public AssignGroup getAssignGroup() {
		return assignGroup;
	}

	public void setAssignGroup(AssignGroup assignGroup) {
		this.assignGroup = assignGroup;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
