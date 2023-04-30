<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
    <%@include file="head.jsp"%>
</head>
<body>
    <%@include file="navbar.jsp"%>
    <div class="container mt-3" style="width: 70%">
        <div class="border border-secondary p-3">
            <form action="/login" method="post">
                <div class="row">
                    <div class="col-3">
                        <legend><h2>Login Page</h2></legend>
                    </div>
                    <hr>
                </div>
                <div class="row">
                    <div class="col-3">
                        <label>Email:</label>
                    </div>
                    <div class="col-8">
                        <input type="text" class="form-control" name="email">
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-3">
                        <label>Password:</label>
                    </div>
                    <div class="col-8">
                        <input type="password" class="form-control" name="password">
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-12">
                        <button class="btn btn-success">Login</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</body>
</html>
