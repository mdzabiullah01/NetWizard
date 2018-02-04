/**
 *
 */
package com.netwizard.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Gautam Joshi
 *
 */
@XmlRootElement
public class DepartmentRequest implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String _id;
	private String departmentName;
	private Date createdDate;
	private String assignGroupId;

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

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getAssignGroupId() {
		return assignGroupId;
	}

	public void setAssignGroupId(String assignGroupId) {
		this.assignGroupId = assignGroupId;
	}
}
