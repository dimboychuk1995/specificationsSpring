
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<div class="container-fluid marginTop100">
  <div class="row">
    <h1 class="pull-down col-md-6">Редагування даних по РЕМ</h1>
  </div>
  <div class="row">
    <div class="col-md-6">
      <form:form action="" method="POST" modelAttribute="rem" class="form-group pull-down">
        <fieldset>

          <label>Назва</label>
          <form:input type="text" path="rem_name" readonly="true" class="form-control" cssErrorClass="" />

          <label>Директор</label>
          <form:input type="text" path="director" class="form-control" cssErrorClass=""/>

          <label>Директор</label>
          <form:input type="text" path="contacts" class="form-control" cssErrorClass=""/>

          <label>Директор</label>
          <form:input type="text" path="rek_bank" class="form-control" cssErrorClass=""/>

          <label>Директор</label>
          <form:input type="text" path="rem_licality" class="form-control" cssErrorClass=""/>

          <label>Директор</label>
          <form:input type="text" path="director_rod" class="form-control" cssErrorClass=""/>

          <label>Директор</label>
          <form:input type="text" path="director_dav" class="form-control" cssErrorClass=""/>

          <label>Директор</label>
          <form:input type="text" path="dovirenist" class="form-control" cssErrorClass=""/>

          <label>Директор</label>
          <form:input type="text" path="golovnyi_ingener" class="form-control" cssErrorClass=""/>

          <label>Директор</label>
          <form:input type="text" path="vykonavets" class="form-control" cssErrorClass=""/>

          <label>Директор</label>
          <form:input type="text" path="region" class="form-control" cssErrorClass=""/>

          <label>Директор</label>
          <form:input type="text" path="rek_bank_with_spec" class="form-control" cssErrorClass=""/>

          <label>Директор</label>
          <form:input type="text" path="rek_bank_without_spec" class="form-control" cssErrorClass=""/>

          <label>Директор</label>
          <form:input type="text" path="city_town_village" class="form-control" cssErrorClass=""/>

        </fieldset>
      </form:form>
    </div>
  </div>
</div>
