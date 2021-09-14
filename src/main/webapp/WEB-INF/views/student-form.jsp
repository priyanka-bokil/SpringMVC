<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
</head>
<body>
<h1>Student Details</h1>

	<div class="container mt-3">

		<div class="row">

			<div class="col-md-6 offset-md-3">

				<h1 class="text-center mb-3">Fill student details</h1>

				<form action="handle-student" method="post">
					<div class="form-group">
						<label for="rollno">Roll Number</label> <input type="number"
							class="form-control" id="rollno" aria-describedby="emailHelp"
							name="roll" placeholder="Enter your roll number here">
					</div>


					<div class="form-group">

						<label for="name">Name</label>
						<textarea class="form-control" name="name" id="name"
							rows="5" placeholder="Enter your name"></textarea>
					</div>


					<div class="form-group">
						<label for="college">College</label> <input type="text"
							placeholder="Enter your college name" name="college"
							class="form-control" id="college">
					</div>
					
						<div class="form-group">
						<label for="city">City</label> <input type="text"
							placeholder="Enter your city" name="city"
							class="form-control" id="city">
					</div>

					<div class="container text-center">

						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline-danger">Back</a>


						<button type="submit" class="btn btn-primary">Add</button>
					</div>
				</form>


			</div>

		</div>

	</div>

</body>
</html>