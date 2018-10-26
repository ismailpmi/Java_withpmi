<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE HTML >
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Factorial</title>
</head>
      
<body>
  <b>Enter Name:-</b>
   
    <form>
   
    <table>
            <tr><td><input type="text" name="n1" ></td></tr>
            <tr><td><input type="text" name="n2" ></td></tr>
            <tr><td><center><input type="submit" value="Submit"></center></tr>
    </table>
   
    </form>
 
<%
int num1=10;
int num2=20;
%>
 
 
<%!
    int factorial(int n)    {
        if (n == 1) {
            return n;
        }
        else {
            return n * factorial(n - 1);
        }
    }
%>
 
    <h3>Fact are:-</h3>
 
 
 
    <%
    out.println("The factorial of  " + num1 +"  is : " + factorial(num1));
    out.println("The factorial of  " + num2 +"  is : " + factorial(num2));
    %>
 
 
 
  <br /><a href="<%= request.getRequestURI() %>">Back</a> 
<body>
</html>

