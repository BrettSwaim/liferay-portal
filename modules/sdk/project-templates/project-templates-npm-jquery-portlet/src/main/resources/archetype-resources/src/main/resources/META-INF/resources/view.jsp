#parse ("definitions.vm")
<%@ include file="/init.jsp" %>

<div id="<portlet:namespace />-root" style="cursor:pointer;"></div>

<aui:script require="<%= mainRequire %>">
	main.default('<portlet:namespace />-root');
</aui:script>