<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ page isELIgnored="false" %>
<%@include file="/WEB-INF/pages/parts/head.jsp" %>
<body>
<%@include file="/WEB-INF/pages/parts/header.jsp" %>
<div class="page-content">
    <div class="row">
        <div class="col-md-2">
            <%@include file="/WEB-INF/pages/parts/sidebar.jsp" %>
        </div>
        <div class="col-md-10">
            <div class="row">
                <div class="col-md-12 content-box-large">
                    <div class="panel-heading">
                        <div class="panel-title">Редактирование профиля</div>
                    </div>
                    <div class="panel-body">
                        <spring:form class="form-horizontal panel-body" action="profile-update" method="post" modelAttribute="user">
                            <spring:hidden path="id" />
                            <div class="form-group">
                                <label for="profile_name">Full Name</label>
                                <spring:input class="form-control" id="profile_name" path="name"/>
                            </div>
                            <div class="form-group">
                                <label for="profile_email">Email</label>
                                <spring:input class="form-control" id="profile_email" path="email"/>
                            </div>
                            <div class="form-group">
                                <label for="profile_password">Password</label>
                                <spring:password class="form-control" id="profile_password" path="password"/>
                            </div>
                            <div class="form-group">
                                <label for="profile_phone">Phone No</label>
                                <spring:input class="form-control" id="profile_phone" path="phone" /></div>
                            <input type="submit" class="btn btn-success" id="profile_submit" value="Update Profile">
                            
                        </spring:form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<%@include file="/WEB-INF/pages/parts/footer.jsp" %>

<%@include file="/WEB-INF/pages/parts/script-import.jsp" %>
</body>
</html>

