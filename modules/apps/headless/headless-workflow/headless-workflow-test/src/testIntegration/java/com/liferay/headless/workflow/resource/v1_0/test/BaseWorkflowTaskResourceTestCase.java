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

package com.liferay.headless.workflow.resource.v1_0.test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.liferay.headless.workflow.dto.v1_0.WorkflowTask;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.vulcan.pagination.Pagination;

import java.net.URL;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public abstract class BaseWorkflowTaskResourceTestCase {

	@Before
	public void setUp() throws Exception {
		testGroup = GroupTestUtil.addGroup();

		_resourceURL = new URL(
			"http://localhost:8080/o/headless-workflow/v1.0");
	}

	@After
	public void tearDown() throws Exception {
		GroupTestUtil.deleteGroup(testGroup);
	}

	@Test
	public void testGetRoleWorkflowTasksPage() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetWorkflowTask() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetWorkflowTasksPage() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostWorkflowTaskAssignToMe() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostWorkflowTaskAssignToUser() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostWorkflowTaskChangeTransition() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostWorkflowTaskUpdateDueDate() throws Exception {
		Assert.assertTrue(true);
	}

	protected void assertEquals(
		List<WorkflowTask> workflowTasks1, List<WorkflowTask> workflowTasks2) {

		Assert.assertEquals(workflowTasks1.size(), workflowTasks2.size());

		for (int i = 0; i < workflowTasks1.size(); i++) {
			WorkflowTask workflowTask1 = workflowTasks1.get(i);
			WorkflowTask workflowTask2 = workflowTasks2.get(i);

			assertEquals(workflowTask1, workflowTask2);
		}
	}

	protected void assertEquals(
		WorkflowTask workflowTask1, WorkflowTask workflowTask2) {

		Assert.assertTrue(
			workflowTask1 + " does not equal " + workflowTask2,
			equals(workflowTask1, workflowTask2));
	}

	protected void assertEqualsIgnoringOrder(
		List<WorkflowTask> workflowTasks1, List<WorkflowTask> workflowTasks2) {

		Assert.assertEquals(workflowTasks1.size(), workflowTasks2.size());

		for (WorkflowTask workflowTask1 : workflowTasks1) {
			boolean contains = false;

			for (WorkflowTask workflowTask2 : workflowTasks2) {
				if (equals(workflowTask1, workflowTask2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				workflowTasks2 + " does not contain " + workflowTask1,
				contains);
		}
	}

	protected void assertResponseCode(
		int expectedResponseCode, Http.Response actualResponse) {

		Assert.assertEquals(
			expectedResponseCode, actualResponse.getResponseCode());
	}

	protected boolean equals(
		WorkflowTask workflowTask1, WorkflowTask workflowTask2) {

		if (workflowTask1 == workflowTask2) {
			return true;
		}

		return false;
	}

	protected Page<WorkflowTask> invokeGetRoleWorkflowTasksPage(
			Long roleId, Pagination pagination)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL + _toPath("/roles/{role-id}/workflow-tasks", roleId));

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options),
			new TypeReference<Page<WorkflowTask>>() {
			});
	}

	protected Http.Response invokeGetRoleWorkflowTasksPageResponse(
			Long roleId, Pagination pagination)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL + _toPath("/roles/{role-id}/workflow-tasks", roleId));

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected WorkflowTask invokeGetWorkflowTask(Long workflowTaskId)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL +
				_toPath("/workflow-tasks/{workflow-task-id}", workflowTaskId));

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options), WorkflowTask.class);
	}

	protected Http.Response invokeGetWorkflowTaskResponse(Long workflowTaskId)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL +
				_toPath("/workflow-tasks/{workflow-task-id}", workflowTaskId));

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected Page<WorkflowTask> invokeGetWorkflowTasksPage(
			Pagination pagination)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL + _toPath("/workflow-tasks", pagination));

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options),
			new TypeReference<Page<WorkflowTask>>() {
			});
	}

	protected Http.Response invokeGetWorkflowTasksPageResponse(
			Pagination pagination)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL + _toPath("/workflow-tasks", pagination));

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected WorkflowTask invokePostWorkflowTaskAssignToMe(
			Long workflowTaskId, WorkflowTask workflowTask)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setBody(
			_inputObjectMapper.writeValueAsString(workflowTask),
			ContentTypes.APPLICATION_JSON, StringPool.UTF8);

		options.setLocation(
			_resourceURL +
				_toPath(
					"/workflow-tasks/{workflow-task-id}/assign-to-me",
					workflowTaskId));

		options.setPost(true);

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options), WorkflowTask.class);
	}

	protected Http.Response invokePostWorkflowTaskAssignToMeResponse(
			Long workflowTaskId, WorkflowTask workflowTask)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setBody(
			_inputObjectMapper.writeValueAsString(workflowTask),
			ContentTypes.APPLICATION_JSON, StringPool.UTF8);

		options.setLocation(
			_resourceURL +
				_toPath(
					"/workflow-tasks/{workflow-task-id}/assign-to-me",
					workflowTaskId));

		options.setPost(true);

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected WorkflowTask invokePostWorkflowTaskAssignToUser(
			Long workflowTaskId, WorkflowTask workflowTask)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setBody(
			_inputObjectMapper.writeValueAsString(workflowTask),
			ContentTypes.APPLICATION_JSON, StringPool.UTF8);

		options.setLocation(
			_resourceURL +
				_toPath(
					"/workflow-tasks/{workflow-task-id}/assign-to-user",
					workflowTaskId));

		options.setPost(true);

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options), WorkflowTask.class);
	}

	protected Http.Response invokePostWorkflowTaskAssignToUserResponse(
			Long workflowTaskId, WorkflowTask workflowTask)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setBody(
			_inputObjectMapper.writeValueAsString(workflowTask),
			ContentTypes.APPLICATION_JSON, StringPool.UTF8);

		options.setLocation(
			_resourceURL +
				_toPath(
					"/workflow-tasks/{workflow-task-id}/assign-to-user",
					workflowTaskId));

		options.setPost(true);

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected WorkflowTask invokePostWorkflowTaskChangeTransition(
			Long workflowTaskId, WorkflowTask workflowTask)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setBody(
			_inputObjectMapper.writeValueAsString(workflowTask),
			ContentTypes.APPLICATION_JSON, StringPool.UTF8);

		options.setLocation(
			_resourceURL +
				_toPath(
					"/workflow-tasks/{workflow-task-id}/change-transition",
					workflowTaskId));

		options.setPost(true);

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options), WorkflowTask.class);
	}

	protected Http.Response invokePostWorkflowTaskChangeTransitionResponse(
			Long workflowTaskId, WorkflowTask workflowTask)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setBody(
			_inputObjectMapper.writeValueAsString(workflowTask),
			ContentTypes.APPLICATION_JSON, StringPool.UTF8);

		options.setLocation(
			_resourceURL +
				_toPath(
					"/workflow-tasks/{workflow-task-id}/change-transition",
					workflowTaskId));

		options.setPost(true);

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected WorkflowTask invokePostWorkflowTaskUpdateDueDate(
			Long workflowTaskId, WorkflowTask workflowTask)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setBody(
			_inputObjectMapper.writeValueAsString(workflowTask),
			ContentTypes.APPLICATION_JSON, StringPool.UTF8);

		options.setLocation(
			_resourceURL +
				_toPath(
					"/workflow-tasks/{workflow-task-id}/update-due-date",
					workflowTaskId));

		options.setPost(true);

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options), WorkflowTask.class);
	}

	protected Http.Response invokePostWorkflowTaskUpdateDueDateResponse(
			Long workflowTaskId, WorkflowTask workflowTask)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setBody(
			_inputObjectMapper.writeValueAsString(workflowTask),
			ContentTypes.APPLICATION_JSON, StringPool.UTF8);

		options.setLocation(
			_resourceURL +
				_toPath(
					"/workflow-tasks/{workflow-task-id}/update-due-date",
					workflowTaskId));

		options.setPost(true);

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected WorkflowTask randomWorkflowTask() {
		return new WorkflowTask() {
			{
				completed = RandomTestUtil.randomBoolean();
				dateCompleted = RandomTestUtil.nextDate();
				dateCreated = RandomTestUtil.nextDate();
				definitionName = RandomTestUtil.randomString();
				description = RandomTestUtil.randomString();
				dueDate = RandomTestUtil.nextDate();
				id = RandomTestUtil.randomLong();
				name = RandomTestUtil.randomString();
			}
		};
	}

	protected Group testGroup;

	protected static class Page<T> {

		public Collection<T> getItems() {
			return new ArrayList<>(items);
		}

		public int getItemsPerPage() {
			return itemsPerPage;
		}

		public int getLastPageNumber() {
			return lastPageNumber;
		}

		public int getPageNumber() {
			return pageNumber;
		}

		public int getTotalCount() {
			return totalCount;
		}

		@JsonProperty
		protected Collection<T> items;

		@JsonProperty("pageSize")
		protected int itemsPerPage;

		@JsonProperty
		protected int lastPageNumber;

		@JsonProperty("page")
		protected int pageNumber;

		@JsonProperty
		protected int totalCount;

	}

	private Http.Options _createHttpOptions() {
		Http.Options options = new Http.Options();

		options.addHeader("Accept", "application/json");

		String userNameAndPassword = "test@liferay.com:test";

		String encodedUserNameAndPassword = Base64.encode(
			userNameAndPassword.getBytes());

		options.addHeader(
			"Authorization", "Basic " + encodedUserNameAndPassword);

		options.addHeader("Content-Type", "application/json");

		return options;
	}

	private String _toPath(String template, Object value) {
		return template.replaceFirst("\\{.*\\}", String.valueOf(value));
	}

	private static final ObjectMapper _inputObjectMapper = new ObjectMapper() {
		{
			setSerializationInclusion(JsonInclude.Include.NON_NULL);
		}
	};
	private static final ObjectMapper _outputObjectMapper = new ObjectMapper();

	private URL _resourceURL;

}