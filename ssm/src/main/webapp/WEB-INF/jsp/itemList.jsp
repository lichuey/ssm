<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品列表页面</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.14/favicon.ico">
    <link rel="canonical" href="https://getbootstrap.com/docs/3.4/examples/dashboard/">
    <link href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.14/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.14/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.14/examples/dashboard/dashboard.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.14/assets/js/ie-emulation-modes-warning.js"></script>
    <script type="text/javascript" src="js/jquery-3.6.0.js"></script>
    <script type="text/javascript" src="js/attr.js"></script>
</head>
<body>
    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">商品管理系统</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">查询商品</a></li>
                    <li><a href="#">添加商品</a></li>
                </ul>
                <form class="navbar-form navbar-right">
                    <input type="text" class="form-control" placeholder="搜索">
                </form>
            </div>
        </div>
    </nav>
    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-3 col-md-2 sidebar">
                <ul class="nav nav-sidebar">
                    <%--<li class="active"><a href="#">Overview <span class="sr-only">(current)</span></a></li>--%>
                    <li id="1" class="active"><a href="#" onclick="attr1()">主页面</a></li>
                    <li id="2"><a href="#" onclick="attr2()" >Reports</a></li>
                    <li id="3"><a href="#" onclick="attr3()" >Reports</a></li>
                    <li id="4"><a href="#" onclick="attr4()" >Reports</a></li>
                </ul>
                <ul class="nav nav-sidebar">
                    <li id="5"><a href="#" onclick="attr5()" >Reports</a></li>
                    <li id="6"><a href="#" onclick="attr6()" >Reports</a></li>
                    <li id="7"><a href="#" onclick="attr7()" >Reports</a></li>
                    <li id="8"><a href="#" onclick="attr8()" >Reports</a></li>
                    <li id="9"><a href="#" onclick="attr9()" >Reports</a></li>
                </ul>
                <ul class="nav nav-sidebar">
                    <li id="10"><a href="#" onclick="attr10()" >Reports</a></li>
                    <li id="11"><a href="#" onclick="attr11()" >Reports</a></li>
                    <li id="12"><a href="#" onclick="attr12()" >Reports</a></li>
                </ul>
            </div>
            <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

                <h2 class="sub-header">商品列表</h2>
                <div class="table-responsive">
                    <table class="table table-striped">
                        <thead>
                        <tr>
                            <th>编号</th>
                            <th>商品名称</th>
                            <th>商品价格</th>
                            <th>商品描述</th>
                            <th>商品图片</th>
                            <th>商店</th>
                        </tr>
                        </thead>
                        <tbody>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.14/assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.14/dist/js/bootstrap.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.14/assets/js/vendor/holder.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.14/assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
