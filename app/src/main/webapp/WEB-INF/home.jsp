<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Home</title>
    </head>
    <body>
        <form action="/insert">
            <input type="text" name="texto" />
            <button type="submit">Salvar</button>
        </form>
        <h1>Tarefas</h1>
        <c:forEach var="t" items="${tarefas}">
            ${t.descricao} <br />
        </c:forEach>
    </body>
</html>

