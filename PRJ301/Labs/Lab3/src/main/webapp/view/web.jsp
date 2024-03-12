<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html lang="en">

    <head>

        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Multi Level Menu</title>

        <style><%@include file="/css/web.css"%></style>
        <!--<link rel="stylesheet" href="./css/web.css" type="text/css"/>-->

        <!--<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"/>-->

    </head>
    <body>

        <nav>
            <c:out value="${menu}" escapeXml="false"/>
        </nav>

        <div class="container">

            <div class="row">
                <c:forEach items="${listCAT}" var="o">
                    <div class="col">                       

                        <div class="card">
                            <h1>ID = ${o.id}</h1>
                            <h2>Name = ${o.nameCategories}</h2>
                            <h2>Parent ID = ${o.parentId}</h2>

                            <button type="button">
                                <h1>Learn More</h1>
                            </button>

                        </div>
                    </div>
                </c:forEach>
            </div>

            <div class="paging">
                <c:forEach begin="1" end="${endP}" var="i">
                    <a class="${tag == i ? "active": ""}" href="${pageContext.request.contextPath}/?index=${i}">${i}</a>
                </c:forEach>
            </div>

        </div>

        <!--<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>-->
    </body>
</html>