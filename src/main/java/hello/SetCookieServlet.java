package hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet("/setcookietest")
public class SetCookieServlet extends HttpServlet {
    static Random rand = new Random();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //Some random names and values
        Cookie cookie = new Cookie("id" + rand.nextInt(10000),"val" + rand.nextInt(1000));
        cookie.setHttpOnly(true);
        cookie.setMaxAge(rand.nextInt(30)); //The cookie will live for 30 secs
        response.addCookie(cookie);
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Set cookie test</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Setting a cookie</h1>");
            out.println("<br/><br/>");
            out.println("<a href='readcookietest'>Display cookies.</a>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
