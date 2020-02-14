<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
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
                        <div class="panel-title">Пользователи</div>
                    </div>
                    <div class="panel-body">
                        <div class="row">
                            <table class="table table-bordered">
                                <thead>
                                <tr>
                                    <th>Id</th>
                                    <th>Имя</th>
                                    <th>Почта</th>
                                    <th>Пароль</th>
                                    <th>Телефон</th>
                                    <th>Роль</th>
                                    <th>Операции</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${usersList}" var="user">
                                    <tr>
                                        <td><c:out value="${user.id}"/></td>
                                        <td><c:out value="${user.name}"/></td>
                                        <td><c:out value="${user.email}"/></td>
                                        <td><c:out value="${user.password}"/></td>
                                        <td><c:out value="${user.phone}"/></td>
                                        <td><c:out value="${user.role}"/></td>
                                        <td>
                                            <c:url value="update-user" var="update">
                                                <c:param name="user_id" value="${user.id}"/>
                                            </c:url>
                                            <a href="${update}" class="btn btn-info" id="update"><i
                                                    class="glyphicon glyphicon-refresh"></i> Update</a>
                                            <c:url value="delete-user" var="delete">
                                                <c:param name="user_id" value="${user.id}"/>
                                            </c:url>
                                            <a href="${delete}" class="btn btn-danger" id="delete"><i
                                                    class="glyphicon glyphicon-remove"></i> Delete</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>

                        <spring:form class="form-horizontal panel-body" action="save-user" method="post" modelAttribute="user">
                            <div class="form-group row">
                                <spring:hidden path="id"/>
                                <div class="col-md-3">
                                    <label>Имя</label>
                                    <spring:input path="name" class="form-control" id="name"/>
                                </div>
                                <div class="col-md-2">
                                    <label>Почта</label>
                                    <spring:input path="email" class="form-control" id="email"/>
                                </div>
                                <div class="col-md-2">
                                    <label>Пароль</label>
                                    <spring:input path="password" class="form-control" id="password"/>
                                </div>
                                <div class="col-md-2">
                                    <label>Номер телефона</label>
                                    <spring:input path="phone" class="form-control" id="phone"/>
                                </div>
                                <div class="col-md-2">
                                    <label>Роль</label>
                                    <spring:select path="role" class="form-control" items="${role}" />
                                </div>
                            </div>
                            <div class="form-inline">
                                <input type="submit" class="btn btn-primary signup" value="Save">
                            </div>
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

