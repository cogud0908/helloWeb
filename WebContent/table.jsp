<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 String row=request.getParameter("r");
 String col=request.getParameter("c");
 
 int nRow=1;
 if(row!=null)
  nRow=	Integer.parseInt(row);
 int nCol=1;
 if(col!=null)
  nCol=Integer.parseInt(col);
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="2px" padding="0px" cellspacing=0 cellpadding="5px">
			<%for(int i=0;i<nRow;i++){ %>
		<tr>
			<%for(int j=0; j<nCol;j++){ %>
			<td>cell(<%=i %>,<%=j %>)</td>
			<%} %>
		</tr>
		<% }%>
	</table>
	<!-- <table border="1px" padding="0px" cellspacing=0 cellpadding="5px">
		<tr>
			<td>cell(0,0)</td>
			<td>cell(0,1)</td>
			<td>cell(0,2)</td>
		</tr>
		<tr>
			<td>cell(1,0)</td>
			<td>cell(1,1)</td>
			<td>cell(1,2)</td>
		</tr>
		<tr>
			<td>cell(3,0)</td>
			<td>cell(3,1)</td>
			<td>cell(3,2)</td>
		</tr>
	</table> -->
</body>
</html>