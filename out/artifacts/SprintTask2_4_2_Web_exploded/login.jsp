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
                    <div class="col-12">
                        <div id="liveAlertPlaceholder"></div>
                    </div>
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
                        <button type="button" class="btn btn-primary" id="liveAlertBtn">Show live alert</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <script><script type="text/javascript" src="/js/*"></script></script>
    <script>
        const alertPlaceholder = document.getElementById('liveAlertPlaceholder')
        const appendAlert = (message, type) => {
            const wrapper = document.createElement('div')
            wrapper.innerHTML = [
                `<div class="alert alert-${type} alert-dismissible" role="alert">`,
                `   <div>${message}</div>`,
                '   <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>',
                '</div>'
            ].join('')

            alertPlaceholder.append(wrapper)
        }

        const alertTrigger = document.getElementById('liveAlertBtn')
        if (alertTrigger) {
            alertTrigger.addEventListener('click', () => {
                appendAlert('Nice, you triggered this alert message!', 'success')
            })
        }
    </script>
</body>
</html>
