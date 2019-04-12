<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="modal-dialog" role="document">
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                    aria-hidden="true">&times;</span></button>
            <h5 class="modal-title" id="exampleModalLabel1">门店</h5>
        </div>
        <div class="modal-body">
            <form id="updateStore">
                <div class="form-group">
                    <label class="control-label mb-10">用户/门店名称:</label>
                    <input type="text" class="form-control" name="storeName" value="${store.storeName}">
                </div>
                <input type="hidden" value="${store.storeId}" name="storeId">
                <div class="form-group">
                    <label class="control-label mb-10">门店/用户类别:</label>
                    <select class="form-control" name="storeType">
                        <option value="">请选择</option>
                        <option value="1"
                        <c:if test="${store.storeType==1}">
                            selected
                        </c:if>
                          >合同用户</option>
                        <option value="2"
                        <c:if test="${store.storeType==2}">
                            selected
                        </c:if>
                        >散户</option>
                    </select>
                </div>

                <div class="form-group">
                    <label class="control-label mb-10">电话:</label>
                    <input type="text" class="form-control" name="storePhone"  maxlength="11" minlength="11" value="${store.storePhone}">
                </div>

                <div class="form-group">
                    <label class="control-label mb-10">地址</label>
                    <textarea class="form-control" name="storeAddress">${store.storeAddress}</textarea>
                </div>


            </form>
        </div>
        <div class="modal-footer">
            <button type="button" id="storeEditmodal" class="btn btn-default" data-dismiss="modal">取消</button>
            <button type="button" class="btn btn-primary"  onclick="edit()">保存</button>
        </div>
    </div>
</div>
<script>

    $(function () {
        uppStrotValidate();
    })

    function upp() {
        var tbobj=document.getElementById("example");
        tbobj.rows[$("#index").val()].cells[0].innerText=$("#updateStore input[name='storeName']").val();
        tbobj.rows[$("#index").val()].cells[1].innerText=$("#updateStore select[name='storeType'] option:selected").text();
        tbobj.rows[$("#index").val()].cells[2].innerText=$("#updateStore textarea[name='storeAddress']").val();
        tbobj.rows[$("#index").val()].cells[3].innerText=$("#updateStore input[name='storePhone']").val();
    }


    function edit() {

        var flag = $("#updateStore").valid();
        if(!flag){
            //没有通过验证
            return;
        }

        var addStore = $("#updateStore").serializeArray();
        appModule.post('/store/edit.do',addStore,function (data) {
            $("#storeEditmodal").click();
            upp();
            appModule.alert("修改成功");
        },function () {
            appModule.alert("修改失败")
        });
    };


    function uppStrotValidate() {

        $("#updateStore").validate({
            rules: {
                storeName: "required",
                storeType:"required",
                "storePhone":{
                    required : true,
                    minlength : 11,
                },
                "storeAddress":"required",
            },
            messages: {
                storeName: {
                    required:"请输入名称",
                },
                storeType:{
                    required:"请选择类型"
                },
                "storePhone":{
                    required : "请输入手机号",
                    minlength : "确认手机不能小于11个字符",
                },
                "storeAddress":{
                    required:"请输入地址"
                }
            }
        });
    }


</script>

