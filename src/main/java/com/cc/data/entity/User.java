package com.cc.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "user")
public class User extends CommonEntity {

	@Id
	@Column(name = "user_id")
	private Long userId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "corp_email")
	private String corpEmail;

	@Column(name = "personal_email")
	private String personalEmail;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "company_location")
	private String companyLocation;

	@Column(name = "corp_email_validated")
	private Boolean corpEmailValidated;

	@Column(name = "personal_email_validated")
	private Boolean personalEmailValidated;

	@Column(name="active")
	private Boolean active;
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCorpEmail() {
		return corpEmail;
	}

	public void setCorpEmail(String corpEmail) {
		this.corpEmail = corpEmail;
	}

	public String getPersonalEmail() {
		return personalEmail;
	}

	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyLocation() {
		return companyLocation;
	}

	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}

	public Boolean getCorpEmailValidated() {
		return corpEmailValidated;
	}

	public void setCorpEmailValidated(Boolean corpEmailValidated) {
		this.corpEmailValidated = corpEmailValidated;
	}

	public Boolean getPersonalEmailValidated() {
		return personalEmailValidated;
	}

	public void setPersonalEmailValidated(Boolean personalEmailValidated) {
		this.personalEmailValidated = personalEmailValidated;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("userId", userId).append("firstName", firstName)
				.append("lastName", lastName).append("corpEmail", corpEmail).append("personalEmail", personalEmail)
				.append("companyName", companyName).append("companyLocation", companyLocation)
				.append("corpEmailValidated", corpEmailValidated)
				.append("personalEmailValidated", personalEmailValidated).toString();
	}

}
