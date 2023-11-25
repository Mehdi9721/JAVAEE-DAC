package com.app.dao;
import java.sql.*;
import model.Student;
// this class is created for making connection with database
public class StudentDAO {
public static Connection getConnection() throws SQLException,ClassNotFoundException{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","8052608851");
return con;
}
public static int insert(Student s)throws ClassNotFoundException,SQLException  {
	int i=0;
	try {
		Connection con=StudentDAO.getConnection();
		PreparedStatement st=con.prepareStatement("insert into record values(?,?,?,?,?)");
		st.setInt(1,s.getPrn());
		st.setString(2, s.getName());
		st.setInt(3, s.getMath());
		st.setInt(4, s.getComp());
        st.setInt(5, s.getSci());
        i=st.executeUpdate();
	}catch(Exception e){
		System.out.println(e);
	}

	return i;
}

//now validate student
private static ResultSet rs;
public static boolean valid(int p) throws ClassNotFoundException, SQLException {
	Connection con=StudentDAO.getConnection();
	PreparedStatement st=con.prepareStatement("select * from record where prn=? ");
	st.setInt(1, p);
	rs=st.executeQuery();
	boolean a=rs.next();
	return a;
}

public static Student result() throws SQLException {
	Student s=new Student();
	s.setPrn(rs.getInt(1));
	s.setName(rs.getString(2));
	s.setMath(rs.getInt(3));
	s.setComp(rs.getInt(4));
	s.setSci(rs.getInt(5));
	return s;
}
}
