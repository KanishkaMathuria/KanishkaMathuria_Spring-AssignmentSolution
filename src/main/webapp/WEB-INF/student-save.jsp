<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Save Student</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<h3> Save Student</h3>
		<a style="margin-right:700px; font-size:15px;" href="/StudentRegistrations/logout" class="btn btn-primary btn-sm mb-3 mx-auto"> Logout </a>
		<form action="/StudentRegistrations/students/save" method="post">
			<input type="hidden" name="studentId" value="${student.studentId}">
			<div class="form-inline">
			<input type="text"  name="firstName" value="${student.firstName}" placeholder="First Name" class="form-control mb-4 col-4">
			</div>
			<div class="form-inline">
			<input type="text"  name="lastName" value="${student.lastName}" placeholder="Last Name" class="form-control mb-4 col-4">
			</div>
			<div class="form-inline">
			<input type="text"  name="course" value="${student.course}" placeholder="Course" class="form-control mb-4 col-4">
			</div>
			<div class="form-inline">
			<input type="text"  name="country" value="${student.country}" placeholder="Country" class="form-control mb-4 col-4">
			</div>
			<button type="submit" class="btn btn-info col-2">Submit</button>
		</form>

		<a href="/StudentRegistrations/students/list">Back to Student List</a>

	</div>
</body>
</html>