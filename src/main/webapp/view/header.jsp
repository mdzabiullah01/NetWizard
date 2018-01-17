<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!--logo start-->
<div class="brand">
    <a href="index.html" class="logo">
        <span class="logoIcon"></span>
    </a>
    <div class="sidebar-toggle-box">
        <div class="fa fa-bars"></div>
    </div>
</div>
<!--logo end-->

<div class="top-nav clearfix">
    <!--search & user info start-->
    <ul class="nav pull-right top-menu">
       <!--  <li>
            <input type="text" class="form-control search" placeholder=" Search">
        </li> -->
        <!-- user profile -->
        <li>
            <span>
                <img alt="" src="images/2.png">
                <span class="username">Welcome, <span><c:if test="${not empty users}"> ${users.firstName}</c:if> <c:if test="${not empty users}"> ${users.lastName}</c:if></span></span>                
            </span>
           
        </li>
        <!-- user profile -->

        <!-- logout start-->
        <li>
            <a href="<%=request.getContextPath() %>/logout">Logout <span class="logOutIcon"></a>
        </li>
        <!-- logout end -->
       
    </ul>
    <!--search & user info end-->
</div>

<aside>
    <div id="sidebar" class="nav-collapse">
        <!-- sidebar menu start-->
        <div class="leftside-navigation">
            <ul class="sidebar-menu" id="nav-accordion">
                <li>
                 	<c:choose>
					    <c:when test="${not empty dashboardactive}">
					        <a class="active" href="<%=request.getContextPath() %>/dashboard">
								<span class="desktopIcon active"></span>
                        		<span>Dashboard</span>
                    		</a>
					    </c:when>
					    <c:otherwise>
						    <a href="<%=request.getContextPath() %>/dashboard">
								<span class="desktopIcon"></span>
		                        <span>Dashboard</span>
		                    </a>
					    </c:otherwise>
					</c:choose>
                    
                </li>
                
                <li>
                   <c:choose>
					    <c:when test="${not empty welcomeboardactive}">
					         <a class="active" href="<%=request.getContextPath() %>/welcomeboard">
								<span class="welcomeIcon active"></span>
		                        <span>Welcome Board</span>
		                    </a>
					    </c:when>
					    <c:otherwise>
					         <a href="<%=request.getContextPath() %>/welcomeboard">
								<span class="welcomeIcon"></span>
		                        <span>Welcome Board</span>
		                    </a>
					    </c:otherwise>
					</c:choose>
                   
                </li>

                <li>
                 <c:choose>
					    <c:when test="${not empty surveyactive}">
					         <a class="active" href="<%=request.getContextPath() %>/survey">
								<span class="surveyIcon active"></span>
		                        <span>Survey</span>
		                    </a>
					    </c:when>
					    <c:otherwise>
					         <a href="<%=request.getContextPath() %>/survey">
                        		<span class="surveyIcon"></span>
		                        <span>Survey</span>
		                    </a>
					    </c:otherwise>
					</c:choose>
                </li>

                <li>
                  <c:choose>
					    <c:when test="${not empty reportsactive}">
					         <a class="active" href="<%=request.getContextPath() %>/reports">
								<span class="reportsIcon active"></span>
		                        <span>Reports</span>
		                    </a>
					    </c:when>
					    <c:otherwise>
					        <a href="<%=request.getContextPath() %>/reports">
		                        <span class="reportsIcon"></span>
		                        <span>Reports</span>
		                    </a>
					    </c:otherwise>
					</c:choose>
                </li>

                <li>
                   <c:choose>
					    <c:when test="${not empty preferencesactive}">
					         <a class="active" href="<%=request.getContextPath() %>/preferences">
								<span class="settingsIcon active"></span>
		                        <span>Preferences</span>
		                    </a>
					    </c:when>
					    <c:otherwise>
					        <a href="<%=request.getContextPath() %>/preferences">
		                        <span class="settingsIcon"></span>
		                        <span>Preferences</span>
		                    </a>
					    </c:otherwise>
					</c:choose>
                </li>

                <li>
                <c:choose>
					    <c:when test="${not empty usermanagementactive}">
					         <a class="active" href="<%=request.getContextPath() %>/usermanagement">
								<span class="userMngtIcon active"></span>
		                        <span>User Management</span>
		                    </a>
					    </c:when>
					    <c:otherwise>
					         <a href="<%=request.getContextPath() %>/usermanagement">
		                        <span class="userMngtIcon"></span>
		                        <span>User Management</span>
		                    </a>
					    </c:otherwise>
					</c:choose>
                </li>
            </ul>            
</div>
        <!-- sidebar menu end-->
    </div>
</aside>