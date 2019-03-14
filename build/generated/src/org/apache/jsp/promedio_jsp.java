package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URL;

public final class promedio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
 
   //Captura de la informacion
    String numero1 = request.getParameter("num1");
    String numero2 = request.getParameter("num2");
    String numero3 = request.getParameter("num3");
    
    //Convertir String en integer
    double num1 =0;
    double num2=0;
    double num3=0;
    double promedio=0;
    String url = "";
    
    try{
    num1=Double.parseDouble(numero1);
    num2=Double.parseDouble(numero2);
    num3=Double.parseDouble(numero3);
    promedio = (num1+num2+num3)/3;
    
    if (promedio <= 2.5){
        url = "Imagenes/rojo.png";
    }else if(promedio > 2.5 && promedio <= 3.5){
        url = "Imagenes/amarillo.jpg";       
    }else if (promedio > 3.5){
        url = "Imagenes/verde.png";
    }
        
    }catch(Exception e){
        out.print("FAIL");
    
}
    


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Calculo de promedio</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Calcular Promedio</h1>\n");
      out.write("        <!--Formulario-->\n");
      out.write("        <form method=\"POST\" action=\"\">\n");
      out.write("            <p>Ingrese primer numero: <input type=\"text\" name=\"num1\"/></p>\n");
      out.write("            <p>Ingrese segundo numero: <input type=\"text\" name=\"num2\"/></p>\n");
      out.write("            <p>Ingrese tercer numero: <input type=\"text\" name=\"num3\"/></p>\n");
      out.write("            <p><input type=\"submit\" name=\"\" value=\"Calcular promedio\"/></p>\n");
      out.write("            <p><b>Pomedio:</b> ");
      out.print(promedio);
      out.write("</p>               \n");
      out.write("        </form>\n");
      out.write("            <img src=\"");
      out.print(url);
      out.write("\" width=\"200\" height=\"200\"/>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
