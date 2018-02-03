/**
 *
 */
package com.netwizard.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Gautam Joshi
 *
 */
@Document(collection = "assignGroup")
public class AssignGroup implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String _id;
	private String groupName;
	private Date createdDate;

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

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
}
