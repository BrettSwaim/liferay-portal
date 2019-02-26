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

package com.liferay.headless.document.library.dto.v1_0;

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
@GraphQLName("Document")
@XmlRootElement(name = "Document")
public class Document {

	public AdaptedImages[] getAdaptedImages() {
		return adaptedImages;
	}

	public AggregateRating getAggregateRating() {
		return aggregateRating;
	}

	public Categories[] getCategories() {
		return categories;
	}

	public Long[] getCategoryIds() {
		return categoryIds;
	}

	public String getContentUrl() {
		return contentUrl;
	}

	public Creator getCreator() {
		return creator;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public String getDescription() {
		return description;
	}

	public String getEncodingFormat() {
		return encodingFormat;
	}

	public String getFileExtension() {
		return fileExtension;
	}

	public Long getFolderId() {
		return folderId;
	}

	public Long getId() {
		return id;
	}

	public String[] getKeywords() {
		return keywords;
	}

	public Number getSizeInBytes() {
		return sizeInBytes;
	}

	public String getTitle() {
		return title;
	}

	public void setAdaptedImages(AdaptedImages[] adaptedImages) {
		this.adaptedImages = adaptedImages;
	}

	@JsonIgnore
	public void setAdaptedImages(
		UnsafeSupplier<AdaptedImages[], Throwable>
			adaptedImagesUnsafeSupplier) {

		try {
			adaptedImages = adaptedImagesUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}

	@JsonIgnore
	public void setAggregateRating(
		UnsafeSupplier<AggregateRating, Throwable>
			aggregateRatingUnsafeSupplier) {

		try {
			aggregateRating = aggregateRatingUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setCategories(Categories[] categories) {
		this.categories = categories;
	}

	@JsonIgnore
	public void setCategories(
		UnsafeSupplier<Categories[], Throwable> categoriesUnsafeSupplier) {

		try {
			categories = categoriesUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setCategoryIds(Long[] categoryIds) {
		this.categoryIds = categoryIds;
	}

	@JsonIgnore
	public void setCategoryIds(
		UnsafeSupplier<Long[], Throwable> categoryIdsUnsafeSupplier) {

		try {
			categoryIds = categoryIdsUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	@JsonIgnore
	public void setContentUrl(
		UnsafeSupplier<String, Throwable> contentUrlUnsafeSupplier) {

		try {
			contentUrl = contentUrlUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setCreator(Creator creator) {
		this.creator = creator;
	}

	@JsonIgnore
	public void setCreator(
		UnsafeSupplier<Creator, Throwable> creatorUnsafeSupplier) {

		try {
			creator = creatorUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@JsonIgnore
	public void setDateCreated(
		UnsafeSupplier<Date, Throwable> dateCreatedUnsafeSupplier) {

		try {
			dateCreated = dateCreatedUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	@JsonIgnore
	public void setDateModified(
		UnsafeSupplier<Date, Throwable> dateModifiedUnsafeSupplier) {

		try {
			dateModified = dateModifiedUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JsonIgnore
	public void setDescription(
		UnsafeSupplier<String, Throwable> descriptionUnsafeSupplier) {

		try {
			description = descriptionUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setEncodingFormat(String encodingFormat) {
		this.encodingFormat = encodingFormat;
	}

	@JsonIgnore
	public void setEncodingFormat(
		UnsafeSupplier<String, Throwable> encodingFormatUnsafeSupplier) {

		try {
			encodingFormat = encodingFormatUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	@JsonIgnore
	public void setFileExtension(
		UnsafeSupplier<String, Throwable> fileExtensionUnsafeSupplier) {

		try {
			fileExtension = fileExtensionUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setFolderId(Long folderId) {
		this.folderId = folderId;
	}

	@JsonIgnore
	public void setFolderId(
		UnsafeSupplier<Long, Throwable> folderIdUnsafeSupplier) {

		try {
			folderId = folderIdUnsafeSupplier.get();
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

	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}

	@JsonIgnore
	public void setKeywords(
		UnsafeSupplier<String[], Throwable> keywordsUnsafeSupplier) {

		try {
			keywords = keywordsUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setSizeInBytes(Number sizeInBytes) {
		this.sizeInBytes = sizeInBytes;
	}

	@JsonIgnore
	public void setSizeInBytes(
		UnsafeSupplier<Number, Throwable> sizeInBytesUnsafeSupplier) {

		try {
			sizeInBytes = sizeInBytesUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@JsonIgnore
	public void setTitle(
		UnsafeSupplier<String, Throwable> titleUnsafeSupplier) {

		try {
			title = titleUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public String toString() {
		StringBundler sb = new StringBundler(34);

		sb.append("{");

		sb.append("adaptedImages=");

		sb.append(adaptedImages);
		sb.append(", aggregateRating=");

		sb.append(aggregateRating);
		sb.append(", categories=");

		sb.append(categories);
		sb.append(", categoryIds=");

		sb.append(categoryIds);
		sb.append(", contentUrl=");

		sb.append(contentUrl);
		sb.append(", creator=");

		sb.append(creator);
		sb.append(", dateCreated=");

		sb.append(dateCreated);
		sb.append(", dateModified=");

		sb.append(dateModified);
		sb.append(", description=");

		sb.append(description);
		sb.append(", encodingFormat=");

		sb.append(encodingFormat);
		sb.append(", fileExtension=");

		sb.append(fileExtension);
		sb.append(", folderId=");

		sb.append(folderId);
		sb.append(", id=");

		sb.append(id);
		sb.append(", keywords=");

		sb.append(keywords);
		sb.append(", sizeInBytes=");

		sb.append(sizeInBytes);
		sb.append(", title=");

		sb.append(title);

		sb.append("}");

		return sb.toString();
	}

	@GraphQLField
	@JsonProperty
	protected AdaptedImages[] adaptedImages;

	@GraphQLField
	@JsonProperty
	protected AggregateRating aggregateRating;

	@GraphQLField
	@JsonProperty
	protected Categories[] categories;

	@GraphQLField
	@JsonProperty
	protected Long[] categoryIds;

	@GraphQLField
	@JsonProperty
	protected String contentUrl;

	@GraphQLField
	@JsonProperty
	protected Creator creator;

	@GraphQLField
	@JsonProperty
	protected Date dateCreated;

	@GraphQLField
	@JsonProperty
	protected Date dateModified;

	@GraphQLField
	@JsonProperty
	protected String description;

	@GraphQLField
	@JsonProperty
	protected String encodingFormat;

	@GraphQLField
	@JsonProperty
	protected String fileExtension;

	@GraphQLField
	@JsonProperty
	protected Long folderId;

	@GraphQLField
	@JsonProperty
	protected Long id;

	@GraphQLField
	@JsonProperty
	protected String[] keywords;

	@GraphQLField
	@JsonProperty
	protected Number sizeInBytes;

	@GraphQLField
	@JsonProperty
	protected String title;

}