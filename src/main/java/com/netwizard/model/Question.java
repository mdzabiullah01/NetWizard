/**
 * 
 */
package com.netwizard.model;

import java.io.Serializable;

/**
 * @author Rayulu Vemula
 *
 */
public class Question implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String _id;
	private String question;
	private Integer responseMethod;

	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}

	/**
	 * @param _id
	 *            the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
	}

	public Integer getResponseMethod() {
		return responseMethod;
	}

	public void setResponseMethod(Integer responseMethod) {
		this.responseMethod = responseMethod;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

}
