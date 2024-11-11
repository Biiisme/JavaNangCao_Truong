
<%@page import="BaoModal.Bao"%>
<%@page import="LoaiModal.Loai"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<title>Insert title here</title>
</head>
<body>
	<!--  HEADER -->
	<div class="container mt-3">
          
  <table class="table table-bordered">
    
    <tbody>
      <tr>
        <td><form action="Trangchu">
				<div class="input-group">
				<h5>Nhập tiêu đề hoặc tóm tắt</h5>
				<input type="text" name="search" value="" class="form-control ip-seach"
					placeholder=>
					
					<button type="submit" class=" btn btn-info">
						<i>Search</i> </button>
				</div>
				</form></td>
        <td><a class="nav-link" href="thongkeController">Thống kê</a></td>
        
      </tr>
      
      
    </tbody>
  </table>
</div>
	<!-- CONTAINER -->
	<div class="container">	
	<!-- Trả sách về 1 session -->
	
	<!--TRẢ VỀ DANH SÁCH CÁC SÁCH KHI TÌM KIẾM -->
	<%
	
// HIỂN THỊ TẤT CẢ CÁC CART DANH SÁCH %>
		
			<!--HIỂN THỊ LOẠI SÁCH  -->
			
			<!-- CHỌN MÃ LOẠI HIỂN THỊ SÁCH -->

				<h3 class="text-center">Danh sách các bài báo</h3>
				<hr>
				<%
				ArrayList<Bao> listSearch = new ArrayList<Bao>();
				listSearch = (ArrayList<Bao>)request.getAttribute("listSearch");
				int n = listSearch.size();
				for (int i = 0; i < n; i++) {
					
					
				%>
		
						<h1 class="card-title text-center"><%=listSearch.get(i).getTieude()%></h1>
						<h5 class="card-title text-center"><%=listSearch.get(i).getNgay()%></h5>
						<h4 class="card-title text-center"><%=listSearch.get(i).getTomtat()%></h4>
						<p class="card-title "><%=listSearch.get(i).getNoidung()%></p>
						<hr>
						
			 <%} %>
			 
				
				
			
</div>

	<!--MODAL FORM ĐĂNG NHẬP  -->
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>