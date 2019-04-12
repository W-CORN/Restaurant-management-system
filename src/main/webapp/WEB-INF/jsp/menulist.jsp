<%@ page import="team.ruike.cim.util.Pager" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/28
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <title>菜谱列表</title>
    <meta name="description" content="Hound is a Dashboard & Admin Site Responsive Template by hencework."/>
    <meta name="keywords"
          content="admin, admin dashboard, admin template, cms, crm, Hound Admin, Houndadmin, premium admin templates, responsive admin, sass, panel, software, ui, visualization, web app, application"/>
    <meta name="author" content="hencework"/>
    <!-- Favicon -->
    <link rel="shortcut icon" href="../../favicon.ico">
    <link rel="icon" href="../../favicon.ico" type="image/x-icon">

    <!--alerts CSS -->
    <link href="../../vendors/bower_components/sweetalert/dist/sweetalert.css" rel="stylesheet" type="text/css">

    <!-- Custom CSS -->
    <link href="../../dist/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<!-- Preloader -->
<div class="preloader-it">
    <div class="la-anim-1"></div>
</div>
<!-- /Preloader -->
<div class="wrapper theme-1-active pimary-color-red">
    <!-- Top Menu Items -->
    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="mobile-only-brand pull-left">
            <div class="nav-header pull-left">
                <div class="logo-wrap">
                    <a href="index.do">
                        <img class="brand-img" src="../../dist/img/logo.png" alt="brand"/>
                        <span class="brand-text">餐饮工业化</span>
                    </a>
                </div>
            </div>
            <a id="toggle_nav_btn" class="toggle-left-nav-btn inline-block ml-20 pull-left"
               href="javascript:void(0);"><i class="zmdi zmdi-menu"></i></a>
            <a id="toggle_mobile_search" data-toggle="collapse" data-target="#search_form" class="mobile-only-view"
               href="javascript:void(0);"><i class="zmdi zmdi-search"></i></a>
            <a id="toggle_mobile_nav" class="mobile-only-view" href="javascript:void(0);"><i class="zmdi zmdi-more"></i></a>
            <form id="search_form" role="search" class="top-nav-search collapse pull-left">
                <div class="input-group">
                    <input type="text" name="example-input1-group2" class="form-control" placeholder="Search">
                    <span class="input-group-btn">
						<button type="button" class="btn  btn-default" data-target="#search_form" data-toggle="collapse"
                                aria-label="Close" aria-expanded="true"><i class="zmdi zmdi-search"></i></button>
						</span>
                </div>
            </form>
        </div>
        <div id="mobile_only_nav" class="mobile-only-nav pull-right">
            <ul class="nav navbar-right top-nav pull-right">
                <li>
                    <a id="open_right_sidebar" href="#"><i class="zmdi zmdi-settings top-nav-icon"></i></a>
                </li>
                <li class="dropdown app-drp">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
                            class="zmdi zmdi-apps top-nav-icon"></i></a>
                    <ul class="dropdown-menu app-dropdown" data-dropdown-in="slideInRight" data-dropdown-out="flipOutX">
                        <li>
                            <div class="app-nicescroll-bar">
                                <ul class="app-icon-wrap pa-10">
                                    <li>
                                        <a href="weather.html" class="connection-item">
                                            <i class="zmdi zmdi-cloud-outline txt-info"></i>
                                            <span class="block">weather</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="inbox.html" class="connection-item">
                                            <i class="zmdi zmdi-email-open txt-success"></i>
                                            <span class="block">e-mail</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="calendar.html" class="connection-item">
                                            <i class="zmdi zmdi-calendar-check txt-primary"></i>
                                            <span class="block">calendar</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="vector-map.html" class="connection-item">
                                            <i class="zmdi zmdi-map txt-danger"></i>
                                            <span class="block">map</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="chats.html" class="connection-item">
                                            <i class="zmdi zmdi-comment-outline txt-warning"></i>
                                            <span class="block">chat</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="contact-card.html" class="connection-item">
                                            <i class="zmdi zmdi-assignment-account"></i>
                                            <span class="block">contact</span>
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <li>
                            <div class="app-box-bottom-wrap">
                                <hr class="light-grey-hr ma-0"/>
                                <a class="block text-center read-all" href="javascript:void(0)"> more </a>
                            </div>
                        </li>
                    </ul>
                </li>
                <li class="dropdown full-width-drp">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
                            class="zmdi zmdi-more-vert top-nav-icon"></i></a>
                    <ul class="dropdown-menu mega-menu pa-0" data-dropdown-in="fadeIn" data-dropdown-out="fadeOut">
                        <li class="product-nicescroll-bar row">
                            <ul class="pa-20">
                                <li class="col-md-3 col-xs-6 col-menu-list">
                                    <a href="javascript:void(0);" data-toggle="collapse" data-target="#xx">
                                        <div class="pull-left"><i class="zmdi zmdi-landscape mr-20"></i><span
                                                class="right-nav-text">研发管理</span></div>
                                        <div class="pull-right"><i class="zmdi zmdi-caret-down"></i></div>
                                        <div class="clearfix"></div>
                                    </a>
                                    <hr class="light-grey-hr ma-0"/>
                                    <ul id="xx" class="collapse in collapse-level-1">
                                        <li>
                                            <a href="index.do">Analytical</a>
                                        </li>
                                        <li>
                                            <a href="index2.html">Demographic</a>
                                        </li>
                                        <li>
                                            <a href="index3.html">Project</a>
                                        </li>
                                        <li>
                                            <a href="profile.html">profile</a>
                                        </li>
                                    </ul>
                                    <a href="widgets.html">
                                        <div class="pull-left"><i class="zmdi zmdi-flag mr-20"></i><span
                                                class="right-nav-text">widgets</span></div>
                                        <div class="pull-right"><span class="label label-warning">8</span></div>
                                        <div class="clearfix"></div>
                                    </a>
                                    <hr class="light-grey-hr ma-0"/>
                                    <a href="documentation.html">
                                        <div class="pull-left"><i class="zmdi zmdi-book mr-20"></i><span
                                                class="right-nav-text">documentation</span></div>
                                        <div class="clearfix"></div>
                                    </a>
                                    <hr class="light-grey-hr ma-0"/>
                                </li>
                                <li class="col-md-3 col-xs-6 col-menu-list">
                                    <a href="javascript:void(0);">
                                        <div class="pull-left">
                                            <i class="zmdi zmdi-shopping-basket mr-20"></i><span class="right-nav-text">E-Commerce</span>
                                        </div>
                                        <div class="pull-right"><span class="label label-success">hot</span>
                                        </div>
                                        <div class="clearfix"></div>
                                    </a>
                                    <hr class="light-grey-hr ma-0"/>
                                    <ul>
                                        <li>
                                            <a href="e-commerce.html">Dashboard</a>
                                        </li>
                                        <li>
                                            <a href="product.html">Products</a>
                                        </li>
                                        <li>
                                            <a href="product-detail.html">Product Detail</a>
                                        </li>
                                        <li>
                                            <a href="add-products.html">Add Product</a>
                                        </li>
                                        <li>
                                            <a href="product-orders.html">Orders</a>
                                        </li>
                                        <li>
                                            <a href="product-cart.html">Cart</a>
                                        </li>
                                        <li>
                                            <a href="product-checkout.html">Checkout</a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="col-md-6 col-xs-12 preview-carousel">
                                    <a href="javascript:void(0);">
                                        <div class="pull-left"><span class="right-nav-text">latest products</span></div>
                                        <div class="clearfix"></div>
                                    </a>
                                    <hr class="light-grey-hr ma-0"/>
                                    <div class="product-carousel owl-carousel owl-theme text-center">
                                        <a href="#">
                                            <img src="../../dist/img/chair.jpg" alt="chair">
                                            <span>Circle chair</span>
                                        </a>
                                        <a href="#">
                                            <img src="../../dist/img/chair2.jpg" alt="chair">
                                            <span>square chair</span>
                                        </a>
                                        <a href="#">
                                            <img src="../../dist/img/chair3.jpg" alt="chair">
                                            <span>semi circle chair</span>
                                        </a>
                                        <a href="#">
                                            <img src="../../dist/img/chair4.jpg" alt="chair">
                                            <span>wooden chair</span>
                                        </a>
                                        <a href="#">
                                            <img src="../../dist/img/chair2.jpg" alt="chair">
                                            <span>square chair</span>
                                        </a>
                                    </div>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li class="dropdown alert-drp">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
                            class="zmdi zmdi-notifications top-nav-icon"></i><span
                            class="top-nav-icon-badge">5</span></a>
                    <ul class="dropdown-menu alert-dropdown" data-dropdown-in="bounceIn" data-dropdown-out="bounceOut">
                        <li>
                            <div class="notification-box-head-wrap">
                                <span class="notification-box-head pull-left inline-block">notifications</span>
                                <a class="txt-danger pull-right clear-notifications inline-block"
                                   href="javascript:void(0)"> clear all </a>
                                <div class="clearfix"></div>
                                <hr class="light-grey-hr ma-0"/>
                            </div>
                        </li>
                        <li>
                            <div class="streamline message-nicescroll-bar">
                                <div class="sl-item">
                                    <a href="javascript:void(0)">
                                        <div class="icon bg-green">
                                            <i class="zmdi zmdi-flag"></i>
                                        </div>
                                        <div class="sl-content">
												<span class="inline-block capitalize-font  pull-left truncate head-notifications">
												New subscription created</span>
                                            <span class="inline-block font-11  pull-right notifications-time">2pm</span>
                                            <div class="clearfix"></div>
                                            <p class="truncate">Your customer subscribed for the basic plan. The
                                                customer will pay $25 per month.</p>
                                        </div>
                                    </a>
                                </div>
                                <hr class="light-grey-hr ma-0"/>
                                <div class="sl-item">
                                    <a href="javascript:void(0)">
                                        <div class="icon bg-yellow">
                                            <i class="zmdi zmdi-trending-down"></i>
                                        </div>
                                        <div class="sl-content">
                                            <span class="inline-block capitalize-font  pull-left truncate head-notifications txt-warning">Server #2 not responding</span>
                                            <span class="inline-block font-11 pull-right notifications-time">1pm</span>
                                            <div class="clearfix"></div>
                                            <p class="truncate">Some technical error occurred needs to be resolved.</p>
                                        </div>
                                    </a>
                                </div>
                                <hr class="light-grey-hr ma-0"/>
                                <div class="sl-item">
                                    <a href="javascript:void(0)">
                                        <div class="icon bg-blue">
                                            <i class="zmdi zmdi-email"></i>
                                        </div>
                                        <div class="sl-content">
                                            <span class="inline-block capitalize-font  pull-left truncate head-notifications">2 new messages</span>
                                            <span class="inline-block font-11  pull-right notifications-time">4pm</span>
                                            <div class="clearfix"></div>
                                            <p class="truncate"> The last payment for your G Suite Basic subscription
                                                failed.</p>
                                        </div>
                                    </a>
                                </div>
                                <hr class="light-grey-hr ma-0"/>
                                <div class="sl-item">
                                    <a href="javascript:void(0)">
                                        <div class="sl-avatar">
                                            <img class="img-responsive" src="../../dist/img/avatar.jpg" alt="avatar"/>
                                        </div>
                                        <div class="sl-content">
                                            <span class="inline-block capitalize-font  pull-left truncate head-notifications">Sandy Doe</span>
                                            <span class="inline-block font-11  pull-right notifications-time">1pm</span>
                                            <div class="clearfix"></div>
                                            <p class="truncate">Neque porro quisquam est qui dolorem ipsum quia dolor
                                                sit amet, consectetur, adipisci velit</p>
                                        </div>
                                    </a>
                                </div>
                                <hr class="light-grey-hr ma-0"/>
                                <div class="sl-item">
                                    <a href="javascript:void(0)">
                                        <div class="icon bg-red">
                                            <i class="zmdi zmdi-storage"></i>
                                        </div>
                                        <div class="sl-content">
                                            <span class="inline-block capitalize-font  pull-left truncate head-notifications txt-danger">99% server space occupied.</span>
                                            <span class="inline-block font-11  pull-right notifications-time">1pm</span>
                                            <div class="clearfix"></div>
                                            <p class="truncate">consectetur, adipisci velit.</p>
                                        </div>
                                    </a>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="notification-box-bottom-wrap">
                                <hr class="light-grey-hr ma-0"/>
                                <a class="block text-center read-all" href="javascript:void(0)"> read all </a>
                                <div class="clearfix"></div>
                            </div>
                        </li>
                    </ul>
                </li>
                <li class="dropdown auth-drp">
                    <a href="#" class="dropdown-toggle pr-0" data-toggle="dropdown"><img src="../../dist/img/user1.png"
                                                                                         alt="user_auth"
                                                                                         class="user-auth-img img-circle"/><span
                            class="user-online-status"></span></a>
                    <ul class="dropdown-menu user-auth-dropdown" data-dropdown-in="flipInX"
                        data-dropdown-out="flipOutX">
                        <li>
                            <a href="profile.html"><i class="zmdi zmdi-account"></i><span>Profile</span></a>
                        </li>
                        <li>
                            <a href="#"><i class="zmdi zmdi-card"></i><span>my balance</span></a>
                        </li>
                        <li>
                            <a href="inbox.html"><i class="zmdi zmdi-email"></i><span>Inbox</span></a>
                        </li>
                        <li>
                            <a href="#"><i class="zmdi zmdi-settings"></i><span>Settings</span></a>
                        </li>
                        <li class="divider"></li>
                        <li class="sub-menu show-on-hover">
                            <a href="#" class="dropdown-toggle pr-0 level-2-drp"><i
                                    class="zmdi zmdi-check text-success"></i> available</a>
                            <ul class="dropdown-menu open-left-side">
                                <li>
                                    <a href="#"><i class="zmdi zmdi-check text-success"></i><span>available</span></a>
                                </li>
                                <li>
                                    <a href="#"><i class="zmdi zmdi-circle-o text-warning"></i><span>busy</span></a>
                                </li>
                                <li>
                                    <a href="#"><i
                                            class="zmdi zmdi-minus-circle-outline text-danger"></i><span>offline</span></a>
                                </li>
                            </ul>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#"><i class="zmdi zmdi-power"></i><span>Log Out</span></a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>
    <!-- /Top Menu Items -->

    <!-- Left Sidebar Menu -->
    <div class="fixed-sidebar-left">
        <ul class="nav navbar-nav side-nav nicescroll-bar">
            <li class="navigation-header">
                <span>功能菜单</span>
                <i class="zmdi zmdi-more"></i>
            </li>
            <li>
                <a href="javascript:void(0);">
                    <div class="pull-left"><i class="icon-home mr-20"></i><span
                            class="right-nav-text">主页</span></div>
                    <div class="pull-right"><span class="label label-warning">8</span></div>
                    <div class="clearfix"></div>
                </a>
            </li>
            <c:forEach items="${sessionScope.u.roles}" var="role">
                <c:forEach items="${role.jurisdictions}" var="j">
                    <li>
                        <a href="javascript:void(0);" <c:if test="${j.jurisdictionId==1}"> class="active" </c:if>
                           data-toggle="collapse" data-target="#${j.jurisdictionId}">
                            <div class="pull-left"><i class="${j.icon} mr-20"></i><span
                                    class="right-nav-text" style="font-family: 微软雅黑;">${j.jurisdictionName}</span>
                            </div>
                            <div class="pull-right"><i class="zmdi zmdi-caret-down"></i></div>
                            <div class="clearfix"></div>
                        </a>
                            <%--在此处判断权限类型--%>
                        <ul id="${j.jurisdictionId}"
                            class="collapse <c:if test="${j.jurisdictionId==1}">in</c:if> collapse-level-1">
                            <c:forEach items="${role.functions}" var="f">
                                <c:if test="${j.jurisdictionId==f.jurisdictionId&&f.type==0}">
                                    <li>
                                        <a <c:if test="${f.functionId==1}"> class="active-page" </c:if>
                                                href="${pageContext.request.contextPath}/${f.functionUrl}">${f.functionName}</a>
                                    </li>
                                </c:if>
                            </c:forEach>
                        </ul>
                    </li>
                </c:forEach>
            </c:forEach>
            <li>
                <hr class="light-grey-hr mb-10"/>
            </li>
            <li class="navigation-header">
                <span>系统</span>
                <i class="zmdi zmdi-more"></i>
            </li>
            <li>
                <a href="documentation.html">
                    <div class="pull-left"><i class="fa fa-power-off mr-20"></i><span class="right-nav-text">退出</span>
                    </div>
                    <div class="clearfix"></div>
                </a>
            </li>
        </ul>
    </div>
    <!-- /Left Sidebar Menu -->

    <!-- Main Content -->
    <div class="page-wrapper">
        <div class="container-fluid">
            <!-- Title -->
            <div class="row heading-bg">
                <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                    <h5 class="txt-dark">菜谱列表</h5>
                </div>
                <!-- Breadcrumb -->
                <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                    <ol class="breadcrumb">
                        <li><a href="${pageContext.request.contextPath}/index.do">首页</a></li>
                        <li><a href="#"><span>菜谱管理</span></a></li>
                        <li class="active"><span>菜谱列表</span></li>
                    </ol>
                </div>
                <!-- /Breadcrumb -->
            </div>
            <!-- /Title -->
            <!-- Row -->
            <div class="row">
                <div class="col-md-12">
                    <div class="panel panel-default card-view pa-0">
                        <div class="panel-wrapper collapse in">
                            <div class="panel-body pa-0">
                                <div class="">
                                    <div class="col-lg-3 col-md-4 file-directory pa-0">
                                        <div class="ibox float-e-margins">
                                            <div class="ibox-content">
                                                <div class="file-manager">
                                                    <div class="mt-20 mb-20 ml-15 mr-15">
                                                        <!--<div class="fileupload btn btn-warning btn-anim btn-block"><i class="fa fa-upload"></i><span class="btn-text">Upload files</span>-->
                                                        <!--<input type="file" class="upload">-->
                                                        <!--</div>-->
                                                    </div>
                                                    <div class="pl-15 mb-30">
                                                        <a href="${pageContext.request.contextPath}/menulist.do?menuState.menuStateId=0" class="file-control <c:if test="${requestScope.menu.menuState.menuStateId==0||requestScope.menu.menuState.menuStateId==null}"> active </c:if>">全部</a>
                                                        <c:forEach items="${requestScope.stateList}" var="state">
                                                            <a href="${pageContext.request.contextPath}/menulist.do?menuState.menuStateId=${state.menuStateId}" class="file-control <c:if test="${requestScope.menu.menuState.menuStateId==state.menuStateId}"> active </c:if>">${state.menuStateName}</a>
                                                        </c:forEach>
                                                    </div>

                                                    <h6 class="mb-10 pl-15">类别</h6>
                                                    <ul class="folder-list mb-30">
                                                        <li class="<c:if test="${requestScope.menu.menuType.menuTypeId==0||requestScope.menu.menuType.menuTypeId==null}"> active </c:if>"><a href="${pageContext.request.contextPath}/menulist.do?menuType.menuTypeId=0"><i
                                                                class="fa fa-lemon-o"></i>所有</a></li>
                                                        <c:forEach var="type" items="${requestScope.typeList}">
                                                            <li class="<c:if test="${requestScope.menu.menuType.menuTypeId==type.menuTypeId}">active </c:if>"><a href="${pageContext.request.contextPath}/menulist.do?menuType.menuTypeId=${type.menuTypeId}"><i class="fa fa-lemon-o"></i>${type.menuTypeName}</a></li>
                                                        </c:forEach>
                                                    </ul>
                                                    <h6 class="pl-15 mb-10">条件检索</h6>
                                                    <div class="input-group">
                                                        <div class="input-group-addon"><i class="ti-agenda"></i></div>
                                                        <input id="se" type="text" class="form-control" name="Username"
                                                               placeholder="关键字检索" value="${requestScope.menu.menuName}">
                                                    </div>
                                                    <br/>
                                                    <div style="margin:0 auto;text-align:center;">
                                                        <button id="seb" class="btn btn-primary btn-rounded btn-icon left-icon">
                                                            <i class="fa fa-search"></i> <span>检索</span></button>

                                                        <button onclick="toAddMenu()" class="btn btn-primary btn-rounded btn-icon left-icon">
                                                            <span>添加菜谱</span>
                                                        </button>
                                                    </div>

                                                    <div class="clearfix"></div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-lg-9 col-md-8 file-sec pt-20">
                                        <div class="row">
                                            <div class="col-lg-12">
                                                <div class="row">
                                                    <c:forEach items="${requestScope.pager.list}" var="menu">
                                                        <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12  file-box">
                                                            <div class="file menu-z">
                                                                <a href="${pageContext.request.contextPath}/menuflow.do?menuId=${menu.menuId}">
                                                                    <div class="image"
                                                                         style="background-image:url(../../images/menuimg/${menu.menuImage})">
                                                                    </div>
                                                                    <div class="file-name">
                                                                            ${menu.menuName}
                                                                        <br>
                                                                        <span>创建时间:<fmt:formatDate value="${menu.menuCreateDate}" pattern="yyyy年MM月dd日 HH:mm:ss"/></span>
                                                                    </div>
                                                                </a>
                                                                <div style="float: right;position: relative;top: 3px;">

                                                                    <button type="button" class="btn " style="background-color: white;" onclick="toEdit(${menu.menuId})">
                                                                        <i class="fa ti-pencil-alt" style="color: #2879ff;"></i>
                                                                    </button>
                                                                    <button type="button" class="btn" style="background-color: white;" data-menu="${menu.menuId}"  onclick="toDel(this)">
                                                                        <i class="fa ti-trash" style="color: #2879ff;"></i>
                                                                    </button>

                                                                </div>
                                                            </div>
                                                        </div>
                                                    </c:forEach>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="panel-wrapper collapse in" style="margin:0 auto;text-align:center;">
                                            <div class="panel-body">
                                                <div class="row">
                                                    <div class="col-md-12">
                                                        <ul class="pagination pagination-split">
                                                            <li <c:if
                                                                    test="${requestScope.pager.currentPage==1}"> class="disabled" </c:if>>
                                                                <a <%
                                                                    Pager pager = (Pager) request.getAttribute("pager");
                                                                    if(pager.getCurrentPage()!=1){%>
                                                                    href="${pageContext.request.contextPath}/menulist.do?currentPage=${requestScope.pager.previousPage}&menuState.menuStateId=${requestScope.menu.menuState.menuStateId}&menuType.menuTypeId=${requestScope.menu.menuType.menuTypeId}&menuName=${requestScope.menu.menuName}"
                                                                    <%
                                                                        }else {%>
                                                                        href="javascript:void(0);"
                                                                        <%}
                                                                    %>>
                                                                    <i class="fa fa-angle-left"></i></a></li>
                                                            <c:forEach var="bar" items="${requestScope.pager.pageBar}">
                                                                <li <c:if
                                                                        test="${bar==requestScope.pager.currentPage}"> class="active" </c:if> >
                                                                    <a href="${pageContext.request.contextPath}/menulist.do?currentPage=${bar}&menuState.menuStateId=${requestScope.menu.menuState.menuStateId}&menuType.menuTypeId=${requestScope.menu.menuType.menuTypeId}&menuName=${requestScope.menu.menuName}">${bar}</a>
                                                                </li>
                                                            </c:forEach>
                                                            <%--<li class="disabled"><a href="#">1</a></li>--%>
                                                            <%--<li class="active"><a href="#">2</a></li>--%>
                                                            <li <c:if
                                                                    test="${requestScope.pager.currentPage>=requestScope.pager.totalPage}"> class="disabled" </c:if>>
                                                                <a <%
                                                                    if(pager.getCurrentPage()<pager.getTotalPage()){%>
                                                                        href="${pageContext.request.contextPath}/menulist.do?currentPage=${requestScope.pager.nextPage}&menuState.menuStateId=${requestScope.menu.menuState.menuStateId}&menuType.menuTypeId=${requestScope.menu.menuType.menuTypeId}&menuName=${requestScope.menu.menuName}"
                                                                        <%
                                                                        }else {%>
                                                                        href="javascript:void(0);"
                                                                        <%}
                                                                        %>>
                                                                    <i class="fa fa-angle-right"></i></a></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /Row -->

        </div>
        <!-- Footer -->
        <footer class="footer container-fluid pl-30 pr-30">
            <div class="row">
                <div class="col-sm-12">
                    <p>2017 &copy; CIM by XuZhouRuiKe Technology Co.,Ltd</p>
                </div>
            </div>
        </footer>
        <!-- /Footer -->
    </div>
    <!-- /Main Content -->
</div>
<!-- /#wrapper -->

<!-- JavaScript -->

<!-- jQuery -->
<script src="../../vendors/bower_components/jquery/dist/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="../../vendors/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

<!-- Slimscroll JavaScript -->
<script src="../../dist/js/jquery.slimscroll.js"></script>

<!-- Fancy Dropdown JS -->
<script src="../../dist/js/dropdown-bootstrap-extended.js"></script>

<!-- Owl JavaScript -->
<script src="../../vendors/bower_components/owl.carousel/dist/owl.carousel.min.js"></script>

<!-- Switchery JavaScript -->
<script src="../../vendors/bower_components/switchery/dist/switchery.min.js"></script>
<!-- Sweet-Alert  -->
<script src="../../vendors/bower_components/sweetalert/dist/sweetalert.min.js"></script>
<script src="../../dist/js/sweetalert-data.js"></script>

<!-- Init JavaScript -->
<script src="../../dist/js/init.js"></script>
<script>
    $(function () {
        $("#seb").click(function () {
            location.href="${pageContext.request.contextPath}/menulist.do?menuName="+$("#se").val();
        });
        $(".menu-z").mouseover(function () {
            $(this).css("border","1px solid orange");
        });
        $(".menu-z").mouseout(function () {
            $(this).css("border","1px solid #F8FEFF");
        });
    });

    function toEdit(tid) {
        location.href="/menu/toEdit.cl?menuId="+tid;
    }

    function toDel(thi) {
        swal({
            title: "是否删除?",
            text: "你将无法恢复这个的数据!",
            type: "warning",
            showCancelButton: true,
            confirmButtonColor: "#fec107",
            confirmButtonText: "删除!",
                cancelButtonText: "取消!",
            closeOnConfirm: false
        }, function(){
            var menuId={
                "menuId":$(thi).data("menu")
            };

          $.ajax({
                url: "/menu/del.do",
                method: "post",
                data:menuId,
                success: function (data) {
                   $(thi).parent().parent().parent().remove();
                    swal("删除!", "你的菜谱数据已被删除.", "success");
                }, error: function () {
                  swal("错误", "未知异常,删除失败", "error");
                }
            });


        });
        return false;
    }

    function toAddMenu() {
        location.href="menu/toAdd.cl";
    }
</script>
</body>
</html>
