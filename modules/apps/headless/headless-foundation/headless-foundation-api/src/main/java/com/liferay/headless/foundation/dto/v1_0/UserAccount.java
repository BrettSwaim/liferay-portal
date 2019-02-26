/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.headless.foundation.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLName;

import java.util.Date;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName("UserAccount")
@XmlRootElement(name = "UserAccount")
public class UserAccount {

	public String getAdditionalName() {
		return additionalName;
	}

	public String getAlternateName() {
		return alternateName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public ContactInformation getContactInformation() {
		return contactInformation;
	}

	public String getDashboardURL() {
		return dashboardURL;
	}

	public String getEmail() {
		return email;
	}

	public String getFamilyName() {
		return familyName;
	}

	public String getGivenName() {
		return givenName;
	}

	public String getHonorificPrefix() {
		return honorificPrefix;
	}

	public String getHonorificSuffix() {
		return honorificSuffix;
	}

	public Long getId() {
		return id;
	}

	public String getImage() {
		return image;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public Organization[] getMyOrganizations() {
		return myOrganizations;
	}

	public Long[] getMyOrganizationsIds() {
		return myOrganizationsIds;
	}

	public String getName() {
		return name;
	}

	public String getProfileURL() {
		return profileURL;
	}

	public Role[] getRoles() {
		return roles;
	}

	public Long[] getRolesIds() {
		return rolesIds;
	}

	public String[] getTasksAssignedToMe() {
		return tasksAssignedToMe;
	}

	public String[] getTasksAssignedToMyRoles() {
		return tasksAssignedToMyRoles;
	}

	public void setAdditionalName(String additionalName) {
		this.additionalName = additionalName;
	}

	@JsonIgnore
	public void setAdditionalName(
		UnsafeSupplier<String, Throwable> additionalNameUnsafeSupplier) {

		try {
			additionalName = additionalNameUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setAlternateName(String alternateName) {
		this.alternateName = alternateName;
	}

	@JsonIgnore
	public void setAlternateName(
		UnsafeSupplier<String, Throwable> alternateNameUnsafeSupplier) {

		try {
			alternateName = alternateNameUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@JsonIgnore
	public void setBirthDate(
		UnsafeSupplier<Date, Throwable> birthDateUnsafeSupplier) {

		try {
			birthDate = birthDateUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setContactInformation(ContactInformation contactInformation) {
		this.contactInformation = contactInformation;
	}

	@JsonIgnore
	public void setContactInformation(
		UnsafeSupplier<ContactInformation, Throwable>
			contactInformationUnsafeSupplier) {

		try {
			contactInformation = contactInformationUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setDashboardURL(String dashboardURL) {
		this.dashboardURL = dashboardURL;
	}

	@JsonIgnore
	public void setDashboardURL(
		UnsafeSupplier<String, Throwable> dashboardURLUnsafeSupplier) {

		try {
			dashboardURL = dashboardURLUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonIgnore
	public void setEmail(
		UnsafeSupplier<String, Throwable> emailUnsafeSupplier) {

		try {
			email = emailUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	@JsonIgnore
	public void setFamilyName(
		UnsafeSupplier<String, Throwable> familyNameUnsafeSupplier) {

		try {
			familyName = familyNameUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	@JsonIgnore
	public void setGivenName(
		UnsafeSupplier<String, Throwable> givenNameUnsafeSupplier) {

		try {
			givenName = givenNameUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setHonorificPrefix(String honorificPrefix) {
		this.honorificPrefix = honorificPrefix;
	}

	@JsonIgnore
	public void setHonorificPrefix(
		UnsafeSupplier<String, Throwable> honorificPrefixUnsafeSupplier) {

		try {
			honorificPrefix = honorificPrefixUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setHonorificSuffix(String honorificSuffix) {
		this.honorificSuffix = honorificSuffix;
	}

	@JsonIgnore
	public void setHonorificSuffix(
		UnsafeSupplier<String, Throwable> honorificSuffixUnsafeSupplier) {

		try {
			honorificSuffix = honorificSuffixUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setId(Long id) {
		this.id = id;
	}

	@JsonIgnore
	public void setId(UnsafeSupplier<Long, Throwable> idUnsafeSupplier) {
		try {
			id = idUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setImage(String image) {
		this.image = image;
	}

	@JsonIgnore
	public void setImage(
		UnsafeSupplier<String, Throwable> imageUnsafeSupplier) {

		try {
			image = imageUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@JsonIgnore
	public void setJobTitle(
		UnsafeSupplier<String, Throwable> jobTitleUnsafeSupplier) {

		try {
			jobTitle = jobTitleUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setMyOrganizations(Organization[] myOrganizations) {
		this.myOrganizations = myOrganizations;
	}

	@JsonIgnore
	public void setMyOrganizations(
		UnsafeSupplier<Organization[], Throwable>
			myOrganizationsUnsafeSupplier) {

		try {
			myOrganizations = myOrganizationsUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setMyOrganizationsIds(Long[] myOrganizationsIds) {
		this.myOrganizationsIds = myOrganizationsIds;
	}

	@JsonIgnore
	public void setMyOrganizationsIds(
		UnsafeSupplier<Long[], Throwable> myOrganizationsIdsUnsafeSupplier) {

		try {
			myOrganizationsIds = myOrganizationsIdsUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonIgnore
	public void setName(UnsafeSupplier<String, Throwable> nameUnsafeSupplier) {
		try {
			name = nameUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setProfileURL(String profileURL) {
		this.profileURL = profileURL;
	}

	@JsonIgnore
	public void setProfileURL(
		UnsafeSupplier<String, Throwable> profileURLUnsafeSupplier) {

		try {
			profileURL = profileURLUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setRoles(Role[] roles) {
		this.roles = roles;
	}

	@JsonIgnore
	public void setRoles(
		UnsafeSupplier<Role[], Throwable> rolesUnsafeSupplier) {

		try {
			roles = rolesUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setRolesIds(Long[] rolesIds) {
		this.rolesIds = rolesIds;
	}

	@JsonIgnore
	public void setRolesIds(
		UnsafeSupplier<Long[], Throwable> rolesIdsUnsafeSupplier) {

		try {
			rolesIds = rolesIdsUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setTasksAssignedToMe(String[] tasksAssignedToMe) {
		this.tasksAssignedToMe = tasksAssignedToMe;
	}

	@JsonIgnore
	public void setTasksAssignedToMe(
		UnsafeSupplier<String[], Throwable> tasksAssignedToMeUnsafeSupplier) {

		try {
			tasksAssignedToMe = tasksAssignedToMeUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setTasksAssignedToMyRoles(String[] tasksAssignedToMyRoles) {
		this.tasksAssignedToMyRoles = tasksAssignedToMyRoles;
	}

	@JsonIgnore
	public void setTasksAssignedToMyRoles(
		UnsafeSupplier<String[], Throwable>
			tasksAssignedToMyRolesUnsafeSupplier) {

		try {
			tasksAssignedToMyRoles = tasksAssignedToMyRolesUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public String toString() {
		StringBundler sb = new StringBundler(44);

		sb.append("{");

		sb.append("additionalName=");

		sb.append(additionalName);
		sb.append(", alternateName=");

		sb.append(alternateName);
		sb.append(", birthDate=");

		sb.append(birthDate);
		sb.append(", contactInformation=");

		sb.append(contactInformation);
		sb.append(", dashboardURL=");

		sb.append(dashboardURL);
		sb.append(", email=");

		sb.append(email);
		sb.append(", familyName=");

		sb.append(familyName);
		sb.append(", givenName=");

		sb.append(givenName);
		sb.append(", honorificPrefix=");

		sb.append(honorificPrefix);
		sb.append(", honorificSuffix=");

		sb.append(honorificSuffix);
		sb.append(", id=");

		sb.append(id);
		sb.append(", image=");

		sb.append(image);
		sb.append(", jobTitle=");

		sb.append(jobTitle);
		sb.append(", myOrganizations=");

		sb.append(myOrganizations);
		sb.append(", myOrganizationsIds=");

		sb.append(myOrganizationsIds);
		sb.append(", name=");

		sb.append(name);
		sb.append(", profileURL=");

		sb.append(profileURL);
		sb.append(", roles=");

		sb.append(roles);
		sb.append(", rolesIds=");

		sb.append(rolesIds);
		sb.append(", tasksAssignedToMe=");

		sb.append(tasksAssignedToMe);
		sb.append(", tasksAssignedToMyRoles=");

		sb.append(tasksAssignedToMyRoles);

		sb.append("}");

		return sb.toString();
	}

	@GraphQLField
	@JsonProperty
	protected String additionalName;

	@GraphQLField
	@JsonProperty
	protected String alternateName;

	@GraphQLField
	@JsonProperty
	protected Date birthDate;

	@GraphQLField
	@JsonProperty
	protected ContactInformation contactInformation;

	@GraphQLField
	@JsonProperty
	protected String dashboardURL;

	@GraphQLField
	@JsonProperty
	protected String email;

	@GraphQLField
	@JsonProperty
	protected String familyName;

	@GraphQLField
	@JsonProperty
	protected String givenName;

	@GraphQLField
	@JsonProperty
	protected String honorificPrefix;

	@GraphQLField
	@JsonProperty
	protected String honorificSuffix;

	@GraphQLField
	@JsonProperty
	protected Long id;

	@GraphQLField
	@JsonProperty
	protected String image;

	@GraphQLField
	@JsonProperty
	protected String jobTitle;

	@GraphQLField
	@JsonProperty
	protected Organization[] myOrganizations;

	@GraphQLField
	@JsonProperty
	protected Long[] myOrganizationsIds;

	@GraphQLField
	@JsonProperty
	protected String name;

	@GraphQLField
	@JsonProperty
	protected String profileURL;

	@GraphQLField
	@JsonProperty
	protected Role[] roles;

	@GraphQLField
	@JsonProperty
	protected Long[] rolesIds;

	@GraphQLField
	@JsonProperty
	protected String[] tasksAssignedToMe;

	@GraphQLField
	@JsonProperty
	protected String[] tasksAssignedToMyRoles;

}