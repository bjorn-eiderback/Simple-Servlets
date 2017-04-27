<%--
  accessa via http://localhost:8080/trivial-servlets-1.0-SNAPSHOT/enkeltFormular.jsp
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Yielding and Setting Values</title>
    </head>
    <body>
    <jsp:useBean id="fieldValuesBean" scope="page" class="beans.FieldvaluesBean"/>
    <jsp:setProperty name="fieldValuesBean" property="*"/>
    <form method="post">
        Ge värden:
        <br/>
        Värde 1:
        <input id="fieldValue1" name="fieldValue1" type="text" size="25"/>
        <br/>
        Värde 2:
        <input id="fieldValue2" name="fieldValue2" type="text" size="25"/>
        <br/>
        Aktuella värden:<br/>
        <jsp:getProperty name="fieldValuesBean" property="fieldValue1"/>
        <br/>
        <jsp:getProperty name="fieldValuesBean" property="fieldValue2"/>
        <br/>
        <c:if test="${fieldValuesBean.valuesAssigned}" >
            Kombo:
            <jsp:getProperty name="fieldValuesBean" property="kombo"/>
            <br/>
        </c:if>
        <input type="submit" value="Skicka">
    </form>
    </body>
</html>
