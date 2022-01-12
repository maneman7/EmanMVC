<%-- 
    Document   : mahasiswa-form
    Created on : Dec 2, 2021, 10:54:42 PM
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
    </head>
    <h2>Tambah Data </h2>
    <body>
        <div class="container">
            <div class="col-md-6">
                
                <form action="mahasiswa-form.html" modelAttribute="mhs" method="POST">
                    <div class="form-group"> 
                        <input type="text" class="form-control" name="nomorktp" placeholder="Nomor KTP" />
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="nomorkk" placeholder="Nomor KK" />
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="nama" placeholder="Nama Kepala Keluarga" />
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="alamat" placeholder="Alamat" />
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="no_hp" placeholder="No HP" />
                    </div>
                    <button type="submit" class="btn btn-primary">Save</button>
                </form>
                
            </div>
            <a href="${pageContext.request.contextPath}/home.html">Kembali</a>
        </div>
    </body>
</html>
