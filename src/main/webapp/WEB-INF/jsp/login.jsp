<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/24
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>登陆</title>
    <meta name="description" content="Hound is a Dashboard & Admin Site Responsive Template by hencework." />
    <meta name="keywords" content="admin, admin dashboard, admin template, cms, crm, Hound Admin, Houndadmin, premium admin templates, responsive admin, sass, panel, software, ui, visualization, web app, application" />
    <meta name="author" content="hencework"/>

    <!-- Favicon -->
    <link rel="shortcut icon" href="../../favicon.ico">
    <link rel="icon" href="../../favicon.ico" type="image/x-icon">

    <!-- vector map CSS -->
    <link href="../../vendors/bower_components/jasny-bootstrap/dist/css/jasny-bootstrap.min.css" rel="stylesheet" type="text/css"/>
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

<div class="wrapper pa-0">
    <header class="sp-header">
        <div class="sp-logo-wrap pull-left">
            <a href="index.jsp">
                <img class="brand-img mr-10" src="../../dist/img/logo.png" alt="brand"/>
                <span class="brand-text">Hound</span>
            </a>
        </div>
        <div class="form-group mb-0 pull-right">
            <span class="inline-block pr-10">Don't have an account?</span>
            <a class="inline-block btn btn-info btn-rounded btn-outline" href="#">Sign Up</a>
        </div>
        <div class="clearfix"></div>
    </header>

    <!-- Main Content -->
    <div class="page-wrapper pa-0 ma-0 auth-page">
        <div class="container-fluid">
            <!-- Row -->
            <div class="table-struct full-width full-height">
                <div class="table-cell vertical-align-middle auth-form-wrap">
                    <div class="auth-form  ml-auto mr-auto no-float">
                        <div class="row">
                            <div class="col-sm-12 col-xs-12">
                                <div class="mb-30">
                                    <h3 class="text-center txt-dark mb-10">Sign in to Hound</h3>
                                    <h6 class="text-center nonecase-font txt-grey">Enter your details below</h6>
                                </div>
                                <div class="form-wrap">
                                    <form action="${pageContext.request.contextPath}/signin.do">
                                        <div class="form-group">
                                            <label class="control-label mb-10" for="exampleInputEmail_2">用户名</label>
                                            <input type="text" name="userName" class="form-control"  id="exampleInputEmail_2">
                                        </div>
                                        <div class="form-group">
                                            <label class="pull-left control-label mb-10" for="exampleInputpwd_2">密码</label>
                                            <a class="capitalize-font txt-primary block mb-10 pull-right font-12" href="#">忘记密码 ?</a>
                                            <div class="clearfix"></div>
                                            <input type="password" name="password" class="form-control"  id="exampleInputpwd_2">
                                        </div>

                                        <div class="form-group">
                                            <div class="checkbox checkbox-primary pr-10 pull-left">
                                                <input id="checkbox_2" type="checkbox" value="1" name="flag">
                                                <label for="checkbox_2">15天内自动登陆</label>
                                            </div>
                                            <div class="clearfix"></div>
                                        </div>
                                        <div class="form-group text-center">
                                            <button type="submit" class="btn btn-info btn-rounded">登陆</button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /Row -->
        </div>

    </div>
    <!-- /Main Content -->

</div>
<!-- /#wrapper -->

<!-- JavaScript -->

<!-- jQuery -->
<script src="../../vendors/bower_components/jquery/dist/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="../../vendors/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="../../vendors/bower_components/jasny-bootstrap/dist/js/jasny-bootstrap.min.js"></script>

<!-- Slimscroll JavaScript -->
<script src="../../dist/js/jquery.slimscroll.js"></script>
<script src="../../vendors/bower_components/sweetalert/dist/sweetalert.min.js"></script>
<!-- Init JavaScript -->
<script src="../../dist/js/init.js"></script>
<script>
    var ms=${param.ms};
    if(ms==1){
        swal({
            title: "请您先登陆系统！",
            confirmButtonColor: "#2879ff",
        });
    }else if(ms==2){
        swal({
            title: "抱歉您无权访问此功能！",
            confirmButtonColor: "#2879ff",
        });
    }

</script>
</body>
</html>

