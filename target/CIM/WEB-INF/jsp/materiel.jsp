<%@ page import="team.ruike.cim.util.Pager" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/4
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <title>物料管理</title>
    <meta name="description" content="Hound is a Dashboard & Admin Site Responsive Template by hencework."/>
    <meta name="keywords"
          content="admin, admin dashboard, admin template, cms, crm, Hound Admin, Houndadmin, premium admin templates, responsive admin, sass, panel, software, ui, visualization, web app, application"/>
    <meta name="author" content="hencework"/>

    <!-- Favicon -->
    <link rel="shortcut icon" href="../../favicon.ico">
    <link rel="icon" href="../../favicon.ico" type="image/x-icon">

    <!-- Bootstrap Wysihtml5 css -->
    <link rel="stylesheet"
          href="../../vendors/bower_components/bootstrap3-wysihtml5-bower/dist/bootstrap3-wysihtml5.css"/>

    <!-- Data table CSS -->
    <link href="../../vendors/bower_components/datatables/media/css/jquery.dataTables.min.css" rel="stylesheet"
          type="../../text/css"/>
    <link href="../../vendors/bower_components/sweetalert/dist/sweetalert.css" rel="stylesheet" type="text/css">
    <!-- Custom CSS -->
    <link href="../../dist/css/style.css" rel="stylesheet" type="text/css">

</head>

<body>
<!--Preloader-->
<div class="preloader-it">
    <div class="la-anim-1"></div>
</div>
<!--/Preloader-->
<div class="wrapper theme-1-active pimary-color-red">

    <!-- Top Menu Items -->
    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="mobile-only-brand pull-left">
            <div class="nav-header pull-left">
                <div class="logo-wrap">
                    <a href="index.html">
                        <img class="brand-img" src="../../dist/img/logo.png" alt="brand"/>
                        <span class="brand-text">Hound</span>
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
                                    <a href="javascript:void(0);">
                                        <div class="pull-left"><i class="zmdi zmdi-landscape mr-20"></i><span
                                                class="right-nav-text">Dashboard</span></div>
                                        <div class="pull-right"><i class="zmdi zmdi-caret-down"></i></div>
                                        <div class="clearfix"></div>
                                    </a>
                                    <hr class="light-grey-hr ma-0"/>
                                    <ul>
                                        <li>
                                            <a href="index.html">Analytical</a>
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
                                        <a <c:if test="${f.functionId==5}"> class="active-page" </c:if>
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

    <!-- Right Sidebar Menu -->
    <div class="fixed-sidebar-right">
        <ul class="right-sidebar">
            <li>
                <div class="tab-struct custom-tab-1">
                    <ul role="tablist" class="nav nav-tabs" id="right_sidebar_tab">
                        <li class="active" role="presentation"><a aria-expanded="true" data-toggle="tab" role="tab"
                                                                  id="chat_tab_btn" href="#chat_tab">消息</a></li>
                        <li role="presentation" class=""><a data-toggle="tab" id="messages_tab_btn" role="tab"
                                                            href="#messages_tab" aria-expanded="false">管理员</a></li>
                        <li role="presentation" class=""><a data-toggle="tab" id="todo_tab_btn" role="tab"
                                                            href="#todo_tab" aria-expanded="false">通知</a></li>
                    </ul>
                    <div class="tab-content" id="right_sidebar_content">
                        <div id="chat_tab" class="tab-pane fade active in" role="tabpanel">
                            <div class="chat-cmplt-wrap">
                                <div class="chat-box-wrap">
                                    <div class="add-friend">
                                        <a href="javascript:void(0)" class="inline-block txt-grey">
                                            <i class="zmdi zmdi-more"></i>
                                        </a>
                                        <span class="inline-block txt-dark">消息</span>
                                        <a href="javascript:void(0)" class="inline-block text-right txt-grey"><i
                                                class="zmdi zmdi-plus"></i></a>
                                        <div class="clearfix"></div>
                                    </div>
                                    <div id="chat_list_scroll">
                                        <div class="nicescroll-bar">
                                            <ul class="chat-list-wrap">
                                                <li class="chat-list">
                                                    <div class="chat-body">
                                                        <a href="javascript:void(0)">
                                                            <div class="chat-data">
                                                                <img class="user-img img-circle"
                                                                     src="../../dist/img/user.png"
                                                                     alt="user"/>
                                                                <div class="user-data">
                                                                    <span class="name block capitalize-font">群聊</span>
                                                                    <span class="time block truncate txt-grey">all</span>
                                                                </div>
                                                                <%--<div class="status away"></div>--%>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </a>
                                                    </div>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <div class="recent-chat-box-wrap">
                                    <div class="recent-chat-wrap">
                                        <div class="panel-heading ma-0">
                                            <div class="goto-back">
                                                <a id="goto_back" href="javascript:void(0)"
                                                   class="inline-block txt-grey">
                                                    <i class="zmdi zmdi-chevron-left"></i>
                                                </a>
                                                <span class="inline-block txt-dark">群聊</span>
                                                <a href="javascript:void(0)" class="inline-block text-right txt-grey"><i
                                                        class="zmdi zmdi-more"></i></a>
                                                <div class="clearfix"></div>
                                            </div>
                                        </div>
                                        <div class="panel-wrapper collapse in">
                                            <div class="panel-body pa-0">
                                                <div class="chat-content">
                                                    <ul class="nicescroll-bar pt-20">
                                                        <li class="friend">
                                                            <div class="friend-msg-wrap">
                                                                <img class="user-img img-circle block pull-left"
                                                                     src="../../dist/img/user.png" alt="user"/>
                                                                <div class="msg pull-left">
                                                                    <p>你好傻逼</p>
                                                                    <div class="msg-per-detail text-right">
                                                                        <span class="msg-time txt-grey">2:30 PM</span>
                                                                    </div>
                                                                </div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </li>
                                                        <li class="self mb-10">
                                                            <div class="self-msg-wrap">
                                                                <div class="msg block pull-right">你他妈的才傻逼
                                                                    <div class="msg-per-detail text-right">
                                                                        <span class="msg-time txt-grey">2:31 pm</span>
                                                                    </div>
                                                                </div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </li>
                                                    </ul>
                                                </div>
                                                <!--111-->
                                                <div class="input-group">
                                                    <input type="text" id="input_msg_send" name="send-msg"
                                                           class="input-msg-send form-control"
                                                           placeholder="Type something">
                                                    <div class="input-group-btn emojis">
                                                        <div class="dropup">
                                                            <button type="button"
                                                                    class="btn  btn-default  dropdown-toggle"
                                                                    data-toggle="dropdown"><i
                                                                    class="zmdi zmdi-mood"></i></button>
                                                            <ul class="dropdown-menu dropdown-menu-right">
                                                                <li><a href="javascript:void(0)">Action</a></li>
                                                                <li><a href="javascript:void(0)">Another action</a></li>
                                                                <li class="divider"></li>
                                                                <li><a href="javascript:void(0)">Separated link</a></li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                    <div class="input-group-btn attachment">
                                                        <div class="fileupload btn  btn-default"><i
                                                                class="zmdi zmdi-attachment-alt"></i>
                                                            <input type="file" class="upload">
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div id="messages_tab" class="tab-pane fade" role="tabpanel">
                            <div class="message-box-wrap">
                                <div class="msg-search">
                                    <a href="javascript:void(0)" class="inline-block txt-grey">
                                        <i class="zmdi zmdi-more"></i>
                                    </a>
                                    <span class="inline-block txt-dark">在线管理员</span>
                                    <a href="javascript:void(0)" class="inline-block text-right txt-grey"><i
                                            class="zmdi zmdi-search"></i></a>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="set-height-wrap">
                                    <div class="streamline message-box nicescroll-bar" id="us">
                                        <a href="javascript:void(0)">
                                            <div class="sl-item unread-message">
                                                <div class="sl-avatar avatar avatar-sm avatar-circle">
                                                    <img class="img-responsive img-circle" src="../../dist/img/user.png"
                                                         alt="avatar"/>
                                                </div>
                                                <div class="sl-content">
                                                    <span class="inline-block capitalize-font   pull-left message-per">华中昊</span>
                                                    <span class="inline-block font-11  pull-right message-time">12:28 AM</span>
                                                    <div class="clearfix"></div>
                                                    <span class=" truncate message-subject">超级管理员</span>
                                                    <p class="txt-grey truncate"></p>
                                                </div>
                                            </div>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div id="todo_tab" class="tab-pane fade" role="tabpanel">
                            <div class="todo-box-wrap">
                                <div class="add-todo">
                                    <a href="javascript:void(0)" class="inline-block txt-grey">
                                        <i class="zmdi zmdi-more"></i>
                                    </a>
                                    <span class="inline-block txt-dark">todo list</span>
                                    <a href="javascript:void(0)" class="inline-block text-right txt-grey"><i
                                            class="zmdi zmdi-plus"></i></a>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="set-height-wrap">
                                    <!-- Todo-List -->
                                    <ul class="todo-list nicescroll-bar">
                                        <li class="todo-item">
                                            <div class="checkbox checkbox-default">
                                                <input type="checkbox" id="checkbox01"/>
                                                <label for="checkbox01">Record The First Episode</label>
                                            </div>
                                        </li>
                                        <li>
                                            <hr class="light-grey-hr"/>
                                        </li>
                                        <li class="todo-item">
                                            <div class="checkbox checkbox-pink">
                                                <input type="checkbox" id="checkbox02"/>
                                                <label for="checkbox02">Prepare The Conference Schedule</label>
                                            </div>
                                        </li>
                                        <li>
                                            <hr class="light-grey-hr"/>
                                        </li>
                                    </ul>
                                    <!-- /Todo-List -->
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </li>
        </ul>
    </div>
    <!-- /Right Sidebar Menu -->


    <!-- Main Content -->
    <div class="page-wrapper">
        <div class="container-fluid">
            <!-- Title -->
            <div class="row heading-bg">
                <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                    <h5 class="txt-dark">物料管理</h5>
                </div>
                <!-- Breadcrumb -->
                <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                    <ol class="breadcrumb">
                        <li><a href="index.html">主页</a></li>
                        <li><a href="#"><span>研发管理</span></a></li>
                        <li class="active"><span>物料管理</span></li>
                    </ol>
                </div>
                <!-- /Breadcrumb -->
            </div>
            <!-- /Title -->

            <!-- Row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default card-view pa-0">
                        <div class="panel-wrapper collapse in">
                            <div class="panel-body pa-0">
                                <div class="contact-list">
                                    <div class="row">


                                        <aside class="col-lg-2 col-md-4 pr-0">
                                            <!--选择门店 div-->
                                            <div class="mt-20 mb-20 ml-15 mr-15">
                                                <c:forEach items="${sessionScope.u.roles}" var="ls">
                                                    <c:forEach items="${ls.functions}" var="ps">
                                                        <c:if test="${ps.functionId==7}">
                                                            <a href="#myModal" data-toggle="modal" title="Compose"
                                                               class="btn btn-danger btn-block">新增物料</a>
                                                        </c:if>
                                                    </c:forEach>
                                                </c:forEach>
                                                <!-- Modal -->
                                                <div aria-hidden="true" role="dialog" tabindex="-1" id="myModal"
                                                     class="modal fade" style="display: none;">
                                                    <div class="modal-dialog">
                                                        <div class="modal-content">
                                                            <div class="modal-header">
                                                                <button type="button" class="close" data-dismiss="modal"
                                                                        aria-hidden="true">×
                                                                </button>
                                                                <h4 class="modal-title">新增物料</h4>
                                                            </div>
                                                            <div class="modal-body">
                                                                <form class="form-horizontal form-material"
                                                                      id="materiel">
                                                                    <div class="form-group">
                                                                        <div class="col-md-12 mb-20">
                                                                            <label class="control-label mb-10">物料名称</label>
                                                                            <input type="text" class="form-control"
                                                                                   name="materielName"
                                                                                   placeholder="请输入物料名称"/>
                                                                            <label class="control-label mb-10">一级分类</label>
                                                                            <select class="form-control">
                                                                                <c:forEach var="ta"
                                                                                           items="${requestScope.typea}">
                                                                                    <option value="${ta.materielTypeLevelAId}">${ta.materielTypeLevelAName}</option>
                                                                                </c:forEach>
                                                                            </select>
                                                                            <label class="control-label mb-10">二级分类</label>
                                                                            <select class="form-control"
                                                                                    name="materielTypeLevelB.materielTypeLevelBId">
                                                                                <c:forEach var="ta"
                                                                                           items="${requestScope.typeb}">
                                                                                    <option value="${ta.materielTypeLevelBId}">${ta.materielTypeLevelBName}</option>
                                                                                </c:forEach>
                                                                            </select>
                                                                            <label class="control-label mb-10">单位</label>
                                                                            <select class="form-control"
                                                                                    name="materielUnit.materielUnitId">
                                                                                <c:forEach var="ta"
                                                                                           items="${requestScope.utils}">
                                                                                    <option value="${ta.materielUnitId}">${ta.materielUnitName}</option>
                                                                                </c:forEach>
                                                                            </select>
                                                                            <label class="control-label mb-10">出成率</label>
                                                                            <input type="number" name="materielYield"
                                                                                   class="form-control"
                                                                                   placeholder="请输入出成率（0-1）"/>
                                                                            <label class="control-label mb-10">商业保质期（天）</label>
                                                                            <input type="number"
                                                                                   name="materielShelfLife"
                                                                                   class="form-control"
                                                                                   placeholder="请输入商业保质期"/>
                                                                            <label class="control-label mb-10">最低库存预警</label>
                                                                            <input type="number"
                                                                                   name="materielMinWarning"
                                                                                   class="form-control"
                                                                                   placeholder="最低库存预警"/>
                                                                            <label class="control-label mb-10">备注</label>
                                                                            <textarea name="materielRemarks"
                                                                                      class="form-control"></textarea>
                                                                        </div>
                                                                    </div>
                                                                </form>
                                                            </div>
                                                            <div class="modal-footer">
                                                                <button type="button" id="addmate"
                                                                        class="btn btn-info waves-effect"
                                                                        data-dismiss="modal">保存
                                                                </button>
                                                                <button type="button"
                                                                        class="btn btn-default waves-effect"
                                                                        data-dismiss="modal">取消
                                                                </button>
                                                            </div>
                                                        </div>
                                                        <!-- /.modal-content -->
                                                    </div>
                                                    <!-- /.modal-dialog -->
                                                </div>
                                                <!-- /.modal -->
                                            </div>
                                            <br/>
                                            <hr/>
                                            <h6 class="pl-15 mb-10">条件检索</h6>
                                            <div class="input-group" style="margin:0 auto;text-align:center;">
                                                <input type="text" class="form-control" id="mname"
                                                       placeholder="请输入物料名称"
                                                       value="${requestScope.materiel.materielName}"/>
                                                <hr/>
                                                <br/>
                                                <select class="form-control" id="mtypea">
                                                    <option value="0">请选择</option>
                                                    <c:forEach items="${requestScope.typea}" var="ta">
                                                        <option value="${ta.materielTypeLevelAId}">${ta.materielTypeLevelAName}</option>
                                                    </c:forEach>
                                                </select>
                                                <hr/>
                                                <br/>
                                                <select class="form-control" id="mtypeb">
                                                    <option value="0">请选择</option>
                                                </select>
                                            </div>
                                            <br/>
                                            <div style="margin:0 auto;text-align:center;">
                                                <button id="seb" class="btn btn-primary btn-rounded btn-icon left-icon">
                                                    <i class="fa fa-search"></i> <span>检索</span></button>
                                            </div>
                                        </aside>

                                        <aside class="col-lg-10 col-md-8 pl-0">
                                            <div class="panel pa-0">
                                                <div class="panel-wrapper collapse in">
                                                    <div class="panel-body  pa-0">
                                                        <div class="table-responsive mb-30">
                                                            <table id="datable_1"
                                                                   class="table  display table-hover mb-30"
                                                                   data-page-size="10">
                                                                <thead>
                                                                <tr>
                                                                    <th>物料编号</th>
                                                                    <th>名称</th>
                                                                    <th>类别</th>
                                                                    <th>单位</th>
                                                                    <th>出成率</th>
                                                                    <th>商业保质期（天）</th>
                                                                    <th>最低库存预警</th>
                                                                    <th>备注</th>
                                                                    <th>操作</th>
                                                                </tr>
                                                                </thead>
                                                                <tbody>
                                                                <c:forEach items="${requestScope.pager.list}" var="ls">
                                                                    <tr>
                                                                        <td>13878234y89203</td>
                                                                        <td>${ls.materielName}</td>
                                                                        <td>${ls.materielTypeLevelB.materielTypeLevelBName}</td>
                                                                        <td>${ls.materielUnit.materielUnitName}</td>
                                                                        <td>${ls.materielYield}</td>
                                                                        <td>${ls.materielShelfLife}</td>
                                                                        <td>${ls.materielMinWarning}</td>
                                                                        <td>${ls.materielRemarks}</td>
                                                                        <td>
                                                                            <a href="javascript:void(0)"
                                                                               class="text-inverse" title="修改"
                                                                               data-toggle="tooltip"><i
                                                                                    class="fa fa-pencil-square txt-danger"></i></a>
                                                                            <a href="javascript:void(0)"
                                                                               class="text-inverse del" flagname="${ls.materielName}" flagid="${ls.materielId}" title="删除"
                                                                               data-toggle="tooltip"><i
                                                                                    class="ti-trash txt-danger"></i></a>
                                                                        </td>
                                                                    </tr>
                                                                </c:forEach>

                                                                <%--<tr>--%>
                                                                <%--<td>13878234y89203</td>--%>
                                                                <%--<td>五花肉</td>--%>
                                                                <%--<td>猪肉</td>--%>
                                                                <%--<td>千克</td>--%>
                                                                <%--<td>5</td>--%>
                                                                <%--<td>10</td>--%>
                                                                <%--<td>200</td>--%>
                                                                <%--<td>sd14525se4r1sdf4r</td>--%>
                                                                <%--<td>--%>
                                                                <%--<a href="javascript:void(0)"--%>
                                                                <%--class="text-inverse" title="修改"--%>
                                                                <%--data-toggle="tooltip"><i--%>
                                                                <%--class="fa fa-pencil-square txt-danger"></i></a>--%>
                                                                <%--<a href="javascript:void(0)"--%>
                                                                <%--class="text-inverse" title="删除"--%>
                                                                <%--data-toggle="tooltip"><i--%>
                                                                <%--class="ti-trash txt-danger"></i></a>--%>
                                                                <%--</td>--%>
                                                                <%--</tr>--%>
                                                                </tbody>
                                                            </table>

                                                        </div>
                                                        <div class="panel-wrapper collapse in"
                                                             style="margin:0 auto;text-align:center;">
                                                            <div class="panel-body">
                                                                <div class="row">
                                                                    <div class="col-md-12">
                                                                        <ul class="pagination pagination-split">
                                                                            <li <c:if
                                                                                    test="${requestScope.pager.currentPage==1}"> class="disabled" </c:if>>
                                                                                <a <%
                                                                                    Pager pager = (Pager) request.getAttribute("pager");
                                                                                    if (pager.getCurrentPage() != 1) {%>
                                                                                        href="${pageContext.request.contextPath}/materiellist.do?currentPage=${requestScope.pager.previousPage}&materielTypeLevelB.materielTypeLevelBId=${requestScope.materiel.materielTypeLevelB.materielTypeLevelBId}&materielName=${requestScope.materiel.materielName}"
                                                                                        <%
                                                                                        } else {%>
                                                                                        href="javascript:void(0);"
                                                                                        <%
                                                                                            }
                                                                                        %>>
                                                                                    <i class="fa fa-angle-left"></i></a>
                                                                            </li>
                                                                            <c:forEach var="bar"
                                                                                       items="${requestScope.pager.pageBar}">
                                                                                <li <c:if
                                                                                        test="${bar==requestScope.pager.currentPage}"> class="active" </c:if> >
                                                                                    <a href="${pageContext.request.contextPath}/materiellist.do?currentPage=${bar}&materielTypeLevelB.materielTypeLevelBId=${requestScope.materiel.materielTypeLevelB.materielTypeLevelBId}&materielName=${requestScope.materiel.materielName}">${bar}</a>
                                                                                </li>
                                                                            </c:forEach>
                                                                            <%--<li class="disabled"><a href="#">1</a></li>--%>
                                                                            <%--<li class="active"><a href="#">2</a></li>--%>
                                                                            <li <c:if
                                                                                    test="${requestScope.pager.currentPage>=requestScope.pager.totalPage}"> class="disabled" </c:if>>
                                                                                <a <%
                                                                                    if (pager.getCurrentPage() < pager.getTotalPage()) {%>
                                                                                        href="${pageContext.request.contextPath}/materiellist.do?currentPage=${requestScope.pager.nextPage}&materielTypeLevelB.materielTypeLevelBId=${requestScope.materiel.materielTypeLevelB.materielTypeLevelBId}&materielName=${requestScope.materiel.materielName}"
                                                                                        <%
                                                                                        } else {%>
                                                                                        href="javascript:void(0);"
                                                                                        <%
                                                                                            }
                                                                                        %>>
                                                                                    <i class="fa fa-angle-right"></i></a>
                                                                            </li>
                                                                        </ul>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </aside>
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
                    <p>2017 &copy; Hound. Pampered by Hencework</p>
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

<!-- wysuhtml5 Plugin JavaScript -->
<script src="../../vendors/bower_components/wysihtml5x/dist/wysihtml5x.min.js"></script>

<script src="../../vendors/bower_components/bootstrap3-wysihtml5-bower/dist/bootstrap3-wysihtml5.all.js"></script>

<!-- Fancy Dropdown JS -->
<script src="../../dist/js/dropdown-bootstrap-extended.js"></script>

<!-- Bootstrap Wysuhtml5 Init JavaScript -->
<script src="../../dist/js/bootstrap-wysuhtml5-data.js"></script>

<!-- Data table JavaScript -->

<%--<script src="../../dist/js/dataTables-data.js"></script>--%>

<!-- Slimscroll JavaScript -->
<script src="../../dist/js/jquery.slimscroll.js"></script>

<!-- Owl JavaScript -->
<script src="../../vendors/bower_components/owl.carousel/dist/owl.carousel.min.js"></script>

<!-- Switchery JavaScript -->
<script src="../../vendors/bower_components/switchery/dist/switchery.min.js"></script>

<!-- Init JavaScript -->
<script src="../../vendors/bower_components/sweetalert/dist/sweetalert.min.js"></script>
<script src="../../dist/js/jquery.slimscroll.js"></script>
<script src="../../dist/js/init.js"></script>
<script>
    $(function () {
        $(".del").click(function(){
            var mid=$(this).attr("flagid");
            var mname=$(this).attr("flagname");
            var $tr=$(this).parent().parent();
            swal({
                title: "你确定要删除"+mname+"吗?",
                text: "删除操作不可恢复！!",
                type: "warning",
                showCancelButton: true,
                confirmButtonColor: "#fec107",
                confirmButtonText: "确定!",
                cancelButtonText: "取消!",
                closeOnConfirm: false,
                closeOnCancel: true
            }, function(isConfirm){
                if (isConfirm) {
                    $.ajax({
                        url:"${pageContext.request.contextPath}/delmateriel.do?materielId="+mid,
                        cache: false,
                        success:function(data){
                            if(data == 'true'){
                                swal("删除成功", "删除成功，如需要回复请再次添加！", "success");
                                $($tr).remove();
                            }else{
                                swal("删除失败！！", "系统异常！请联系管理员处理！！", "error");
                            }
                        }
                    });
                }
            });
        });


        $("#mtypea").change(function () {
            var selectValue = $("#mtypea").val();
            $("#mtypeb").empty();
            $("#mtypeb").append("<option value='0'>请选择</option>");
            $.ajax({
                url: "${pageContext.request.contextPath}/gettypeblist.do?materielTypeLevelA.materielTypeLevelAId=" + selectValue,
                cache: false,
                dataType: 'json',
                success: function (data) {
                    for (var i = 0, l = data.length; i < l; i++) {
                        $("#mtypeb").append("<option value='"+data[i].materielTypeLevelBId+"'>"+data[i].materielTypeLevelBName+"</option>");
                    }
                }
            });

        });

        $("#seb").click(function () {
            var mname = $("#mname").val();
            var typebId=$("#mtypeb").val();
            location.href = "${pageContext.request.contextPath}/materiellist.do?materielName=" + mname+"&materielTypeLevelB.materielTypeLevelBId="+typebId;
        });
        $("#addmate").click(function () {
            var data = $("#materiel").serialize();
            var submitData = decodeURIComponent(data, true);
            $.ajax({
                type: 'post',
                url: '${pageContext.request.contextPath}/addMateriel.do?' + submitData,
                cache: false,
                success: function (data) {
                    if (data =='true') {
                        swal({
                            title: "新增成功！！!",
                            type: "success",
                            text: "您现在可以在其他系统中使用它！",
                            confirmButtonColor: "#01c853",
                        });
                    } else {
                        swal("新增失败！！", "系统异常！请联系管理员处理。", "error");
                    }
                },error:function () {
                    swal("新增失败！！", "系统异常！请联系管理员处理。", "error");
                }
            });
        });
    });
</script>
<script src="${pageContext.request.contextPath}/websocket.js" charset="utf-8" type="text/javascript"></script>
</body>

</html>

