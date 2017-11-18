<%@ include file="common/header.jspf" %>
<div class="container">
<h1> Phonebook </h1> <br/>
<div>
<table class="table">
    <tr>
        <td>
        <form method="post">
        <input type="text" name="contact" value="Search by name..." onfocus="if(this.value == 'Search by name...') {this.value=''}"
         onblur="if(this.value == ''){this.value ='Search by name...'}">
        <input type="submit" value="Search" class="btn btn-success">
        </form>
        </td>
        <td>
        <form method="get"><input type="submit" value="Reset" class="btn btn-warning">
        </td>
    </tr>
</table>
</div>
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
<%@ include file="common/footer.jspf" %>