<%--
  Created by IntelliJ IDEA.
  User: us9522
  Date: 27.01.2017
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>


<div class="container-fluid marginTop100">
  <div class="row">
    <div class="col-lg-12">
      <div class="table-responsive">
        <table class="table table-hover table-striped table-bordered" id="rem_list">
          <thead>
            <tr>
              <th>Рем</th>
              <th>Директор</th>
              <th>Контактний телефон</th>
              <th>Банківські реквізити</th>
              <th>Адреса</th>
              <th>Довіреність</th>
              <th>Головний інженер</th>
              <th>Виконавець</th>
              <th>Район</th>
            </tr>
          </thead>
          <tbody>
            <c:forEach items="${rem_list}" var="rem">
              <tr id="${rem.id}" class="">
                <td>
                  <c:out value="${rem.rem_name}"></c:out>
                </td>
                <td>
                  <c:out value="${rem.director}"></c:out>
                </td>
                <td>
                  <c:out value="${rem.contacts}"></c:out>
                </td>
                <td>
                  <c:out value="${rem.rek_bank}"></c:out>
                </td>
                <td>
                  <c:out value="${rem.rem_licality}"></c:out>
                </td>
                <td>
                  <c:out value="${rem.dovirenist}"></c:out>
                </td>
                <td>
                  <c:out value="${rem.golovnyi_ingener}"></c:out>
                </td>
                <td>
                  <c:out value="${rem.vykonavets}"></c:out>
                </td>
                <td>
                  <c:out value="${rem.region}"></c:out>
                </td>
              </tr>
            </c:forEach>
          </tbody>
        </table>
      </div>
    </div>
  </div>
</div>


<input id="contextPath" type="hidden" value="${pageContext.request.contextPath}" />

<script src="<c:url value = "/resources/dist/css/rem/rem.css  " />"></script>