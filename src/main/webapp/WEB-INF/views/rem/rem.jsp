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


<div class="container-fluid">
  <div class="row">
    <div class="col-lg-12">
      <div class="table-responsive">
        <table class="table table-hover table-striped table-bordered" id="rem_list">
          <thead>
            <tr>
              <th></th>
              <th></th>
              <th></th>
              <th></th>
              <th></th>
              <th></th>
              <th></th>
              <th></th>
              <th></th>
              <th></th>
              <th></th>
              <th></th>
              <th></th>
              <th></th>
            </tr>
          </thead>
          <tbody>
            <c:forEach items="${rem_list}" var="rem">
              <tr id="${rem.id}" class="">
                <td>
                  <c:out value="${rem.rem_name}"></c:out>
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