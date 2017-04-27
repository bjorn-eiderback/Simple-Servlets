<%--
    accessa via http://localhost:8080/trivial-servlets-1.0-SNAPSHOT/aktuellTid.jsp
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Klocka</title>
    </head>
    <body>
        <jsp:useBean id="datumBean" scope="application" class="beans.DatumBean"/>
        <h1>Hallå datum!</h1>
        <p>
        Aktuell tidpunkt är: ${datumBean.aktuelltDatum}!
        </p>
    </body>
</html>