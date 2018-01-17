
<!DOCTYPE html>
<head>
<title>Net Wizards Admin Panel Category Bootstrap Responsive Website Template | Login </title>
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
<link rel="stylesheet" href="css/custom-style.css">
<!-- //font-awesome icons -->

</head>
<body class="loginBg">
<div class="log-w3 loginContainer">
<h2>Welcome <span>Board and Survey</span></h2>
<div class="w3layouts-main">
	<h2><span class="logoIcon"></span></h2>
	<p class="errorMsg">Please enter password</p>
	<div class="clearfix"></div>
		<form action="j_spring_security_check" method="post">
           
		    <div class="inputs">
		    	<span class="userIcon"></span>
		    	<input type="text" class="ggg" name="j_username" placeholder="Username" required="">

		    </div>

		    <div class="inputs">
		    	<span class="pwdIcon"></span>
		    	<input type="password" class="ggg" name="j_password" placeholder="PASSWORD" required="">
		    	
		    </div>
			
			<c:if test="${not empty error}"><font color="red" style="font-size: 12px;"> ${error} </font> </c:if> 
			
			<div class="row row-no-margin">
				<!-- <span class="pull-left"><input type="checkbox" />Remember Me</span> -->
				<span class="pull-right">
				<input type="submit" value="Sign In" name="login">
				</span>

				<div class="clearfix"></div>
			</div>
			
			<h6><a href="#">Forgot Password?</a></h6>
				<div class="clearfix"></div>
				
		</form>
		
</div>
</div>
 <footer>
		  <div class="footer">
			<div class="wthree-copyright">
			  <p>© 2017 netwizards. All rights reserved | Design by <a href="#">EmmDee</a></p>
			</div>
		  </div>
  </footer>
<script src="js/bootstrap.js"></script>
</body>
</html>
