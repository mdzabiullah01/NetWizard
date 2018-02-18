/**
 * 
 */
package com.netwizard.request.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.netwizard.model.Question;

/**
 * @author Rayulu Vemula
 *
 */
@XmlRootElement
public class SurveyRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String _id;
	private String categoryId;
	private String surveyName;
	private Date startDate;
	private Date endDate;
	private Date scheduleDate;
	private List<Question> questions;
	private Date issueDate;
	private Date presentingDate;
	private Date presentingTime;
	private String status;

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

	/**
	 * @return the surveyName
	 */
	public String getSurveyName() {
		return surveyName;
	}

	/**
	 * @param surveyName
	 *            the surveyName to set
	 */
	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate
	 *            the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate
	 *            the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the scheduleDate
	 */
	public Date getScheduleDate() {
		return scheduleDate;
	}

	/**
	 * @param scheduleDate
	 *            the scheduleDate to set
	 */
	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	/**
	 * @return the questions
	 */
	public List<Question> getQuestions() {
		return questions;
	}

	/**
	 * @param questions
	 *            the questions to set
	 */
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	/**
	 * @return the issueDate
	 */
	public Date getIssueDate() {
		return issueDate;
	}

	/**
	 * @param issueDate
	 *            the issueDate to set
	 */
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	/**
	 * @return the presentingDate
	 */
	public Date getPresentingDate() {
		return presentingDate;
	}

	/**
	 * @param presentingDate
	 *            the presentingDate to set
	 */
	public void setPresentingDate(Date presentingDate) {
		this.presentingDate = presentingDate;
	}

	/**
	 * @return the presentingTime
	 */
	public Date getPresentingTime() {
		return presentingTime;
	}

	/**
	 * @param presentingTime
	 *            the presentingTime to set
	 */
	public void setPresentingTime(Date presentingTime) {
		this.presentingTime = presentingTime;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

}
