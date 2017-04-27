<%--
  accessa via http://localhost:8080/trivial-servlets-1.0-SNAPSHOT/aktuellTidInbaddad.jsp
--%>
<%@page import="java.time.LocalDateTime"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%! LocalDateTime aktuellTid = LocalDateTime.now(); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Embedding Java in a JSP</title>
    </head>
    <body>
        <h1>Hallå inbäddade tid!</h1>
        Aktuell tidpunkt är: <%= aktuellTid %>
    </body>
</html>
