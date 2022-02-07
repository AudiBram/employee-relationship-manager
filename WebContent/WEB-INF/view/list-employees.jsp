<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Employee</title>
	
	<link rel="shortcut icon" type="image" href="${pageContext.request.contextPath}/resources/css/ghozali.png">
	
	<!-- reference our css -->
	
	<link type="text/css" 
			rel="stylesheet" 
			href="${pageContext.request.contextPath}/resources/css/style.css" />
	
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Employee Management Tracker</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
		
			<!-- put new button: Add Customer -->
			
			<input type="button" value="Tambah Data" 
					onclick="window.location.href='showFormForAdd'; return false;"
					class="add-button"
			/>
			
			<!-- add html here -->
			
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				
				<c:forEach var="tempEmployee" items="${employee}">
				
					<c:url var="updateLink" value="/employee/showFormForUpdate">
						<c:param name = "employeeId" value="${tempEmployee.id}" />
					</c:url>
					
					<c:url var="deleteLink" value="/employee/delete">
						<c:param name = "employeeId" value="${tempEmployee.id}" />
					</c:url>
				
					<tr>
						<td> ${tempEmployee.firstName} </td>
						<td> ${tempEmployee.lastName} </td>
						<td> ${tempEmployee.email} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a> 
							|
							<a href="${deleteLink}"
								onclick="if (!(confirm('Are you sure want to delete this data ?'))) return false">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</table>
			
		</div>
	</div>

</body>

</html>