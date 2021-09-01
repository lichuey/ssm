<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品管理系统登陆页面</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.14/favicon.ico">
    <link rel="canonical" href="https://getbootstrap.com/docs/3.4/examples/signin/">
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.14/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.14/examples/signin/signin.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.14/assets/js/ie-emulation-modes-warning.js"></script>
    <script type="text/javascript" src="js/jquery-3.6.0.js"></script>
    <script>
        $(function () {
            $("#save").click(function () {
                if (this.checked) {
                    $("#username").val("${username}");
                    $("#password").val("${password}");
                }
            });
        });
    </script>
</head>
<body>
<div class="container">
    <form class="form-signin" action="login.action" method="get">
        <h2 class="form-signin-heading" align="center">商品管理系统</h2>

        <label for="username" class="sr-only">User</label>
        <input type="text" id="username" name="username" class="form-control" placeholder="用户名" required="" autofocus="">

        <label for="password" class="sr-only">Password</label>
        <input type="password" id="password" name="password" class="form-control" placeholder="密码" required="">

        <div class="checkbox">
            <label>
                <input type="checkbox" id="save" name="save" value="save"> 保存用户名和密码
            </label>
        </div>

        <button class="btn btn-lg btn-primary btn-block" id="login" type="submit">登录</button>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.14/assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
