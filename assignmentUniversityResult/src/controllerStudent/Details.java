package controllerStudent;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.StudentDAO;

import model.Student;

@WebServlet("/detail")
public class Details extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Student s=new Student();
		s.setPrn(Integer.parseInt(req.getParameter("prn")));
		s.setName(req.getParameter("name"));
	    s.setSci(Integer.parseInt(req.getParameter("science")));
	    s.setMath(Integer.parseInt(req.getParameter("math")));
	    s.setComp(Integer.parseInt(req.getParameter("computer")));
	    PrintWriter pw=res.getWriter();
	    res.setContentType("text/html");
	    int i=0;
		try {
			i=StudentDAO.insert(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(i>0) {
		pw.write("Details of "+ s.getName() +" Filled Sucessfully!!!!!!");
        req.getRequestDispatcher("detail.html").include(req, res);
		}
}
	}

