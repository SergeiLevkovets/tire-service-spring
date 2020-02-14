<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ page isELIgnored="false" %>
<li ><a href="${pageContext.request.contextPath}/index.html"> <i class="glyphicon glyphicon-home"></i> Главная страница </a> </li>
<li   ><a href="${pageContext.request.contextPath}/order-create"> <i class="glyphicon glyphicon-shopping-cart"></i> Оформить заказ </a> </li>
<li  ><a href="${pageContext.request.contextPath}/profile"> <i class="glyphicon glyphicon-user"></i> Профиль </a> </li>
<li  ><a href="${pageContext.request.contextPath}/login"> <i class="glyphicon glyphicon-log-in"></i> Войти  </a> </li>
<li ><a href="${pageContext.request.contextPath}/registration"> <i class="glyphicon glyphicon-floppy-disk"></i> Регистрация </a> </li>
<li class="submenu" ><a href="#"><i class="glyphicon glyphicon-list"></i> Статистика <span class="caret pull-right"></span></a>
    <!-- Sub menu -->
    <ul>
        <li><a href="${pageContext.request.contextPath}/tire"> <i class="glyphicon glyphicon-list"></i> Список шин </a> </li>
        <li><a href="${pageContext.request.contextPath}/order-statistics"> <i class="glyphicon glyphicon-list"></i> Полный список заказов </a> </li>
        <li><a href="${pageContext.request.contextPath}/order-statistics"> <i class="glyphicon glyphicon-list"></i> Список заказов </a> </li>
    </ul>
</li>
<li class="submenu" ><a href="#"><i class="glyphicon glyphicon-list"></i> Редактирование <span class="caret pull-right"></span></a>
    <!-- Sub menu -->
    <ul>
        <li><a href="${pageContext.request.contextPath}/service-item-price"> <i class="glyphicon glyphicon-list"></i> Стоимость операций </a> </li>
        <li><a href="${pageContext.request.contextPath}/service-item"> <i class="glyphicon glyphicon-list"></i> Операции </a> </li>
        <li><a href="${pageContext.request.contextPath}/diameter"> <i class="glyphicon glyphicon-list"></i> Диаметр диска </a> </li>
        <li><a href="${pageContext.request.contextPath}/height"> <i class="glyphicon glyphicon-list"></i> Высота профиля </a> </li>
        <li><a href="${pageContext.request.contextPath}/width"> <i class="glyphicon glyphicon-list"></i> Ширина колеса </a> </li>
        <li><a href="${pageContext.request.contextPath}/users"> <i class="glyphicon glyphicon-list"></i> Пользователи </a> </li>
    </ul>
</li>
<li><a href="${pageContext.request.contextPath}/logout"> <i class="glyphicon glyphicon-log-out"></i> Выход </a> </li>
<li><a href="${pageContext.request.contextPath}/404"> <i class="glyphicon glyphicon-warning-sign"></i> 404 </a> </li>