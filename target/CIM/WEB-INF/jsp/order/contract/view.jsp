<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- Row -->
<div class="row">
    <div class="col-md-12">
        <div class="panel panel-default card-view">
            <div class="panel-heading">
                <div class="pull-left">
                    <h6 class="panel-title txt-dark">合同订单</h6>
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
                                                            <p class="form-control-static">${contractOrder.contractOrderNo}</p>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">交付时间:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static"><fmt:formatDate value="${contractOrder.contractOrderEndDate}"  pattern="yyyy-MM-dd" /></p>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">是否交付:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static">
                                                            <c:if test="${contractOrder.contractOrderState==0}">
                                                                未交付
                                                            </c:if>
                                                            <c:if test="${contractOrder.contractOrderState==1}">
                                                                已交付
                                                            </c:if>
                                                            </p>
                                                        </div>
                                                    </div>
                                                </div>

                                                <!--/span-->
                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">下单时间:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static"><fmt:formatDate value="${contractOrder.contractOrderStartDate}"  pattern="yyyy-MM-dd" /></p>
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
                                                            <p class="form-control-static">${contractOrder.contractOrderRemarks}</p>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">确认人:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static">${contractOrder.user.userName}</p>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>


                                            <!--订单合同-->
                                            <div class="col-md-5">

                                                <!--/span-->
                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">合同号:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static">${contractOrder.orderContract.orderContractNo}</p>
                                                        </div>
                                                    </div>
                                                </div>
                                                <!--/span-->

                                                <!--/span-->
                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">合同名称:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static">${contractOrder.orderContract.orderContractName}</p>
                                                        </div>
                                                    </div>
                                                </div>
                                                <!--/span-->

                                                <!--/span-->
                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">合同签订时间:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static"><fmt:formatDate value="${contractOrder.orderContract.orderContractDate}" pattern="yyyy-MM-dd"/> </p>
                                                        </div>
                                                    </div>
                                                </div>

                                                <!--/span-->
                                                <div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3">签订人:</label>
                                                        <div class="col-md-9">
                                                            <p class="form-control-static">${contractOrder.orderContract.store.storeName}</p>
                                                        </div>
                                                    </div>
                                                </div>
                                                <!--/span-->
                                            </div>

                                        </div>

                                        <hr class="light-grey-hr"/>
                                        <c:forEach var="contractOrderTerm" items="${contractOrder.contractOrderTerms}">
                                        <div class="row">
                                            <!--订单项-->
                                            <div class="col-md-4">
                                                <div class="form-group">

                                                    <label class="control-label col-md-4">菜品名称:</label>
                                                    <div class="col-md-8">
                                                        <p class="form-control-static">${contractOrderTerm.menu.menuName}</p>
                                                    </div>

                                                </div>
                                            </div>

                                            <div class="col-md-4">
                                                <div class="form-group">
                                                    <label class="control-label col-md-3">菜品数量:</label>
                                                    <div class="col-md-9">
                                                        <p class="form-control-static">${contractOrderTerm.menuNumber}</p>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="col-md-4">
                                                <div class="form-group">
                                                    <label class="control-label col-md-3">完成数量:</label>
                                                    <div class="col-md-9">
                                                        <p class="form-control-static">${contractOrderTerm.completeNumber}</p>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-md-4">
                                                <div class="form-group">
                                                    <label class="control-label col-md-3">完成状态:</label>
                                                    <div class="col-md-9">
                                                        <p class="form-control-static">
                                                            <c:if test="${contractOrderTerm.contractOrderTermState==0}">
                                                                未完成
                                                            </c:if>
                                                            <c:if test="${contractOrderTerm.contractOrderTermState==1}">
                                                                已完成
                                                            </c:if>

                                                        </p>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-md-4">
                                                <div class="form-group">
                                                    <label class="control-label col-md-3">产品批次:</label>
                                                    <div class="col-md-9">
                                                        <p class="form-control-static">${contractOrderTerm.productBatch}</p>
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