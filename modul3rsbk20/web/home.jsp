<%-- 
    Document   : home
    Created on : Sep 22, 2019, 12:45:58 PM
    Author     : WIN 10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link href="https://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">
<script src="js/bootstrap.min.js"></script>
<style>
	.menu {
		margin-left: -15px; 
		margin-right: 15px;
	}
	.daftar{
		border: 2px solid #e5e5e5; 
		border-radius: 5px; 
		padding: 5px;
	}
	.table th, .table td{
		text-align: center;
	}
	.nav{
		padding: 5px; 
		border: 2px solid #e5e5e5;
		border-radius: 5px;
	}
	.nav li{
		border-bottom: 2px solid #e5e5e5;
		border-radius: 5px;
	}
	.daftar h3{
                margin-top: 50px;
		margin-bottom: 25px;
	}
	</style>
</head>
 <style type="text/css">
      .jumbotron.new {
          position: relative;
          background: url(img/bg-jumbotron.jpg) center center;
          color:#fff;
          width: 100%;
          height: 100%;
          background-size: cover;
          overflow: hidden;
      }
      body{
          background-image:url(img/bg-body.jpg);
          color:#fff;
	  background-size:cover;
	  background-attachment: fixed;
		}
      .warna{
          font-size:24px; 
          background-color:white;
          color:blue;
		}
    </style>
    <div class="container">
        <div class="jumbotron new">
	<center><h2><b>Data Mahasiswa</b></h2>
	<p>Modul RSBK - Kelompok20</p>
        <h5>Selamat Datang, <%=session.getAttribute("userName")%></h6></center>
    </div>
    <div class="row content col-md-8 col-md-offset-2">
	<div class="col-md-3 menu">
	<ul class="nav nav-pills nav-stacked" style="">
            <li><a href="#">Home</a></li>
            <li><a href="./login.jsp">Logout</a></li>
            <li><a href="./profile.jsp"><span class="glyphicon glyphicon-user warna" ></i></span></a></li>
	</ul>
	</div>
	<div class="col-md-9 daftar">
            <form action="./StudentServlet" method="POST">
                <table class="table table-bordered">
                <tr>
                <td>Student ID</td>
                <td><input class="form-control" type="text" name="studentId" value="${student.studentId}" /></td>
                </tr>
                <tr>
                <td>First Name</td>
                <td><input class="form-control" type="text" name="firstname" value="${student.firstName}" /></td>
                </tr>
                <tr>
                <td>Last Name</td>
                <td><input class="form-control" type="text" name="lastname" value="${student.lastName}" /></td>
                </tr>
                <tr>
                <tr>
                <td>Address</td>
                <td><input class="form-control" type="text" name="address" value="${student.address}" /></td>
                </tr>
                <tr>
                <td colspan="2">
                <button type="submit" class="btn btn-primary" name="action" value="Add"><span class="glyphicon glyphicon-plus"></span> Add</button>
                <button type="submit" class="btn btn-default" name="action" value="Edit"><span class="glyphicon glyphicon-edit"></span> Edit</button>
                <button type="submit" class="btn btn-danger" name="action" value="Delete"><span class="glyphicon glyphicon-trash"></span> Delete</button>
                <button type="submit" class="btn btn-warning" name="action" value="Search"><span class="glyphicon glyphicon-search"></span> Search</button>
                </td>
                </tr>
                </table>
            </form>
            <h3 align="center">Informasi Data</h3>
		<table class="table table-bordered table-hover">
                    <thead>
                    <tr>
                    <th>No. ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Address</th>
                    </tr>
                    </thead>
                    <tbody>
                    <s:forEach items="${allStudents}" var="stud">
                    <tr>
                        <td>${stud.studentId}</td>
			<td>${stud.firstName}</td>
                        <td>${stud.lastName}</td>
                        <td>${stud.address}</td>
                    </tr>
                    </s:forEach>
                    </tbody>
                </table>
            </div>
	</div>
    </div>
</html>
