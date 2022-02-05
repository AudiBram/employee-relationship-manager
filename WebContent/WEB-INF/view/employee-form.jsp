<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Nyimpen Data</title>
	
	<link rel="shortcut icon" type="image" href="${pageContext.request.contextPath}/resources/css/twitter.png">
	
	<link type="text/css" 
			rel="stylesheet" 
			href="${pageContext.request.contextPath}/resources/css/style.css" />
			
			
	<link type="text/css" 
			rel="stylesheet" 
			href="${pageContext.request.contextPath}/resources/css/add-employee-style.css" />
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Cilok Edy sek enak rek?</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>simpen data disini, pake data palsu ya guys!</h3>
		
		<form:form action="saveEmployee" modelAttribute="employee" method="POST">
		
			<!-- need to associate this data with customer id -->
			<form:hidden path="id"/>
			
			<table>
				<tbody>
					<tr>
						<td><label>Nama Depan:</label></td>
						<td><form:input path="firstName" /></td>
					</tr>
					
					<tr>
						<td><label>Nama Belakang:</label></td>
						<td><form:input path="lastName" /></td>
					</tr>
					
					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" /></td>
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Simpan" class="save" /></td>
					</tr>
			
				</tbody>
			</table>
		
		
		</form:form>
		
		 <div style="clear; both;"></div>
		 
		 <p>
		 	<a href="${pageContext.request.contextPath}/employee/list">Back to List</a>
		 </p>
	</div>

</body>

</html>










