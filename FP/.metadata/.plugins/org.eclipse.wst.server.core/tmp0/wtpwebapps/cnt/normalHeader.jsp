<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
  <head>
    <meta charset="utf-8">
    <title>MyAccount</title>
    <link href="css/style.css" type="text/css" rel="stylesheet">
   
 </head>
    <!-- header section starts  -->


<body>
<header class="header">

    <a href="#" class="logo"><span>T</span>ECH<span>Z</span>ONE</a>

<%

     
	String Semail = (String)session.getAttribute("emailu");


%>
    <nav class="navbar">
         <a href="#home">home</a>
        <a href="UserSignUp.jsp">SignUp</a>
        <a href="login.jsp">logIn</a>
        <a href="uac">Account</a>
        <a href="logout">logOut</a>
    </nav>

    <div id="menu-bars" class="fas fa-bars"></div>

</header>