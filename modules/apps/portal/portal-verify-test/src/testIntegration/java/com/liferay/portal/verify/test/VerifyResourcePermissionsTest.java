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

package com.liferay.portal.verify.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.ResourcePermission;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.RoleConstants;
import com.liferay.portal.kernel.service.ResourcePermissionLocalServiceUtil;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.rule.DeleteAfterTestRun;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RoleTestUtil;
import com.liferay.portal.kernel.verify.model.VerifiableResourcedModel;
import com.liferay.portal.model.impl.ResourcePermissionImpl;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.verify.VerifyProcess;
import com.liferay.portal.verify.VerifyResourcePermissions;
import com.liferay.portal.verify.model.GroupVerifiableResourcedModel;
import com.liferay.portal.verify.model.RoleVerifiableModel;
import com.liferay.portal.verify.test.util.BaseVerifyProcessTestCase;

import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Manuel de la Peña
 * @author Preston Crary
 */
@RunWith(Arquillian.class)
public class VerifyResourcePermissionsTest extends BaseVerifyProcessTestCase {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new LiferayIntegrationTestRule();

	@Test
	public void testVerifyGroupResourcedModel() throws Exception {
		_group = GroupTestUtil.addGroup();

		_testVerifyResourcedModel(
			_group.getCompanyId(), _group.getGroupId(),
			_group.getCreatorUserId(), new GroupVerifiableResourcedModel());
	}

	@Test
	public void testVerifyRoleResourcedModel() throws Exception {
		_role = RoleTestUtil.addRole(RoleConstants.TYPE_REGULAR);

		_testVerifyResourcedModel(
			_role.getCompanyId(), _role.getRoleId(), _role.getUserId(),
			new RoleVerifiableModel());
	}

	@Override
	protected VerifyProcess getVerifyProcess() {
		return new VerifyResourcePermissions();
	}

	private void _testVerifyResourcedModel(
			long companyId, long pk, long userId,
			VerifiableResourcedModel verifiableResourcedModel)
		throws Exception {

		Role ownerRole = RoleLocalServiceUtil.getRole(
			companyId, RoleConstants.OWNER);

		ResourcePermission resourcePermission =
			ResourcePermissionLocalServiceUtil.fetchResourcePermission(
				companyId, verifiableResourcedModel.getModelName(),
				ResourceConstants.SCOPE_INDIVIDUAL, String.valueOf(pk),
				ownerRole.getRoleId());

		Assert.assertNotNull(resourcePermission);

		ResourcePermissionLocalServiceUtil.deleteResourcePermission(
			resourcePermission);

		VerifyResourcePermissions verifyResourcePermissions =
			new VerifyResourcePermissions();

		verifyResourcePermissions.verify(verifiableResourcedModel);

		EntityCacheUtil.clearCache(ResourcePermissionImpl.class);
		FinderCacheUtil.clearCache(ResourcePermissionImpl.class.getName());

		resourcePermission =
			ResourcePermissionLocalServiceUtil.fetchResourcePermission(
				companyId, verifiableResourcedModel.getModelName(),
				ResourceConstants.SCOPE_INDIVIDUAL, String.valueOf(pk),
				ownerRole.getRoleId());

		Assert.assertNotNull(resourcePermission);

		Assert.assertEquals(
			String.valueOf(pk), resourcePermission.getPrimKey());

		Assert.assertEquals(userId, resourcePermission.getOwnerId());
	}

	@DeleteAfterTestRun
	private Group _group;

	@DeleteAfterTestRun
	private Role _role;

}