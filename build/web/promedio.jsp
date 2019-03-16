<%@page import="java.math.RoundingMode"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="java.net.URL"%>
<%
    //Captura de la informacion
    String numero1 = request.getParameter("num1");
    String numero2 = request.getParameter("num2");
    String numero3 = request.getParameter("num3");

    //Convertir String en integer
    double num1 = 0;
    double num2 = 0;
    double num3 = 0;
    double promedio = 0;
    String url = "";
    
    
    try {
        num1 = Double.parseDouble(numero1);
        num2 = Double.parseDouble(numero2);
        num3 = Double.parseDouble(numero3);
        promedio = (num1 + num2 + num3) / 3;
        

        if (promedio <= 2.5) {
            url = "Imagenes/rojo.png";
        } else if (promedio > 2.5 && promedio <= 3.5) {
            url = "Imagenes/amarillo.jpg";
        } else if (promedio > 3.5) {
            url = "Imagenes/verde.png";
        }

    } catch (Exception e) {
        out.print("");

    }
    //clase que permite limitar el numero de decimales en una cifra y realizar redondeo.
    BigDecimal promDecimal = new BigDecimal(promedio).setScale(2, RoundingMode.UP);


%>




<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="mystyle.css">
        <title>Calculo de promedio</title>
    </head>
    <body>
        <div class="formulario">
            <h1>Calcular Promedio</h1>
            <!--Formulario-->
            <form method="POST" action="">
                <label>Primer numero</label>
                <input type="text" name="num1" placeholder="ingrese dato" autofocus /></br>
                <label>Segundo numero</label>
                <input type="text" name="num2" placeholder="ingrese dato"/></br>
                <label>Tercer numero</label>
                <input type="text" name="num3" placeholder="ingrese dato"/></br>
                <input type="submit" name="" value="Calcular promedio" class="button"/>
                <p><b>Pomedio:</b> <%=promDecimal.doubleValue()%></p>               
            </form>
        </div>
            <div class="formulario" >
             <img src="<%=url%>" width="200" height="200"/>
        </div>



    </body>
</html>
