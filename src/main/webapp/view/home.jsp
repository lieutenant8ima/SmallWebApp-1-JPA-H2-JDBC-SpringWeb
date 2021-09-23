<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <br>*****Add Student Info*****<br>
    
    <br> 
	<form action="addStudent">
		Student Id   : <input type="text" name="sid"><br>
		<br>
	  Student Name : <input type="text" name="sname"><br>
		<br>
	  Student Tech : <input type="text" name="lang"><br>
		<br>
		<input type="submit"><br>
	</form>
	
	<br>
	<br>
	
	<br>*****Fetch Student Record By Typing Student Id*****<br>
	
	<br>
	
	<form action="getStudent">
		Student Id   : <input type="text" name="sid"><br>
		<br>
		<input type="submit"><br>
	</form>
	
	<br>
	<br>
	
	<br>*****Delete Student Record By Typing Student Id*****<br>
	
	<br>
	
	<form action="deleteStudent">
		Student Id   : <input type="text" name="sid"><br>
		<br>
		<input type="submit"><br>
	</form>
	
	<br>
	<br>
	
	<br>*****Update Student Record By Typing Student Id*****<br>
	
	<br>
	
	<form action="updateStudent">
		Student Id   : <input type="text" name="sid"><br>
		<br>
		<input type="submit"><br>
	</form>
	
	
</body>
</html>