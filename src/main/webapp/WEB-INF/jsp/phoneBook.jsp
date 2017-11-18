<html>
<head>
<title> PhoneBook </title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
<h1> Phone book details </h1>
<table class="table table-striped">
    <thead>
        <th> Name </th>
        <th> Phone number </th>
        <th> Address </th>
    </thead>
    <tbody>
    <c:forEach items="${phoneBook}" var="contactInfo">
    <tr>
        <td>${contactInfo.name}</td>
        <td>${contactInfo.phoneNumber}</td>
        <td>${contactInfo.address}</td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>