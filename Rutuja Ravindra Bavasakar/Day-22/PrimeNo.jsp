<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1>Generate Prime Numbers</h1>
   <hr><br>
   <table border='1'>
   <tr>
   <% int start = 1000; %>
   <% int end = 3000; %>
   <% boolean prime; %>
   <% int count = 0; %>
   <% for(int i=start; i<=end; i++) { %>
      <% prime = true; %>
      <% for(int j=2; j<i; j++) { %>
         <% if(i%j==0) { %>
           <% prime = false; %>
           <%-- break; --%>
         <% } %>
      <% } %>
      
      <% if(prime) { %>
         <td><%=i %></td>
         <% count++; %>
         <% if(count>=15) { %>
            <% count = 0; %>
            </tr><tr>
      <% } %>
    <% } %>
    <% } %>
    </tr>
   </table>
</body>
</html>