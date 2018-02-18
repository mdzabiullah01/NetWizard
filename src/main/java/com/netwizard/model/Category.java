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
@Document(collection = RequestConstans.Collections.COLLECTION_CATEGORY)
public class Category implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String _id;
	private String categoryName;
	private Date createdDate;

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

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
