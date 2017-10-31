<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib tagdir="/WEB-INF/tags/" prefix="events" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<events:template>
    <jsp:body>
        <fieldset>
            <legend>
                <h2 class="text-center">Formulário</h2>
            </legend>
            <c:url value="/events" var="url"/>
            <form action="${url}" method="post">
                <div class="form-group">
                    <label for="nome">Nome :</label>
                    <input id="nome" name="title" class="form-control">
                </div>

                <div class="form-group">
                    <label for="Descrição">Descrição :</label>
                    <textarea id="Descrição" class="form-control"
                              name="description"></textarea>
                </div>


                <div class="form-group">
                    <label for="endereco">Endereco :</label>
                    <input id="endereco" class="form-control"
                           name="address">
                </div>

                <div class="form-group">
                    <label for="data">Data :</label>
                    <input id="data" type="datetime-local" class="form-control" name="date">

                </div>


                <div class="form-group">
                    <label for="foto">Foto :</label>
                    <input id="foto" name="poster" class="form-control">
                </div>

                <input type="submit" value="Salvar" class="btn btn-primary">
            </form>

        </fieldset>
    </jsp:body>
</events:template>
