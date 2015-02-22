<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Received Summaries</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Le styles -->
<link href="assets/css/bootstrap.css" rel="stylesheet">
<link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
<link href="assets/css/jquery-ui.min.css" rel="stylesheet">
<link href="assets/css/jquery.timepicker.css" rel="stylesheet">
<link
	href="https://cdn.datatables.net/plug-ins/f2c75b7247b/integration/bootstrap/3/dataTables.bootstrap.css"
	rel="stylesheet">


<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="assets/js/modernizr.js"></script>
<script src="assets/js/jquery-ui.js"></script>
<script src="assets/js/jquery.timepicker.min.js"></script>

<script
	src="https://cdn.datatables.net/1.10.5/js/jquery.dataTables.min.js"></script>
<script
	src="https://cdn.datatables.net/plug-ins/f2c75b7247b/integration/bootstrap/3/dataTables.bootstrap.js"></script>





<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<script type="text/javascript">
	$(function() {
		if (!Modernizr.inputtypes['time']) {
			$('input[type=date]').datepicker({
				dateFormat : 'yy-mm-dd'
			});
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
						<li><a href="viewreceivedummary.jsp">View Received
								Summaries</a></li>
						<li class="active"><a href="trainee_registration.jsp">Trainee
								Registration</a></li>
						<li><a href="#">Todo</a></li>
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
						
						<form method="post" action="Registration">
							<fieldset>

								<!-- Form Name -->
								<legend>Basic Trainee Registration</legend>

								<div class="row-fluid">
									<div class="span4">

										<!-- Text input-->
										<div class="control-group">
											<label class="control-label" for="first_name">First
												Name</label>
											<div class="controls">
												<input id="first_name" name="first_name"
													placeholder="placeholder" class="input-large" type="text">

											</div>
										</div>

										<!-- Text input-->
										<div class="control-group">
											<label class="control-label" for="last_name">Last
												Name</label>
											<div class="controls">
												<input id="last_name" name="last_name"
													placeholder="placeholder" class="input-large" type="text">

											</div>
										</div>

										<!-- Text input-->
										<div class="control-group">
											<label class="control-label" for="mi">M.I.</label>
											<div class="controls">
												<input id="mi" name="mi" placeholder="placeholder"
													class="input-small" type="text">

											</div>
										</div>

										<!-- Text input-->
										<div class="control-group">
											<label class="control-label" for="ssn">SSN</label>
											<div class="controls">
												<input id="ssn" name="ssn" placeholder=""
													class="input-large" type="text">

											</div>
										</div>

										<!-- Text input-->
										<div class="control-group">
											<label class="control-label" for="date_of_birth">Date
												of Birth</label>
											<div class="controls">
												<input id="date_of_birth" name="date_of_birth"
													placeholder="placeholder" class="input-large" type="date">

											</div>
										</div>

									</div>
									<!--/span-->

									<div class="span4">
										<div class="control-group">
											<label class="control-label" for="probation_end_date">Probation
												End Date</label>
											<div class="controls">
												<input id="textinput" name="probation_end_date"
													placeholder="placeholder" class="input-medium" type="date">

											</div>
										</div>

										<!-- Multiple Radios (inline) -->
										<div class="control-group">
											<label class="control-label" for="radios">Pre-Training
												Graduate</label>
											<div class="controls">
												<label class="radio inline" for="radios-0"> <input
													name="pre_graduate" id="radios-0" value="Yes"
													checked="checked" type="radio"> Yes
												</label> <label class="radio inline" for="radios-1"> <input
													name="pre_graduate" id="radios-1" value="No" type="radio">
													No
												</label>
											</div>
										</div>

										<!-- Multiple Radios (inline) -->
										<div class="control-group">
											<label class="control-label" for="radios">Landorld
												Training</label>
											<div class="controls">
												<label class="radio inline" for="radios-0-land"> <input
													name="landlord_graduate" id="radios-0-land" value="Yes"
													checked="checked" type="radio"> Yes
												</label> <label class="radio inline" for="radios-1-land"> <input
													name="landlord_graduate" id="radios-1-land" value="No"
													type="radio"> No
												</label>
											</div>
										</div>

									</div>
									<!--/span-->
								</div>
								<!--/row-->


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
				</div>
			</div>
		</div>
	</div>
</body>
</html>