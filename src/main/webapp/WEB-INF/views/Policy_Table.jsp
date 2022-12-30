<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%-- <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %> --%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center"> List of Policies</h1>
	<br>
	<br>
	<table class="disp_data">
	<thead>
	<tr>
	<td><b>PolicyId</b></td>
	<td><b>FirstName</b></td>
	<td><b>LastName</b></td>
	<td><b>DOB</b></td>
	<td><b>Email</b></td>
	<td><b>Mobile</b></td>
	<td><b>Gender</b></td>
	<td><b>Tobacoo</b></td>
	<td><b>Income</b></td>
	<td><b>LifeCoverAmount</b></td>
	<td><b>LifeCoverAge</b></td>
	<td><b>Status</b></td>
	</tr>
	</thead>
	 <c:forEach var="list_val" items="${list}">
	 <tr>
	 <td align="center"><c:out value="${list_val.getPolicyId()}"></c:out></td> <%--problem in policy_id --%>
	 <td align="center"><c:out value="${list_val.getFirstName()}"></c:out></td>
	 <td align="center"><c:out value="${list_val.getLastName()}"></c:out></td>
	 <td align="center"><c:out value="${list_val.getDob()}"></c:out></td>
	 <td align="center"><c:out value="${list_val.getEmailId()}"></c:out></td>
	 <td align="center"><c:out value="${list_val.getMobileNo()}"></c:out></td>
	 <td align="center"><c:out value="${list_val.getGender()}"></c:out></td>
	 <td align="center"><c:out value="${list_val.getTobacoo()}"></c:out></td>
	 <td align="center"><c:out value="${list_val.getIncome()}"></c:out></td>
	 <td align="center"><c:out value="${list_val.getLifeCoverAmount()}"></c:out></td>
	 <td align="center"><c:out value="${list_val.getLifeCoverAge()}"></c:out></td>
	 <td align="center"><c:out value="${list_val.getStatus()}"></c:out>
	 <button><a href="approve?id=${list_val.getPolicyId()}">Approve</a></button>
	 <button><a href="reject?id=${list_val.getPolicyId()}">Reject</a></button>
	 </td>
	 
	 
	 </tr>
	 
	 
	 </c:forEach>
	 
	</table>

</body>
</html>