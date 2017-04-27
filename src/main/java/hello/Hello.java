package hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//Vi kan antingen skriva
//    http://localhost:8080/trivial-servlets-1.0-SNAPSHOT/hello
// eller
//    http://localhost:8080/trivial-servlets-1.0-SNAPSHOT/
// För att trigga igång Hello.-servleten eftersom  vi givit båda namnen i @WebServlet
@WebServlet({"/hello", "/"})
public class Hello extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Hello!");
    }

    @Override
    public String getServletInfo() {
        return "The most trivial servlet ever...";

    }
}
