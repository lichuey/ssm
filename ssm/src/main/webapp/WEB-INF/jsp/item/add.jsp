<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>添加商品页面</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1, maximum-scale=1,user-scalable=no" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css">
    </head>
    <body>
        <h2 align="center">添加商品</h2>
        <div class="container" style="border:1px solid black">

            <form action="addItem.action" role="form" class="form-horizontal" enctype="multipart/form-data" method="post">

                <div class="form-group">
                    <label for="i_name" class="control-label col-sm-2 col-sm-offset-3">商品名称</label>
                    <div class="col-sm-2">
                        <input type="text" class="form-control" id="i_name" name="i_name" placeholder="请输入商品名称">
                    </div>
                </div>

                <div class="form-group">
                    <label for="i_price" class="control-label col-sm-2 col-sm-offset-3">商品价格</label>
                    <div class="col-sm-2">
                        <input type="text" class="form-control" id="i_price" name="i_price" placeholder="请输入商品价格">
                    </div>
                </div>

                <div class="form-group">
                    <label for="i_describe" class="control-label col-sm-2 col-sm-offset-3">商品描述</label>
                    <div class="col-sm-2">
                        <input type="text" class="form-control" id="i_describe" name="i_describe" placeholder="请输入商品描述">
                    </div>
                </div>

                <div class="form-group">
                    <label for="i_picture" class="control-label col-sm-2 col-sm-offset-3">商品图片</label>
                    <div class="col-sm-2">
                        <c:if test="${item.i_picture != null}">
                            <img src="/pic/${item.i_picture}" width="100px" alt="无法显示图片"/>
                        </c:if>
                        <input type="file" class="form-control" id="i_picture" name="picName" placeholder="请输入商品图片">
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2 col-sm-offset-3">商店</label>
                    <div class="col-sm-2">
                        <select class="form-control" name="store.s_id">
                                <option value="">请选择商店</option>
                            <c:forEach items="${storeList}" var="store" varStatus="sta">
                                <option value="${store.s_id}">${store.s_name}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-2 col-sm-offset-5 ">
                        <button type="submit" class="btn btn-success">保存</button>
                    </div>
                </div>

            </form>
        </div>
    </body>
</html>
