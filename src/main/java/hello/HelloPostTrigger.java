package hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/helloposttrigger")
public class HelloPostTrigger extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " +
                "transitional//en\">\n";

        out.println(docType +
                "<html>" +
                    "<body>"+
                        "<form action=\"hellopost\" method=\"POST\">" +
                            "First Name: <input type=\"text\" name=\"first_name\">" +
                            "<br />" +
                            "Last Name: <input type=\"text\" name=\"last_name\" />" +
                            "<input type=\"submit\" value=\"Submit\" />" +
                        "</form>" +
                        "</body>" +
                "</html>");
    }

}
