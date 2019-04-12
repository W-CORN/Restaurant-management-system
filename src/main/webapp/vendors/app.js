var appModule = (function () {





    function pagination(url, param) {
        $.ajax({
            url: url,
            method: "get",
            data: param,
            success: function (data) {
            }, error: function () {
            }
        });
    }

    function post(url, param, success, error, type) {
        $.ajax({
            url: url,
            method: "post",
            data: param,
            dataType: type || "json",
            success: function (data) {
                if (null != success) {
                    success(data);
                }
            }, error: function (data) {
                alert("error");
            }
        });
    }

    function open(url, param, container) {
        $.ajax({
            url: url,
            method: "post",
            data: param,
            dataType: "html",
            success: function (html) {
                $("#" + container).empty().append(html);
            }, error: function () {
                alert("error");
            }
        });
    }
    


    function alert(message) {
        swal({
            title: message,
            confirmButtonColor: "#2879ff",
        });
        return false;
    }

    return {
        post: post,
        open: open,
        alert: alert,
        pagination:pagination

    }
})();