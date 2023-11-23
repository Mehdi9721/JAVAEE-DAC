package sendRedirectTULUSKO;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServer extends HttpServlet {
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
res.setContentType("text/html");
int k=Integer.parseInt(req.getParameter("k"));
PrintWriter out=res.getWriter();
k=k*k;
out.print(k);
}
}
