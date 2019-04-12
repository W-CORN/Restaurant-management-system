<%@ page import="team.ruike.cim.pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/21
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    if (session.getAttribute("u") == null) {
        String userName="";
        String password="";
        Cookie[] cook=request.getCookies();
        if(cook!=null){
            for (Cookie cookie : cook) {
                if(cookie.getName().equals("userName")){
                    userName=cookie.getValue();
                }else if(cookie.getName().equals("password")){
                    password=cookie.getValue();
                }
            }
            request.getRequestDispatcher("/signin.do?userName="+userName+"&password="+password+"").forward(request,response);
            return;
        }
        response.sendRedirect("login.do");
        return;
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <title>餐饮工业化管理系统主页</title>
    <meta name="description" content="Hound is a Dashboard & Admin Site Responsive Template by hencework."/>
    <meta name="keywords"
          content="admin, admin dashboard, admin template, cms, crm, Hound Admin, Houndadmin, premium admin templates, responsive admin, sass, panel, software, ui, visualization, web app, application"/>
    <meta name="author" content="hencework"/>

    <!-- Favicon -->
    <link rel="shortcut icon" href="../../favicon.ico">
    <link rel="icon" href="../../favicon.ico" type="image/x-icon">

    <!-- Morris Charts CSS -->
    <link href="../../vendors/bower_components/morris.js/morris.css" rel="stylesheet" type="text/css"/>

    <!-- Data table CSS -->
    <link href="../../vendors/bower_components/datatables/media/css/jquery.dataTables.min.css" rel="stylesheet"
          type="text/css"/>

    <link href="../../vendors/bower_components/jquery-toast-plugin/dist/jquery.toast.min.css" rel="stylesheet"
          type="text/css">

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
                <a href="javascript:void(0);" class="active">
                    <div class="pull-left"><i class="icon-home mr-20"></i><span
                            class="right-nav-text">主页</span></div>
                    <div class="pull-right"><span class="label label-warning">8</span></div>
                    <div class="clearfix"></div>
                </a>
            </li>
            <c:forEach items="${sessionScope.u.roles}" var="role">
                <c:forEach items="${role.jurisdictions}" var="j">
                    <li>
                        <a href="javascript:void(0);" data-toggle="collapse" data-target="#${j.jurisdictionId}">
                            <div class="pull-left"><i class="${j.icon} mr-20"></i><span
                                    class="right-nav-text" style="font-family: 微软雅黑;">${j.jurisdictionName}</span>
                            </div>
                            <div class="pull-right"><i class="zmdi zmdi-caret-down"></i></div>
                            <div class="clearfix"></div>
                        </a>
                        <%--在此处判断权限类型--%>
                        <ul id="${j.jurisdictionId}" class="collapse collapse-level-1">
                            <c:forEach items="${role.functions}" var="f">
                                <c:if test="${j.jurisdictionId==f.jurisdictionId&&f.type==0}">
                                    <li>
                                        <a href="${pageContext.request.contextPath}/${f.functionUrl}">${f.functionName}</a>
                                    </li>
                                </c:if>
                            </c:forEach>
                        </ul>
                    </li>
                </c:forEach>
            </c:forEach>
            <%--<li>--%>
            <%--<a href="javascript:void(0);" data-toggle="collapse" data-target="#dashboard_dr">--%>
            <%--<div class="pull-left"><i class="zmdi zmdi-landscape mr-20"></i><span--%>
            <%--class="right-nav-text">研发管理</span>--%>
            <%--</div>--%>


            <%--<div class="pull-right"><i class="zmdi zmdi-caret-down"></i></div>--%>
            <%--<div class="clearfix"></div>--%>
            <%--</a>--%>
            <%--<ul id="dashboard_dr" class="collapse collapse-level-1">--%>
            <%--<li>--%>
            <%--<a class="active-page" href="index.do">Analytical</a>--%>
            <%--</li>--%>
            <%--<li>--%>
            <%--<a href="index2.html">Demographic</a>--%>
            <%--</li>--%>
            <%--<li>--%>
            <%--<a href="index3.html">Project</a>--%>
            <%--</li>--%>
            <%--<li>--%>
            <%--<a href="profile.html">profile</a>--%>
            <%--</li>--%>
            <%--</ul>--%>
            <%--</li>--%>
            <li>
                <hr class="light-grey-hr mb-10"/>
            </li>
            <li class="navigation-header">
                <span>系统</span>
                <i class="zmdi zmdi-more"></i>
            </li>
            <li>
                <a href="/logOut.do">
                    <div class="pull-left"><i class="fa fa-power-off mr-20"></i><span class="right-nav-text">注销</span>
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
                                                    <ul class="nicescroll-bar pt-20" id="mses">
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
        <div class="container-fluid pt-25">
            <!-- Row -->
            <div class="row">
                <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                    <div class="panel panel-default card-view pa-0">
                        <div class="panel-wrapper collapse in">
                            <div class="panel-body pa-0">
                                <div class="sm-data-box bg-red">
                                    <div class="container-fluid">
                                        <div class="row">
                                            <div class="col-xs-6 text-center pl-0 pr-0 data-wrap-left">
                                                <span class="txt-light block counter"><span
                                                        class="counter-anim">914,001</span></span>
                                                <span class="weight-500 uppercase-font txt-light block font-13">visits</span>
                                            </div>
                                            <div class="col-xs-6 text-center  pl-0 pr-0 data-wrap-right">
                                                <i class="zmdi zmdi-male-female txt-light data-right-rep-icon"></i>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                    <div class="panel panel-default card-view pa-0">
                        <div class="panel-wrapper collapse in">
                            <div class="panel-body pa-0">
                                <div class="sm-data-box bg-yellow">
                                    <div class="container-fluid">
                                        <div class="row">
                                            <div class="col-xs-6 text-center pl-0 pr-0 data-wrap-left">
                                                <span class="txt-light block counter"><span
                                                        class="counter-anim">46.41</span>%</span>
                                                <span class="weight-500 uppercase-font txt-light block">bounce rate</span>
                                            </div>
                                            <div class="col-xs-6 text-center  pl-0 pr-0 data-wrap-right">
                                                <i class="zmdi zmdi-redo txt-light data-right-rep-icon"></i>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                    <div class="panel panel-default card-view pa-0">
                        <div class="panel-wrapper collapse in">
                            <div class="panel-body pa-0">
                                <div class="sm-data-box bg-green">
                                    <div class="container-fluid">
                                        <div class="row">
                                            <div class="col-xs-6 text-center pl-0 pr-0 data-wrap-left">
                                                <span class="txt-light block counter"><span class="counter-anim">4,054,876</span></span>
                                                <span class="weight-500 uppercase-font txt-light block">pageviews</span>
                                            </div>
                                            <div class="col-xs-6 text-center  pl-0 pr-0 data-wrap-right">
                                                <i class="zmdi zmdi-file txt-light data-right-rep-icon"></i>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                    <div class="panel panel-default card-view pa-0">
                        <div class="panel-wrapper collapse in">
                            <div class="panel-body pa-0">
                                <div class="sm-data-box bg-blue">
                                    <div class="container-fluid">
                                        <div class="row">
                                            <div class="col-xs-6 text-center pl-0 pr-0 data-wrap-left">
                                                <span class="txt-light block counter"><span
                                                        class="counter-anim">46.43</span>%</span>
                                                <span class="weight-500 uppercase-font txt-light block">growth rate</span>
                                            </div>
                                            <div class="col-xs-6 text-center  pl-0 pr-0 pt-25  data-wrap-right">
                                                <div id="sparkline_4"
                                                     style="width: 100px; overflow: hidden; margin: 0px auto;"></div>
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

            <!-- Row -->
            <div class="row">
                <div class="col-lg-6 col-md-12 col-sm-12 col-xs-12">
                    <div class="panel panel-default card-view">
                        <div class="panel-heading">
                            <div class="pull-left">
                                <h6 class="panel-title txt-dark">user statistics</h6>
                            </div>
                            <div class="pull-right">
									<span class="no-margin-switcher">
										<input type="checkbox" id="morris_switch" class="js-switch" data-color="#ff2a00"
                                               data-secondary-color="#2879ff" data-size="small"/>
									</span>
                            </div>
                            <div class="clearfix"></div>
                        </div>
                        <div class="panel-wrapper collapse in">
                            <div class="panel-body">
                                <div id="morris_extra_line_chart" class="morris-chart" style="height:293px;"></div>
                                <ul class="flex-stat mt-40">
                                    <li>
                                        <span class="block">Weekly Users</span>
                                        <span class="block txt-dark weight-500 font-18"><span class="counter-anim">3,24,222</span></span>
                                    </li>
                                    <li>
                                        <span class="block">Monthly Users</span>
                                        <span class="block txt-dark weight-500 font-18"><span class="counter-anim">1,23,432</span></span>
                                    </li>
                                    <li>
                                        <span class="block">Trend</span>
                                        <span class="block">
												<i class="zmdi zmdi-trending-up txt-success font-24"></i>
											</span>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                    <div class="panel panel-default card-view">
                        <div class="panel-wrapper collapse in">
                            <div class="panel-body sm-data-box-1">
                                <span class="uppercase-font weight-500 font-14 block text-center txt-dark">customer satisfaction</span>
                                <div class="cus-sat-stat weight-500 txt-success text-center mt-5">
                                    <span class="counter-anim">93.13</span><span>%</span>
                                </div>
                                <div class="progress-anim mt-20">
                                    <div class="progress">
                                        <div class="progress-bar progress-bar-success wow animated progress-animated"
                                             role="progressbar" aria-valuenow="93.12" aria-valuemin="0"
                                             aria-valuemax="100"></div>
                                    </div>
                                </div>
                                <ul class="flex-stat mt-5">
                                    <li>
                                        <span class="block">Previous</span>
                                        <span class="block txt-dark weight-500 font-15">79.82</span>
                                    </li>
                                    <li>
                                        <span class="block">% Change</span>
                                        <span class="block txt-dark weight-500 font-15">+14.29</span>
                                    </li>
                                    <li>
                                        <span class="block">Trend</span>
                                        <span class="block">
												<i class="zmdi zmdi-trending-up txt-success font-20"></i>
											</span>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="panel panel-default card-view">
                        <div class="panel-heading">
                            <div class="pull-left">
                                <h6 class="panel-title txt-dark">browser stats</h6>
                            </div>
                            <div class="pull-right">
                                <a href="#" class="pull-left inline-block mr-15">
                                    <i class="zmdi zmdi-download"></i>
                                </a>
                                <a href="#" class="pull-left inline-block close-panel" data-effect="fadeOut">
                                    <i class="zmdi zmdi-close"></i>
                                </a>
                            </div>
                            <div class="clearfix"></div>
                        </div>
                        <div class="panel-wrapper collapse in">
                            <div class="panel-body">
                                <div>
										<span class="pull-left inline-block capitalize-font txt-dark">
											google chrome
										</span>
                                    <span class="label label-warning pull-right">50%</span>
                                    <div class="clearfix"></div>
                                    <hr class="light-grey-hr row mt-10 mb-10"/>
                                    <span class="pull-left inline-block capitalize-font txt-dark">
											mozila firefox
										</span>
                                    <span class="label label-danger pull-right">10%</span>
                                    <div class="clearfix"></div>
                                    <hr class="light-grey-hr row mt-10 mb-10"/>
                                    <span class="pull-left inline-block capitalize-font txt-dark">
											Internet explorer
										</span>
                                    <span class="label label-success pull-right">30%</span>
                                    <div class="clearfix"></div>
                                    <hr class="light-grey-hr row mt-10 mb-10"/>
                                    <span class="pull-left inline-block capitalize-font txt-dark">
											safari
										</span>
                                    <span class="label label-primary pull-right">10%</span>
                                    <div class="clearfix"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                    <div class="panel panel-default card-view panel-refresh">
                        <div class="refresh-container">
                            <div class="la-anim-1"></div>
                        </div>
                        <div class="panel-heading">
                            <div class="pull-left">
                                <h6 class="panel-title txt-dark">Visit by Traffic Types</h6>
                            </div>
                            <div class="pull-right">
                                <a href="#" class="pull-left inline-block refresh mr-15">
                                    <i class="zmdi zmdi-replay"></i>
                                </a>
                                <div class="pull-left inline-block dropdown">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false"
                                       role="button"><i class="zmdi zmdi-more-vert"></i></a>
                                    <ul class="dropdown-menu bullet dropdown-menu-right" role="menu">
                                        <li role="presentation"><a href="javascript:void(0)" role="menuitem"><i
                                                class="icon wb-reply" aria-hidden="true"></i>Devices</a></li>
                                        <li role="presentation"><a href="javascript:void(0)" role="menuitem"><i
                                                class="icon wb-share" aria-hidden="true"></i>General</a></li>
                                        <li role="presentation"><a href="javascript:void(0)" role="menuitem"><i
                                                class="icon wb-trash" aria-hidden="true"></i>Referral</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="clearfix"></div>
                        </div>
                        <div class="panel-wrapper collapse in">
                            <div class="panel-body">
                                <div>
                                    <canvas id="chart_6" height="191"></canvas>
                                </div>
                                <hr class="light-grey-hr row mt-10 mb-15"/>
                                <div class="label-chatrs">
                                    <div class="">
                                        <span class="clabels clabels-lg inline-block bg-blue mr-10 pull-left"></span>
                                        <span class="clabels-text font-12 inline-block txt-dark capitalize-font pull-left"><span
                                                class="block font-15 weight-500 mb-5">44.46% organic</span><span
                                                class="block txt-grey">356 visits</span></span>
                                        <div id="sparkline_1" class="pull-right"
                                             style="width: 100px; overflow: hidden; margin: 0px auto;"></div>
                                        <div class="clearfix"></div>
                                    </div>
                                </div>
                                <hr class="light-grey-hr row mt-10 mb-15"/>
                                <div class="label-chatrs">
                                    <div class="">
                                        <span class="clabels clabels-lg inline-block bg-green mr-10 pull-left"></span>
                                        <span class="clabels-text font-12 inline-block txt-dark capitalize-font pull-left"><span
                                                class="block font-15 weight-500 mb-5">5.54% Refrral</span><span
                                                class="block txt-grey">36 visits</span></span>
                                        <div id="sparkline_2" class="pull-right"
                                             style="width: 100px; overflow: hidden; margin: 0px auto;"></div>
                                        <div class="clearfix"></div>
                                    </div>
                                </div>
                                <hr class="light-grey-hr row mt-10 mb-15"/>
                                <div class="label-chatrs">
                                    <div class="">
                                        <span class="clabels clabels-lg inline-block bg-yellow mr-10 pull-left"></span>
                                        <span class="clabels-text font-12 inline-block txt-dark capitalize-font pull-left"><span
                                                class="block font-15 weight-500 mb-5">50% Other</span><span
                                                class="block txt-grey">245 visits</span></span>
                                        <div id="sparkline_3" class="pull-right"
                                             style="width: 100px; overflow: hidden; margin: 0px auto;"></div>
                                        <div class="clearfix"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /Row -->

            <!-- Row -->
            <div class="row">
                <div class="col-lg-8 col-md-7 col-sm-12 col-xs-12">
                    <div class="panel panel-default card-view panel-refresh">
                        <div class="refresh-container">
                            <div class="la-anim-1"></div>
                        </div>
                        <div class="panel-heading">
                            <div class="pull-left">
                                <h6 class="panel-title txt-dark">今日生产任务</h6>
                            </div>
                            <div class="pull-right">
                                <a href="#" class="pull-left inline-block refresh mr-15">
                                    <i class="zmdi zmdi-replay"></i>
                                </a>
                                <a href="#" class="pull-left inline-block full-screen mr-15">
                                    <i class="zmdi zmdi-fullscreen"></i>
                                </a>
                                <div class="pull-left inline-block dropdown">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false"
                                       role="button"><i class="zmdi zmdi-more-vert"></i></a>
                                    <ul class="dropdown-menu bullet dropdown-menu-right" role="menu">
                                        <li role="presentation"><a href="javascript:void(0)" role="menuitem"><i
                                                class="icon wb-reply" aria-hidden="true"></i>Edit</a></li>
                                        <li role="presentation"><a href="javascript:void(0)" role="menuitem"><i
                                                class="icon wb-share" aria-hidden="true"></i>Delete</a></li>
                                        <li role="presentation"><a href="javascript:void(0)" role="menuitem"><i
                                                class="icon wb-trash" aria-hidden="true"></i>New</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="clearfix"></div>
                        </div>
                        <div class="panel-wrapper collapse in">
                            <div class="panel-body row pa-0">
                                <div class="table-wrap">
                                    <div class="table-responsive">
                                        <table class="table table-hover mb-0">
                                            <thead>
                                            <tr>
                                                <th>生产批次</th>
                                                <th>生产类型</th>
                                                <th>产品</th>
                                                <th>数量</th>
                                                <th>详情</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach items="${requestScope.proLs}" var="ls">
                                                <c:forEach items="${ls.contractProductionPlanItems}" var="prolss">
                                                    <tr>
                                                        <td><span class="txt-dark weight-500">${ls.productionBatch}</span></td>
                                                        <td>合同订单</td>
                                                        <td>
                                                            <span class="txt-dark weight-500">${prolss.menu.menuName}</span>
                                                        </td>
                                                        <td>${prolss.menuNumber}</td>
                                                        <td><a href="${pageContext.request.contextPath}/product.do?contractProductionPlanItemId=${prolss.contractProductionPlanItemId}">查看详情</a></td>
                                                    </tr>
                                                </c:forEach>
                                            </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-5 col-sm-12 col-xs-12">
                    <div class="panel panel-default card-view panel-refresh">
                        <div class="refresh-container">
                            <div class="la-anim-1"></div>
                        </div>
                        <div class="panel-heading">
                            <div class="pull-left">
                                <h6 class="panel-title txt-dark">Advertising & Promotions</h6>
                            </div>
                            <div class="pull-right">
                                <a href="#" class="pull-left inline-block refresh mr-15">
                                    <i class="zmdi zmdi-replay"></i>
                                </a>
                                <div class="pull-left inline-block dropdown">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false"
                                       role="button"><i class="zmdi zmdi-more-vert"></i></a>
                                    <ul class="dropdown-menu bullet dropdown-menu-right" role="menu">
                                        <li role="presentation"><a href="javascript:void(0)" role="menuitem"><i
                                                class="icon wb-reply" aria-hidden="true"></i>option 1</a></li>
                                        <li role="presentation"><a href="javascript:void(0)" role="menuitem"><i
                                                class="icon wb-share" aria-hidden="true"></i>option 2</a></li>
                                        <li role="presentation"><a href="javascript:void(0)" role="menuitem"><i
                                                class="icon wb-trash" aria-hidden="true"></i>option 3</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="clearfix"></div>
                        </div>
                        <div class="panel-wrapper collapse in">
                            <div class="panel-body">
                                <div>
                                    <canvas id="chart_2" height="253"></canvas>
                                </div>
                                <div class="label-chatrs mt-30">
                                    <div class="inline-block mr-15">
                                        <span class="clabels inline-block bg-yellow mr-5"></span>
                                        <span class="clabels-text font-12 inline-block txt-dark capitalize-font">Active</span>
                                    </div>
                                    <div class="inline-block mr-15">
                                        <span class="clabels inline-block bg-red mr-5"></span>
                                        <span class="clabels-text font-12 inline-block txt-dark capitalize-font">Closed</span>
                                    </div>
                                    <div class="inline-block">
                                        <span class="clabels inline-block bg-green mr-5"></span>
                                        <span class="clabels-text font-12 inline-block txt-dark capitalize-font">Hold</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Row -->
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

<!-- Data table JavaScript -->
<script src="../../vendors/bower_components/datatables/media/js/jquery.dataTables.min.js"></script>

<!-- Slimscroll JavaScript -->
<script src="../../dist/js/jquery.slimscroll.js"></script>

<!-- simpleWeather JavaScript -->
<script src="../../vendors/bower_components/moment/min/moment.min.js"></script>
<script src="../../vendors/bower_components/simpleWeather/jquery.simpleWeather.min.js"></script>
<script src="../../dist/js/simpleweather-data.js"></script>

<!-- Progressbar Animation JavaScript -->
<script src="../../vendors/bower_components/waypoints/lib/jquery.waypoints.min.js"></script>
<script src="../../vendors/bower_components/jquery.counterup/jquery.counterup.min.js"></script>

<!-- Fancy Dropdown JS -->
<script src="../../dist/js/dropdown-bootstrap-extended.js"></script>

<!-- Sparkline JavaScript -->
<script src="../../vendors/jquery.sparkline/dist/jquery.sparkline.min.js"></script>

<!-- Owl JavaScript -->
<script src="../../vendors/bower_components/owl.carousel/dist/owl.carousel.min.js"></script>

<!-- ChartJS JavaScript -->
<script src="../../vendors/chart.js/Chart.min.js"></script>

<!-- Morris Charts JavaScript -->
<script src="../../vendors/bower_components/raphael/raphael.min.js"></script>
<script src="../../vendors/bower_components/morris.js/morris.min.js"></script>
<script src="../../vendors/bower_components/jquery-toast-plugin/dist/jquery.toast.min.js"></script>

<!-- Switchery JavaScript -->
<script src="../../vendors/bower_components/switchery/dist/switchery.min.js"></script>

<!-- Init JavaScript -->
<script src="../../dist/js/init.js"></script>
<script>
    var zzgms = '${sessionScope.u.userName}';
    var flag=${param.flag};
</script>
<script src="../../dist/js/dashboard-data.js" charset="utf-8" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/sockjs.min.js" charset="utf-8" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/websocket.js" charset="utf-8" type="text/javascript"></script>
<script>
</script>
</body>
</html>
