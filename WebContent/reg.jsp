<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script src="assets/js/modernizr.js"></script>
<script src="assets/js/jquery-1.11.2.js"></script>
<script src="assets/js/jquery-ui.js"></script>
<script src="assets/js/angular.js"></script>
<script src="assets/js/reg.js"></script>

<link rel="stylesheet" type="text/css" href="assets/css/jquery-ui.css">
<link rel="stylesheet" type="text/css" href="assets/css/jquery-ui.structure.css">
<link rel="stylesheet" type="text/css" href="assets/css/jquery-ui.theme.css">
<link rel="stylesheet" type="text/css" href="assets/css/main.css">

<title>Insert title here</title>
</head>
<body>

	<div id="side">
		<ul style="list-style-type: none;">
			<li><a href="#basic_info">Basic Info</a></li>
			<li><a href="#contact">Contact</a></li>
			<li><a href="#reference">Reference</a></li>
			<li><a href="#income">Income</a></li>
			<li><a href="#pre_training">Pre-Training</a></li>
			<li><a href="#landlord_training">Landlord Training</a></li>
			<li><a href="#drug_abuse">Drug Abuse</a></li>
			<li><a href="#alch_abuse">Alcohol Abuse</a></li>
			<li><a href="#mental_illness">Mental Illness</a></li>
			<li><a href="#arrests">Arrests</a></li>
			<li><a href="#spiritual_reference">Spiritual Reference</a></li>
			<li><a href="#house_purchase">House Purchase</a></li>
			<li><a href="#debt_appl">Debt as of Application</a></li>
			<li><a href="#debt_control">Debt Control Details</a></li>
		</ul>

	</div>
	<div id="right">

		<form action="Registration" method="post">
			<h2 id="basic_information">Basic Information</h2>

			<table style="width: 75%">
				<tr>
					<td><input id="last_name" name="last_name" type="text"></input></td>
					<td><input id="first_name" name="first_name" type="text"></input></td>
					<td style="width: 50px;"><input id="mi" name="mi" type="text"></input></td>
					<td><input id="ssn" name="ssn" type="text"></input></td>
					<td><input id="date_of_birth" name="date_of_birth" type="text"
						class="datepicker"></input></td>
					<td><input id="age" name="age" type="text"
						style="width: 50px;"></input></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td>First Name</td>
					<td>M.I.</td>
					<td>SSN</td>
					<td>Date of Birth</td>
					<td>Age</td>
				</tr>

				<tr>
					<td colspan="5"><input id="residence_address"
						name="residence_address" type="text"></input></td>
					<td><input id="apt" name="apt" type="text"
						style="width: 50px;"></input></td>
				</tr>

				<tr>
					<td colspan="5">Residence Address</td>
					<td>Apt #</td>
				</tr>

				<tr>
					<td><input id="zip_code" name="zip_code" type="text"></input></td>
					<td colspan="2"><input id="city" name="city" type="text"></input></td>
					<td><input id="county" name="county" type="text"></input></td>
					<td><input id="state" name="state" class="state" type="text"></input></td>
				</tr>
				<tr>
					<td>Zip Code</td>
					<td colspan="2">City</td>
					<td>County</td>
					<td>State</td>
				</tr>

				<tr>
					<td><div id="marital" class="buttonset">
							<input type="radio" id="mar1" name="marital" checked
								value="single"> <label for="mar1">Single</label> <input
								type="radio" id="mar2" name="marital" value="married"> <label
								for="mar2">Married</label>
						</div></td>
					<td colspan="2"><div id="gender" class="buttonset">
							<input type="radio" id="gen1" name="gender" checked="checked">
							<label for="gen1">Male</label> <input type="radio" id="gen2"
								name="gender"> <label for="gen2">Female</label>
						</div></td>
					<td colspan="2"><select name="edu" id="edu">
							<option value="primaryschool">Primary School</option>
							<option value="juniorhighschool">Junior High School</option>
							<option value="highschool">High School</option>
							<option value="undergraduate">Undergraduate</option>
							<option value="associate">Associate</option>
							<option value="bachelor">Bachelor</option>
							<option value="master">Master</option>
							<option value="doctoral">Doctoral</option>
					</select></td>
				</tr>
				<tr>
					<td>Marital Status</td>
					<td colspan="2">Gender</td>
					<td colspan="2">Highest Education Level</td>
				</tr>


				<tr>
					<td><div id="pre_graduate" class="buttonset">
							<input type="radio" id="pre_graduate_i1" name="pre_graduate"
								checked="checked"> <label for="pre_graduate_i1">Yes</label>
							<input type="radio" id="pre_graduate_i2" name="pre_graduate">
							<label for="pre_graduate_i2">No</label>
						</div></td>
					<td colspan="2"><div id="landlord_graduate" class="buttonset">
							<input type="radio" id="landlord_graduate_i1"
								name="landlord_graduate" checked="checked"> <label
								for="landlord_graduate_i1">Yes</label> <input type="radio"
								id="landlord_graduate_i2" name="landlord_graduate"> <label
								for="landlord_graduate_i2">No</label>
						</div></td>
					<td><input id="probation_end_date" name="probation_end_date"
						type="text" class="datepicker"></input></td>
				</tr>

				<tr>
					<td>Pre-Training Graduate</td>
					<td colspan="2">Landlord Training Graduate</td>
					<td>Probation End Date</td>
				</tr>


				<tr>

					<td><input id="mentor_start_date" name="mentor_start_date"
						type="text" class="datepicker"></input></td>
					<td colspan="2"><input id="mentor_end_date"
						name="mentor_end_date" type="text" class="datepicker"></input></td>
					<td></td>
				</tr>

				<tr>

					<td>Mentor Start Date</td>
					<td colspan="2">Mentor End Date</td>
					<td>Mentor</td>
				</tr>

				<tr>
					<td colspan="3"><textarea id="bio" rows="10" cols="10"></textarea></td>
					<td colspan="3"><textarea id="notes" rows="10" cols="10"></textarea></td>
				</tr>

				<tr>
					<td colspan="3">Biography</td>
					<td colspan="3">Notes</td>
				</tr>

			</table>

			<br>

			<h2 id="contact">Contact</h2>

			<table style="width: 50%">
				<tr>
					<td><input id="contact_phone_number" type="text"></input></td>
					<td><select name="contact_phone_type" id="phone_type">
							<option value="1">Type 1</option>
							<option value="2">Type 2</option>
					</select></td>
					<td><input id="contact_email_address" type="text"></input></td>
				</tr>
				<tr>
					<td>Phone Number</td>
					<td>Phone Type</td>
					<td>Email Address</td>
				</tr>
				<tr>
					<td colspan="2"><input id="contact_mailing_address"
						type="text"></input></td>
					<td><input id="contact_zip_code" type="text"></td>
				</tr>
				<tr>
					<td colspan="2">Mailing Address</td>
					<td>Zip Code</td>
				</tr>

				<tr>
					<td><input id="contact_city" type="text"></input></td>
					<td><input id="contact_county" type="text"></input></td>
					<td><input id="contact_state" type="text" class="state"></input></td>
				</tr>
				<tr>
					<td>City</td>
					<td>County</td>
					<td>State</td>
				</tr>

				<tr>
					<td colspan="2"><textarea id="notes_contact" rows="10"
							cols="10"></textarea></td>
				</tr>
				<tr>
					<td>Notes</td>
				</tr>

			</table>


			<h2 id="reference">Reference</h2>

			<table style="width: 50%">
				<tr>
					<td>Personal Reference Name</td>
					<td>Personal Reference Phone</td>
				</tr>
				<tr>
					<td><input id="reference_name" type="text"></input></td>
					<td><input id="reference_phone" type="text"></input></td>
				</tr>
			</table>

			<h2 id="household">Household</h2>

			<table style="width: 50%">
				<tr>
					<td><input id="household_name" type="text"></input></td>
					<td><input id="household_age" type="text"></input></td>
					<td><select name="household_relationship"
						id="household_relationship">
							<option value="1">Rel 1</option>
							<option value="2">Rel 2</option>
					</select></td>
				</tr>

				<tr>
					<td>Name</td>
					<td>Age</td>
					<td>Relationship</td>
				</tr>

				<tr>
					<td colspan="2"><textarea id="notes_household" rows="10"
							cols="10"></textarea></td>
				</tr>

				<tr>
					<td colspan="2">Notes</td>
				</tr>
			</table>

			<h2 id="income">Income</h2>

			<table style="width: 50%">
				<tr>
					<td><input id="income_gross_income" type="text"></input></td>
					<td><select name="income_frequency" id="income_frequency">
							<option value="1">Weekly</option>
							<option value="2">BiWeekly</option>
							<option value="1">Monthly</option>
							<option value="2">Annually</option>
					</select></td>
					<td><select name="income_source" id="income_source">
							<option value="1">Employment</option>
							<option value="2">SSI</option>
							<option value="1">Other</option>
					</select></td>
				</tr>

				<tr>
					<td>Gross Income</td>
					<td>Frequency</td>
					<td>Source</td>
				</tr>

				<tr>
					<td colspan="2"><textarea id="notes_income" rows="10"
							cols="10"></textarea></td>
				</tr>

				<tr>
					<td colspan="2">Notes</td>
				</tr>
			</table>

			<h2 id="employment">Employment</h2>

			<table style="width: 50%">
				<tr>
					<td><input id="employment_employer" type="text"></input></td>
					<td><input id="employment_title" type="text"></input></td>
					<td></td>
				</tr>

				<tr>
					<td>Employer</td>
					<td>Title / Job Description</td>
					<td></td>
				</tr>

				<tr>
					<td><input id="employment_work_phone" type="text"></input></td>
					<td><input id="employment_work_location" type="text"></input></td>
					<td><input id="employment_length" type="text"></input></td>
				</tr>

				<tr>
					<td>Work Phone</td>
					<td>Work Location</td>
					<td>Length of Employment</td>
				</tr>


				<tr>
					<td><input id="employment_supervisor" type="text"></input></td>
					<td><div id="employment_permission" class="buttonset">
							<input type="radio" id="empp1" name="employment_permission"
								checked="checked"> <label for="empp1">Yes</label> <input
								type="radio" id="empp2" name="employment_permission"> <label
								for="empp2">No</label>
						</div></td>
					<td></td>
				</tr>

				<tr>
					<td>Supervisor</td>
					<td>Permission to Contact</td>
					<td></td>
				</tr>

				<tr>
					<td colspan="2"><textarea id="notes_employment" rows="10"
							cols="10"></textarea></td>
				</tr>

				<tr>
					<td colspan="2">Notes</td>
				</tr>

			</table>

			<h2 id="pre_training">Pre-Training</h2>

			<table style="width: 70%">
				<tr>
					<td><input type="text" id="pre_training_begin"
						class="datepicker"></input></td>
					<td><input type="text" id="pre_training_ended"
						class="datepicker"></input></td>
					<td><div id="pre_training_incomplete" class="buttonset">
							<input type="radio" id="pre_i1" name="pre_training_incomplete"
								checked="checked"> <label for="pre_i1">Yes</label> <input
								type="radio" id="pre_i2" name="pre_training_incomplete">
							<label for="pre_i2">No</label>
						</div></td>
				</tr>
				<tr>
					<td>Pre-Training Began</td>
					<td>Pre-Training Ended</td>
					<td>Pre-Training Incomplete</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td><div id="pre_str1" class="buttonset">
							<input type="radio" id="pre_str1_i1" name="pre_str1"
								checked="checked"> <label for="pre_str1_i1">Yes</label>
							<input type="radio" id="pre_str1_i2" name="pre_str1"> <label
								for="pre_str1_i2">No</label>
						</div></td>
					<td><div id="pre_str2" class="buttonset">
							<input type="radio" id="pre_str2_i1" name="pre_str2"
								checked="checked"> <label for="pre_str2_i1">Yes</label>
							<input type="radio" id="pre_str2_i2" name="pre_str2"> <label
								for="pre_str2_i2">No</label>
						</div></td>
					<td><div id="pre_str3" class="buttonset">
							<input type="radio" id="pre_str3_i1" name="pre_str3"
								checked="checked"> <label for="pre_str3_i1">Yes</label>
							<input type="radio" id="pre_str3_i2" name="pre_str3"> <label
								for="pre_str3_i2">No</label>
						</div></td>
				</tr>
				<tr>
					<td>Time Budgeting</td>
					<td>Communication Protocol</td>
					<td>Tracking Expenses and Budgeting</td>
				</tr>

				<tr>
					<td><div id="pre_str4" class="buttonset">
							<input type="radio" id="pre_str4_i1" name="pre_str4"
								checked="checked"> <label for="pre_str4_i1">Yes</label>
							<input type="radio" id="pre_str4_i2" name="pre_str4"> <label
								for="pre_str4_i2">No</label>
						</div></td>
					<td><div id="pre_str5" class="buttonset">
							<input type="radio" id="pre_str5_i1" name="pre_str5"
								checked="checked"> <label for="pre_str5_i1">Yes</label>
							<input type="radio" id="pre_str5_i2" name="pre_str5"> <label
								for="pre_str5_i2">No</label>
						</div></td>
					<td><div id="pre_str6" class="buttonset">
							<input type="radio" id="pre_str6_i1" name="pre_str6"
								checked="checked"> <label for="pre_str3_i1">Yes</label>
							<input type="radio" id="pre_str6_i2" name="pre_str6"> <label
								for="pre_str6_i2">No</label>
						</div></td>
				</tr>
				<tr>
					<td>Bill Paying</td>
					<td>Document Retention</td>
					<td>Financial Review</td>
				</tr>

				<tr>
					<td><div id="pre_str7" class="buttonset">
							<input type="radio" id="pre_str7_i1" name="pre_str7"
								checked="checked"> <label for="pre_str4_i1">Yes</label>
							<input type="radio" id="pre_str7_i2" name="pre_str7"> <label
								for="pre_str7_i2">No</label>
						</div></td>
					<td><div id="pre_str5" class="buttonset">
							<input type="radio" id="pre_str8_i1" name="pre_str8"
								checked="checked"> <label for="pre_str8_i1">Yes</label>
							<input type="radio" id="pre_str8_i2" name="pre_str8"> <label
								for="pre_str8_i2">No</label>
						</div></td>
					<td><div id="pre_str9" class="buttonset">
							<input type="radio" id="pre_str9_i1" name="pre_str9"
								checked="checked"> <label for="pre_str9_i1">Yes</label>
							<input type="radio" id="pre_str9_i2" name="pre_str9"> <label
								for="pre_str9_i2">No</label>
						</div></td>
				</tr>
				<tr>
					<td>Credit Recovery</td>
					<td>Checking Accounts</td>
					<td>Tax Returns</td>
				</tr>

				<tr>
					<td><div id="pre_str10" class="buttonset">
							<input type="radio" id="pre_str10_i1" name="pre_str10"
								checked="checked"> <label for="pre_str10_i1">Yes</label>
							<input type="radio" id="pre_str10_i2" name="pre_str10"> <label
								for="pre_str10_i2">No</label>
						</div></td>
					<td><div id="pre_str9" class="buttonset">
							<input type="radio" id="pre_str11_i1" name="pre_str11"
								checked="checked"> <label for="pre_str11_i1">Yes</label>
							<input type="radio" id="pre_str11_i2" name="pre_str11"> <label
								for="pre_str11_i2">No</label>
						</div></td>
					<td></td>
				</tr>
				<tr>
					<td>Information Resources</td>
					<td>Linear Communication</td>
					<td></td>
				</tr>


				<tr>
					<td colspan="2"><textarea id="notes_pre_training" rows="10"
							cols="10"></textarea></td>
				</tr>
				<tr>
					<td colspan="2">Notes</td>
				</tr>

			</table>

			<h2 id="landlord_training">Landlord Training</h2>

			<div id="landlord_training" class="tabs" style="width: 50%">
				<ul>
					<li><a href="#fragment-1"><span>Phase 1</span></a></li>
					<li><a href="#fragment-2"><span>Phase 2</span></a></li>
					<li><a href="#fragment-3"><span>Phase 3</span></a></li>
					<li><a href="#fragment-4"><span>Phase 4</span></a></li>
				</ul>
				<div id="fragment-1">

					<table>
						<tr>
							<td><input type="text" id="phase1_begin" class="datepicker"></input></td>
							<td><input type="text" id="phase1_ended" class="datepicker"></input></td>
							<td><div id="phase1_incomplete" class="buttonset">
									<input type="radio" id="p1_i1" name="phase1_incomplete"
										checked="checked"> <label for="p1_i1">Yes</label> <input
										type="radio" id="p1_i2" name="phase1_incomplete"> <label
										for="p1_i2">No</label>
								</div></td>
						</tr>
						<tr>
							<td>Phase 1 Began</td>
							<td>Phase 1 Ended</td>
							<td>Phase 1 Incomplete</td>
						</tr>
					</table>
				</div>

				<div id="fragment-2">

					<table>
						<tr>
							<td><input type="text" id="phase2_begin" class="datepicker"></input></td>
							<td><input type="text" id="phase2_ended" class="datepicker"></input></td>
							<td><div id="phase2_incomplete" class="buttonset">
									<input type="radio" id="p2_i1" name="phase2_incomplete"
										checked="checked"> <label for="p2_i1">Yes</label> <input
										type="radio" id="p2_i2" name="phase2_incomplete"> <label
										for="p2_i2">No</label>
								</div></td>
						</tr>
						<tr>
							<td>Phase 2 Began</td>
							<td>Phase 2 Ended</td>
							<td>Phase 2 Incomplete</td>
						</tr>
					</table>

				</div>
				<div id="fragment-3">

					<table>
						<tr>
							<td><input type="text" id="phase3_begin" class="datepicker"></input></td>
							<td><input type="text" id="phase3_ended" class="datepicker"></input></td>
							<td><div id="phase3_incomplete" class="buttonset">
									<input type="radio" id="p3_i1" name="phase3_incomplete"
										checked="checked"> <label for="p3_i1">Yes</label> <input
										type="radio" id="p3_i2" name="phase3_incomplete"> <label
										for="p3_i2">No</label>
								</div></td>
						</tr>
						<tr>
							<td>Phase 3 Began</td>
							<td>Phase 3 Ended</td>
							<td>Phase 3 Incomplete</td>
						</tr>
					</table>

				</div>

				<div id="fragment-4">

					<table>
						<tr>
							<td><input type="text" id="phase4_begin" class="datepicker"></input></td>
							<td><input type="text" id="phase4_ended" class="datepicker"></input></td>
							<td><div id="phase4_incomplete" class="buttonset">
									<input type="radio" id="p4_i1" name="phase4_incomplete"
										checked="checked"> <label for="p4_i1">Yes</label> <input
										type="radio" id="p4_i2" name="phase4_incomplete"> <label
										for="p4_i2">No</label>
								</div></td>
						</tr>
						<tr>
							<td>Phase 4 Began</td>
							<td>Phase 4 Ended</td>
							<td>Phase 4 Incomplete</td>
						</tr>
					</table>

				</div>
			</div>

			<h2 id="drug_abuse">Drug Abuse</h2>

			<table style="width: 50%">
				<tr>
					<td><input id="drug_abuse_name" type="text"></input></td>
					<td><input id="drug_abuse_phone" type="text"></input></td>
					<td><div id="clean6" class="buttonset">
							<input type="radio" id="c61" name="clean6" checked="checked">
							<label for="c61">Yes</label> <input type="radio" id="c62"
								name="clean6"> <label for="c62">No</label>
						</div></td>
				</tr>
				<tr>
					<td>Professional's Name</td>
					<td>Professional's Phone</td>
					<td>Clean for 6 months</td>
				</tr>

				<tr>
					<td colspan="2"><textarea id="notes_drug_abuse" rows="10"
							cols="10"></textarea></td>
				</tr>
				<tr>
					<td colspan="2">Notes</td>
				</tr>

			</table>

			<h2 id="alch_abuse">Alcohol Abuse</h2>

			<table style="width: 50%">
				<tr>
					<td><input id="alch_abuse_name" type="text"></input></td>
					<td><input id="alch_abuse_phone" type="text"></input></td>
					<td><div id="sober6" class="buttonset">
							<input type="radio" id="s61" name="sober6" checked="checked">
							<label for="s61">Yes</label> <input type="radio" id="s62"
								name="sober6"> <label for="s62">No</label>
						</div></td>
				</tr>
				<tr>
					<td>Professional's Name</td>
					<td>Professional's Phone</td>
					<td>Sober for 6 months</td>
				</tr>

				<tr>
					<td colspan="2"><textarea id="notes_alch_abuse" rows="10"
							cols="10"></textarea></td>
				</tr>
				<tr>
					<td colspan="2">Notes</td>
				</tr>

			</table>


			<h2 id="mental_illness">Mental Illness</h2>

			<table style="width: 56%">
				<tr>
					<td><input id="mental_illness_name" type="text"></input></td>
					<td><input id="mental_illness_phone" type="text"></input></td>
					<td><div id="comp" class="buttonset">
							<input type="radio" id="cp1" name="comp" checked="checked">
							<label for="cp1">Yes</label> <input type="radio" id="cp2"
								name="comp"> <label for="cp2">No</label>
						</div></td>
				</tr>
				<tr>
					<td>Professional's Name</td>
					<td>Professional's Phone</td>
					<td>Compliant with Treatment</td>
				</tr>

				<tr>
					<td colspan="2"><textarea id="notes_mental" rows="10"
							cols="10"></textarea></td>
				</tr>
				<tr>
					<td colspan="2">Notes</td>
				</tr>

			</table>

			<h2 id="arrests">Arrests</h2>

			<table style="width: 50%">
				<tr>
					<td><input type="text" id="date_of_arrest" class="datepicker"></input></td>
					<td><select name="arrest_current_status"
						id="arrest_current_status">
							<option value="1">Fined</option>
							<option value="2">Time Served</option>
							<option value="3">Cleared</option>
							<option value="3">Probation</option>
							<option value="3">Trial Pending</option>
							<option value="3">Acquited</option>
					</select></td>
					<td></td>
				</tr>
				<tr>
					<td>Date of Arrest</td>
					<td>Current Status</td>
					<td></td>
				</tr>

				<tr>
					<td><input id="arrests_name" type="text"></input></td>
					<td><input id="arrests_phone" type="text"></input></td>
				</tr>
				<tr>
					<td>Probation/Parole Officer's Name</td>
					<td>Probation/Parole Officer's Phone</td>
				</tr>

				<tr>
					<td colspan="2"><textarea id="arrest_details" rows="10"
							cols="10"></textarea></td>
				</tr>
				<tr>
					<td colspan="2">Notes</td>
				</tr>

			</table>

			<h2 id="homelessness">Homelessness</h2>

			<table style="width: 50%">
				<tr>
					<td colspan="2"><textarea id="homeless_details" rows="10"
							cols="10"></textarea></td>
				</tr>
				<tr>
					<td colspan="2">What led to your homeless situations?</td>
				</tr>
			</table>


			<h2 id="spiritual_reference">Spiritual Reference</h2>

			<table style="width: 50%">
				<tr>
					<td><input id="spiritual_reference_name" type="text"></input></td>
					<td><input id="spiritual_reference_phone" type="text"></input></td>

				</tr>
				<tr>
					<td>Spiritual Reference's Name</td>
					<td>Spiritual Reference's Phone</td>
				</tr>
			</table>

			<h2 id="house_purchase">House Purchase</h2>

			<table style="width: 50%">
				<tr>
					<td><input type="text" id="date_house_purchased"
						class="datepicker"></input></td>

					<td><div id="house_purchase_pending" class="buttonset">
							<input type="radio" id="hpp1" name="house_purchase_pending"
								checked="checked"> <label for="hpp1">Yes</label> <input
								type="radio" id="hpp2" name="house_purchase_pending"> <label
								for="hpp2">No</label>
						</div></td>
				</tr>
				<tr>
					<td>Date of House Purchased</td>
					<td>House Purchase Pending?</td>
				</tr>
			</table>

			<h2 id="debt_appl">Debt as of Application</h2>

			<table style="width: 50%">
				<tr>
					<td><select name="debt_category" id="debt_category">
							<option value="1">Category 1</option>
							<option value="1">Category 1</option>
							<option value="1">Category 1</option>
							<option value="1">Category 1</option>
					</select></td>

					<td><input id="debt_appl_amount" type="text"></input></td>
				</tr>
				<tr>
					<td>Category</td>
					<td>Amount</td>
				</tr>
			</table>


			<h2 id="debt_control">Debt Control Details</h2>

			<table style="width: 50%">
				<tr>
					<td colspan="2"><textarea id="debt_control_details" rows="10"
							cols="10"></textarea></td>
				</tr>
				<tr>
					<td colspan="2">How do you control your debt?</td>
				</tr>
			</table>

			<button id="reg_submit" type="submit">Submit</button>

		</form>
	</div>
</body>
</html>