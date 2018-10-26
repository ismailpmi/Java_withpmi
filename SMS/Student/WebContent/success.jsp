<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
     <%@ page import = "java.text.SimpleDateFormat, javax.servlet.*" %>
     <%@ page import = "java.time.LocalTime, javax.servlet.*" %>
     <%@ page import = "java.time.format.DateTimeFormatter, javax.servlet.*" %>
     <%@ page import = "java.util.Date, javax.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>success</title>
</head>
<body bgcolor="green">
	<%!int i = 0;%>
	<%= "My first servlet" %>
	<%
		response.setHeader("Cache-Control", "no-cache,no-store,revalidate");
		if (session.getAttribute("USERNAME") == null) {
			response.sendRedirect("login.html");
		}
	%>
	<br/>
	 <center>
         <h1>Display Current Date & Time</h1>
      </center>
      <%
         Date date = new Date();
      	int hours = date.getHours();
         out.print( "<h2 align = \"center\">" +date.toString()+"</h2>");
         SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
         out.print( "<h2 align = \"center\">" +formatter.format(date)+"</h2>");
         /* System.out.println(formatter.format(date));   */
         LocalTime localTime = LocalTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
		
		/* System.out.println(localTime.format(dateTimeFormatter)); */
		out.print( "<h2 align = \"center\">" +localTime.format(dateTimeFormatter)+"</h2>");
         if(hours>=1 || hours<12){
            
             out.print( "<h2 align = \"center\">" +"Good Noon"+"</h2>");
         }else if(hours>12 || hours<=16){
        	 out.print( "<h2 align = \"center\">" +"Good Evening"+"</h2>");
         }else{
        	 out.print( "<h2 align = \"center\">" +"Good Night"+"</h2>");
         } 
        /*  SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy hh.mm.ss.S aa");
         String formattedDate = dateFormat.format(new Date()).toString();
         System.out.println(formattedDate);
         LocalTime localTime = LocalTime.now();
         DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
         System.out.println(localTime.format(dateTimeFormatter)); */
         
        
		
      %>
     
	<h1 style="color:blue;">Welcome ${USERNAME}</h1>
	
	<form method="post" action="Call">
		
		Name    :<input type="text" name="name" required><br/><br/>
		Address	:<input type="text" name="address"><br/><br/>
		phone	:<input type="text" name="phone"><br/><br/>
	
		<input value="ShowNOW!" type="submit">
		
		<br/>
		Hello ${name}... your address is ${address}... your phoneNO is ${phone}  
		<br/><br/>
		Uppercase: ${ucase}<br/><br/> TotalLengthOfName: ${len}
	</form>
	
      <form action="logout" method="get">
		<input type="submit" value="logout">
	</form>
	<a href="fact.jsp">factorial</a>
</body>
</html>