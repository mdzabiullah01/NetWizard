<!DOCTYPE html>
<head>
<title>Net Wizards Admin Panel Category Bootstrap Responsive Website Template | Home </title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Visitors Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstrap-css -->
<link rel="stylesheet" href="css/bootstrap.min.css" >
<!-- //bootstrap-css -->
<!-- Custom CSS -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/style-responsive.css" rel="stylesheet"/>
<!-- font CSS -->
<link href='//fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<!-- font-awesome icons -->
<link rel="stylesheet" href="css/font.css" type="text/css"/>
<link href="css/font-awesome.css" rel="stylesheet"> 
<link rel="stylesheet" href="css/morris.css" type="text/css"/>
<!-- calendar -->
<link rel="stylesheet" href="css/monthly.css">
<!-- //calendar -->



<link rel="stylesheet" href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css" type="text/css">
<link rel="stylesheet" href="https://cdn.datatables.net/responsive/2.2.1/css/responsive.dataTables.min.css" type="text/css">

<link rel="stylesheet" href="css/custom-style.css">

<!-- //font-awesome icons -->
<script src="js/jquery2.0.3.min.js"></script>
<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/responsive/2.2.1/js/dataTables.responsive.min.js"></script>
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
        <div class="col-md-6"><h1>Dashboard</h1></div>

        <div class="col-md-6">
            <ul>
                <li><span class="calendarIcon"></span> <span>11 December 2017</span></li>
                <li><span class="clockIcon"></span> <span>01:22:45 PM</span></li>
            </ul>

        </div>

    </div>
		
		<div class="row">
			<div class="panel-body" >
				<div class="col-md-6 w3ls-graph">
					<!--agileinfo-grap-->
						<div class="agileinfo-grap">
							<div class="agileits-box">
								<header class="agileits-box-header clearfix">
									<h3>Current Survey Running</h3>
										<div class="toolbar">
											
											
										</div>
								</header>
								<div class="agileits-box-body clearfix">
									<div id="hero-area"></div>
								</div>
                                <div class="agileits-box-data">
                                    <div class="row">
                                        <div class="col-xs-12 col-sm-12 col-md-2 pR0">
                                        <label class="lh15">survey name</label>
                                        </div>
                                        <div class="col-xs-12 col-sm-12 col-md-10">
                                        <input type="text" value="work environment from march to april" disabled>
                                        </div>
                                    </div>
                                    <div class="row altRow">
                                    <div class="col-md-6">

                                        <label class="lh15">survey category</label>
                                        <input type="text" value="work environment" disabled>
                                    </div>
                                    <div class="col-md-6">
                                        <label  class="lh15">start date of survey</label>
                                        <input type="text" value="20/04/2017" disabled>
                                    </div>
                                    </div>
                                    <div class="row altRow">
                                    <div class="col-md-6">
                                        <label class="lh15">total answers</label>
                                        <input type="text" value="30" class="disableBg" 
                                        disabled>
                                    </div>
                                    <div class="col-md-6">
                                        <label  class="lh15">end date of survey</label>
                                        <input type="text" value="30/04/2017" disabled>
                                    </div>
                                    </div>
                                </div>
							</div>
						</div>
	<!--//agileinfo-grap-->

				</div>

                <div class="col-md-6 w3ls-graph">
                    <!--agileinfo-grap-->
                        <div class="agileinfo-grap">
                            <div class="agileits-box">
                                <header class="agileits-box-header clearfix">
                                    <h3>Previous Work Environment Survey</h3>
                                        <div class="toolbar">
                                            
                                            
                                        </div>
                                </header>
                                <div class="agileits-box-body clearfix">
                                    <div id="graph8"></div>
                        <script>
                        /* data stolen from http://howmanyleft.co.uk/vehicle/jaguar_'e'_type */
                        var day_data = [
                          {"period": "2016-10-01", "licensed": 3407, "sorned": 660},
                          {"period": "2016-09-30", "licensed": 3351, "sorned": 629},
                          {"period": "2016-09-29", "licensed": 3269, "sorned": 618}
                        
                       
                        ];
                        Morris.Bar({
                          element: 'graph8',
                          data: day_data,
                          xkey: 'period',
                          ykeys: ['licensed', 'sorned'],
                          labels: ['Licensed', 'SORN'],
                          xLabelAngle: 60
                        });
                        </script>
                                </div>
                                <div class="agileits-box-data">
                                    <div class="row">
                                        <div class="col-xs-12 col-sm-12 col-md-2 pR0">
                                        <label class="lh15">survey name</label>
                                        </div>
                                        <div class="col-xs-12 col-sm-12 col-md-10">
                                        <input type="text" value="work environment from march to april" disabled>
                                        </div>
                                    </div>
                                    <div class="row altRow">
                                    <div class="col-md-6">

                                        <label class="lh15">survey category</label>
                                        <input type="text" value="work environment" disabled>
                                    </div>
                                    <div class="col-md-6">
                                        <label  class="lh15">start date of survey</label>
                                        <input type="text" value="20/04/2017" disabled>
                                    </div>
                                    </div>
                                    <div class="row altRow">
                                    <div class="col-md-6">
                                        <label class="lh15">total answers</label>
                                        <input type="text" value="30" class="disableBg" 
                                        disabled>
                                    </div>
                                    <div class="col-md-6">
                                        <label  class="lh15">end date of survey</label>
                                        <input type="text" value="30/04/2017" disabled>
                                    </div>
                                    </div>
                                </div>
                            </div>
                        </div>
    <!--//agileinfo-grap-->

                </div>
			</div>
		</div>
		
			<div class="clearfix"></div>
		<div class="agileits-stats">
					
					<div class="col-md-12 stats-info stats-last widget-shadow">
						<div class="stats-last-agile">
							<table id="dashboardTable" class="tableResponsiveData table stats-table responsive display nowrap" >
								<thead>
									<tr>
										<th>Date</th>
										<th>Time</th>
										<th>Message Type</th>
										<th>Employee</th>
                                        <th>Message Content</th>
                                        <th>Duration</th>
                                        <th>Status</th>
                                        <th></th>
									</tr>
								</thead>
								<tbody>
                                    <tr class="disabledRow">
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-success">Shown</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
                                    <tr class="disabledRow">
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-warning">Shown</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-info">Running</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-danger">Scheduled</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-danger">Scheduled</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-danger">Scheduled</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
									<tr class="disabledRow">
										<th scope="row">11/12/2017</th>
										<td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
										<td><span class="label label-success">Shown</span></td>
										<td><a href="#" class="editRow">Edit</a></td>
									</tr>
                                    <tr class="disabledRow">
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-warning">Shown</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-info">Running</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-danger">Scheduled</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-danger">Scheduled</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-danger">Scheduled</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
                                    <tr class="disabledRow">
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-success">Shown</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
                                    <tr class="disabledRow">
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-warning">Shown</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-info">Running</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-danger">Scheduled</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-danger">Scheduled</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-danger">Scheduled</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
                                    <tr class="disabledRow">
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-success">Shown</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
                                    <tr class="disabledRow">
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-warning">Shown</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-info">Running</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-danger">Scheduled</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-danger">Scheduled</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">11/12/2017</th>
                                        <td>08:05 AM</td>
                                        <td>Employee Event</td>
                                        <td>Sayeed Sameer</td>
                                        <td>Happy Birthday Sameer</td>
                                        <td>1 Minute</td>
                                        <td><span class="label label-danger">Scheduled</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
									
								</tbody>
							</table>
						</div>
					</div>
					<div class="clearfix"> </div>
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
		//BOX BUTTON SHOW AND CLOSE
	   jQuery('.small-graph-box').hover(function() {
		  jQuery(this).find('.box-button').fadeIn('fast');
	   }, function() {
		  jQuery(this).find('.box-button').fadeOut('fast');
	   });
	   jQuery('.small-graph-box .box-close').click(function() {
		  jQuery(this).closest('.small-graph-box').fadeOut(200);
		  return false;
	   });
	   
	    //CHARTS
	    function gd(year, day, month) {
			return new Date(year, month - 1, day).getTime();
		}
		
		graphArea2 = Morris.Area({
			element: 'hero-area',
			padding: 10,
        behaveLikeLine: true,
        gridEnabled: false,
        gridLineColor: '#dddddd',
        axes: true,
        resize: true,
        smooth:true,
        pointSize: 0,
        lineWidth: 0,
        fillOpacity:0.85,
			data: [
				{period: '2015 Q1', iphone: 2668, ipad: null, itouch: 2649},
				{period: '2015 Q2', iphone: 15780, ipad: 13799, itouch: 12051},
				{period: '2015 Q3', iphone: 12920, ipad: 10975, itouch: 9910},
				{period: '2015 Q4', iphone: 8770, ipad: 6600, itouch: 6695},
				{period: '2016 Q1', iphone: 10820, ipad: 10924, itouch: 12300},
				{period: '2016 Q2', iphone: 9680, ipad: 9010, itouch: 7891},
				{period: '2016 Q3', iphone: 4830, ipad: 3805, itouch: 1598},
				{period: '2016 Q4', iphone: 15083, ipad: 8977, itouch: 5185},
				{period: '2017 Q1', iphone: 10697, ipad: 4470, itouch: 2038},
			
			],
			lineColors:['#eb6f6f','#926383','#eb6f6f'],
			xkey: 'period',
            redraw: true,
            ykeys: ['iphone', 'ipad', 'itouch'],
            labels: ['All Visitors', 'Returning Visitors', 'Unique Visitors'],
			pointSize: 2,
			hideHover: 'auto',
			resize: true
		});
		
	   
	});
	</script>

    <script>
    $(document).ready(function() {
    var table = $('#dashboardTable').DataTable( {
        scrollY: 300,
        paging: true,
        bSort:false
    });   


    } );
    </script>
    

</body>
</html>
