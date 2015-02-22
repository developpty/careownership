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


<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="assets/js/modernizr.js"></script>
<script src="assets/js/jquery-ui.js"></script>
<script src="assets/js/jquery.timepicker.min.js"></script>


<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<script type="text/javascript">

$(function() {
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
    <%
    try{
       	session=request.getSession(false);  
    			if(session!=null)
    			{
    				Object obj = session.getAttribute("SessionMentor");
    				if(obj ==null)
    					response.sendRedirect("index.jsp");
    			    
    			}else
    			{
    				response.sendRedirect("index.jsp");
    			}
    }catch(Exception e)
    {
    	
    }
                             
            %>
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
						<a href="Logout" class="navbar-link">Logout</a>
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
						<li class="active"><a class="active"
							href="mettingsummaryform.jsp">Create Meeting Summary</a></li>
						<li><a href="viewoldsummary.jsp">View Old Summaries</a></li>
						<li><a href="viewfeedback.jsp">View Feedback</a></li>
					</ul>
				</div>
				<!--/.well -->
			</div>
			<!--/span-->

			<div class="span9">
				<div class="row-fluid">
					<div class="span9">
						<%
							if (request.getAttribute("successMessage") != null) {
						%>
						<div class="alert alert-success">
							<a href="#" class="close" data-dismiss="alert">&times;</a>
							<strong>Success!</strong><%=request.getAttribute("successMessage")%>
						</div>
						<%
							} else if (request.getAttribute("accountList") != null) {
						%>
						<blockquote>
							account name:
							<%=request.getAttribute("accountList")%></blockquote>
						<%
							}
						%>

						<form class="form-horizontal" action="MentorServlet" method="post">
							<fieldset>

								<!-- Form Name -->
								<legend>Meeting Summary</legend>
								
								<!-- Select Basic -->
<div class="control-group">
  <label class="control-label" for="selectbasic-1">Select Basic</label>
  <div class="controls">
    <select id="select_apprentice" name="select_apprentice" class="input-xlarge">
      <%
      	session = request.getSession(false);
      	String options = (String)session.getAttribute("SessionMentorMentees");
      %>
		<%=options %>
    </select>
  </div>
</div>
								
								<!-- Text input-->
								<div class="control-group">
									<label class="control-label" for="text_time">Time</label>
									<div class="controls">
										<input id="text_time" name="text_time" placeholder=""
											class="input-xlarge" type="date">

									</div>
								</div>

								<!-- Text input-->
								<div class="control-group">
									<label class="control-label" for="text_place"> Place</label>
									<div class="controls">
										<input id="text_place" name="text_place"
											placeholder="placeholder" class="input-xlarge" type="text">

									</div>
								</div>

								<!-- Textarea -->
								<div class="control-group">
									<label class="control-label" for="text_notes">Notes</label>
									<div class="controls">
										<textarea id="text_notes" name="text_notes">Notes</textarea>
									</div>
								</div>

								<!-- Textarea -->
								<div class="control-group">
									<label class="control-label" for="text_topics_covered">Topics
										Covered</label>
									<div class="controls">
										<textarea id="text_topics_covered" name="text_topics_covered">Topic Covered</textarea>
									</div>
								</div>

								<!-- Textarea -->
								<div class="control-group">
									<label class="control-label" for="text_nextgoals">Next
										Goals</label>
									<div class="controls">
										<textarea id="text_nextgoals" name="text_nextgoals">Next Goals</textarea>
									</div>
								</div>

								<!-- Textarea -->
								<div class="control-group">
									<label class="control-label" for="text_observations">Observations</label>
									<div class="controls">
										<textarea id="text_observations" name="text_observations">Other Observations</textarea>
									</div>
								</div>

								<!-- Button -->
								<div class="control-group">
									<label class="control-label" for="singlebutton-0"></label>
									<div class="controls">
										<button id="singlebutton-0" name="singlebutton-0"
											class="btn btn-primary">Save</button>
									</div>
								</div>

							</fieldset>
						</form>

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