<%-- 
    Document   : home
    Created on : Nov 30, 2021, 10:23:13 PM
    Author     : emanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@include file="include.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Data Warga</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        <h1>Data Warga</h1>
        <p>
        <table class="table table-striped table-bordered">
            <tr class="thead-dark">
                <th>ID</th>
                <th>Nomor KTP</th>
                <th>Nomor KK</th>
                <th>Nama Kepala Keluarga</th>
                <th>Alamat</th>
                <th>No HP</th>
            </tr>
            <c:forEach items="${listMahasiswa}" var="mhs">
                <tr>
                    <td>${mhs.id}</td>
                    <td>${mhs.nomorktp}</td>
                    <td>${mhs.nomorkk}</td>
                    <td>${mhs.nama}</td>
                    <td>${mhs.alamat}</td>
                    <td>${mhs.no_hp}</td>
                </tr>
            </c:forEach>
        </table>
        </p>
        <p>
            <button class="btn btn-primary" onclick="window.location.href='mahasiswa-form.html'">
                Tambah Data
            </button>
        </p>
    </body>
</html>
