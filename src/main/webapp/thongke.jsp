<%@page import="LoaiModal.Loai"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container mt-3">
  <h2>Thống kê loại</h2>
          
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>Mã Loại</th>
        <th>Số bài</th>
        
      </tr>
    </thead>
    <tbody>
    <%ArrayList<Loai>dsl =(ArrayList<Loai>)session.getAttribute("dsl");
    	for(Loai i:dsl){
    %>
      <tr>
        <td><%=i.getMaloai() %></td>
        <td><%=i.getTinCount() %></td>
        
      </tr>
     <%} %>
    </tbody>
  </table>
</div>
<a href="Trangchu"></a>
</body>
</html>