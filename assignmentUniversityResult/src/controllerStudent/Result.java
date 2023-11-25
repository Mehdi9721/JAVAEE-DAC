package controllerStudent;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.StudentDAO;

import model.Student;


@WebServlet("/result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int prn=Integer.parseInt(request.getParameter("prn"));
PrintWriter pw=response.getWriter();
boolean valid=false;
try {
	valid=StudentDAO.valid(prn);
} catch (Exception e) {
	e.printStackTrace();
}
if(valid==true) {
	try {
		Student k=StudentDAO.result();
		float per=( (float)(k.getSci()+k.getComp()+k.getMath())/300)*100;
		pw.write("<head><body>");
		pw.write("Printing Student Result");
		pw.write("<br>");
		pw.write("NAME : "+k.getName());
		pw.write("<br>");
		pw.write("PRN :"+k.getPrn());
		pw.write("<br>");
		pw.write("MATH :"+k.getMath());
		pw.write("<br>");
		pw.write("COMPUTER :"+k.getComp());
		pw.write("<br>");
		pw.write("SCIENCE :"+k.getSci());
		pw.write("<br>");
		pw.write("TOTAL PERCENTAGE :"+per);
		pw.write("<br>");
		pw.write("TOTAL MARK:"+(k.getSci()+k.getComp()+k.getMath()));
		if(per>75) {
			pw.write("<br> GRADE A");
		}
		if(per>=45 && per<=75) {
			pw.write("<br> GRADE B");
		}
		if(per<45) {
			pw.write("<br> GRADE C");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
}else {
	pw.write("INVALID PRN!!!!!!");
	 request.getRequestDispatcher("result.html").include(request, response);
}
		
	}


}
