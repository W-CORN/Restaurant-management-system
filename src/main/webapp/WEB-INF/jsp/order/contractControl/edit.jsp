<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="modal-dialog">
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <h4 class="modal-title">修改合同</h4>
        </div>
        <div class="modal-body">
            <form class="form-horizontal form-material"  id="contractEdit" enctype="multipart/form-data">
                <div class="form-group">
                    <div class="col-md-12 mb-20">
                        <input type="text" class="form-control" placeholder="合同名称" name="orderContractName" value="${orderContract.orderContractName}">
                    </div>
                    <input type="hidden" name="orderContractId" value="${orderContract.orderContractId}" >

                    <div class="col-md-12 mb-20">
                        <div class='input-group date' id='datetimepicker1ss'>
                            <input type='text' class="form-control" placeholder="签订时间" name="orderContractDate" value="<fmt:formatDate value="${orderContract.orderContractDate}" pattern="yyyy-MM-dd"/>"/>
                            <span class="input-group-addon">
                                                    <span class="fa fa-calendar"></span>
                            </span>
                        </div>
                    </div>


                    <div class="col-md-12 mb-20">
                        <select class="form-control" name="store.storeId">
                            <option  value="">请选择用户</option>
                            <c:forEach var="store" items="${storeList}">
                                <option value="${store.storeId}"
                                        <c:if test="${store.storeId==orderContract.store.storeId}">
                                            selected
                                        </c:if>
                                >${store.storeName}</option>
                            </c:forEach>
                        </select>
                    </div>

                    <div class="col-md-12 mb-20">
                        <div class="fileupload btn btn-danger btn-rounded waves-effect waves-light"><span><i class="ion-upload m-r-5"></i>上传合同文件</span>
                            <input type="file" class="upload" name="file">
                        </div>
                    </div>
                </div>

                <div class="modal-footer">
                    <button type="button" class="btn btn-info waves-effect" data-dismiss="modal" onclick="updateContract()">保存</button>
                    <button type="button" id="ordereditModal" class="btn btn-default waves-effect" data-dismiss="modal">取消</button>
                </div>
            </form>
        </div>

    </div>
    <!-- /.modal-content -->
</div>

<script>


    /* Datetimepicker Init*/
    $('#datetimepicker1ss').datetimepicker({
        useCurrent: false,
        format: 'YYYY-MM-DD',
        icons: {
            time: "fa fa-clock-o",
            date: "fa fa-calendar",
            up: "fa fa-arrow-up",
            down: "fa fa-arrow-down"
        },
    }).on('dp.show', function() {
        if($(this).data("DateTimePicker").date() === null)
            $(this).data("DateTimePicker").date(moment());
    });


    function updateContract(){
        var flag = $("#contractEdit").valid();
        if(!flag){
            //没有通过验证
            return;
        }
        var formobj =  document.getElementById("contractEdit");
        var formData=new FormData(formobj);
        $.ajax({
            url: '/order/contract/edit.do',
            type: 'POST',
            cache: false,
            data: formData,
            processData: false,
            contentType: false
        }).done(function(res) {
            upp();
            $("#ordereditModal").click();
            document.getElementById("contractEdit").reset();
            appModule.alert("修改成功");
        }).fail(function(res) {
            appModule.alert("修改失败");
        });
    };


    function upp() {
        var tbobj=document.getElementById("example");
        tbobj.rows[$("#index").val()].cells[1].innerText=$("#contractEdit input[name='orderContractName']").val();
        tbobj.rows[$("#index").val()].cells[2].innerText=$("#contractEdit input[name='orderContractDate']").val();
        tbobj.rows[$("#index").val()].cells[3].innerText=$("#contractEdit select[name='store.storeId'] option:selected").text();
    }
</script>
