<%-- 
    Document   : descrifrar
    Created on : 7/10/2021, 06:37:51 PM
    Author     : PRIDE OTTER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="./codigo.js"></script>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body background="https://fondosmil.com/fondo/4603.jpg">
    
    <div class="container">
    <header></header>
    <div class="titulo"><h1>Descifrar</h1></div>
    <br>
    <br>
    <br>
    <div class="archivo">
       <form name="formulario" method="post" enctype="multipart/form-data" >
            <table>
            <tr>
            <td>Seleccione Archivo</td><td><input type="file" onchange="descifrar(this)" name="archivo" id="hola" /></td>
            </tr>
            <tr>
                <td>Seleccione tamaño de la llave</td><td><select id="tamano"> <option value ="16">16 caracteres</option>
                    <option value ="24">24 caracteres</option><option value ="32">32 caracteres</option></select></td>
            </tr>
            <tr>
                <td>Ingrese la llave</td><td><input type="text" name="llave" id="hola2"/></td>
            </tr>
            <tr>
            <td colspan="2"><input type="submit" value="Descifrar" class="btn" onclick="return validar2()"></td>
            </tr>
            </table>
            <input type="hidden" name="nombre" value="" />
            </form>
    <iframe name="null" style="display: none;"></iframe></div>
    <div class="botones">
    
    <a href="index.jsp">Cifrar</a></div></div>
<div><h2 class="hola3">Maya Caltenco Erick Sebastian y Lopez Sierra Mayra Fernanda</h2></div>
</body>
</html>