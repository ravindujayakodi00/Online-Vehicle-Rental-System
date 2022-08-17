
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Update Details</title>
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
        /* .container {
            margin-top: 3%;
            margin-left: 28%;
        } */
        .title2 {
            background-color: #069A8E;
            margin: 30px 0px;
            padding-top: 1%;
            padding-bottom: 1%;
            padding-left: 40%;
        }
        .title2 h2 {
            color: aliceblue;
        }
        .table {
            margin-top: 5%;
        }
        .container {
            margin-top: 5%;
            margin-left: 33%;
        }

        .btn-warning {
            margin-left: 20%;
        }
        .btn-danger {
            margin-left: -50%;
        }
        a {
            text-decoration: none !important;
            color: aliceblue;
        }

    </style>
</head>
<body>

<div class="title">
    <h1>EDIT PROFILE</h1>
</div>

<div class="container">
    <form action="update" method="post">
        <div class="col-md-6">
            <label>Customer ID</label>
            <input type="text" class="form-control form-control-lg" readonly value="<c:out value="${cus.id}"/>" name="cusid">
        </div>
        <br>
        <div class="col-md-6">
            <label>First Name</label>
            <input type="text" class="form-control form-control-lg" value="<c:out value="${cus.fname}"/>" name="fname">
        </div>
        <br>
        <div class="col-md-6">
            <label>Last Name</label>
            <input type="text" class="form-control form-control-lg" value="<c:out value="${cus.lname}"/>" name="lname">
        </div>
        <br>
        <div class="col-md-6">
            <label>Email</label>
            <input type="email" class="form-control form-control-lg" value="<c:out value="${cus.email}"/>" name="email">
        </div>
        <br>
        <div class="col-md-6">
            <label>Password</label>
            <input type="text" class="form-control form-control-lg" value="<c:out value="${cus.password}"/>" name="password">
        </div>
        <br><br>
        <div class="row">
            <div class="col-md-6">
                <input class="btn btn-warning w-25" type="submit" value="UPDATE">
            </div>
            <div class="col-md-6">
                <a href="delete?id=<c:out value="${cus.id}"/>"><button class="btn btn-danger w-25">DELETE</a></button>
            </div>
        </div>

    </form>


</div>


<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
