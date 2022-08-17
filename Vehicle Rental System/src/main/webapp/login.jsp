
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  <title>Login</title>
  <style>
    * {
      margin: 0%;
    }
    h1 {
      margin-left: 30%;
      margin-top: 0px;
      color: aliceblue;
    }
    .title {
      background-color: #069A8E;
      margin: 0px;
      padding-top: 2%;
      padding-bottom: 2%;
      padding-left: 5%;
    }
    .container {
      margin-left: 30%;
      margin-top: 5%;
    }
    .btn {
      width: 100px;
    }
    .btn-success {
      margin-left: 30%;
    }
    .btn-warning {
      margin-left: 30%;
    }
    a {
      text-decoration: none !important;
      color: aliceblue;
    }
  </style>
</head>
<body>
<div class="title">
  <h1>LOG IN</h1>
</div>
<form action="/login" method="post">
  <div class="container">
    <div class="row">
      <div class="col-md-6 form-group">
        <label for="exampleInputEmail1">Email address</label>
        <input type="email" class="form-control form-control-lg" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" name="Email">
      </div>
    </div>
    <br>
    <div class="row">
      <div class="col-md-6 form-group">
        <label for="exampleInputPassword1">Password</label>
        <input type="password" class="form-control form-control-lg" id="exampleInputPassword1" placeholder="Password" name="Password">
      </div>
    </div>
    <h4 style="color: darkred"><c:out  value="${alert}" /></h4>
    <br>
      <div class="col-md-6">
        <button type="submit" class="btn btn-success btn-lg w-25">LOG IN</button>
      </div>

    <br>
    <div class="col-md-6">
      <a href="create"><button class="btn btn-warning btn-lg w-25">SIGN UP</a></button>
    </div>

  </div>
</form>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
