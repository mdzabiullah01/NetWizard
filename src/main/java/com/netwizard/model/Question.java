/**
 * 
 */
package com.netwizard.model;

import java.io.Serializable;

/**
 * @author Rayulu Vemula
 *
 */
public class Question implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String _id;
	private String questionName;
	private String questionSubject;
	
	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}
	/**
	 * @param _id the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
	}
	/**
	 * @return the questionName
	 */
	public String getQuestionName() {
		return questionName;
	}
	/**
	 * @param questionName the questionName to set
	 */
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}
	/**
	 * @return the questionSubject
	 */
	public String getQuestionSubject() {
		return questionSubject;
	}
	/**
	 * @param questionSubject the questionSubject to set
	 */
	public void setQuestionSubject(String questionSubject) {
		this.questionSubject = questionSubject;
	}
	
	

}
