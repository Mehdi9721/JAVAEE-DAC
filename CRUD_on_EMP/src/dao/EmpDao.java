package dao;
import java.sql.*;
import java.util.ArrayList;

import bean.EmpModel;
public class EmpDao {

	public static Connection getConnection()throws SQLException,ClassNotFoundException {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empcrud","root","8052608851");		
		return con; 
    }

	public static int addemp(EmpModel e) throws SQLException,ClassNotFoundException {
		Connection con=EmpDao.getConnection();
		System.out.println("connected ");
		PreparedStatement stmt=con.prepareStatement("insert into empdetails values(?,?,?,?,?,?)");
		stmt.setInt(1,e.getId());
		stmt.setString(2, e.getName());
		stmt.setString(3, e.getEmail());
		stmt.setString(4,e.getPass());
		stmt.setString(5, e.getGender());
		stmt.setString(6, e.getCountry());
		int i=stmt.executeUpdate();
		System.out.println("updated data ");
		return i;
	}
	public static boolean valid(EmpModel e) throws SQLException,ClassNotFoundException{
		Connection con=EmpDao.getConnection();
		String q="select * from empdetails where empid=?";
		PreparedStatement stmt=con.prepareStatement("select * from empdetails where empid=?");
		stmt.setInt(1,e.getId());
		ResultSet rs=stmt.executeQuery();
		boolean f=rs.next();	
		return f;
	}
	public static void details(ArrayList<EmpModel> ls)throws SQLException,ClassNotFoundException{
		Connection con=EmpDao.getConnection();
		PreparedStatement stmt=con.prepareStatement("select * from empdetails");
		ResultSet rs=stmt.executeQuery();
		while(rs.next()) {
			EmpModel e=new EmpModel();
			e.setCountry(rs.getString(6));
			e.setEmail(rs.getString(3));
			e.setGender(rs.getString(5));
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setPass(rs.getString(4));
			ls.add(e);
		}
	}
	public static EmpModel singleDetail(int id) throws SQLException,ClassNotFoundException{
		Connection con=EmpDao.getConnection();
		System.out.println("Connected to single");
		PreparedStatement stmt=con.prepareStatement("select * from empdetails where empid=?");
		stmt.setInt(1,id);
		ResultSet rs=stmt.executeQuery();
		System.out.println("Executed single meth");
		rs.next();
		EmpModel e=new EmpModel();	
		e.setCountry(rs.getString(6));
		e.setEmail(rs.getString(3));
		e.setGender(rs.getString(5));
		e.setId(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setPass(rs.getString(4));
		System.out.println("below result set");
		return e;
	}

	public static int update(EmpModel e) throws SQLException,ClassNotFoundException{
		Connection con=EmpDao.getConnection();
		System.out.println("connected for updation");
		PreparedStatement stmt=con.prepareStatement(" update empdetails set empid=?,name=?,email=?,paw=?,gender=?,cntry=? where empid=?;");
		stmt.setInt(1,e.getId());
		stmt.setString(2, e.getName());
		stmt.setString(3, e.getEmail());
		stmt.setString(4,e.getPass());
		stmt.setString(5, e.getGender());
		stmt.setString(6, e.getCountry());
		stmt.setInt(7,e.getIdForEdit());
		int i=stmt.executeUpdate();
		System.out.println("Updated new record ");
		con.close();
		stmt.close();
	return i;
	}


	public static int delete(int id) throws SQLException,ClassNotFoundException{
		Connection con=EmpDao.getConnection();
		System.out.println("connected for updation");
		PreparedStatement stmt=con.prepareStatement("delete from empdetails where empid=?");
		stmt.setInt(1,id);
		int i=stmt.executeUpdate();
		return i;
	}


}
