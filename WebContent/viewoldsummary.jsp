<%@page import="careownership.Logic.MentorLogic"%>
<%@page import="careownership.Utils.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Meeting Summary</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Le styles -->
<link href="assets/css/bootstrap.css" rel="stylesheet">
<link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
<link href="assets/css/jquery-ui.min.css" rel="stylesheet">
<link href="assets/css/jquery.timepicker.css" rel="stylesheet">
<link href="https://cdn.datatables.net/plug-ins/f2c75b7247b/integration/bootstrap/3/dataTables.bootstrap.css" rel="stylesheet">


<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="assets/js/modernizr.js"></script>
<script src="assets/js/jquery-ui.js"></script>
<script src="assets/js/jquery.timepicker.min.js"></script>

<script src="https://cdn.datatables.net/1.10.5/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/plug-ins/f2c75b7247b/integration/bootstrap/3/dataTables.bootstrap.js"></script>





<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<script type="text/javascript">

$(function() {
	$('#example').dataTable();
	
	if (!Modernizr.inputtypes['time']) {
		/*$('input[type=date]').datepicker({
			dateFormat: 'yy-mm-dd'
		});*/
		
		$('input[type=date]').timepicker();
	}
});


</script>
<!-- <style>
      body {
        padding-top: 30px;
        padding-bottom: 30px;
      }
    </style>  -->


<style type="text/css">
body {
	padding-top: 60px;
	padding-bottom: 40px;
	padding-left: 10px;
}

.sidebar-nav {
	padding: 9px 0;
}

@media ( max-width : 980px) {
	/* Enable use of floated navbar text */
	.navbar-text.pull-right {
		float: none;
		padding-left: 5px;
		padding-right: 5px;
	}
}
</style>

<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

<!-- Le fav and touch icons -->
</head>

<body>

	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container-fluid">
				<button type="button" class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="brand" href="#">Project name</a>
				<div class="nav-collapse collapse">
					<p class="navbar-text pull-right">
						Logged in as <a href="#" class="navbar-link">Username</a>
					</p>
					<ul class="nav">
						<li class="active"><a href="#">Home</a></li>
						<li><a href="#about">About</a></li>
						<li><a href="#contact">Contact</a></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>


	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span3">
				<div class="well sidebar-nav">
					<ul class="nav nav-list">
						<li class="nav-header">Options</li>
						<li><a class="active"
							href="mettingsummaryform.jsp">Create Meeting Summary</a></li>
						<li class="active"><a href="viewoldsummary.jsp">View Old Summaries</a></li>
						<li><a href="viewfeedback.jsp">View Feedback</a></li>
					</ul>
				</div>
				<!--/.well -->
			</div>
			<!--/span-->

			<div class="span9">
				<div class="row-fluid">
					<div class="span9">
						<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
            <tr>
                <th>ID</th>
                <th>Place</th>
                <th>Notes</th>
                <th>Goals</th>
            </tr>
        </thead>
 
        <tfoot>
            <tr>
                <th>ID</th>
                <th>Place</th>
                <th>Notes</th>
                <th>Goals</th>
            </tr>
        </tfoot>
 
        <tbody>
            <%
        	session=request.getSession(false);  
			int mentorID = 0;
			if(session!=null)
			{
				
		    	mentorID=Integer.parseInt(session.getAttribute("SessionMentor").toString());  
		    	MentorLogic logic = new MentorLogic();
		    	Messages message = logic.getAllMeetings(mentorID);			
			      if(message.isStatus())
			      {%>
			    	 <%= message.getReturnData() %>
			      <%}
			}

                        
            %>
        </tbody>
    </table>

						
					</div>
					<!--/span-->
				</div>
				<!--/row-->

			</div>
			<!--/span-->
		</div>
		<!--/row-->
	</div>
</body>
</html>