<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Row -->
<div class="row">
    <div class="col-md-12">
        <div class="panel panel-default card-view">
            <div class="panel-heading">
                <div class="pull-left">
                    <h6 class="panel-title txt-dark">门店信息</h6>
                </div>
                <div class="clearfix"></div>
            </div>
            <div class="panel-wrapper collapse in">
                <div class="panel-body">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-wrap">
                                <form class="form-horizontal" role="form">
                                    <div class="form-body">
                                        <hr class="light-grey-hr"/>
                                        <div class="row">
                                            <!--门店-->
                                            <div class="col-md-6">
                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">用户/门店名称:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static">${store.storeName}</p>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">门店/用户类别:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static">
                                                                <c:choose>
                                                                    <c:when test="${store.storeType==1}">
                                                                        合同用户
                                                                    </c:when>
                                                                    <c:when test="${store.storeType==2}">
                                                                        散户
                                                                    </c:when>
                                                                </c:choose>
                                                            </p>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">地址:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static">${store.storeAddress}</p>
                                                        </div>
                                                    </div>
                                                </div>

                                                <!--/span-->
                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">电话:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static">${store.storePhone}</p>
                                                        </div>
                                                    </div>
                                                </div>
                                                <!--/span-->
                                            </div>
                                            <div class="col-md-6">


                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">下单项数量:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static">${store.storeOrderNumber}</p>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">门店编号:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static">${store.storeNo}</p>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">状态:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static">${store.status}</p>
                                                        </div>
                                                    </div>
                                                </div>
                                                
                                            </div>
                                        </div>

                                    </div>

                                    <div class="form-actions mt-10">
                                        <div class="row">
                                            <div class="col-md-10"></div>
                                            <div class="col-md-2">
                                                <div class="row">
                                                    <div class="col-md-offset-3 col-md-9">
                                                        <button type="button"
                                                                class="btn btn-default"
                                                                data-dismiss="modal">关闭
                                                        </button>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- /Row -->