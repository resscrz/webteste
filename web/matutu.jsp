<%-- 
    Document   : matutu
    Created on : 11/10/2021, 18:51:19
    Author     : Maria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>outra pagina</title>
    </head>
    <body>
        <h1>vai cariu</h1>
        <form>
            Tranqueira 1
            <input type="text" size="10" value="<%=request.getAttribute("mimi1")%>"><br>
            Tranqueira 2
            <input type="text" size="10" value="<%=request.getAttribute("mimi2")%>"><br>
            Tranqueira 3
            <input type="text" size="10" value="<%=request.getAttribute("mimi3")%>"><br>
            Tranqueira 4
            <input type="text" size="10" value="<%=request.getAttribute("mimi4")%>"><br>
            <input type="button" value="voltar" onclick="history.back()">           
        </form>
    </body>
</html>
