<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page isELIgnored="false" %>
<%@include file="/WEB-INF/pages/parts/head.jsp" %>
<body class="login-bg">
<div class="header">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="logo">
                    <c:url value="index" var="index_url"></c:url>
                    <h1><a href="${index_url}">Tire Service</a></h1>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="page-content container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="login-wrapper">
                <spring:form class="box" id="registration_form" action="registration" method="post" modelAttribute="user">
                    <div class="content-wrap">
                        <h6>Sign Up</h6>
                        <spring:input path="name" class="form-control" id="name" placeholder="Name" />
                        <spring:input path="email" class="form-control" id="email"  placeholder="E-mail address" />
                        <spring:input path="phone" class="form-control" id="phone" placeholder="Phone number" />
                        <spring:password path="password" class="form-control" id="password" placeholder="Password" />

                        <div class="action">
                            <input type="submit" class="btn btn-primary signup" value="Sign Up">
                        </div>
                    </div>
                </spring:form>

                <div class="already">
                    <p>Have an account already?</p>
                    <c:url value="login" var="login_url"></c:url>
                    <a href="${login_url}">Login</a>
                </div>
            </div>
        </div>
    </div>
</div>

<%@include file="/WEB-INF/pages/parts/script-import.jsp" %>
</body>
</html>