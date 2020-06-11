<%-- 
    Document   : bs
    Created on : Jun 6, 2020, 6:02:50 PM
    Author     : kashish
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>book appointment</title>
    <//head>
<link rel="stylesheet" type="text/css" href="css/bookn.css">
<body>
	<header>
		<div class="ban">
			<img src="im/pop.jpeg"></div><br>
<div class="con ">
	<u><h2>Book Appointment</h2></u><br>
	<p>Name</p>
        <form action ="for" method="post"> 
	  <input type = "text" name = "name" value = "" maxlength = "100" />
      <p>Email</p>
	  <input type = "text" name = "mail" value = "" maxlength = "100" />
	  <p>Mobile</p>
	  <input type = "text" name = "mobile" value = "" maxlength = "100" />
</div>
<br><br>
<p>Comment</p>
	 <section class="o"><input type = "text" name = "comment" value = "" maxlength = "100" />
</section>
<button>SUBMIT</button>
</form>
	</header>


</body>
</html>