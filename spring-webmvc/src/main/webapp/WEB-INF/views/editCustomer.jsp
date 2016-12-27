<%@ page language="java" contentType="text/html; ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <link rel="stylesheet" href="/resources/css/bootstrap.css"/>
    <link rel="stylesheet" href="/resources/css/bootstrap-theme.css"/>
    <meta charset="UTF-8">
    <title>Home Page</title>
</head>
<body>
<div class="container">
    <h3>
        <spring:message code="home.page.title"/>
    </h3>
    <hr/>

    <form:form action="/customers/add" commandName="customer"
               method="post"
               cssClass="form">
        <div class="form-group">
            <form:label path="id">id</form:label>
            <form:input path="id" readonly="true" cssClass="form-control"/>
        </div>
        <div class="form-group">
            <form:label path="firstName">first name</form:label>
            <form:input path="firstName" cssClass="form-control"/>
        </div>
        <div class="form-group">
            <form:label path="lastName">last name</form:label>
            <form:input path="lastName" cssClass="form-control"/>
        </div>
        <div class="form-group">
            <form:label path="email">email</form:label>
            <form:input path="email" cssClass="form-control"/>
        </div>
        <div class="form-group">
            <button type="reset" css="btn btn-default">Clear</button>
            <button type="submit" css="btn btn-primary">Save</button>
        </div>
    </form:form>

</div>
</body>
</html>