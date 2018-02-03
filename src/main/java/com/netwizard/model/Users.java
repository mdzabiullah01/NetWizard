/**
 *
 */
package com.netwizard.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Rayulu Vemula
 *
 */
@Document(collection = "users")
public class Users implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String _id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private List<String> rolesList;
	private List<String> agencyList;
	private List<String> oldPasswordList;
	private Long wrong_pwd_tries;
	private Date createdDate;
	private Date lastAccessed;
	private Date password_forget_time;
	private String defaultPassword;
	private String profilepic;
	private String department;
	private String country;
	private String nationality;
	private Date dateofbirth;
	private Date dateOfJoinging;
	private String assignGroup;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getDefaultPassword() {
		return defaultPassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDefaultPassword(String defaultPassword) {
		this.defaultPassword = defaultPassword;
	}

	public Long getWrong_pwd_tries() {
		return this.wrong_pwd_tries;
	}

	public void setWrong_pwd_tries(final Long wrong_pwd_tries) {
		this.wrong_pwd_tries = wrong_pwd_tries;
	}

	public Date getLastAccessed() {
		return lastAccessed;
	}

	public void setLastAccessed(Date lastAccessed) {
		this.lastAccessed = lastAccessed;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(final String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(final String email) {
		this.email = email;
	}

	public List<String> getRolesList() {
		return this.rolesList;
	}

	public void setRolesList(final List<String> rolesList) {
		this.rolesList = rolesList;
	}

	public List<String> getAgencyList() {
		return this.agencyList;
	}

	public void setAgencyList(final List<String> agencyList) {
		this.agencyList = agencyList;
	}

	public List<String> getOldPasswordList() {
		return this.oldPasswordList;
	}

	public void setOldPasswordList(final List<String> oldPasswordList) {
		this.oldPasswordList = oldPasswordList;
	}

	public String getProfilepic() {
		return profilepic;
	}

	public void setProfilepic(String profilepic) {
		this.profilepic = profilepic;
	}

	public Date getPassword_forget_time() {
		return password_forget_time;
	}

	public void setPassword_forget_time(Date password_forget_time) {
		this.password_forget_time = password_forget_time;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public Date getDateOfJoinging() {
		return dateOfJoinging;
	}

	public void setDateOfJoinging(Date dateOfJoinging) {
		this.dateOfJoinging = dateOfJoinging;
	}

	public String getAssignGroup() {
		return assignGroup;
	}

	public void setAssignGroup(String assignGroup) {
		this.assignGroup = assignGroup;
	}

}
