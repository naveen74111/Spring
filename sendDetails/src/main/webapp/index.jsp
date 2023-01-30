<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>X-workz</title>
</head>
<body leftmargin="500" marginheight="120px" style='background-color:yellow;'>
<h1>Send Details Of Fav Person</h1>
<form action="send" method="post">
<pre>
<h1>
FirstName <input type="text" name="firstName" placeholder="type your firstName"/>
lastName  <input type="text" name="lastName" placeholder="type your lastName"/>
Gender Male<input type="radio" name="gender" value="male" />FeMale<input type="radio" name="gender" value="female"/>
       
Reason <textarea rows="2" cols="25" name="reason"></textarea>
Address <textarea rows="5" cols="25" name="address"></textarea>
	<input type="submit" value="Send"/>
</h1>
</pre>
</form>
</body>
</html>