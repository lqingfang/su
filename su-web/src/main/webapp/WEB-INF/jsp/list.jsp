<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPath"><%=request.getContextPath() %></c:set>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{border-collapse:collapse;border:none;}
	td{border:solid#000 1px;}
</style>
<!--  
<script type="text/javascript" src="/scripts/lib/jquery.1.9.min.js"></script>
-->
</head>
<body>
     	<table>
     		<tr>
				 <td>id</td>
				 <td>所用时长</td>
			</tr>
     		<c:forEach items="${list}" var="item">
				<tr>
					<td>${item.id}</td>
					<td>${item.cost}</td>
				</tr>
			</c:forEach>
		</table>
		<br>
	<input type="button" value="导出" onClick="exportXls()">
</body>
<script type="text/javascript">
	function exportXls() {
		location.href = "${ctxPath}/exportXls";
	}
</script>
</html>