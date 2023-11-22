package abtest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class MyServ extends HttpServlet {
public	MyServ(){
		
	}
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
res.setContentType("text/html");
PrintWriter out=res.getWriter();
int a=Integer.parseInt(req.getParameter("val1"));
int b=Integer.parseInt(req.getParameter("val2"));
int k=a+b;
req.setAttribute("k",k);
RequestDispatcher rd=req.getRequestDispatcher("sq");
rd.forward(req,res);
//out.write("your addition is: "+k);
}
}
