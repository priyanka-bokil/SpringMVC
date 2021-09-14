<html>
<head>
<%@include file="./base.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

</head>
<body>
	<div class="container mt-3">
		<div class="row">

			<div class="col-md-12">

				<h1 class="text-center mb-3">Welcome to Student App</h1>
				
				<form action="search-student" method="GET">
				<div class="form-group">
				<h6>Search Student by name</h6>
				<input type="number" placeholder="Enter name of Student">
				<button type="submit" class="btn btn-outline-success btn-sm" name="roll">Search</button>
				</div>
				</form>
				
				<br>
				
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Roll No</th>
							<th scope="col">Student Name</th>
							<th scope="col">College</th>
							<th scope="col">City</th>
						</tr>
					</thead>
					<tbody>
					
					<c:forEach items="${students }" var="s">
						<tr>
							<th scope="row">${s.roll }</th>
							<td>${s.name }</td>
							<td>${s.college }</td>
							<td>${s.city }</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="container text-center">
					<a href="student-form" class="btn btn-outline-success">Add student</a>
				</div>
			</div>
		</div>


	</div>
</body>
</html>