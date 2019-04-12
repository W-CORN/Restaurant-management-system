<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/12/4
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <title>Hound I Fast build Admin dashboard for any platform</title>
    <meta name="description" content="Hound is a Dashboard & Admin Site Responsive Template by hencework."/>
    <meta name="keywords"
          content="admin, admin dashboard, admin template, cms, crm, Hound Admin, Houndadmin, premium admin templates, responsive admin, sass, panel, software, ui, visualization, web app, application"/>
    <meta name="author" content="hencework"/>

    <!-- Favicon -->
    <link rel="shortcut icon" href="../../../favicon.ico">
    <link rel="icon" href="../../../favicon.ico" type="image/x-icon">

    <!--alerts CSS -->
    <link href="../../../vendors/bower_components/sweetalert/dist/sweetalert.css" rel="stylesheet" type="text/css">

    <!-- Custom Fonts -->
    <link href="../../../dist/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- Calendar CSS -->
    <link href="../../../vendors/bower_components/fullcalendar/dist/fullcalendar.css" rel="stylesheet" type="text/css"/>

    <!-- Custom CSS -->
    <link href="../../../dist/css/style.css" rel="stylesheet" type="text/css">

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
                        <img class="brand-img" src="../../../dist/img/logo.png" alt="brand"/>
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
                                            <a href="warehouse.html">Products</a>
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
                                            <img src="../../../dist/img/chair.jpg" alt="chair">
                                            <span>Circle chair</span>
                                        </a>
                                        <a href="#">
                                            <img src="../../../dist/img/chair2.jpg" alt="chair">
                                            <span>square chair</span>
                                        </a>
                                        <a href="#">
                                            <img src="../../../dist/img/chair3.jpg" alt="chair">
                                            <span>semi circle chair</span>
                                        </a>
                                        <a href="#">
                                            <img src="../../../dist/img/chair4.jpg" alt="chair">
                                            <span>wooden chair</span>
                                        </a>
                                        <a href="#">
                                            <img src="../../../dist/img/chair2.jpg" alt="chair">
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
                                            <img class="img-responsive" src="../../../dist/img/avatar.jpg"
                                                 alt="avatar"/>
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
                    <a href="#" class="dropdown-toggle pr-0" data-toggle="dropdown"><img
                            src="../../../dist/img/user1.png"
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
                        <a href="javascript:void(0);" <c:if test="${j.jurisdictionId==5}"> class="active" </c:if>
                           data-toggle="collapse" data-target="#${j.jurisdictionId}">
                            <div class="pull-left"><i class="${j.icon} mr-20"></i><span
                                    class="right-nav-text" style="font-family: 微软雅黑;">${j.jurisdictionName}</span>
                            </div>
                            <div class="pull-right"><i class="zmdi zmdi-caret-down"></i></div>
                            <div class="clearfix"></div>
                        </a>
                            <%--在此处判断权限类型--%>
                        <ul id="${j.jurisdictionId}"
                            class="collapse <c:if test="${j.jurisdictionId==5}">in</c:if> collapse-level-1">
                            <c:forEach items="${role.functions}" var="f">
                                <c:if test="${j.jurisdictionId==f.jurisdictionId&&f.type==0}">
                                    <li>
                                        <a <c:if test="${f.functionId==28}"> class="active-page" </c:if>
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
                                                                  id="chat_tab_btn" href="#chat_tab">chat</a></li>
                        <li role="presentation" class=""><a data-toggle="tab" id="messages_tab_btn" role="tab"
                                                            href="#messages_tab" aria-expanded="false">messages</a></li>
                        <li role="presentation" class=""><a data-toggle="tab" id="todo_tab_btn" role="tab"
                                                            href="#todo_tab" aria-expanded="false">todo</a></li>
                    </ul>
                    <div class="tab-content" id="right_sidebar_content">
                        <div id="chat_tab" class="tab-pane fade active in" role="tabpanel">
                            <div class="chat-cmplt-wrap">
                                <div class="chat-box-wrap">
                                    <div class="add-friend">
                                        <a href="javascript:void(0)" class="inline-block txt-grey">
                                            <i class="zmdi zmdi-more"></i>
                                        </a>
                                        <span class="inline-block txt-dark">users</span>
                                        <a href="javascript:void(0)" class="inline-block text-right txt-grey"><i
                                                class="zmdi zmdi-plus"></i></a>
                                        <div class="clearfix"></div>
                                    </div>
                                    <form role="search" class="chat-search pl-15 pr-15 pb-15">
                                        <div class="input-group">
                                            <input type="text" id="example-input1-group2" name="example-input1-group2"
                                                   class="form-control" placeholder="Search">
                                            <span class="input-group-btn">
												<button type="button" class="btn  btn-default"><i
                                                        class="zmdi zmdi-search"></i></button>
												</span>
                                        </div>
                                    </form>
                                    <div id="chat_list_scroll">
                                        <div class="nicescroll-bar">
                                            <ul class="chat-list-wrap">
                                                <li class="chat-list">
                                                    <div class="chat-body">
                                                        <a href="javascript:void(0)">
                                                            <div class="chat-data">
                                                                <img class="user-img img-circle"
                                                                     src="../../../dist/img/user.png"
                                                                     alt="user"/>
                                                                <div class="user-data">
                                                                    <span class="name block capitalize-font">Clay Masse</span>
                                                                    <span class="time block truncate txt-grey">No one saves us but ourselves.</span>
                                                                </div>
                                                                <div class="status away"></div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </a>
                                                        <a href="javascript:void(0)">
                                                            <div class="chat-data">
                                                                <img class="user-img img-circle"
                                                                     src="../../../dist/img/user1.png" alt="user"/>
                                                                <div class="user-data">
                                                                    <span class="name block capitalize-font">Evie Ono</span>
                                                                    <span class="time block truncate txt-grey">Unity is strength</span>
                                                                </div>
                                                                <div class="status offline"></div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </a>
                                                        <a href="javascript:void(0)">
                                                            <div class="chat-data">
                                                                <img class="user-img img-circle"
                                                                     src="../../../dist/img/user2.png" alt="user"/>
                                                                <div class="user-data">
                                                                    <span class="name block capitalize-font">Madalyn Rascon</span>
                                                                    <span class="time block truncate txt-grey">Respect yourself if you would have others respect you.</span>
                                                                </div>
                                                                <div class="status online"></div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </a>
                                                        <a href="javascript:void(0)">
                                                            <div class="chat-data">
                                                                <img class="user-img img-circle"
                                                                     src="../../../dist/img/user3.png" alt="user"/>
                                                                <div class="user-data">
                                                                    <span class="name block capitalize-font">Mitsuko Heid</span>
                                                                    <span class="time block truncate txt-grey">I’m thankful.</span>
                                                                </div>
                                                                <div class="status online"></div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </a>
                                                        <a href="javascript:void(0)">
                                                            <div class="chat-data">
                                                                <img class="user-img img-circle"
                                                                     src="../../../dist/img/user.png"
                                                                     alt="user"/>
                                                                <div class="user-data">
                                                                    <span class="name block capitalize-font">Ezequiel Merideth</span>
                                                                    <span class="time block truncate txt-grey">Patience is bitter.</span>
                                                                </div>
                                                                <div class="status offline"></div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </a>
                                                        <a href="javascript:void(0)">
                                                            <div class="chat-data">
                                                                <img class="user-img img-circle"
                                                                     src="../../../dist/img/user1.png" alt="user"/>
                                                                <div class="user-data">
                                                                    <span class="name block capitalize-font">Jonnie Metoyer</span>
                                                                    <span class="time block truncate txt-grey">Genius is eternal patience.</span>
                                                                </div>
                                                                <div class="status online"></div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </a>
                                                        <a href="javascript:void(0)">
                                                            <div class="chat-data">
                                                                <img class="user-img img-circle"
                                                                     src="../../../dist/img/user2.png" alt="user"/>
                                                                <div class="user-data">
                                                                    <span class="name block capitalize-font">Angelic Lauver</span>
                                                                    <span class="time block truncate txt-grey">Every burden is a blessing.</span>
                                                                </div>
                                                                <div class="status away"></div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </a>
                                                        <a href="javascript:void(0)">
                                                            <div class="chat-data">
                                                                <img class="user-img img-circle"
                                                                     src="../../../dist/img/user3.png" alt="user"/>
                                                                <div class="user-data">
                                                                    <span class="name block capitalize-font">Priscila Shy</span>
                                                                    <span class="time block truncate txt-grey">Wise to resolve, and patient to perform.</span>
                                                                </div>
                                                                <div class="status online"></div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </a>
                                                        <a href="javascript:void(0)">
                                                            <div class="chat-data">
                                                                <img class="user-img img-circle"
                                                                     src="../../../dist/img/user4.png" alt="user"/>
                                                                <div class="user-data">
                                                                    <span class="name block capitalize-font">Linda Stack</span>
                                                                    <span class="time block truncate txt-grey">Our patience will achieve more than our force.</span>
                                                                </div>
                                                                <div class="status away"></div>
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
                                                <span class="inline-block txt-dark">ryan</span>
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
                                                                     src="../../../dist/img/user.png" alt="user"/>
                                                                <div class="msg pull-left">
                                                                    <p>Hello Jason, how are you, it's been a long time
                                                                        since we last met?</p>
                                                                    <div class="msg-per-detail text-right">
                                                                        <span class="msg-time txt-grey">2:30 PM</span>
                                                                    </div>
                                                                </div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </li>
                                                        <li class="self mb-10">
                                                            <div class="self-msg-wrap">
                                                                <div class="msg block pull-right"> Oh, hi Sarah I'm have
                                                                    got a new job now and is going great.
                                                                    <div class="msg-per-detail text-right">
                                                                        <span class="msg-time txt-grey">2:31 pm</span>
                                                                    </div>
                                                                </div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </li>
                                                        <li class="self">
                                                            <div class="self-msg-wrap">
                                                                <div class="msg block pull-right"> How about you?
                                                                    <div class="msg-per-detail text-right">
                                                                        <span class="msg-time txt-grey">2:31 pm</span>
                                                                    </div>
                                                                </div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </li>
                                                        <li class="friend">
                                                            <div class="friend-msg-wrap">
                                                                <img class="user-img img-circle block pull-left"
                                                                     src="../../../dist/img/user.png" alt="user"/>
                                                                <div class="msg pull-left">
                                                                    <p>Not too bad.</p>
                                                                    <div class="msg-per-detail  text-right">
                                                                        <span class="msg-time txt-grey">2:35 pm</span>
                                                                    </div>
                                                                </div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </li>
                                                    </ul>
                                                </div>
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
                                    <span class="inline-block txt-dark">messages</span>
                                    <a href="javascript:void(0)" class="inline-block text-right txt-grey"><i
                                            class="zmdi zmdi-search"></i></a>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="set-height-wrap">
                                    <div class="streamline message-box nicescroll-bar">
                                        <a href="javascript:void(0)">
                                            <div class="sl-item unread-message">
                                                <div class="sl-avatar avatar avatar-sm avatar-circle">
                                                    <img class="img-responsive img-circle"
                                                         src="../../../dist/img/user.png"
                                                         alt="avatar"/>
                                                </div>
                                                <div class="sl-content">
                                                    <span class="inline-block capitalize-font   pull-left message-per">Clay Masse</span>
                                                    <span class="inline-block font-11  pull-right message-time">12:28 AM</span>
                                                    <div class="clearfix"></div>
                                                    <span class=" truncate message-subject">Themeforest message sent via your envato market profile</span>
                                                    <p class="txt-grey truncate">Neque porro quisquam est qui dolorem
                                                        ipsu messm quia dolor sit amet, consectetur, adipisci velit</p>
                                                </div>
                                            </div>
                                        </a>
                                        <a href="javascript:void(0)">
                                            <div class="sl-item">
                                                <div class="sl-avatar avatar avatar-sm avatar-circle">
                                                    <img class="img-responsive img-circle"
                                                         src="../../../dist/img/user1.png"
                                                         alt="avatar"/>
                                                </div>
                                                <div class="sl-content">
                                                    <span class="inline-block capitalize-font   pull-left message-per">Evie Ono</span>
                                                    <span class="inline-block font-11  pull-right message-time">1 Feb</span>
                                                    <div class="clearfix"></div>
                                                    <span class=" truncate message-subject">Pogody theme support</span>
                                                    <p class="txt-grey truncate">Neque porro quisquam est qui dolorem
                                                        ipsum quia dolor sit amet, consectetur, adipisci velit</p>
                                                </div>
                                            </div>
                                        </a>
                                        <a href="javascript:void(0)">
                                            <div class="sl-item">
                                                <div class="sl-avatar avatar avatar-sm avatar-circle">
                                                    <img class="img-responsive img-circle"
                                                         src="../../../dist/img/user2.png"
                                                         alt="avatar"/>
                                                </div>
                                                <div class="sl-content">
                                                    <span class="inline-block capitalize-font   pull-left message-per">Madalyn Rascon</span>
                                                    <span class="inline-block font-11  pull-right message-time">31 Jan</span>
                                                    <div class="clearfix"></div>
                                                    <span class=" truncate message-subject">Congratulations from design nominees</span>
                                                    <p class="txt-grey truncate">Neque porro quisquam est qui dolorem
                                                        ipsum quia dolor sit amet, consectetur, adipisci velit</p>
                                                </div>
                                            </div>
                                        </a>
                                        <a href="javascript:void(0)">
                                            <div class="sl-item unread-message">
                                                <div class="sl-avatar avatar avatar-sm avatar-circle">
                                                    <img class="img-responsive img-circle"
                                                         src="../../../dist/img/user3.png"
                                                         alt="avatar"/>
                                                </div>
                                                <div class="sl-content">
                                                    <span class="inline-block capitalize-font   pull-left message-per">Ezequiel Merideth</span>
                                                    <span class="inline-block font-11  pull-right message-time">29 Jan</span>
                                                    <div class="clearfix"></div>
                                                    <span class=" truncate message-subject">Themeforest item support message</span>
                                                    <p class="txt-grey truncate">Neque porro quisquam est qui dolorem
                                                        ipsum quia dolor sit amet, consectetur, adipisci velit</p>
                                                </div>
                                            </div>
                                        </a>
                                        <a href="javascript:void(0)">
                                            <div class="sl-item unread-message">
                                                <div class="sl-avatar avatar avatar-sm avatar-circle">
                                                    <img class="img-responsive img-circle"
                                                         src="../../../dist/img/user4.png"
                                                         alt="avatar"/>
                                                </div>
                                                <div class="sl-content">
                                                    <span class="inline-block capitalize-font   pull-left message-per">Jonnie Metoyer</span>
                                                    <span class="inline-block font-11  pull-right message-time">27 Jan</span>
                                                    <div class="clearfix"></div>
                                                    <span class=" truncate message-subject">Help with beavis contact form</span>
                                                    <p class="txt-grey truncate">Neque porro quisquam est qui dolorem
                                                        ipsum quia dolor sit amet, consectetur, adipisci velit</p>
                                                </div>
                                            </div>
                                        </a>
                                        <a href="javascript:void(0)">
                                            <div class="sl-item">
                                                <div class="sl-avatar avatar avatar-sm avatar-circle">
                                                    <img class="img-responsive img-circle"
                                                         src="../../../dist/img/user.png"
                                                         alt="avatar"/>
                                                </div>
                                                <div class="sl-content">
                                                    <span class="inline-block capitalize-font   pull-left message-per">Priscila Shy</span>
                                                    <span class="inline-block font-11  pull-right message-time">19 Jan</span>
                                                    <div class="clearfix"></div>
                                                    <span class=" truncate message-subject">Your uploaded theme is been selected</span>
                                                    <p class="txt-grey truncate">Neque porro quisquam est qui dolorem
                                                        ipsum quia dolor sit amet, consectetur, adipisci velit</p>
                                                </div>
                                            </div>
                                        </a>
                                        <a href="javascript:void(0)">
                                            <div class="sl-item">
                                                <div class="sl-avatar avatar avatar-sm avatar-circle">
                                                    <img class="img-responsive img-circle"
                                                         src="../../../dist/img/user1.png"
                                                         alt="avatar"/>
                                                </div>
                                                <div class="sl-content">
                                                    <span class="inline-block capitalize-font   pull-left message-per">Linda Stack</span>
                                                    <span class="inline-block font-11  pull-right message-time">13 Jan</span>
                                                    <div class="clearfix"></div>
                                                    <span class=" truncate message-subject"> A new rating has been received</span>
                                                    <p class="txt-grey truncate">Neque porro quisquam est qui dolorem
                                                        ipsum quia dolor sit amet, consectetur, adipisci velit</p>
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
                                        <li class="todo-item">
                                            <div class="checkbox checkbox-warning">
                                                <input type="checkbox" id="checkbox03" checked/>
                                                <label for="checkbox03">Decide The Live Discussion Time</label>
                                            </div>
                                        </li>
                                        <li>
                                            <hr class="light-grey-hr"/>
                                        </li>
                                        <li class="todo-item">
                                            <div class="checkbox checkbox-success">
                                                <input type="checkbox" id="checkbox04" checked/>
                                                <label for="checkbox04">Prepare For The Next Project</label>
                                            </div>
                                        </li>
                                        <li>
                                            <hr class="light-grey-hr"/>
                                        </li>
                                        <li class="todo-item">
                                            <div class="checkbox checkbox-danger">
                                                <input type="checkbox" id="checkbox05" checked/>
                                                <label for="checkbox05">Finish Up AngularJs Tutorial</label>
                                            </div>
                                        </li>
                                        <li>
                                            <hr class="light-grey-hr"/>
                                        </li>
                                        <li class="todo-item">
                                            <div class="checkbox checkbox-purple">
                                                <input type="checkbox" id="checkbox06" checked/>
                                                <label for="checkbox06">Finish Infinity Project</label>
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
                    <h5 class="txt-dark">仓库</h5>
                </div>
                <!-- Breadcrumb -->
                <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                    <ol class="breadcrumb">
                        <li><a href="index.html">Dashboard</a></li>
                        <li><a href="#"><span>e-commerce</span></a></li>
                        <li class="active"><span>products</span></li>
                    </ol>
                </div>
                <!-- /Breadcrumb -->
            </div>
            <!-- /Title -->
            <div class="row">
                <div class=" info ">
                    <div class="col-md-0">

                    </div>

                </div>
            </div>
            <div class="form-group">

            </div>
            <!-- Product Row One -->
            <div class="row lsitwar">
                <h5 class="txt-dark">物料仓库</h5>
                <c:forEach var="warh" items="${lsitwar}">
                    <div class="col-lg-2 col-md-2 col-sm-4 col-xs-6">
                        <div class="panel panel-default card-view pa-0">
                            <div class="panel-wrapper collapse in">
                                <div class="panel-body pa-0">
                                    <article class="col-item">
                                        <form action="">
                                            <div class="photo">
                                                <div class="options">
                                                    <a href="/getWarehouseRegisterItem.do?goodsShelve.warehouseRegion.warehouse.warehouseId=${warh.warehouseId}"
                                                       class="font-18 txt-grey mr-10 pull-left"><i
                                                            class="zmdi zmdi-calendar-note mr-10" title="查看记录"></i></a>
                                                    <a href="" class="font-18 txt-grey mr-10 pull-left"
                                                       data-toggle="modal"
                                                       data-target="#editor-modal3"><i
                                                            class="fa fa-plus-square addWareouse" title="添加仓库"></i></a>
                                                </div>
                                                <a href="/getwarehouseregion.do?warehouse.warehouseId=${warh.warehouseId}">
                                                    <img
                                                            src="../../../images/menuimg/timg.jpg"
                                                            class="img-responsive"
                                                            alt="Product Image" title="查看区域"/> </a>
                                                <div class="info">
                                                    <h6>
                                                            ${warh.warehouseName}
                                                    </h6>
                                                    <div class="product-rating inline-block">
                                                            ${warh.remarks}
                                                    </div>
                                                    <span class="head-font block text-warning font-16">管理人:【${warh.user.userName}】</span>
                                                </div>
                                            </div>
                                        </form>
                                    </article>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
            <div class="row addprs">
                <h5 class="txt-dark">成品仓库</h5>
                <c:forEach var="prs" items="${productWarehouses}">
                    <div class="col-lg-2 col-md-2 col-sm-4 col-xs-6">
                        <div class="panel panel-default card-view pa-0">
                            <div class="panel-wrapper collapse in">
                                <div class="panel-body pa-0">
                                    <article class="col-item">
                                        <form>
                                            <div class="photo">
                                                <div class="options">
                                                    <a href="getProductWarehouseRegister.do"
                                                       class="font-18 txt-grey mr-10 pull-left"><i
                                                            class="zmdi zmdi-calendar-note mr-10" title="查看记录"></i></a>
                                                    <a href="" class="font-18 txt-grey mr-10 pull-left addWareouse"
                                                       data-toggle="modal"
                                                       data-target="#editor-modal4"><i
                                                            class="fa fa-plus-square " title="添加仓库"></i></a>
                                                </div>
                                                <a href="/getProductwarehouseregion.do?productWarehouse.productWarehouseId=${prs.productWarehouseId}">
                                                    <img src="../../../images/menuimg/timg.jpg"
                                                         class="img-responsive"
                                                         alt="Product Image" title="查看区域"/> </a>
                                                <div class="info">
                                                    <h6>
                                                            ${prs.productWarehouseName}
                                                    </h6>
                                                    <div class="product-rating inline-block">
                                                            ${prs.remarks}
                                                    </div>
                                                    <span class="head-font block text-warning font-16">管理员:【${prs.user.userName}】</span>
                                                </div>
                                            </div>
                                        </form>
                                    </article>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
            <!-- /Product Row Four -->
        </div>
        <div class="modal fade" id="editor-modal2" tabindex="-1" role="dialog" aria-labelledby="editor-title">
            <div class="modal-dialog" role="document">
                <form class="modal-content form-horizontal" id="editor2">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                aria-hidden="true">×</span></button>
                        <h5 class="modal-title" id="editor-title2">修改物料仓库</h5>
                    </div>
                    <div class="modal-body">
                        <input type="number" id="id2" name="id" class="hidden"/>
                        <div class="form-group col-sm-10">
                            <input type="text" class="form-control" placeholder="仓库名称">
                        </div>
                        <div class="form-group col-sm-10 select">
                            <select class="form-control select2 select2-hidden-accessible selectUser"
                                    tabindex="-1" aria-hidden="true" placeholder="选择管理员">
                            </select></div>
                        <div class="form-group col-sm-10">
                            <input type="text" class="form-control" placeholder="备注">
                        </div>
                    </div>
                    <div class="modal-footer">
                        <div style="float: right">
                            <button type="button" class="btn btn-default" data-dismiss="modal" onclick="cloo()"
                                    style="float: right">取消
                            </button>
                            <button type="button" class="btn btn-primary" data-dismiss="modal"
                                    style="float:right;margin-right: 20px;">保存
                            </button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <div class="modal fade" id="editor-modal3" tabindex="-1" role="dialog" aria-labelledby="editor-title">
            <!--添加弹框 -->
            <div class="modal-dialog" role="document">
                <form class="modal-content form-horizontal" id="editor3">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"
                                onclick="cloo()"><span
                                aria-hidden="true">×</span></button>
                        <h5 class="modal-title" id="editor-title3">添加物料仓库</h5>
                    </div>
                    <div class="modal-body">
                        <input type="number" id="id3" name="id" class="hidden"/>
                        <div class="form-group col-sm-10">
                            <input type="text" class="form-control" placeholder="仓库名称"
                                   id="warehouseName">
                        </div>
                        <div class="form-group col-sm-10">
                            <select class="form-control select2 select2-hidden-accessible selectUser"
                                    tabindex="-1" aria-hidden="true" id="userid" placeholder="选择管理员">

                            </select></div>
                        <div class="form-group col-sm-10">
                            <input type="text" class="form-control" placeholder="备注" name="remarks" id="remarks">
                        </div>
                    </div>
                    <div class="modal-footer">
                        <div style="float: right">
                            <button type="button" class="btn btn-default" data-dismiss="modal" onclick="cloo()"
                                    style="float: right">取消
                            </button>
                            <button type="button" class="btn btn-primary addwarehouse" data-dismiss="modal"
                                    style="float:right;margin-right: 20px;">保存
                            </button>

                        </div>
                    </div>
                </form>
            </div>
        </div>
        <div class="modal fade" id="editor-modal4" tabindex="-1" role="dialog" aria-labelledby="editor-title">
            <!--添加弹框 -->
            <div class="modal-dialog" role="document">
                <form class="modal-content form-horizontal" id="editor4">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                aria-hidden="true">×</span></button>
                        <h5 class="modal-title" id="editor-title4">添加成品仓库</h5>
                    </div>
                    <div class="modal-body">
                        <input type="number" id="id4" name="id" class="hidden"/>
                        <div class="form-group col-sm-10">
                            <input type="text" class="form-control" placeholder="仓库名称" name="productWarehouseName"
                                   id="productWarehouseName">
                        </div>
                        <div class="form-group col-sm-10">
                            <select class="form-control select2 select2-hidden-accessible selectUser"
                                    tabindex="-1" aria-hidden="true" name="pname" id="Pname" placeholder="选择管理员">
                            </select></div>
                        <div class="form-group col-sm-10">
                            <input type="text" class="form-control" placeholder="备注" name="remarks" id="Premarks">
                        </div>
                    </div>
                    <div class="modal-footer">
                        <div style="float: right">
                            <button type="button" class="btn btn-default" data-dismiss="modal" onclick="cloo()"
                                    style="float: right">取消
                            </button>
                            <button type="button" class="btn btn-primary addPWareHouse" data-dismiss="modal"
                                    style="float:right;margin-right: 20px;">保存
                            </button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <div class="modal fade" id="editor-modal5" tabindex="-1" role="dialog" aria-labelledby="editor-title">
            <!--添加弹框 -->
            <div class="modal-dialog" role="document">
                <form class="modal-content form-horizontal" id="editor5">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                aria-hidden="true">×</span></button>
                        <h5 class="modal-title" id="editor-title5">修改成品仓库</h5>
                    </div>
                    <div class="modal-body">
                        <input type="number" id="id5" name="id" class="hidden"/>
                        <div class="form-group col-sm-10">
                            <input type="text" class="form-control" placeholder="仓库名称">
                        </div>
                        <div class="form-group col-sm-10">
                            <select class="form-control select2 select2-hidden-accessible selectUser"
                                    tabindex="-1" aria-hidden="true" placeholder="选择管理员">
                            </select></div>
                        <div class="form-group col-sm-10">
                            <input type="text" class="form-control" placeholder="备注">
                        </div>
                    </div>
                    <div class="modal-footer">
                        <div style="float: right">
                            <button type="button" class="btn btn-default" data-dismiss="modal" onclick="cloo()"
                                    style="float: right">取消
                            </button>
                            <button type="button" class="btn btn-primary" data-dismiss="modal"
                                    style="float:right;margin-right: 20px;">保存
                            </button>

                        </div>
                    </div>
                </form>
            </div>
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
<script src="../../../vendors/bower_components/jquery/dist/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="../../../vendors/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

<!-- Slimscroll JavaScript -->
<script src="../../../dist/js/jquery.slimscroll.js"></script>

<!-- Owl JavaScript -->
<script src="../../../vendors/bower_components/owl.carousel/dist/owl.carousel.min.js"></script>

<!-- Sweet-Alert  -->
<script src="../../../vendors/bower_components/sweetalert/dist/sweetalert.min.js"></script>
<script src="../../../dist/js/sweetalert-data.js"></script>

<!-- Switchery JavaScript -->
<script src="../../../vendors/bower_components/switchery/dist/switchery.min.js"></script>

<!-- Fancy Dropdown JS -->
<script src="../../../dist/js/dropdown-bootstrap-extended.js"></script>
<!-- Treeview JavaScript -->
<script src="../../../vendors/bower_components/bootstrap-treeview/dist/bootstrap-treeview.min.js"></script>
<!-- Treeview Init JavaScript -->
<script src="../../../dist/js/treeview-data.js"></script>
<!-- Init JavaScript -->
<script src="../../../dist/js/init.js"></script>
<script>
    $(function () {
        $(".addWareouse").click(function () {
            $.ajax({
                type: "post",
                url: "${pageContext.request.contextPath}/warehouseUser.cl",
                cache: false,
                dataType: "json",
                success: function (data) {
                    var daa = $(data);
                    $(".selectUser").html("");
                    $.each(daa, function (i, imt) {
                        $(".selectUser").append("<option value='" + imt.userId + "'><font style='vertical-align: inherit;'><fontstyle='vertical-align: inherit;'>" + imt.userName + "</font></font> </option>");
                    })
                }, error: function () {
                    alert("系统异常，请稍后重试！");
                }
            });
        });
        $(".addwarehouse").click(function () {
            var name = $("#warehouseName").val();
            var remarks = $("#remarks").val();
            var userId = $("#userid").find("option:selected");
            var id = $(userId).val();
            var uname = $(userId).text();
            swal({
                title: "你确定要添加仓库吗?",
                text: "添加之后不可删除！!",
                type: "warning",
                showCancelButton: true,
                confirmButtonColor: "#fec107",
                confirmButtonText: "确定!",
                cancelButtonText: "取消!",
                closeOnConfirm: false,
                closeOnCancel: true
            }, function (isConfirm) {
                if (isConfirm) {
                    $.ajax({
                        type: "post",
                        url: "${pageContext.request.contextPath}/addwarehouse.do?warehouseName=" + name + "&remarks=" + remarks + "&user.userId=" + id + "",
                        cache: false,
                        dataType: "json",
                        success: function (data) {
                            if (data != "") {
                                cloo();
                                swal("添加成功", "添加成功！", "success");
                                $(".lsitwar").append("<div class=\"col-lg-2 col-md-2 col-sm-4 col-xs-6\">\n" + "<div class=\"panel panel-default card-view pa-0\">\n" +
                                    "                            <div class=\"panel-wrapper collapse in\">\n" +
                                    "                                <div class=\"panel-body pa-0\">\n" +
                                    "                                    <article class=\"col-item\">\n" +
                                    "                                        <form>\n" +
                                    "                                            <div class=\"photo\">\n" +
                                    "                                                <div class=\"options\">\n" +
                                    "                                                    <a href=\"getProductWarehouseRegister.do\"\n" +
                                    "                                                       class=\"font-18 txt-grey mr-10 pull-left\"><i\n" +
                                    "                                                            class=\"zmdi zmdi-calendar-note mr-10\" title=\"查看记录\"></i></a>\n" +
                                    "                                                 \n" +
                                    "                                                    <a href=\"\" class=\"font-18 txt-grey mr-10 pull-left addWareouse\"\n" +
                                    "                                                       data-toggle=\"modal\"\n" +
                                    "                                                       data-target=\"#editor-modal4\"><i\n" +
                                    "                                                            class=\"fa fa-plus-square \" title=\"添加仓库\"></i></a>\n" +
                                    "                                                </div>\n" +
                                    "                                                <a href=\"/getProductwarehouseregion.do?productWarehouse.productWarehouseId=$" + data + "\">\n" +
                                    "                                                    <img src=\"../../../images/menuimg/timg.jpg\"\n" +
                                    "                                                         class=\"img-responsive\"\n" +
                                    "                                                         alt=\"Product Image\" title=\"查看区域\"/> </a>\n" +
                                    "                                                <div class=\"info\">\n" +
                                    "                                                    <h6>\n" +
                                    "                                                            " + name + "\n" +
                                    "                                                    </h6>\n" +
                                    "                                                    <div class=\"product-rating inline-block\">\n" +
                                    "                                                            " + remarks + "\n" +
                                    "                                                    </div>\n" +
                                    "                                                    <span class=\"head-font block text-warning font-16\">管理员:【" + uname + "】</span>\n" +
                                    "                                                </div>\n" +
                                    "                                            </div>\n" +
                                    "                                        </form>\n" +
                                    "                                    </article>\n" +
                                    "                                </div>\n" +
                                    "                            </div>\n" +
                                    "                        </div>\n" +
                                    "                    </div>");
                            }

                        }, error: function () {
                            cloo();
                            swal("添加失败！！", "系统异常！请联系管理员处理！！", "error");
                        }
                    });
                }
            });

        });

        $(".addPWareHouse").click(function () {
            var name = $("#productWarehouseName").val();
            var remarks = $("#Premarks").val();
            var userId = $("#Pname").find("option:selected");
            var id = $(userId).val();
            var uname = $(userId).text();
            swal({
                title: "你确定要添加仓库吗?",
                text: "添加之后不可删除！!",
                type: "warning",
                showCancelButton: true,
                confirmButtonColor: "#fec107",
                confirmButtonText: "确定!",
                cancelButtonText: "取消!",
                closeOnConfirm: false,
                closeOnCancel: true
            }, function (isConfirm) {
                if (isConfirm) {
                    $.ajax({
                        type: "post",
                        url: "${pageContext.request.contextPath}/addPWareHouse.do?productWarehouseName=" + name + "&remarks=" + remarks + "&user.userId=" + id + "",
                        cache: false,
                        dataType: "json",
                        success: function (data) {
                            if (data != "") {
                                swal("添加成功", "添加成功！", "success");
                                cloo();
                                $(".addprs").append("<div class=\"col-lg-2 col-md-2 col-sm-4 col-xs-6\">\n" +
                                    "                        <div class=\"panel panel-default card-view pa-0\">\n" +
                                    "                            <div class=\"panel-wrapper collapse in\">\n" +
                                    "                                <div class=\"panel-body pa-0\">\n" +
                                    "                                    <article class=\"col-item\">\n" +
                                    "                                        <form>\n" +
                                    "                                            <div class=\"photo\">\n" +
                                    "                                                <div class=\"options\">\n" +
                                    "                                                    <a href=\"getProductWarehouseRegister.do\"\n" +
                                    "                                                       class=\"font-18 txt-grey mr-10 pull-left\"><i\n" +
                                    "                                                            class=\"zmdi zmdi-calendar-note mr-10\" title=\"查看记录\"></i></a>\n" +
                                    "                                                  \n" +
                                    "                                                    <a href=\"\" class=\"font-18 txt-grey mr-10 pull-left addWareouse\"\n" +
                                    "                                                       data-toggle=\"modal\"\n" +
                                    "                                                       data-target=\"#editor-modal4\"><i\n" +
                                    "                                                            class=\"fa fa-plus-square \" title=\"添加仓库\"></i></a>\n" +
                                    "                                                </div>\n" +
                                    "                                                <a href=\"/getProductwarehouseregion.do?productWarehouse.productWarehouseId=" + data + "\">\n" +
                                    "                                                    <img src=\"../../../images/menuimg/timg.jpg\"\n" +
                                    "                                                         class=\"img-responsive\"\n" +
                                    "                                                         alt=\"Product Image\" title=\"查看区域\"/> </a>\n" +
                                    "                                                <div class=\"info\">\n" +
                                    "                                                    <h6>\n" +
                                    "                                                            " + name + "\n" +
                                    "                                                    </h6>\n" +
                                    "                                                    <div class=\"product-rating inline-block\">\n" +
                                    "                                                           " + remarks + "\n" +
                                    "                                                    </div>\n" +
                                    "                                                    <span class=\"head-font block text-warning font-16\">管理员:【" + uname + "】</span>\n" +
                                    "                                                </div>\n" +
                                    "                                            </div>\n" +
                                    "                                        </form>\n" +
                                    "                                    </article>\n" +
                                    "                                </div>\n" +
                                    "                            </div>\n" +
                                    "                        </div>\n" +
                                    "                    </div>");
                            }
                        }, error: function () {
                            cloo();
                            swal("添加失败！！", "系统异常！请联系管理员处理！！", "error");
                        }
                    });
                }
            });

        });
    });

    function cloo() {
        var name = $("#productWarehouseName").val("");
        var remarks = $("#Premarks").val("");
        $("#warehouseName").val("");
        $("#remarks").val("");
    }
</script>
</body>

</html>

