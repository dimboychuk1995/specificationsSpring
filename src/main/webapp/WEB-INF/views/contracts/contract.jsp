<%--
  Created by IntelliJ IDEA.
  User: us9522
  Date: 21.02.2017
  Time: 15:56
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
        <table class="table table-hover table-striped table-bordered" id="contract_list">
          <thead>
            <tr>

            </tr>
          </thead>
          <tbody>
            <c:forEach items="${contract_list}" var="contract">
              <tr id="#{contract.id}" class="">

              </tr>
            </c:forEach>
          </tbody>
        </table>
      </div>
    </div>
  </div>
</div>
