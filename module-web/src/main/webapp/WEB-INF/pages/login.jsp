<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ page isELIgnored="false" %>

<%@include file="/WEB-INF/pages/parts/head.jsp" %>
<body class="login-bg">
<div class="header">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <!-- Logo -->
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
                <form class="box" id="login_form" action="${pageContext.request.contextPath}/login" method="post">
                    <div class="content-wrap">
                        <h6>Sign In</h6>
                        <input class="form-control" type="email" id="email" name="email"
                                placeholder="E-mail address">
                        <input class="form-control" type="password" id="password" name="password"
                                placeholder="Password" required>
                        <div class="action">
                            <input type="submit" class="btn btn-primary signup" id="submit_login" value="Login">
                        </div>
                    </div>
                </form>

                <div class="already">
                    <p>Don't have an account?</p>
                    <c:url value="registration" var="registration_url"></c:url>

                    <a href="${registration_url}">Create an account</a>
                </div>
            </div>
        </div>
    </div>
</div>


<%@include file="/WEB-INF/pages/parts/script-import.jsp" %>
</body>
</html>