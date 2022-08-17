
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Account</title>
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
        .btn-warning {
            margin-left: 85%;
        }
        .table {
            margin-top: 5%;
        }
    </style>
</head>
<body>
<div class="title">
    <div class="row">
        <div class="col-md-8">
            <h1>MY PROFILE</h1>
        </div>
        <div class="col-md-2">
            <button class="btn btn-warning">Reserve A Vehicle</button>
        </div>
    </div>
    </div>
    <c:forEach var="cus" items="${cusDetails}">

        <table class="table table-striped">

        <tbody>
        <tr>
            <td>Customer ID</td>
            <td>${cus.id}</td>
        </tr>
        <tr>
            <td>First Name</td>
            <td>${cus.fname}</td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td>${cus.lname}</td>
        </tr>
        <tr>
            <td>Email</td>
            <td>${cus.email}</td>
        </tr>

        </tbody>
    </table>

        <a href="setupdate?cusid=<c:out value="${cus.id}"/>" class="btn btn-warning">Update</a>

    </c:forEach>

    <h3><c:out value="${alert}" /></h3>
</body>
</html>
