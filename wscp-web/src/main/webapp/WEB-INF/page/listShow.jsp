<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>水利管理系统</title>
    <% pageContext.setAttribute("APP_PATH", request.getContextPath()); %>
    <script type="text/javascript" src="${APP_PATH }/static/js/jquery-3.2.1.min.js"></script>
    <link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>

<!-- 搭建显示页面 -->
<div class="container">
    <!-- 标题 -->
    <div class="row">
        <div class="col-md-12" align="center">
            <h1>甘肃省水利管理系统</h1>
        </div>
    </div>
    <!-- 显示表格数据 -->
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover">
                <tr>
                <tr>
                    <th>${user.id} </th>
                    <th>${user.userName} </th>
                    <th>${user.passWord} </th>
                    <th>${user.email} </th>
                    <th>${user.role} </th>
                </tr>
            </table>
        </div>
    </div>
</div>
</body>
</html>