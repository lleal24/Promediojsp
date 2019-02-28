<%@page import="java.net.URL"%>
<% 
   //Captura de la informacion
    String numero1 = request.getParameter("num1");
    String numero2 = request.getParameter("num2");
    String numero3 = request.getParameter("num3");
    
    //Convertir String en integer
    double num1 =0;
    double num2=0;
    double num3=0;
    double promedio=0;
    try{
    num1=Double.parseDouble(numero1);
    num2=Double.parseDouble(numero2);
    num3=Double.parseDouble(numero3);
    promedio = (num1+num2+num3)/3;
    
        
    }catch(Exception e){
        out.print("FAIL");
    
}
    

%>


<%= promedio %>





<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculo de promedio</title>
    </head>
    <body>
        <h1>Calcular Promedio</h1>
        <!--Formulario-->
        <form method="POST" action="">
            <p>Ingrese primer numero: <input type="text" name="num1"/></p>
            <p>Ingrese segundo numero: <input type="text" name="num2"/></p>
            <p>Ingrese tercer numero: <input type="text" name="num3"/></p>
            <p><input type="submit" name="" value="Calcular promedio"/></p>
            <p><%=promedio%></p>               
        </form>
      
        
        
    </body>
</html>
