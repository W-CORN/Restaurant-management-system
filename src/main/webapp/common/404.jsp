<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/23
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>404</title>
    <!-- Favicon -->
    <link rel="shortcut icon" href="../favicon.ico">
    <link rel="icon" href="../favicon.ico" type="image/x-icon">

    <!-- vector map CSS -->
    <link href="../vendors/bower_components/jasny-bootstrap/dist/css/jasny-bootstrap.min.css" rel="stylesheet" type="text/css"/>



    <!-- Custom CSS -->
    <link href="../dist/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<!--Preloader-->
<div class="preloader-it">
    <div class="la-anim-1"></div>
</div>
<!--/Preloader-->

<div class="wrapper error-page pa-0">
    <header class="sp-header">
        <div class="sp-logo-wrap pull-left">
            <a href="/WEB-INF/jsp/index.jsp">
                <img class="brand-img mr-10" src="../dist/img/logo.png" alt="brand"/>
                <span class="brand-text">主页</span>
            </a>
        </div>
        <div class="form-group mb-0 pull-right">
            <a class="inline-block btn btn-info btn-rounded btn-outline nonecase-font" href="/WEB-INF/jsp/index.jsp">回到主页</a>
        </div>
        <div class="clearfix"></div>
    </header>

    <!-- Main Content -->
    <div class="page-wrapper pa-0 ma-0 error-bg-img">
        <div class="container-fluid">
            <!-- Row -->
            <div class="table-struct full-width full-height">
                <div class="table-cell vertical-align-middle auth-form-wrap">
                    <div class="auth-form  ml-auto mr-auto no-float">
                        <div class="row">
                            <div class="col-sm-12 col-xs-12">
                                <div class="mb-30">
                                    <span class="block error-head text-center txt-info mb-10">404</span>
                                    <span class="text-center nonecase-font mb-20 block error-comment">找不到网页</span>
                                    <p class="text-center">抱歉您访问的页面不存在,请检查你的URL.</p>
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
<script src="../vendors/bower_components/jquery/dist/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="../vendors/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="../vendors/bower_components/jasny-bootstrap/dist/js/jasny-bootstrap.min.js"></script>

<!-- Slimscroll JavaScript -->
<script src="../dist/js/jquery.slimscroll.js"></script>

<!-- Init JavaScript -->
<script src="../dist/js/init.js"></script>
</body>
</html>