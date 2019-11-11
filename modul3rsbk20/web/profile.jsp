<%-- 
    Document   : profil
    Created on : Nov 10, 2019, 3:06:38 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Profile</title>
<link rel="stylesheet" href="css/bootstrap.css">
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
            <li><a href="./StudentServlet">Home<span class="sr-only">(current)</span></a></li>
            <li><a href="./login.jsp">Logout</a></li>
            <li><a href="#"><span class="glyphicon glyphicon-user warna" ></i></span></a></li>
	</ul>
	</div>
         
    <div class="container">
        <div class="row mt-3">
        <div class="col-md-6">
            <div class="card">
            <div class="card-body">
                <h2>Haloo</h2></center>
            <p class="card-text">Perkenalkan,kami dari kelompok 20 praktikum RSBK, yang terdiri dari : <br>1. Mutiara Victorina M (21120116120010) <br>2. Nisrina Fauziah (21120116120031)<br> Kami adalah mahasiswa Teknik Komputer Universitas Diponegoro angkatan 2016.</p>
            </div>
    </div>
        </div>
    </div>
</div>
    </body>
</html>
