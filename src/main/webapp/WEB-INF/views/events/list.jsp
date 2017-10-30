<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib tagdir="/WEB-INF/tags/" prefix="events" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<events:template>
    <jsp:body>

        <table class="table table-hover ">
            <thead>
            <tr>
                <th class="text-center">Nome</th>
                <th class="text-center">Endereço</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${events}" var="event">

                <tr>
                    <td class="text-center">${event.title }
                    </td>
                    <td class="text-center">${event.address }
                    </td>

                </tr>
            </c:forEach>
            </tbody>
        </table>
    </jsp:body>

</events:template>