package sendRedirectTULUSKO;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Home extends HttpServlet {
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
res.setContentType("text/html");
PrintWriter out=res.getWriter();
int a=Integer.parseInt(req.getParameter("t1"));
int b=Integer.parseInt(req.getParameter("t2"));
int k=a+b;
HttpSession sess=req.getSession();
sess.setAttribute("k", k);
res.sendRedirect("redirect");
//here with help of ? mark in url mapping we can send data also
}
}
