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

    <a href=<c:url value="/specifications"/> class="btn btn-default pull-down">Назад</a>

    <button id="sendForm" type="submit" form="contractFormCustomer" class="btn btn-success pull-down">Зберегти
      <span class="glyphicon glyphicon-ok"></span>
    </button>

    <a href="<c:url value="/specifications/contract/delete/${id}"/> " class="btn btn-danger delete">Видалити</a>

    <h3 class="pull-down col-md-12 text-center">Редагування даних по договору ТУ</h3>
  </div>

  <div class="row">
    <div class="col-lg-2">
      <ul class="nav nav-tabs nav-stacked nav-pills">
        <li class="active"><a data-toggle="tab" href="#customer">Замовник</a></li>
        <li><a data-toggle="tab" href="#dataobject">Дані про об'єкт</a></li>
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
        <div id="customer" class="tab-pane fade in active">
          <div class="row">
            <div class="col-md-8">
              <form:form id="contractFormCustomer" action="" method="post" modelAttribute="contract" class="form-group pull-down">
                <fieldset>

                  <label>Соціальний статус</label>
                  <form:select path="customerSocStatus" items="${CustomerSocStatusEnum}" itemLabel="customerSocStatus" class="form-control" cssErrorClass=""/>

                  <label>Споживач</label>
                  <form:select path="customerType" items="${CustomerTypeEnum}" itemLabel="customerType" class="form-control" cssErrorClass=""/>

                  <label>Тип договору</label>
                  <form:select path="typeContract" items="${TypeContractEnum}" itemLabel="typeContract" class="form-control" cssErrorClass=""/>

                  <label>Тип приєднання</label>
                  <form:select path="typeJoin" items="${TypeJoinEnum}" itemLabel="typeJoin" class="form-control" cssErrorClass=""/>

                  <label>Ступінь приєднання</label>
                  <form:select path="stageJoin" items="${StageJoinEnum}" itemLabel="stageJoin" class="form-control" cssErrorClass=""/>

                  <label>Дата реєстрації в РЕМ</label>
                  <form:input type="text" path="registrationDate" placeholder="click to show datepicker" id="mainDatepicker" class="form-control" cssErrorClass=""/>

                  <label>ПІП</label>
                  <div class="row">
                    <div class="col-md-3">
                      <form:input type="text" path="sName" class="form-control" cssErrorClass=""/>
                    </div>
                    <div class="col-md-3">
                      <form:input type="text" path="fName" class="form-control" cssErrorClass=""/>
                    </div>
                    <div class="col-md-3">
                      <form:input type="text" path="tName" class="form-control" cssErrorClass=""/>
                    </div>
                  </div>
                  <label>Посада керівника</label>
                  <form:input type="text" path="customer_post" class="form-control" cssErrorClass=""/>

                  <label>Установчий документ</label>
                  <form:select path="constitutiveDocuments" items="${ConstitutiveDocumentsEnum}" itemLabel="constitutiveDocuments" class="form-control" cssErrorClass=""/>

                  <label>Розрахунковий рахунок</label>
                  <form:input type="text" path="bank_account" class="form-control" cssErrorClass=""/>

                  <label>МФО, Банк</label>
                  <form:input type="text" path="bank_mfo" class="form-control" cssErrorClass=""/>

                  <label>Ідентифікаційний номер</label>
                  <form:input type="text" path="bank_identification_number" class="form-control" cssErrorClass=""/>

                  <label>Свідоцтво платника податків</label>
                  <form:input type="text" path="taxpayer" class="form-control" cssErrorClass=""/>

                  <label>Населений пункт</label>
                  <form:input type="text" path="customer_locality" class="form-control" cssErrorClass=""/>

                  <label>Вулиця, номер будинку, квартири</label>
                  <form:input type="text" path="customer_adress" class="form-control" cssErrorClass=""/>

                  <label>Телефон</label>
                  <form:input type="text" path="customer_telephone" class="form-control" cssErrorClass=""/>

                  <label>Поштовий індекс</label>
                  <form:input type="text" path="customer_zipcode" class="form-control" cssErrorClass=""/>

                </fieldset>
              </form:form>
            </div>
          </div>
        </div>
        <div id="dataobject" class="tab-pane fade">
          <div class="row">
            <div class="col-md-8">
              <form:form id="contractFormCustomer" action="" method="post" modelAttribute="contract" class="form-group pull-down">
                <fieldset>

                  <%--<label>Підстава видачі ТУ</label>--%>
                  <%--<form:select path="reasonTC" items="${ReasonTCEnum}" itemLabel="reasonTC" class="form-control" cssErrorClass=""/>--%>

                  <label>Назва</label>
                  <form:input type="text" path="object_name" class="form-control" cssErrorClass=""/>

                  <label>Функціональне призначення об'єкта</label>
                  <form:input type="text" path="functional_target" class="form-control" cssErrorClass=""/>

                  <label>Назва населеного пункту</label>
                  <form:input type="text" path="name_locality" class="form-control" cssErrorClass=""/>

                  <label>Адреса</label>
                  <form:input type="text" path="name_locality" class="form-control" cssErrorClass=""/>

                  <label>Поштовий індекс</label>
                  <form:input type="text" path="name_locality" class="form-control" cssErrorClass=""/>

                  <label>Розробник ТУ</label>
                  <form:input type="text" path="name_locality" class="form-control" cssErrorClass=""/>

                  <label>Сума за ТУ, грн</label>
                  <form:input type="text" path="name_locality" class="form-control" cssErrorClass=""/>

                  <label>Дата оплати</label>
                  <form:input type="text" path="name_locality" class="form-control" cssErrorClass=""/>

                  <label>Дата введення в експлуатацію</label>
                  <form:input type="text" path="name_locality" class="form-control" cssErrorClass=""/>

                  <label>Вартість виїзду на об*єкт (без ПДВ), грн</label>
                  <form:input type="text" path="name_locality" class="form-control" cssErrorClass=""/>

                  <label>Географічні координати точки підлючення</label>
                  <form:input type="text" path="name_locality" class="form-control" cssErrorClass=""/>

                  <label>Географічні координати точки забезпечення потужності</label>

                  <label>Точка приєднання</label>

                  <label>Точка забезпечення потужності</label>

                  <label>Категорія надійності</label>

                  <label>Категорія надійності(існуюча потужність)</label>

                  <label>Категорія надійності будівельних струмоприймачів</label>

                  <label>Напруга</label>

                  <label>Заявлена потужність, кВт</label>

                  <label>Потужність будівельних струмоприймачів</label>
                  <label>В тому числі для</label>

                  <label>опалення приміщень:</label>

                  <label>екологічної броні:</label>

                  <label>аварійної броні:</label>

                  <label>технологічної броні:</label>

                  <label>електричний підігрів води</label>

                  <label>стаціонарні електричні плити</label>

                  <label>існуюча потужність</label>

                  <label>Договір про постачання(користування) е/е № та дата</label>

                </fieldset>
              </form:form>
            </div>
          </div>
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