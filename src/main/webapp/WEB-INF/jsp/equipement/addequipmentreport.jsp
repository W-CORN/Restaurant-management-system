<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" class="translated-ltr"><head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>添加异常报告</title>
    <meta name="description" content="Hound is a Dashboard &amp; Admin Site Responsive Template by hencework.">
    <meta name="keywords" content="admin, admin dashboard, admin template, cms, crm, Hound Admin, Houndadmin, premium admin templates, responsive admin, sass, panel, software, ui, visualization, web app, application">
    <meta name="author" content="hencework">
    <!-- Favicon -->
    <link rel="shortcut icon" href="favicon.ico">
    <link rel="icon" href="favicon.ico" type="image/x-icon">
    <!-- Custom CSS -->
    <link href="dist/css/style.css" rel="stylesheet" type="text/css">
    <link type="text/css" rel="stylesheet" charset="UTF-8" href="https://translate.googleapis.com/translate_static/css/translateelement.css"></head>


<%--date--%>
<!-- Bootstrap Colorpicker CSS -->
<link href="../../../vendors/bower_components/mjolnic-bootstrap-colorpicker/dist/css/bootstrap-colorpicker.min.css" rel="stylesheet" type="text/css"/>
<!-- Bootstrap Datetimepicker CSS -->
<link href="../../../vendors/bower_components/eonasdan-bootstrap-datetimepicker/build/css/bootstrap-datetimepicker.min.css" rel="stylesheet" type="text/css"/>


<body>
<!--Preloader-->
<div class="preloader-it" style="display: none;">
    <div class="la-anim-1 la-animate"></div>
</div>
<!--/Preloader-->
<div class="wrapper theme-1-active pimary-color-red">

    <!-- Top Menu Items -->
    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="mobile-only-brand pull-left">
            <div class="nav-header pull-left">
                <div class="logo-wrap">
                    <a href="index.html">
                        <img class="brand-img" src="dist/img/logo.png" alt="牌">
                        <span class="brand-text"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">猎犬</font></font></span>
                    </a>
                </div>
            </div>
            <a id="toggle_nav_btn" class="toggle-left-nav-btn inline-block ml-20 pull-left" href="javascript:void(0);"><i class="zmdi zmdi-menu"></i></a>
            <a id="toggle_mobile_search" data-toggle="collapse" data-target="#search_form" class="mobile-only-view" href="javascript:void(0);"><i class="zmdi zmdi-search"></i></a>
            <a id="toggle_mobile_nav" class="mobile-only-view" href="javascript:void(0);"><i class="zmdi zmdi-more"></i></a>
            <form id="search_form" role="search" class="top-nav-search collapse pull-left">
                <div class="input-group">
                    <input type="text" name="example-input1-group2" class="form-control" placeholder="Search">
                    <span class="input-group-btn">
							<button type="button" class="btn  btn-default" data-target="#search_form" data-toggle="collapse" aria-label="Close" aria-expanded="true"><i class="zmdi zmdi-search"></i></button>
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
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="zmdi zmdi-apps top-nav-icon"></i></a>
                    <ul class="dropdown-menu app-dropdown" data-dropdown-in="slideInRight" data-dropdown-out="flipOutX">
                        <li>
                            <div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto; height: 162px;"><div class="app-nicescroll-bar" style="overflow: hidden; width: auto; height: 162px;">
                                <ul class="app-icon-wrap pa-10">
                                    <li>
                                        <a href="weather.html" class="connection-item">
                                            <i class="zmdi zmdi-cloud-outline txt-info"></i>
                                            <span class="block"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">天气</font></font></span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="inbox.html" class="connection-item">
                                            <i class="zmdi zmdi-email-open txt-success"></i>
                                            <span class="block"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">电子邮件</font></font></span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="calendar.html" class="connection-item">
                                            <i class="zmdi zmdi-calendar-check txt-primary"></i>
                                            <span class="block"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">日历</font></font></span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="vector-map.html" class="connection-item">
                                            <i class="zmdi zmdi-map txt-danger"></i>
                                            <span class="block"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">地图</font></font></span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="chats.html" class="connection-item">
                                            <i class="zmdi zmdi-comment-outline txt-warning"></i>
                                            <span class="block"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">聊</font></font></span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="contact-card.html" class="connection-item">
                                            <i class="zmdi zmdi-assignment-account"></i>
                                            <span class="block"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">联系</font></font></span>
                                        </a>
                                    </li>
                                </ul>
                            </div><div class="slimScrollBar" style="background: rgb(135, 135, 135); width: 4px; position: absolute; top: 0px; opacity: 0.4; display: block; border-radius: 0px; z-index: 99; right: 1px;"></div><div class="slimScrollRail" style="width: 4px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(51, 51, 51); opacity: 0.2; z-index: 90; right: 1px;"></div></div>
                        </li>
                        <li>
                            <div class="app-box-bottom-wrap">
                                <hr class="light-grey-hr ma-0">
                                <a class="block text-center read-all" href="javascript:void(0)"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> 更多 </font></font></a>
                            </div>
                        </li>
                    </ul>
                </li>
                <li class="dropdown full-width-drp">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="zmdi zmdi-more-vert top-nav-icon"></i></a>
                    <ul class="dropdown-menu mega-menu pa-0" data-dropdown-in="fadeIn" data-dropdown-out="fadeOut">
                        <div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto; height: 346px;"><li class="product-nicescroll-bar row" style="overflow: hidden; width: auto; height: 346px;">
                            <ul class="pa-20">
                                <li class="col-md-3 col-xs-6 col-menu-list">
                                    <a href="javascript:void(0);"><div class="pull-left"><i class="zmdi zmdi-landscape mr-20"></i><span class="right-nav-text"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">仪表板</font></font></span></div><div class="pull-right"><i class="zmdi zmdi-caret-down"></i></div><div class="clearfix"></div></a>
                                    <hr class="light-grey-hr ma-0">
                                    <ul>
                                        <li>
                                            <a href="index.html"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">分析</font></font></a>
                                        </li>
                                        <li>
                                            <a href="index2.html"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">人口</font></font></a>
                                        </li>
                                        <li>
                                            <a href="index3.html"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">项目</font></font></a>
                                        </li>
                                        <li>
                                            <a href="profile.html"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">轮廓</font></font></a>
                                        </li>
                                    </ul>
                                    <a href="widgets.html"><div class="pull-left"><i class="zmdi zmdi-flag mr-20"></i><span class="right-nav-text"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">小部件</font></font></span></div><div class="pull-right"><span class="label label-warning"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">8</font></font></span></div><div class="clearfix"></div></a>
                                    <hr class="light-grey-hr ma-0">
                                    <a href="documentation.html"><div class="pull-left"><i class="zmdi zmdi-book mr-20"></i><span class="right-nav-text"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">文件</font></font></span></div><div class="clearfix"></div></a>
                                    <hr class="light-grey-hr ma-0">
                                </li>
                                <li class="col-md-3 col-xs-6 col-menu-list">
                                    <a href="javascript:void(0);">
                                        <div class="pull-left">
                                            <i class="zmdi zmdi-shopping-basket mr-20"></i><span class="right-nav-text"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">电子商务</font></font></span>
                                        </div>
                                        <div class="pull-right"><span class="label label-success"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">热</font></font></span>
                                        </div>
                                        <div class="clearfix"></div>
                                    </a>
                                    <hr class="light-grey-hr ma-0">
                                    <ul>
                                        <li>
                                            <a href="e-commerce.html"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">仪表板</font></font></a>
                                        </li>
                                        <li>
                                            <a href="product.html"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">制品</font></font></a>
                                        </li>
                                        <li>
                                            <a href="product-detail.html"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">产品信息</font></font></a>
                                        </li>
                                        <li>
                                            <a href="add-products.html"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">添加产品</font></font></a>
                                        </li>
                                        <li>
                                            <a href="product-orders.html"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">命令</font></font></a>
                                        </li>
                                        <li>
                                            <a href="product-cart.html"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">大车</font></font></a>
                                        </li>
                                        <li>
                                            <a href="product-checkout.html"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">查看</font></font></a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="col-md-6 col-xs-12 preview-carousel">
                                    <a href="javascript:void(0);"><div class="pull-left"><span class="right-nav-text"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">最新产品</font></font></span></div><div class="clearfix"></div></a>
                                    <hr class="light-grey-hr ma-0">
                                    <div class="product-carousel owl-carousel owl-theme text-center owl-loaded owl-drag">





                                        <div class="owl-stage-outer"><div class="owl-stage" style="transform: translate3d(-967px, 0px, 0px); transition: 0.25s; width: 2129px;"><div class="owl-item cloned" style="width: 178.5px; margin-right: 15px;"><div class="owl-dots disabled"></div></div><div class="owl-item cloned" style="width: 178.5px; margin-right: 15px;"><div class="owl-stage-outer"><div class="owl-stage" style="transform: translate3d(-1376px, 0px, 0px); transition: 0.25s; width: 2236px;"><div class="owl-item cloned" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair2.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">方形椅子</font></font></span>
                                        </a></div><div class="owl-item cloned" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair3.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">半圆椅子</font></font></span>
                                        </a></div><div class="owl-item cloned" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair4.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">木椅子</font></font></span>
                                        </a></div><div class="owl-item cloned" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair2.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">方形椅子</font></font></span>
                                        </a></div><div class="owl-item" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">圈子椅子</font></font></span>
                                        </a></div><div class="owl-item" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair2.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">方形椅子</font></font></span>
                                        </a></div><div class="owl-item" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair3.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">半圆椅子</font></font></span>
                                        </a></div><div class="owl-item" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair4.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">木椅子</font></font></span>
                                        </a></div><div class="owl-item active" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair2.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">方形椅子</font></font></span>
                                        </a></div><div class="owl-item cloned active" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">圈子椅子</font></font></span>
                                        </a></div><div class="owl-item cloned active" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair2.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">方形椅子</font></font></span>
                                        </a></div><div class="owl-item cloned active" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair3.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">半圆椅子</font></font></span>
                                        </a></div><div class="owl-item cloned" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair4.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">木椅子</font></font></span>
                                        </a></div></div></div></div><div class="owl-item cloned" style="width: 178.5px; margin-right: 15px;"><div class="owl-nav"><div class="owl-prev"><i class="zmdi zmdi-chevron-left"></i></div><div class="owl-next"><i class="zmdi zmdi-chevron-right"></i></div></div></div><div class="owl-item cloned" style="width: 178.5px; margin-right: 15px;"><div class="owl-dots disabled"></div></div><div class="owl-item" style="width: 178.5px; margin-right: 15px;"><div class="owl-stage-outer"><div class="owl-stage" style="transform: translate3d(-1376px, 0px, 0px); transition: 0.25s; width: 2236px;"><div class="owl-item cloned" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair2.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">方形椅子</font></font></span>
                                        </a></div><div class="owl-item cloned" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair3.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">半圆椅子</font></font></span>
                                        </a></div><div class="owl-item cloned" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair4.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">木椅子</font></font></span>
                                        </a></div><div class="owl-item cloned" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair2.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">方形椅子</font></font></span>
                                        </a></div><div class="owl-item" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">圈子椅子</font></font></span>
                                        </a></div><div class="owl-item" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair2.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">方形椅子</font></font></span>
                                        </a></div><div class="owl-item" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair3.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">半圆椅子</font></font></span>
                                        </a></div><div class="owl-item" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair4.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">木椅子</font></font></span>
                                        </a></div><div class="owl-item active" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair2.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">方形椅子</font></font></span>
                                        </a></div><div class="owl-item cloned active" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">圈子椅子</font></font></span>
                                        </a></div><div class="owl-item cloned active" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair2.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">方形椅子</font></font></span>
                                        </a></div><div class="owl-item cloned active" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair3.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">半圆椅子</font></font></span>
                                        </a></div><div class="owl-item cloned" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair4.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">木椅子</font></font></span>
                                        </a></div></div></div></div><div class="owl-item active" style="width: 178.5px; margin-right: 15px;"><div class="owl-nav"><div class="owl-prev"><i class="zmdi zmdi-chevron-left"></i></div><div class="owl-next"><i class="zmdi zmdi-chevron-right"></i></div></div></div><div class="owl-item active" style="width: 178.5px; margin-right: 15px;"><div class="owl-dots disabled"></div></div><div class="owl-item cloned active" style="width: 178.5px; margin-right: 15px;"><div class="owl-stage-outer"><div class="owl-stage" style="transform: translate3d(-1376px, 0px, 0px); transition: 0.25s; width: 2236px;"><div class="owl-item cloned" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair2.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">方形椅子</font></font></span>
                                        </a></div><div class="owl-item cloned" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair3.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">半圆椅子</font></font></span>
                                        </a></div><div class="owl-item cloned" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair4.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">木椅子</font></font></span>
                                        </a></div><div class="owl-item cloned" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair2.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">方形椅子</font></font></span>
                                        </a></div><div class="owl-item" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">圈子椅子</font></font></span>
                                        </a></div><div class="owl-item" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair2.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">方形椅子</font></font></span>
                                        </a></div><div class="owl-item" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair3.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">半圆椅子</font></font></span>
                                        </a></div><div class="owl-item" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair4.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">木椅子</font></font></span>
                                        </a></div><div class="owl-item active" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair2.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">方形椅子</font></font></span>
                                        </a></div><div class="owl-item cloned active" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">圈子椅子</font></font></span>
                                        </a></div><div class="owl-item cloned active" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair2.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">方形椅子</font></font></span>
                                        </a></div><div class="owl-item cloned active" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair3.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">半圆椅子</font></font></span>
                                        </a></div><div class="owl-item cloned" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair4.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">木椅子</font></font></span>
                                        </a></div></div></div></div><div class="owl-item cloned active" style="width: 178.5px; margin-right: 15px;"><div class="owl-nav"><div class="owl-prev"><i class="zmdi zmdi-chevron-left"></i></div><div class="owl-next"><i class="zmdi zmdi-chevron-right"></i></div></div></div><div class="owl-item cloned" style="width: 178.5px; margin-right: 15px;"><div class="owl-dots disabled"></div></div><div class="owl-item cloned" style="width: 178.5px; margin-right: 15px;"><div class="owl-stage-outer"><div class="owl-stage" style="transform: translate3d(-1376px, 0px, 0px); transition: 0.25s; width: 2236px;"><div class="owl-item cloned" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair2.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">方形椅子</font></font></span>
                                        </a></div><div class="owl-item cloned" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair3.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">半圆椅子</font></font></span>
                                        </a></div><div class="owl-item cloned" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair4.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">木椅子</font></font></span>
                                        </a></div><div class="owl-item cloned" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair2.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">方形椅子</font></font></span>
                                        </a></div><div class="owl-item" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">圈子椅子</font></font></span>
                                        </a></div><div class="owl-item" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair2.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">方形椅子</font></font></span>
                                        </a></div><div class="owl-item" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair3.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">半圆椅子</font></font></span>
                                        </a></div><div class="owl-item" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair4.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">木椅子</font></font></span>
                                        </a></div><div class="owl-item active" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair2.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">方形椅子</font></font></span>
                                        </a></div><div class="owl-item cloned active" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">圈子椅子</font></font></span>
                                        </a></div><div class="owl-item cloned active" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair2.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">方形椅子</font></font></span>
                                        </a></div><div class="owl-item cloned active" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair3.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">半圆椅子</font></font></span>
                                        </a></div><div class="owl-item cloned" style="width: 157px; margin-right: 15px;"><a href="#">
                                            <img src="dist/img/chair4.jpg" alt="椅子">
                                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">木椅子</font></font></span>
                                        </a></div></div></div></div></div></div><div class="owl-nav disabled"><div class="owl-prev"><i class="zmdi zmdi-chevron-left"></i></div><div class="owl-next"><i class="zmdi zmdi-chevron-right"></i></div></div><div class="owl-dots disabled"></div></div>
                                </li>
                            </ul>
                        </li><div class="slimScrollBar" style="background: rgb(135, 135, 135); width: 4px; position: absolute; top: 0px; opacity: 0.4; display: none; border-radius: 0px; z-index: 99; right: 1px; height: 346px;"></div><div class="slimScrollRail" style="width: 4px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(51, 51, 51); opacity: 0.2; z-index: 90; right: 1px;"></div></div>
                    </ul>
                </li>
                <li class="dropdown alert-drp">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="zmdi zmdi-notifications top-nav-icon"></i><span class="top-nav-icon-badge"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">五</font></font></span></a>
                    <ul class="dropdown-menu alert-dropdown" data-dropdown-in="bounceIn" data-dropdown-out="bounceOut">
                        <li>
                            <div class="notification-box-head-wrap">
                                <span class="notification-box-head pull-left inline-block"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">通知</font></font></span>
                                <a class="txt-danger pull-right clear-notifications inline-block" href="javascript:void(0)"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">清除所有</font></font></a>
                                <div class="clearfix"></div>
                                <hr class="light-grey-hr ma-0">
                            </div>
                        </li>
                        <li>
                            <div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto; height: 229px;"><div class="streamline message-nicescroll-bar" style="overflow: hidden; width: auto; height: 229px;">
                                <div class="sl-item">
                                    <a href="javascript:void(0)">
                                        <div class="icon bg-green">
                                            <i class="zmdi zmdi-flag"></i>
                                        </div>
                                        <div class="sl-content">
													<span class="inline-block capitalize-font  pull-left truncate head-notifications"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
													新订阅创建于</font></font></span>
                                            <span class="inline-block font-11  pull-right notifications-time"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">下午2点</font></font></span>
                                            <div class="clearfix"></div>
                                            <p class="truncate">Your customer subscribed for the basic plan. The customer will pay $25 per month.</p>
                                        </div>
                                    </a>
                                </div>
                                <hr class="light-grey-hr ma-0">
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
                                <hr class="light-grey-hr ma-0">
                                <div class="sl-item">
                                    <a href="javascript:void(0)">
                                        <div class="icon bg-blue">
                                            <i class="zmdi zmdi-email"></i>
                                        </div>
                                        <div class="sl-content">
                                            <span class="inline-block capitalize-font  pull-left truncate head-notifications">2 new messages</span>
                                            <span class="inline-block font-11  pull-right notifications-time">4pm</span>
                                            <div class="clearfix"></div>
                                            <p class="truncate"> The last payment for your G Suite Basic subscription failed.</p>
                                        </div>
                                    </a>
                                </div>
                                <hr class="light-grey-hr ma-0">
                                <div class="sl-item">
                                    <a href="javascript:void(0)">
                                        <div class="sl-avatar">
                                            <img class="img-responsive" src="dist/img/avatar.jpg" alt="avatar">
                                        </div>
                                        <div class="sl-content">
                                            <span class="inline-block capitalize-font  pull-left truncate head-notifications">Sandy Doe</span>
                                            <span class="inline-block font-11  pull-right notifications-time">1pm</span>
                                            <div class="clearfix"></div>
                                            <p class="truncate">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit</p>
                                        </div>
                                    </a>
                                </div>
                                <hr class="light-grey-hr ma-0">
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
                            </div><div class="slimScrollBar" style="background: rgb(135, 135, 135); width: 4px; position: absolute; top: 0px; opacity: 0.4; display: block; border-radius: 0px; z-index: 99; right: 1px;"></div><div class="slimScrollRail" style="width: 4px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(51, 51, 51); opacity: 0.2; z-index: 90; right: 1px;"></div></div>
                        </li>
                        <li>
                            <div class="notification-box-bottom-wrap">
                                <hr class="light-grey-hr ma-0">
                                <a class="block text-center read-all" href="javascript:void(0)"> read all </a>
                                <div class="clearfix"></div>
                            </div>
                        </li>
                    </ul>
                </li>
                <li class="dropdown auth-drp">
                    <a href="#" class="dropdown-toggle pr-0" data-toggle="dropdown"><img src="dist/img/user1.png" alt="USER_AUTH" class="user-auth-img img-circle"><span class="user-online-status"></span></a>
                    <ul class="dropdown-menu user-auth-dropdown" data-dropdown-in="flipInX" data-dropdown-out="flipOutX">
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
                            <a href="#" class="dropdown-toggle pr-0 level-2-drp"><i class="zmdi zmdi-check text-success"></i> available</a>
                            <ul class="dropdown-menu open-left-side">
                                <li>
                                    <a href="#"><i class="zmdi zmdi-check text-success"></i><span>available</span></a>
                                </li>
                                <li>
                                    <a href="#"><i class="zmdi zmdi-circle-o text-warning"></i><span>busy</span></a>
                                </li>
                                <li>
                                    <a href="#"><i class="zmdi zmdi-minus-circle-outline text-danger"></i><span>offline</span></a>
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
                        <a href="javascript:void(0);" <c:if test="${j.jurisdictionId==8}"> class="active" </c:if>
                           data-toggle="collapse" data-target="#${j.jurisdictionId}">
                            <div class="pull-left"><i class="${j.icon} mr-20"></i><span
                                    class="right-nav-text" style="font-family: 微软雅黑;">${j.jurisdictionName}</span>
                            </div>
                            <div class="pull-right"><i class="zmdi zmdi-caret-down"></i></div>
                            <div class="clearfix"></div>
                        </a>
                            <%--在此处判断权限类型--%>
                        <ul id="${j.jurisdictionId}"
                            class="collapse <c:if test="${j.jurisdictionId==8}">in</c:if> collapse-level-1">
                            <c:forEach items="${role.functions}" var="f">
                                <c:if test="${j.jurisdictionId==f.jurisdictionId&&f.type==0}">
                                    <li>
                                        <a <c:if test="${f.functionId==48}"> class="active-page" </c:if>
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
                        <li class="active" role="presentation"><a aria-expanded="true" data-toggle="tab" role="tab" id="chat_tab_btn" href="#chat_tab"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">聊</font></font></a></li>
                        <li role="presentation" class=""><a data-toggle="tab" id="messages_tab_btn" role="tab" href="#messages_tab" aria-expanded="false"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">消息</font></font></a></li>
                        <li role="presentation" class=""><a data-toggle="tab" id="todo_tab_btn" role="tab" href="#todo_tab" aria-expanded="false"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">去做</font></font></a></li>
                    </ul>
                    <div class="tab-content" id="right_sidebar_content">
                        <div id="chat_tab" class="tab-pane fade active in" role="tabpanel">
                            <div class="chat-cmplt-wrap">
                                <div class="chat-box-wrap">
                                    <div class="add-friend">
                                        <a href="javascript:void(0)" class="inline-block txt-grey">
                                            <i class="zmdi zmdi-more"></i>
                                        </a>
                                        <span class="inline-block txt-dark"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">用户</font></font></span>
                                        <a href="javascript:void(0)" class="inline-block text-right txt-grey"><i class="zmdi zmdi-plus"></i></a>
                                        <div class="clearfix"></div>
                                    </div>
                                    <form role="search" class="chat-search pl-15 pr-15 pb-15">
                                        <div class="input-group">
                                            <input type="text" id="example-input1-group2" name="example-input1-group2" class="form-control" placeholder="Search">
                                            <span class="input-group-btn">
													<button type="button" class="btn  btn-default"><i class="zmdi zmdi-search"></i></button>
													</span>
                                        </div>
                                    </form>
                                    <div id="chat_list_scroll" style="height: 1014px;">
                                        <div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto; height: 100%;"><div class="nicescroll-bar" style="overflow: hidden; width: auto; height: 100%;">
                                            <ul class="chat-list-wrap">
                                                <li class="chat-list">
                                                    <div class="chat-body">
                                                        <a href="javascript:void(0)">
                                                            <div class="chat-data">
                                                                <img class="user-img img-circle" src="dist/img/user.png" alt="用户">
                                                                <div class="user-data">
                                                                    <span class="name block capitalize-font"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">粘土Masse </font></font></span>
                                                                    <span class="time block truncate txt-grey"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">除了我们自己，没有人能拯救我们。</font></font></span>
                                                                </div>
                                                                <div class="status away"></div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </a>
                                                        <a href="javascript:void(0)">
                                                            <div class="chat-data">
                                                                <img class="user-img img-circle" src="dist/img/user1.png" alt="用户">
                                                                <div class="user-data">
                                                                    <span class="name block capitalize-font"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Evie Ono </font></font></span>
                                                                    <span class="time block truncate txt-grey"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">团结就是力量</font></font></span>
                                                                </div>
                                                                <div class="status offline"></div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </a>
                                                        <a href="javascript:void(0)">
                                                            <div class="chat-data">
                                                                <img class="user-img img-circle" src="dist/img/user2.png" alt="用户">
                                                                <div class="user-data">
                                                                    <span class="name block capitalize-font"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Madalyn Rascon </font></font></span>
                                                                    <span class="time block truncate txt-grey"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">尊重自己，如果你会让别人尊重你。</font></font></span>
                                                                </div>
                                                                <div class="status online"></div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </a>
                                                        <a href="javascript:void(0)">
                                                            <div class="chat-data">
                                                                <img class="user-img img-circle" src="dist/img/user3.png" alt="用户">
                                                                <div class="user-data">
                                                                    <span class="name block capitalize-font"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Mitsuko Heid </font></font></span>
                                                                    <span class="time block truncate txt-grey"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">我很感激。</font></font></span>
                                                                </div>
                                                                <div class="status online"></div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </a>
                                                        <a href="javascript:void(0)">
                                                            <div class="chat-data">
                                                                <img class="user-img img-circle" src="dist/img/user.png" alt="用户">
                                                                <div class="user-data">
                                                                    <span class="name block capitalize-font"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Ezequiel Merideth </font></font></span>
                                                                    <span class="time block truncate txt-grey"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">耐心是苦涩的。</font></font></span>
                                                                </div>
                                                                <div class="status offline"></div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </a>
                                                        <a href="javascript:void(0)">
                                                            <div class="chat-data">
                                                                <img class="user-img img-circle" src="dist/img/user1.png" alt="用户">
                                                                <div class="user-data">
                                                                    <span class="name block capitalize-font"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Jonnie Metoyer </font></font></span>
                                                                    <span class="time block truncate txt-grey"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">天才是永恒的耐心。</font></font></span>
                                                                </div>
                                                                <div class="status online"></div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </a>
                                                        <a href="javascript:void(0)">
                                                            <div class="chat-data">
                                                                <img class="user-img img-circle" src="dist/img/user2.png" alt="用户">
                                                                <div class="user-data">
                                                                    <span class="name block capitalize-font"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Angelic Lauver </font></font></span>
                                                                    <span class="time block truncate txt-grey"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">每一个负担都是一种幸福。</font></font></span>
                                                                </div>
                                                                <div class="status away"></div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </a>
                                                        <a href="javascript:void(0)">
                                                            <div class="chat-data">
                                                                <img class="user-img img-circle" src="dist/img/user3.png" alt="用户">
                                                                <div class="user-data">
                                                                    <span class="name block capitalize-font"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Priscila Shy </font></font></span>
                                                                    <span class="time block truncate txt-grey"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">明智地解决，耐心执行。</font></font></span>
                                                                </div>
                                                                <div class="status online"></div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </a>
                                                        <a href="javascript:void(0)">
                                                            <div class="chat-data">
                                                                <img class="user-img img-circle" src="dist/img/user4.png" alt="用户">
                                                                <div class="user-data">
                                                                    <span class="name block capitalize-font"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Linda Stack </font></font></span>
                                                                    <span class="time block truncate txt-grey"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">我们的耐心将比我们的力量更胜一筹。</font></font></span>
                                                                </div>
                                                                <div class="status away"></div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </a>
                                                    </div>
                                                </li>
                                            </ul>
                                        </div><div class="slimScrollBar" style="background: rgb(135, 135, 135); width: 4px; position: absolute; top: 0px; opacity: 0.4; display: block; border-radius: 0px; z-index: 99; right: 1px; height: 1015px;"></div><div class="slimScrollRail" style="width: 4px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(51, 51, 51); opacity: 0.2; z-index: 90; right: 1px;"></div></div>
                                    </div>
                                </div>
                                <div class="recent-chat-box-wrap">
                                    <div class="recent-chat-wrap">
                                        <div class="panel-heading ma-0">
                                            <div class="goto-back">
                                                <a id="goto_back" href="javascript:void(0)" class="inline-block txt-grey">
                                                    <i class="zmdi zmdi-chevron-left"></i>
                                                </a>
                                                <span class="inline-block txt-dark"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">瑞安</font></font></span>
                                                <a href="javascript:void(0)" class="inline-block text-right txt-grey"><i class="zmdi zmdi-more"></i></a>
                                                <div class="clearfix"></div>
                                            </div>
                                        </div>
                                        <div class="panel-wrapper collapse in">
                                            <div class="panel-body pa-0">
                                                <div class="chat-content" style="height: 1005px;">
                                                    <div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto; height: 100%;"><ul class="nicescroll-bar pt-20" style="overflow: hidden; width: auto; height: 100%;">
                                                        <li class="friend">
                                                            <div class="friend-msg-wrap">
                                                                <img class="user-img img-circle block pull-left" src="dist/img/user.png" alt="用户">
                                                                <div class="msg pull-left">
                                                                    <p><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Jason，你好吗，上次见面已经很久了？</font></font></p>
                                                                    <div class="msg-per-detail text-right">
                                                                        <span class="msg-time txt-grey"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">下午2:30</font></font></span>
                                                                    </div>
                                                                </div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </li>
                                                        <li class="self mb-10">
                                                            <div class="self-msg-wrap">
                                                                <div class="msg block pull-right"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> 哦，嗨，莎拉，我现在有了一份新工作，并且进展顺利。
                                                                </font></font><div class="msg-per-detail text-right">
                                                                    <span class="msg-time txt-grey"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">下午2时31分</font></font></span>
                                                                </div>
                                                                </div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </li>
                                                        <li class="self">
                                                            <div class="self-msg-wrap">
                                                                <div class="msg block pull-right"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">  你呢？
                                                                </font></font><div class="msg-per-detail text-right">
                                                                    <span class="msg-time txt-grey"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">下午2时31分</font></font></span>
                                                                </div>
                                                                </div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </li>
                                                        <li class="friend">
                                                            <div class="friend-msg-wrap">
                                                                <img class="user-img img-circle block pull-left" src="dist/img/user.png" alt="用户">
                                                                <div class="msg pull-left">
                                                                    <p><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">不错。</font></font></p>
                                                                    <div class="msg-per-detail  text-right">
                                                                        <span class="msg-time txt-grey"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">2:35 pm</font></font></span>
                                                                    </div>
                                                                </div>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                        </li>
                                                    </ul><div class="slimScrollBar" style="background: rgb(135, 135, 135); width: 4px; position: absolute; top: 0px; opacity: 0.4; display: none; border-radius: 0px; z-index: 99; right: 1px; height: 1005px;"></div><div class="slimScrollRail" style="width: 4px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(51, 51, 51); opacity: 0.2; z-index: 90; right: 1px;"></div></div>
                                                </div>
                                                <div class="input-group">
                                                    <input type="text" id="input_msg_send" name="send-msg" class="input-msg-send form-control" placeholder="Type something">
                                                    <div class="input-group-btn emojis">
                                                        <div class="dropup">
                                                            <button type="button" class="btn  btn-default  dropdown-toggle" data-toggle="dropdown"><i class="zmdi zmdi-mood"></i></button>
                                                            <ul class="dropdown-menu dropdown-menu-right">
                                                                <li><a href="javascript:void(0)">Action</a></li>
                                                                <li><a href="javascript:void(0)">Another action</a></li>
                                                                <li class="divider"></li>
                                                                <li><a href="javascript:void(0)">Separated link</a></li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                    <div class="input-group-btn attachment">
                                                        <div class="fileupload btn  btn-default"><i class="zmdi zmdi-attachment-alt"></i>
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
                                    <a href="javascript:void(0)" class="inline-block text-right txt-grey"><i class="zmdi zmdi-search"></i></a>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="set-height-wrap" style="height: 1065px;">
                                    <div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto; height: 100%;"><div class="streamline message-box nicescroll-bar" style="overflow: hidden; width: auto; height: 100%;">
                                        <a href="javascript:void(0)">
                                            <div class="sl-item unread-message">
                                                <div class="sl-avatar avatar avatar-sm avatar-circle">
                                                    <img class="img-responsive img-circle" src="dist/img/user.png" alt="avatar">
                                                </div>
                                                <div class="sl-content">
                                                    <span class="inline-block capitalize-font   pull-left message-per">Clay Masse</span>
                                                    <span class="inline-block font-11  pull-right message-time">12:28 AM</span>
                                                    <div class="clearfix"></div>
                                                    <span class=" truncate message-subject">Themeforest message sent via your envato market profile</span>
                                                    <p class="txt-grey truncate">Neque porro quisquam est qui dolorem ipsu messm quia dolor sit amet, consectetur, adipisci velit</p>
                                                </div>
                                            </div>
                                        </a>
                                        <a href="javascript:void(0)">
                                            <div class="sl-item">
                                                <div class="sl-avatar avatar avatar-sm avatar-circle">
                                                    <img class="img-responsive img-circle" src="dist/img/user1.png" alt="avatar">
                                                </div>
                                                <div class="sl-content">
                                                    <span class="inline-block capitalize-font   pull-left message-per">Evie Ono</span>
                                                    <span class="inline-block font-11  pull-right message-time">1 Feb</span>
                                                    <div class="clearfix"></div>
                                                    <span class=" truncate message-subject">Pogody theme support</span>
                                                    <p class="txt-grey truncate">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit</p>
                                                </div>
                                            </div>
                                        </a>
                                        <a href="javascript:void(0)">
                                            <div class="sl-item">
                                                <div class="sl-avatar avatar avatar-sm avatar-circle">
                                                    <img class="img-responsive img-circle" src="dist/img/user2.png" alt="avatar">
                                                </div>
                                                <div class="sl-content">
                                                    <span class="inline-block capitalize-font   pull-left message-per">Madalyn Rascon</span>
                                                    <span class="inline-block font-11  pull-right message-time">31 Jan</span>
                                                    <div class="clearfix"></div>
                                                    <span class=" truncate message-subject">Congratulations from design nominees</span>
                                                    <p class="txt-grey truncate">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit</p>
                                                </div>
                                            </div>
                                        </a>
                                        <a href="javascript:void(0)">
                                            <div class="sl-item unread-message">
                                                <div class="sl-avatar avatar avatar-sm avatar-circle">
                                                    <img class="img-responsive img-circle" src="dist/img/user3.png" alt="avatar">
                                                </div>
                                                <div class="sl-content">
                                                    <span class="inline-block capitalize-font   pull-left message-per">Ezequiel Merideth</span>
                                                    <span class="inline-block font-11  pull-right message-time">29 Jan</span>
                                                    <div class="clearfix"></div>
                                                    <span class=" truncate message-subject">Themeforest item support message</span>
                                                    <p class="txt-grey truncate">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit</p>
                                                </div>
                                            </div>
                                        </a>
                                        <a href="javascript:void(0)">
                                            <div class="sl-item unread-message">
                                                <div class="sl-avatar avatar avatar-sm avatar-circle">
                                                    <img class="img-responsive img-circle" src="dist/img/user4.png" alt="avatar">
                                                </div>
                                                <div class="sl-content">
                                                    <span class="inline-block capitalize-font   pull-left message-per">Jonnie Metoyer</span>
                                                    <span class="inline-block font-11  pull-right message-time">27 Jan</span>
                                                    <div class="clearfix"></div>
                                                    <span class=" truncate message-subject">Help with beavis contact form</span>
                                                    <p class="txt-grey truncate">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit</p>
                                                </div>
                                            </div>
                                        </a>
                                        <a href="javascript:void(0)">
                                            <div class="sl-item">
                                                <div class="sl-avatar avatar avatar-sm avatar-circle">
                                                    <img class="img-responsive img-circle" src="dist/img/user.png" alt="avatar">
                                                </div>
                                                <div class="sl-content">
                                                    <span class="inline-block capitalize-font   pull-left message-per">Priscila Shy</span>
                                                    <span class="inline-block font-11  pull-right message-time">19 Jan</span>
                                                    <div class="clearfix"></div>
                                                    <span class=" truncate message-subject">Your uploaded theme is been selected</span>
                                                    <p class="txt-grey truncate">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit</p>
                                                </div>
                                            </div>
                                        </a>
                                        <a href="javascript:void(0)">
                                            <div class="sl-item">
                                                <div class="sl-avatar avatar avatar-sm avatar-circle">
                                                    <img class="img-responsive img-circle" src="dist/img/user1.png" alt="avatar">
                                                </div>
                                                <div class="sl-content">
                                                    <span class="inline-block capitalize-font   pull-left message-per">Linda Stack</span>
                                                    <span class="inline-block font-11  pull-right message-time">13 Jan</span>
                                                    <div class="clearfix"></div>
                                                    <span class=" truncate message-subject"> A new rating has been received</span>
                                                    <p class="txt-grey truncate">Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit</p>
                                                </div>
                                            </div>
                                        </a>
                                    </div><div class="slimScrollBar" style="background: rgb(135, 135, 135); width: 4px; position: absolute; top: 0px; opacity: 0.4; display: block; border-radius: 0px; z-index: 99; right: 1px;"></div><div class="slimScrollRail" style="width: 4px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(51, 51, 51); opacity: 0.2; z-index: 90; right: 1px;"></div></div>
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
                                    <a href="javascript:void(0)" class="inline-block text-right txt-grey"><i class="zmdi zmdi-plus"></i></a>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="set-height-wrap" style="height: 1065px;">
                                    <!-- Todo-List -->
                                    <div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto; height: 100%;"><ul class="todo-list nicescroll-bar" style="overflow: hidden; width: auto; height: 100%;">
                                        <li class="todo-item">
                                            <div class="checkbox checkbox-default">
                                                <input type="checkbox" id="checkbox01">
                                                <label for="checkbox01">Record The First Episode</label>
                                            </div>
                                        </li>
                                        <li>
                                            <hr class="light-grey-hr">
                                        </li>
                                        <li class="todo-item">
                                            <div class="checkbox checkbox-pink">
                                                <input type="checkbox" id="checkbox02">
                                                <label for="checkbox02">Prepare The Conference Schedule</label>
                                            </div>
                                        </li>
                                        <li>
                                            <hr class="light-grey-hr">
                                        </li>
                                        <li class="todo-item">
                                            <div class="checkbox checkbox-warning">
                                                <input type="checkbox" id="checkbox03" checked="">
                                                <label for="checkbox03">Decide The Live Discussion Time</label>
                                            </div>
                                        </li>
                                        <li>
                                            <hr class="light-grey-hr">
                                        </li>
                                        <li class="todo-item">
                                            <div class="checkbox checkbox-success">
                                                <input type="checkbox" id="checkbox04" checked="">
                                                <label for="checkbox04">Prepare For The Next Project</label>
                                            </div>
                                        </li>
                                        <li>
                                            <hr class="light-grey-hr">
                                        </li>
                                        <li class="todo-item">
                                            <div class="checkbox checkbox-danger">
                                                <input type="checkbox" id="checkbox05" checked="">
                                                <label for="checkbox05">Finish Up AngularJs Tutorial</label>
                                            </div>
                                        </li>
                                        <li>
                                            <hr class="light-grey-hr">
                                        </li>
                                        <li class="todo-item">
                                            <div class="checkbox checkbox-purple">
                                                <input type="checkbox" id="checkbox06" checked="">
                                                <label for="checkbox06">Finish Infinity Project</label>
                                            </div>
                                        </li>
                                        <li>
                                            <hr class="light-grey-hr">
                                        </li>
                                    </ul><div class="slimScrollBar" style="background: rgb(135, 135, 135); width: 4px; position: absolute; top: 0px; opacity: 0.4; display: block; border-radius: 0px; z-index: 99; right: 1px;"></div><div class="slimScrollRail" style="width: 4px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(51, 51, 51); opacity: 0.2; z-index: 90; right: 1px;"></div></div>
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
    <%--设备异常添加--%>
    <div class="page-wrapper" style="min-height: 1218px;">
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-12">
                    <div class="panel panel-default card-view">
                        <div class="panel-wrapper collapse in">
                            <div class="panel-body">

                                <div class="form-wrap">

                                    <form action="/addequipmentreport.do" method="post">
                                        <!--/row-->
                                        <h6 class="txt-dark capitalize-font"><i class="zmdi zmdi-calendar-note mr-10"></i><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">添加异常报告</font></font></h6>
                                        <hr class="light-grey-hr">
                                        <div class="row">
                                            <div class="col-md-6">
                                                <div class="form-group">
                                                    <div class="col-sm-5" style="margin-top: 10px;margin-right:-230px">
                                                        <input type="hidden"name="equipment.equipmentId" value="${et.equipmentId}"/>
                                                        &nbsp;设&nbsp;备&nbsp;名&nbsp;称:
                                                    </div>
                                                    <div class="col-sm-7">
                                                        <input type="text" style="width:400px;height: 40px" readonly="readonly" class="form-control"value="${et.equipmentName}">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="form-group">
                                                    <div class="col-sm-5" style="margin-top: 10px;margin-right:-230px">
                                                        <input type="hidden"name="equipmentId" value="${et.equipmentId}"/>
                                                     所&nbsp;属&nbsp;工&nbsp;序:
                                                    </div>
                                                        <div class="col-sm-7">
                                                            <input type="text" style="width: 400px;height: 40px" readonly="readonly" class="form-control"value="${et.working.workingName}">
                                                        </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">&nbsp;</div>
                                        <div class="row">
                                            <div class="col-md-6">
                                            <div class="form-group">
                                                <div class="col-sm-5" style="margin-top: 10px;margin-right:-230px">
                                                    所属负责人:
                                                </div>
                                                <div class="col-sm-7">
                                                    <input type="text" style="width: 400px;height: 40px" readonly="readonly" class="form-control"value="${et.user.userName}">
                                                </div>
                                            </div>
                                            </div>
                                            <div class="col-md-6" >
                                                <div class="form-group">
                                                    <div class="col-sm-5" style="margin-top: 10px;margin-right:-230px">
                                                        所属生产线:
                                                    </div>
                                                    <div class="col-sm-7">
                                                        <input type="text" style="width: 400px;height: 40px" readonly="readonly" class="form-control"value="${et.productionLine.productionLineNo}">
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">&nbsp;</div>
                                        <div class="row">

                                            <div class="col-sm-6">
                                                <div class="form-group">
                                                    <div class="col-sm-5" style="margin-top: 10px;margin-right:-230px">
                                                        设备状态:
                                                    </div>
                                                    <div class="col-sm-7">
                                                        <input type="text" style="width: 400px;height: 40px" readonly="readonly" class="form-control" value="${et.equipmentType.equipmentTypeName}">
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="col-sm-6">
                                                <div class="form-group">
                                                    <div class="col-sm-5" style="margin-top: 10px;margin-right:-230px">
                                                        登&nbsp;&nbsp;&nbsp;&nbsp;记&nbsp;&nbsp;&nbsp;&nbsp;人:
                                                    </div>
                                                    <div class="col-sm-7">
                                                        <input type="hidden" name="user.userId" value="${sessionScope.u.userId}"/>
                                                        <input type="text" style="width: 400px;height: 40px" readonly="readonly" id="user.userId" value="${sessionScope.u.userName}" class="form-control" >
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">&nbsp;</div>
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <div class="form-group" >
                                                    <div class="col-sm-5" style="margin-top: 10px;margin-right:-230px">
                                                        停用原因:
                                                    </div>
                                                    <div class="col-sm-7">
                                                    <input type="text" style="width: 400px;height: 40px" id="equipmentReportReason" name="equipmentReportReason" class="form-control">
                                                </div>
                                            </div>
                                            </div>
                                            <div class="col-sm-6">
                                                <div class="form-group" >
                                                    <div class="col-sm-5" style="margin-top: 10px;margin-right:-230px">
                                                        维修计划:
                                                    </div>
                                                    <div class="col-sm-7">
                                                    <input type="text" style="width: 400px;height: 40px" id="maintenancePlan" name="maintenancePlan" class="form-control">
                                                </div>
                                            </div>
                                            </div>
                                        </div>
                                        <div class="row">&nbsp;</div>
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <div class="form-group" >
                                                    <div class="col-sm-5" style="margin-top: 10px;margin-right:-230px">
                                                        预计时间（分）:
                                                    </div>
                                                    <div class="col-sm-7">
                                                        <div class="input-group date" style="width: 400px;height: 40px">
                                                            <div class='input-group date' id='datetimepicker1s'>
                                                                <input id="dates" type='text' class="form-control"
                                                                       name="date" placeholder="时间" />
                                                                <span class="input-group-addon"><span class="fa fa-calendar"></span></span>
                                                            </div>

                                                        </div>

                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-actions">

                                            <input id="save" type="submit"  class="btn btn-success btn-icon left-icon mr-10 pull-left"  value="保存"/>
                                        </div>
                                    </form>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <!-- Footer -->
        <footer class="footer container-fluid pl-30 pr-30">
            <div class="row">
                <div class="col-sm-12">
                    <p><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">2017©瑞科。</font><font style="vertical-align: inherit;">由于工作而受到尊重</font></font></p>
                </div>
            </div>
        </footer>
        <!-- /Footer -->
    </div>
    <!-- /Main Content -->
</div>
<!-- jQuery -->
<script src="../../../vendors/bower_components/jquery/dist/jquery.min.js"></script>
<script type="text/javascript">
    $(function () {
        //获取当前日期给date控件赋值
        GetNowDate();

        $("#save").click(function () {
            var e=$("#equipmentReportReason").val()
            var m=$("#maintenancePlan").val()
            var no="不能为空";
            if(e==null || e==""){
                $("#equipmentReportReason").attr("placeholder",no).css({color:"green",border:"solid 1px red","font-size":"16px"});
                return false;
            }
            if(m==null || m==""){
                $("#maintenancePlan").attr("placeholder",no).css({color:"green",border:"solid 1px red","font-size":"16px"});
                return false;
            }
        })
    })

    //判断当前选择时间是否小于是当前实际时间
    function contrastTime(dates) {
        var evalue = document.getElementById(dates).value;
        var dB = new Date(evalue.replace(/-/g, "/"));//获取当前选择日期
        var d = new Date();
        var str = d.getFullYear()+"-"+(d.getMonth()+1)+"-"+d.getDate();//获取当前实际日期
        if (Date.parse(str) > Date.parse(dB)) {//时间戳对比
            return 1;
        }
        return 0;
    }
    //作业开始时间失去焦点验证
    $('#dates').blur(function(){
        var ret = contrastTime("dates");//获取返回值
        if(ret == 1){
            alert("作业开始时间不能小于当前实际时间。");
            $(this).val('').focus();
            return;
        }
    });
    //获取当前日期给date控件赋值
    function GetNowDate() {
        var date = new Date();
        var seperator1 = "-";
        var year = date.getFullYear();
        var month = date.getMonth() + 1;
        var strDate = date.getDate()+1;
        if (month >= 1 && month <= 9) {
            month = "0" + month;
        }
        if (strDate >= 0 && strDate <= 9) {
            strDate = "0" + strDate;
    }
        var currentdate = year + seperator1 + month + seperator1 + strDate;
        $("#dates").val(currentdate);
    }
</script>

<!-- Bootstrap Core JavaScript -->
<script src="../../../vendors/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

<!-- Slimscroll JavaScript -->
<script src="../../../dist/js/jquery.slimscroll.js"></script>

<!-- Fancy Dropdown JS -->
<script src="../../../dist/js/dropdown-bootstrap-extended.js"></script>

<!-- Owl JavaScript -->
<script src="../../../vendors/bower_components/owl.carousel/dist/owl.carousel.min.js"></script>

<!-- Switchery JavaScript -->
<script src="../../../vendors/bower_components/switchery/dist/switchery.min.js"></script>

<!-- Init JavaScript -->
<script src="../../../dist/js/init.js"></script><div id="goog-gt-tt" class="skiptranslate" dir="ltr"><div style="padding: 8px;"><div><div class="logo"><img src="https://www.gstatic.com/images/branding/product/1x/translate_24dp.png" width="20" height="20" alt="Google 翻译"></div></div></div><div class="top" style="padding: 8px; float: left; width: 100%;"><h1 class="title gray">原文</h1></div><div class="middle" style="padding: 8px;"><div class="original-text"></div></div><div class="bottom" style="padding: 8px;"><div class="activity-links"><span class="activity-link">提供更好的翻译建议</span><span class="activity-link"></span></div><div class="started-activity-container"><hr style="color: #CCC; background-color: #CCC; height: 1px; border: none;"><div class="activity-root"></div></div></div><div class="status-message" style="display: none;"></div></div>


<!-- Bootstrap Colorpicker JavaScript -->
<script src="../../../vendors/bower_components/mjolnic-bootstrap-colorpicker/dist/js/bootstrap-colorpicker.min.js"></script>

<!-- Bootstrap Daterangepicker JavaScript -->
<script src="../../../vendors/bower_components/bootstrap-daterangepicker/daterangepicker.js"></script>

<!-- Init JavaScript -->
<script src="../../../dist/js/init.js"></script>

<!-- Form Picker Init JavaScript -->
<script src="../../../dist/js/form-picker-data.js"></script>

<%--date--%>
<!-- Moment JavaScript -->
<script type="text/javascript" src="../../../vendors/bower_components/moment/min/moment-with-locales.min.js"></script>
<!-- Bootstrap Colorpicker JavaScript -->
<script src="../../../vendors/bower_components/mjolnic-bootstrap-colorpicker/dist/js/bootstrap-colorpicker.min.js"></script>
<!-- Bootstrap Datetimepicker JavaScript -->
<script type="text/javascript" src="../../../vendors/bower_components/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"></script>

<!-- Form Picker Init JavaScript -->
<script src="../../../dist/js/form-picker-data.js"></script>

<div class="goog-te-spinner-pos">
    <div class="goog-te-spinner-animation">
        <svg xmlns="http://www.w3.org/2000/svg" class="goog-te-spinner" width="96px" height="96px" viewBox="0 0 66 66">
            <circle class="goog-te-spinner-path" fill="none" stroke-width="6" stroke-linecap="round" cx="33" cy="33" r="30">
            </circle>
        </svg>
    </div>
</div>
</body></html>