<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%@include file="/view/resource.jsp" %>
</head>
<body>

	<div class="warp easyui-panel" data-options="border:false">
	
		<!-- Search panel start -->
		<div class="easyui-panel ui-search-panel" title="Search box" data-options="striped:true,collapsible:true,iconCls:'icon-search'">
			<form id="searchForm">
				<p class="ui-fields">
					<label class="ui-label">Name:</label>
					<input name="name" class="easyui-box ui-text" style="width:100px;">
				</p>
				<a href="#" id="btn-search" class="easyui-linkbutton" iconCls="icon-search">Search</a>
			</form>
		</div>
		<!-- Search panel end -->
		
		<!-- Data List -->
		<form id="listForm" method="post">
			<table id="data-list"></table>
		</form>
		<!-- Edit Win&Form -->
		<div id="edit-win" class="easyui-dialog" title="Basic window" data-options="closed:true,iconCls:'icon-save',model:true" style="width:400px;height:380px;">
			<form id="editForm" class="ui-form" method="post">
				<input class="hidden" name="id">
				<div class="ui-edit">
					<div class="ftitle">Information</div>
				</div>
				<div class="fitem">
					<label>Name:</label>
					<input class="easyui-validatebox" type="text" name="name" data-options="required:true">
				</div>
				<div class="fitem">
					<label>City:</label>
					<input class="easyui-validatebox" type="text" name="city" data-options="required:true">
				</div>
				<div class="fitem">
					<label>Mobile:</label>
					<input class="easyui-validatebox" type="text" name="mobile" data-options="required:true">
				</div>
				<div class="fitem">
					<label>Email:</label>
					<input class="easyui-validatebox" type="text" name="mobile" data-options="required:true">
				</div>
				<div class="fitem">
					<label>Know:</label>
					<input class="easyui-validatebox" type="text" name="know" data-options="required:true">
				</div>
				<div class="fitem">
					<label>Inform:</label>
					<input class="easyui-validatebox" type="text" name="inform" data-options="required:true" >
				</div>
				<div class="fitem">
					<label>State:</label>
					<select class="easyui-combobox" name="state" data-options="required:true">
						<option value="0" selected="selected">未读</option>
						<option value="1" >解决</option>
						<option value="2" >审核</option>
					</select>
				</div>
			</form>
		
		</div>
		
	</div>

<script type="text/javascript" src="${msUrl}/js/commons/YDataGrid.js"></script>
<script type="text/javascript" src="${msUrl}/js/ux/siteMain/siteInformation.js"></script>
</body>
</html>