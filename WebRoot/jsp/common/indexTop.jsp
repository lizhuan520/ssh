<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<div class="top">
	<div class="global-width">
		<img src="images/logo.gif" class="logo" />
	</div>
</div>

<div class="status">
	<div class="global-width">
		<span class="usertype">【登录角色：${session}】</span>${session.employee.name}&nbsp;你好！欢迎访问青鸟办公管理系统！
	</div>
	<s:debug></s:debug>
</div>
