<%-- 
    Document   : index
    Created on : 14 Nov, 2017, 2:44:30 PM
    Author     : mca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Complex Number</title>
    </head>
    <body>
    <center><h1>Complex Number Manipulation</h1>
        <s:form method="POST" action="operation">
            
            <s:textfield name="r1" label="Enter the Real part of Complex No1"></s:textfield><br><br>
            <s:textfield name="i1" label="Enter the Imaginary part of Complex No1"></s:textfield><br><br>
            <s:textfield name="r2" label="Enter the Real part of Complex No2"></s:textfield><br><br>
            <s:textfield name="i2" label="Enter the Imaginary part of Complex No2"></s:textfield><br><br>
            <s:radio label="select any one of the Operation" name="operation" list="{'Addition','Subtraction','Multiplication','Conjucate'}"/><br><br>
            <s:submit value="calculate"></s:submit>
        </s:form>
    </center>   
    </body>
</html>
