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

<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css"
	type="text/css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/responsive/2.2.1/css/responsive.dataTables.min.css"
	type="text/css">
<!-- calendar -->
<link rel="stylesheet" href="css/monthly.css">
<!-- //calendar -->

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
						<h1>Preferences</h1>
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
				<div class="agileits-stats">

					<div class="col-md-12 stats-info stats-last widget-shadow">
						<div class="row">
							<div class="col-md-12">
								<h5>Define the group and department of Employees</h5>
							</div>
						</div>

						<div class="row topForm row-no-margin">
							<form:form class="formStyle1" modelAttribute="departmentRequest"
								action="saveDepartmentInfo" method="post">
								<div class="col-md-4">
									<form:label path="assignGroupId">Type</form:label>

									<form:select path="assignGroupId" class="custom-dropdown">
										<form:option value="" label="--- Select Group ---" />
										<form:options items="${allGroups}" itemValue="_id"
											itemLabel="groupName" />

									</form:select>
								</div>
								<div class="col-md-4">
									<form:label path="departmentName">Name</form:label>
									<form:input path="departmentName" type="text" />
								</div>
								<div class="col-md-4">
									<button type="submit" class="blueBtn">Create</button>
									<button type="reset" class="grayBtn">Cancel</button>
								</div>
							</form:form>
						</div>

						<div class="stats-last-agile">

							<table id="prefer1Table"
								class="tableResponsiveData table stats-table responsive display nowrap tableResponsive">
								<thead>
									<tr>
										<th>S.No.</th>
										<th>Date</th>
										<th>Type</th>
										<th>Name</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${departmentList}" var="dept"
										varStatus="deptVar">
										<tr>
											<th scope="row">${deptVar.count}</th>
											<%-- <th>${dept.createdDate}</th> --%>
											<td><fmt:formatDate value="${dept.createdDate}"
													pattern="dd-MM-yyyy" /></td>
											<td>${dept.assignGroup.groupName}</td>
											<td>${dept.departmentName}</td>
										</tr>
									</c:forEach>

								</tbody>
							</table>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>

				<div class="agileits-stats">

					<div class="col-md-12 stats-info stats-last widget-shadow">
						<div class="row">
							<div class="col-md-6">
								<h5>Employee Registration</h5>
							</div>
							<div class="col-md-6 text-right">
								<h6>
									For Bulk Registration, please <span class="linkText">click
										here</span>
								</h6>
							</div>
						</div>

						<div class="stats-last-agile">

							<table id="prefer2Table"
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
									<tr>
										<th scope="row">1</th>
										<td>Syed Sameer</td>
										<td>Sardar</td>
										<td>10/10/1988</td>
										<td>10/02/2008</td>
										<td>Indian Nationality</td>
										<td>IT</td>
										<td><span class="linkText">Upload</span></td>
										<td class="text-center"><span class="saveIcon"></span> <span
											class="editIcon"></span></td>
									</tr>
									<tr>
										<th scope="row">2</th>
										<td>Syed Sameer</td>
										<td>Sardar</td>
										<td>10/10/1988</td>
										<td>10/02/2008</td>
										<td>Indian Nationality</td>
										<td>IT</td>
										<td><span class="linkText">Upload</span></td>
										<td class="text-center"><span class="saveIcon"></span> <span
											class="editIcon"></span></td>
									</tr>
									<tr>
										<th scope="row">3</th>
										<td>Syed Sameer</td>
										<td>Sardar</td>
										<td>10/10/1988</td>
										<td>10/02/2008</td>
										<td>Indian Nationality</td>
										<td>IT</td>
										<td><span class="linkText">Upload</span></td>
										<td class="text-center"><span class="saveIcon"></span> <span
											class="editIcon"></span></td>
									</tr>
									<tr>
										<th scope="row">4</th>
										<td>Syed Sameer</td>
										<td>Sardar</td>
										<td>10/10/1988</td>
										<td>10/02/2008</td>
										<td>Indian Nationality</td>
										<td>IT</td>
										<td><span class="linkText">Upload</span></td>
										<td class="text-center"><span class="saveIcon"></span> <span
											class="editIcon"></span></td>
									</tr>
									<tr>
										<th scope="row">5</th>
										<td>Syed Sameer</td>
										<td>Sardar</td>
										<td>10/10/1988</td>
										<td>10/02/2008</td>
										<td>Indian Nationality</td>
										<td>IT</td>
										<td><span class="linkText">Upload</span></td>
										<td class="text-center"><span class="saveIcon"></span> <span
											class="editIcon"></span></td>
									</tr>
									<tr>
										<th scope="row">6</th>
										<td>Syed Sameer</td>
										<td>Sardar</td>
										<td>10/10/1988</td>
										<td>10/02/2008</td>
										<td>Indian Nationality</td>
										<td>IT</td>
										<td><span class="linkText">Upload</span></td>
										<td class="text-center"><span class="saveIcon"></span> <span
											class="editIcon"></span></td>
									</tr>
									<tr>
										<th scope="row">7</th>
										<td>Syed Sameer</td>
										<td>Sardar</td>
										<td>10/10/1988</td>
										<td>10/02/2008</td>
										<td>Indian Nationality</td>
										<td>IT</td>
										<td><span class="linkText">Upload</span></td>
										<td class="text-center"><span class="saveIcon"></span> <span
											class="editIcon"></span></td>
									</tr>
									<tr>
										<th scope="row">8</th>
										<td>Syed Sameer</td>
										<td>Sardar</td>
										<td>10/10/1988</td>
										<td>10/02/2008</td>
										<td>Indian Nationality</td>
										<td>IT</td>
										<td><span class="linkText">Upload</span></td>
										<td class="text-center"><span class="saveIcon"></span> <span
											class="editIcon"></span></td>
									</tr>
									<tr>
										<th scope="row">9</th>
										<td>Syed Sameer</td>
										<td>Sardar</td>
										<td>10/10/1988</td>
										<td>10/02/2008</td>
										<td>Indian Nationality</td>
										<td>IT</td>
										<td><span class="linkText">Upload</span></td>
										<td class="text-center"><span class="saveIcon"></span> <span
											class="editIcon"></span></td>
									</tr>


								</tbody>
							</table>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>


				<div class="agileits-stats">

					<div class="col-md-12 stats-info stats-last widget-shadow">
						<div class="row">
							<div class="col-md-12">
								<h5>Define the group and department of employees</h5>
							</div>
						</div>
						<div class="stats-last-agile">

							<table id="prefer3Table"
								class="tableResponsiveData table stats-table responsive display nowrap tableResponsive">
								<thead>
									<tr>
										<th>S.No.</th>
										<th>Method</th>
										<th>Field #1</th>
										<th>Field #2</th>
										<th>Field #3</th>
										<th>Field #4</th>
										<th>Field #5</th>
										<th>Field #6</th>
										<th></th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<th scope="row">1</th>
										<td>Method #1</td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td class="text-center"><span class="saveIcon"></span> <span
											class="editIcon"></span></td>
									</tr>
									<tr>
										<th scope="row">2</th>
										<td>Method #1</td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy Happy Happy</span> <span class="linkText">Image</span></td>
										<td class="text-center"><span class="saveIcon"></span> <span
											class="editIcon"></span></td>
									</tr>
									<tr>
										<th scope="row">3</th>
										<td>Method #1</td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td class="text-center"><span class="saveIcon"></span> <span
											class="editIcon"></span></td>
									</tr>
									<tr>
										<th scope="row">4</th>
										<td>Method #1</td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td class="text-center"><span class="saveIcon"></span> <span
											class="editIcon"></span></td>
									</tr>
									<tr>
										<th scope="row">5</th>
										<td>Method #1</td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy Happy Happy</span> <span class="linkText">Image</span></td>
										<td class="text-center"><span class="saveIcon"></span> <span
											class="editIcon"></span></td>
									</tr>
									<tr>
										<th scope="row">6</th>
										<td>Method #1</td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td class="text-center"><span class="saveIcon"></span> <span
											class="editIcon"></span></td>
									</tr>
									<tr>
										<th scope="row">7</th>
										<td>Method #1</td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td class="text-center"><span class="saveIcon"></span> <span
											class="editIcon"></span></td>
									</tr>
									<tr>
										<th scope="row">8</th>
										<td>Method #1</td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy Happy Happy</span> <span class="linkText">Image</span></td>
										<td class="text-center"><span class="saveIcon"></span> <span
											class="editIcon"></span></td>
									</tr>
									<tr>
										<th scope="row">9</th>
										<td>Method #1</td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td><span>Happy</span> <span class="linkText">Image</span></td>
										<td class="text-center"><span class="saveIcon"></span> <span
											class="editIcon"></span></td>
									</tr>


								</tbody>
							</table>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
			</section>
			<footer>
				<jsp:include page="/view/footer.jsp"></jsp:include>s
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

			var table = $('table.display').DataTable({
				scrollY : 200,
				paging : true,
				bSort : false
			});

		});
	</script>

</body>
</html>
