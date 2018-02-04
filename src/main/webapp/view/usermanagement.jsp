<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<head>
<title>Net Wizards Admin Panel Category Bootstrap Responsive
	Website Template | Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Visitors Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>

<!-- bootstrap-css -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- //bootstrap-css -->
<!-- Custom CSS -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/style-responsive.css" rel="stylesheet" />
<!-- font CSS -->
<link
	href='//fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic'
	rel='stylesheet' type='text/css'>
<!-- font-awesome icons -->
<link rel="stylesheet" href="css/font.css" type="text/css" />
<link href="css/font-awesome.css" rel="stylesheet">
<link rel="stylesheet" href="css/morris.css" type="text/css" />
<!-- calendar -->
<link rel="stylesheet" href="css/monthly.css">
<!-- //calendar -->



<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css"
	type="text/css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/responsive/2.2.1/css/responsive.dataTables.min.css"
	type="text/css">

<link rel="stylesheet" href="css/custom-style.css">

<!-- //font-awesome icons -->
<script src="js/jquery2.0.3.min.js"></script>
<script
	src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script
	src="https://cdn.datatables.net/responsive/2.2.1/js/dataTables.responsive.min.js"></script>
<script src="js/raphael-min.js"></script>
<script src="js/morris.js"></script>
</head>
<body>
	<section id="container">
		<!--header start-->
		<header class="header fixed-top clearfix">
			<jsp:include page="/view/header.jsp"></jsp:include>
		</header>
		<!--header end-->
		<!--sidebar start-->
		<!--sidebar end-->
		<!--main content start-->
		<section id="main-content">
			<section class="wrapper">


				<div class="row breadcrumb">
					<div class="col-md-6">
						<h1>User Management</h1>
					</div>

					<div class="col-md-6">
						<ul>
							<li><span class="calendarIcon"></span> <span>11
									December 2017</span></li>
							<li><span class="clockIcon"></span> <span>01:22:45 PM</span></li>
						</ul>

					</div>

				</div>


				<div class="clearfix"></div>
				<%-- <div class="agileits-stats">

					<div class="col-md-12 stats-info stats-last widget-shadow">
						<div class="stats-last-agile">
							<table id="employeesTable"
								class="tableResponsiveData table stats-table responsive display nowrap tableResponsive">
								<thead>
									<tr>
										<th>Name</th>
										<th>Assigned Group</th>
										<th>Nationality</th>

									</tr>
								</thead>
								<tbody>
									<c:forEach items="${userList}" var="usr">
										<tr>
											<th scope="row">${usr.firstName}${usr.lastName}</th>
											<td>${usr.assignGroup}</td>
											<td>${usr.nationality}</td>
										</tr>
									</c:forEach>


								</tbody>
							</table>
						</div>
					</div>
					<div class="clearfix"></div>
				</div> --%>

				<div class="agileits-stats">

					<div class="col-md-12 stats-info stats-last widget-shadow">
						<div class="row">
							<div class="col-md-12">
								<h5>Employee Registration</h5>
							</div>
							<div class="col-md-12 text-right">
								<h6>
									For Bulk Registration, please <span class="linkText">click
										here</span>
								</h6>
							</div>
						</div>

						<div class="stats-last-agile">

							<table id="employeesTable"
								class="tableResponsiveData table stats-table responsive display nowrap tableResponsive">

								<thead>
									<tr>
										<th>S.No.</th>
										<th>First Name</th>
										<th>Last Name</th>
										<th>Date Of Birth</th>
										<th>Date Of Joining</th>
										<th>Group</th>
										<th>Department</th>
										<th>Picture</th>
										<th></th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${userList}" var="usr" varStatus="usersVar">
										<tr>
											<th scope="row">${usersVar.count}</th>
											<th>${usr.firstName}</th>
											<td>${usr.lastName}</td>
											<td><fmt:formatDate value="${usr.dateofbirth}"
													pattern="dd-MM-yyyy" /></td>
											<td><fmt:formatDate value="${usr.dateOfJoinging}"
												pattern="dd-MM-yyyy" />
											</td>
											<td>${usr.department.assignGroup.groupName}</td>
											<td>${usr.department.departmentName}</td>
											<td><span class="linkText">Upload</span></td>
											<td class="text-center"><span class="saveIcon"></span> <span
												class="editIcon"></span></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>

				<div class="agileits-stats">
					<div class="row topForm row-no-margin">
						<form>

							<div class="col-md-2 col-no-padding pull-left">
								<button type="button" class="blueBtn">Add Employee</button>
							</div>
						</form>
					</div>

				</div>


				<div class="agileits-stats">
					<div class="row topForm row-no-margin">

						<form:form class="formStyle1" modelAttribute="userRequest"
							action="saveUserInfo" method="post" id="empRegister">

							<%-- <form class="formStyle1" action="saveUserInfo" method="post" enctype="multipart/form-data"> --%>

							<div class="row row-no-margin">
								<div class="col-md-4 col-no-padding">
									<form:label path="firstName">First Name</form:label>
									<form:input path="firstName" type="text" />
									<%-- <form:errors path="firstName"/> --%>
								</div>
								<div class="col-md-4">
									<form:label path="lastName">Last Name</form:label>
									<form:input path="lastName" type="text" />
								</div>
								<div class="col-md-4">
									<form:label path="dateofbirth">Date of Birth</form:label>
									<%-- <form:input path="dateofbirth" type="date" /> --%>
									<form:input path="dateofbirth" cssClass="date-picker" />

								</div>
							</div>
							<div class="row row-no-margin">
								<div class="col-md-4 col-no-padding">
									<form:label path="nationality">Nationality</form:label>

									<form:select path="nationality">
										<form:option value="">--- Select Nationality ---</form:option>
										<form:option value="Indian">Indian</form:option>
										<form:option value="American">American</form:option>
										<form:option value="African">African</form:option>
									</form:select>

								</div>
								<div class="col-md-4">
									<form:label path="dateofjoing">Date of Joining</form:label>
									<form:input path="dateofjoing" type="date" />
								</div>
								<div class="col-md-4">
									<form:label path="multipartFile">Picture</form:label>
									<form:input path="multipartFile" type="file" />
								</div>
							</div>
							<div class="row row-no-margin">
								<div class="col-md-4 col-no-padding">
									<form:label path="departmentId">Department</form:label>

									<form:select path="departmentId">
										<form:option value="" label="--- Select Group ---" />
										<c:forEach items="${allDepartments}" var="dept">
											<form:option value="${dept._id}"
												label="${dept.departmentName} - ${dept.assignGroup.groupName}" />
										</c:forEach>
									</form:select>
								</div>
								<div class="col-md-2 col-no-padding pull-right">
									<form:button type="submit" class="blueBtn">Save</form:button>
									<form:button type="reset" class="blueBtn">Cancel</form:button>
								</div>
							</div>
							<%-- </form>   --%>
						</form:form>
					</div>

				</div>

				<div class="agileits-stats">
					<div class="row topForm row-no-margin">
						<form>

							<div class="col-md-2 col-no-padding pull-right">
								<button type="button" class="blueBtn">Add Group</button>
							</div>
						</form>
					</div>

				</div>

			</section>
			<footer>
				<jsp:include page="/view/footer.jsp"></jsp:include>
			</footer>
		</section>
		<!--main content end-->
	</section>
	<script src="js/bootstrap.js"></script>
	<script src="js/jquery.dcjqaccordion.2.7.js"></script>
	<script src="js/scripts.js"></script>
	<script src="js/jquery.slimscroll.js"></script>
	<script src="js/jquery.nicescroll.js"></script>
	<!--[if lte IE 8]><script language="javascript" type="text/javascript" src="js/flot-chart/excanvas.min.js"></script><![endif]-->
	<script src="js/jquery.scrollTo.js"></script>
	<!-- morris JavaScript -->


	<script>
		$(document).ready(function() {
			var table = $('#employeesTable').DataTable({
				scrollY : 300,
				paging : true,
				bSort : false
			});

		});
	</script>

</body>
</html>
