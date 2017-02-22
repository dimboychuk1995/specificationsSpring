<%--
  Created by IntelliJ IDEA.
  User: us9522
  Date: 22.02.2017
  Time: 9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<div class="container-fluid marginTop100">
  <div class="row">
    <h3 class="pull-down col-md-12 text-center">Редагування даних по договору ТУ</h3>
  </div>

  <div class="row">
    <div class="col-lg-2">
      <ul class="nav nav-tabs nav-stacked nav-pills">
        <li class="active"><a data-toggle="tab" href="#home">Замовник</a></li>
        <li><a data-toggle="tab" href="#menu1">Дані про об'єкт</a></li>
        <li><a data-toggle="tab" href="#menu2">Вимоги ТУ</a></li>
        <li><a data-toggle="tab" href="#menu2">Технічні умови № Договір</a></li>
        <li><a data-toggle="tab" href="#menu2">Допуск та проектування</a></li>
        <li><a data-toggle="tab" href="#menu2">Допуск та підключення</a></li>
        <li><a data-toggle="tab" href="#menu2">Схема приєднання</a></li>
        <li><a data-toggle="tab" href="#menu2">Документація</a></li>
        <li><a data-toggle="tab" href="#menu2">Документація приєднання</a></li>
        <li><a data-toggle="tab" href="#menu2">Зміни ТУ</a></li>
        <li><a data-toggle="tab" href="#menu2">Плата за стандартне приєднання</a></li>
        <li><a data-toggle="tab" href="#menu2">Плата за нестандартне приєднання</a></li>
        <li><a data-toggle="tab" href="#menu2">Дані ВКБ</a></li>
        <li><a data-toggle="tab" href="#menu2">Прикріплені файли</a></li>
        <li><a data-toggle="tab" href="#menu2">Дані ДКЕЕ</a></li>
      </ul>
    </div>
    <div class="col-lg-10">
      <div class="tab-content">
        <div id="home" class="tab-pane fade in active">
          <h3>HOME</h3>
          <p>Some content.</p>
        </div>
        <div id="menu1" class="tab-pane fade">
          <h3>Menu 1</h3>
          <p>Some content in menu 1.</p>
        </div>
        <div id="menu2" class="tab-pane fade">
          <h3>Menu 2</h3>
          <p>Some content in menu 2.</p>
        </div>
      </div>
    </div>
  </div>
</div>


<link href="<c:url value = "/resources/dist/css/contract/contract.css" />" rel="stylesheet">