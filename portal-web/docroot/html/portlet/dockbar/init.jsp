<%--
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
--%>

<%@ include file="/html/portlet/init.jsp" %>

<%@ page import="com.liferay.portal.util.PortletCategoryUtil" %><%@
page import="com.liferay.portlet.admin.util.PortalUserPersonalBarApplicationType" %><%@
page import="com.liferay.portlet.layoutsadmin.context.GroupDisplayContextHelper" %><%@
page import="com.liferay.taglib.aui.AUIUtil" %>

<%@ page import="java.util.regex.Matcher" %><%@
page import="java.util.regex.Pattern" %>

<%
GroupDisplayContextHelper groupDisplayContextHelper = new GroupDisplayContextHelper(request);
%>

<%@ include file="/html/portlet/dockbar/init-ext.jsp" %>