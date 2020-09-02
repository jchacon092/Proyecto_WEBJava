<%@taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de categorias!</h1>
        <ul>
            <c:forEach items="${listado}" var="list">
                <li>
                    <c:out value="${list.getNombre()}"/>
                </li>
            </c:forEach>
        </ul>

    </body>
</html>
