<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.bitlab.sp_task2.db.Items" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Main Page</title>
        <%@include file="head.jsp"%>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
        <div class="container mt-3" style="width: 70%">
            <div class="row">
                <h1 class="text-center">
                    Welcome to BITLAB SHOP
                </h1>
                <p class="text-center">Electronic devices with high quality and service</p>
            </div>
            <div class="container text-center">
                <div class="row mt-2 mb-3">
                    <%
                        ArrayList<Items> items = (ArrayList<Items>) request.getAttribute("items");
                        if(items!=null){
                            for(Items item:items){
                    %>
                    <div class="col mt-3">
                        <div class="card" style="width: 20rem;">
                            <div class="card-header">
                                <%=item.getName()%>
                            </div>
                            <div class="card-body">
                                <h5 class="card-title text-success">$<%=item.getPrice()%></h5>
                                <p class="card-text"><%=item.getDescription()%></p>
                                <a href="#" class="btn btn-success">Buy Now</a>
                            </div>
                        </div>
                    </div>
                    <%
                            }
                        }
                    %>
                </div>
            </div>
        </div>
    </body>
</html>
