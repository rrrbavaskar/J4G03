<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prime Numbers</title>

</head>
<body>
<% int no1 = Integer.parseInt(request.getParameter("start")); %>
	<% int no2= Integer.parseInt(request.getParameter("end")); %>
	<table border='3'>
	<%int co=0, i=1; %>
	<% for(int j=no1;j<=no2; j++) { %>
		
		<%co=0; %>
		<%for(i=1;i<j;i++) {%>
		<%if(j%i==0){
			co++;
		}%>
		<% }%>
		<%if(co<2){ %>
		<tr>
		     <td><%=i %></td>
		</tr>
		<% }%>
		
		<% }%>
		
		</table>
</body>
</html>	