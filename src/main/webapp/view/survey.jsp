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

<link rel="stylesheet" href="css/custom-style.css">

<link href="https://afeld.github.io/emoji-css/emoji.css" rel="stylesheet">

<!-- //font-awesome icons -->
<script src="js/jquery2.0.3.min.js"></script>
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
        <div class="col-md-6"><h1>Survey</h1></div>

        <div class="col-md-6">
            <ul>
                <li><span class="calendarIcon"></span> <span>11 December 2017</span></li>
                <li><span class="clockIcon"></span> <span>01:22:45 PM</span></li>
            </ul>

        </div>

    </div>
		
		<div class="clearfix"></div>
		<div class="agileits-stats">
					
					<div class="col-md-12 stats-info stats-last widget-shadow">
                    <div class="row">
                        <div class="col-md-12"><h5>Create a Survey</h5></div>                        
                    </div>

                    <div class="row topForm row-no-margin">
                        <form>
                           <div class="col-md-4 col-no-padding">
                           <label>Type</label>
                           <select class="custom-dropdown">
                               <option value="Environment">Environment</option>
                               <option value="Education">Education</option>
                               <option value="Sports">Sports</option>
                               <option value="Sports">Sports</option>
                           </select>
                           </div>
                           <div class="col-md-4">
                           <label>Survey Name</label>
                           <input type="text" name="surveyName">
                           </div>
                           <div class="col-md-4 col-no-padding">
                           <label>Schedule</label>
                           <button type="button" class="grayBtn">Date</button>
                           <button type="button" class="grayBtn">Time</button>
                           <button type="button" class="blueBtn">Add Question</button>
                           </div>
                        </form>                        
                    </div>
                    
						<div class="stats-last-agile surveyQuestContainer">

                        <!-- <div class="row emojiContainer">
                            <i class="em em-smiley"></i>
                             <i class="em em-neutral_face"></i>
                              <i class="em em-unamused"></i>

                        </div> -->


                        <div class="row">
                            <div class="emojiContainer">
                            <span class="emojis emoji-smiley"></span>
                             <span class="emojis emoji-neutral"></span>
                              <span class="emojis emoji-unamused"></span>
                              </div>
                        </div>

                        <div class="clearfix"></div>
                         
                         <div class="surveyBodyContainer">
                          <div class="row">
                              <h6>Question #1 <span class="linkText">Select Respond Method</span>
                              </h6>
                              <div class="col-md-10 col-no-padding">
                              <p>Are you satisfy with the improvement of working Enjoinment from Jan to Feb 2017?</p>
                              </div>
                              <div class="col-md-2"><button type="button" class="blueBtn">Add Next Question</button></div>
                          </div>

                          <div class="row">
                              <h6>Question #2 <span class="linkText">Select Respond Method</span>
                              </h6>
                              <div class="col-md-10 col-no-padding">
                              <p>Are you satisfy with the new interior design?</p>
                              </div>
                              <div class="col-md-2"><button type="button" class="blueBtn">Add Next Question</button></div>
                          </div>

                          <div class="row">
                              <h6>Question #3 <span class="linkText">Select Respond Method</span>
                              </h6>
                              <div class="col-md-10 col-no-padding">
                              <p>Are you satisfy with the new parking management system?</p>
                              </div>
                              <div class="col-md-2"><button type="button" class="blueBtn">Add Next Question</button></div>
                          </div> 
                          </div>
                          <div class="clearfix"> </div>
                          <div class="surveyFooter">
                            <div class="col-md-3 pull-right text-right">
                                <button type="button" class="blueBtn">Create</button>
                                <button type="button" class="grayBtn">Cancel</button>
                            </div>

                        </div>                     
							<div class="clearfix"> </div>
						</div>
                        
                        
                       
					</div>
					<div class="clearfix"> </div>
				</div>

                <div class="agileits-stats">
                    
                    <div class="col-md-12 stats-info stats-last widget-shadow">
                    <div class="row">
                        <div class="col-md-6"><h5>List of Surveys</h5></div>
                        
                    </div>
                    
                        <div class="stats-last-agile">
                        
                            <table class="table stats-table ">
                                <thead>
                                    <tr>
                                        <th>Issue Date</th>
                                        <th>Category</th>                                       
                                        <th>Survey Name</th>
                                        <th>Respond Method</th>
                                        <th>Presenting Date</th>
                                        <th>Presenting Time</th>
                                        <th>Status</th>                                        
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <th scope="row">11/12/2017</th>
                                        <td>Environment</td>
                                        <td>Working Environment from Jan to Feb 2017</td> 
                                        <td>Method #1</td>
                                        <td>12/11/2017</td>
                                        <td>8am -4pm</td>
                                        <td><span class="label label-success">Scheduled</span></td>
                                        <td><a href="#" class="editRow">Edit</a></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">11/12/2017</th>
                                        <td>Environment</td>
                                        <td>Working Environment from Jan to Feb 2017</td> 
                                        <td>Method #1</td>
                                        <td>12/11/2017</td>
                                        <td>8am -4pm</td>
                                        <td><span class="label label-success">Scheduled</span></td>
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
		
		
	   
	});
	</script>

</body>
</html>
