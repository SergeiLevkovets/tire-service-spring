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
                        <spring:form class="form-horizontal panel-body" id="profile_form" action="/profile-update" method="post">
                            <div class="form-group">
                                <label for="profile_name">Full Name</label>
                                <input type="text" class="form-control"
                                       value="${user.name}" name="name" id="profile_name">
                            </div>
                            <div class="form-group">
                                <label for="profile_email">Email</label>
                                <input type="email" class="form-control"
                                       value="${user.email}" name="email" id="profile_email">
                            </div>
                            <div class="form-group">
                                <label for="profile_password">Password</label>
                                <input type="text" class="form-control" name="password"
                                       value="${user.password}" id="profile_password">
                            </div>
                            <div class="form-group">
                                <label for="profile_phone">Phone No</label>
                                <input type="text" value="${user.phone}" id="profile_phone" name="phone" class="form-control">
                            </div>
                            <input type="button" class="btn btn-success" id="profile_submit" value="Update Profile">
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

