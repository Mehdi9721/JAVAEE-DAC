package sendRedirectTULUSKO;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RedirectServer extends HttpServlet {
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
res.setContentType("text/html");
PrintWriter out=res.getWriter();
HttpSession sess=req.getSession();
int k=(int)sess.getAttribute("k");
k=k*k;
out.print(k);
out.print("yes");
}
}
