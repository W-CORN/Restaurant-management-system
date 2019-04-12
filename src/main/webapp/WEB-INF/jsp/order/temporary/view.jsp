<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="row">
    <div class="col-md-12">
        <div class="panel panel-default card-view">
            <div class="panel-heading">
                <div class="pull-left">
                    <h6 class="panel-title txt-dark">临时订单</h6>
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
                                            <!--订单-->
                                            <div class="col-md-4">
                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">订单号:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static">${temporaryOrder.temporaryOrderNo}</p>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">交付时间:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static"><fmt:formatDate value="${temporaryOrder.temporaryOrderEndDate}" pattern="yyyy-MM-dd"/></p>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">是否交付:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static">${temporaryOrder.temporaryOrderState.temporaryOrderStateName}</p>
                                                        </div>
                                                    </div>
                                                </div>

                                                <!--/span-->
                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">下单时间:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static"><fmt:formatDate value="${temporaryOrder.temporaryOrderStartDate}" pattern="yyyy-MM-dd"/></p>
                                                        </div>
                                                    </div>
                                                </div>
                                                <!--/span-->
                                            </div>


                                            <!--订单-->
                                            <div class="col-md-3">
                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">备注:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static">${temporaryOrder.temporaryOrderRemarks}</p>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">确认人:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static">${temporaryOrder.user.userName}</p>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>


                                            <!--临时订单-->
                                            <div class="col-md-5">

                                                <!--/span-->
                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">用户/门店编号:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static">${temporaryOrder.store.storeNo}</p>
                                                        </div>
                                                    </div>
                                                </div>
                                                <!--/span-->

                                                <!--/span-->
                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">用户/门店名称:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static">${temporaryOrder.store.storeName}</p>
                                                        </div>
                                                    </div>
                                                </div>
                                                <!--/span-->

                                                <!--/span-->
                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">电话:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static">${temporaryOrder.store.storePhone}</p>
                                                        </div>
                                                    </div>
                                                </div>

                                                <!--/span-->
                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">地址:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static">${temporaryOrder.store.storeAddress}</p>
                                                        </div>
                                                    </div>
                                                </div>
                                                <!--/span-->
                                            </div>

                                        </div>

                                        <hr class="light-grey-hr"/>
                                        <c:forEach var="temporaryOrderTerm" items="${temporaryOrder.temporaryOrderTerms}">
                                        <div class="row">
                                            <!--订单项-->
                                            <div class="col-md-4">
                                                <div class="form-group">

                                                    <label class="control-label col-md-4">名称:</label>
                                                    <div class="col-md-8">
                                                        <p class="form-control-static">${temporaryOrderTerm.menu.menuName}</p>
                                                    </div>

                                                </div>
                                            </div>

                                            <div class="col-md-4">
                                                <div class="form-group">
                                                    <label class="control-label col-md-3">菜品数量:</label>
                                                    <div class="col-md-9">
                                                        <p class="form-control-static">${temporaryOrderTerm.menuNumber}</p>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="col-md-4">
                                                <div class="form-group">
                                                    <label class="control-label col-md-3">完成数量:</label>
                                                    <div class="col-md-9">
                                                        <p class="form-control-static">${temporaryOrderTerm.completeNumber}</p>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="col-md-4">
                                                <div class="form-group">
                                                    <label class="control-label col-md-3">完成状态:</label>
                                                    <div class="col-md-9">
                                                        <p class="form-control-static">
                                                            <c:forEach var="temporaryOrderState" items="${temporaryOrderStateList}">
                                                                <c:if test="${temporaryOrderTerm.temporaryOrderTermState==temporaryOrderState.temporaryOrderStateId}">
                                                                    ${temporaryOrderState.temporaryOrderStateName}
                                                                </c:if>
                                                            </c:forEach>

                                                        </p>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="col-md-4">
                                                <div class="form-group">
                                                    <label class="control-label col-md-3">产品批次:</label>
                                                    <div class="col-md-9">
                                                        <p class="form-control-static">${temporaryOrderTerm.productBatch}</p>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        </c:forEach>


                                    </div>

                                    <div class="form-actions mt-10">
                                        <div class="row">
                                            <div class="col-md-10"></div>
                                            <div class="col-md-2">
                                                <div class="row">
                                                    <div class="col-md-offset-3 col-md-9">
                                                        <button type="button"
                                                                class="btn btn-default"
                                                                data-dismiss="modal">取消
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
