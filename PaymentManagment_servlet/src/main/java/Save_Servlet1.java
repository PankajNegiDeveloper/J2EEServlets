import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class Save_Servlet1 extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String FirstName = req.getParameter("fname");
	String lastName = req.getParameter("lname");
	String Gender = req.getParameter("Gender");
	String Address = req.getParameter("Add");
	String Email = req.getParameter("Email");
	String Password = req.getParameter("Password");
	String CardType = req.getParameter("Card");
	String CardNumber = req.getParameter("Cnumber");
	String Expiration = req.getParameter("Expiration");
	String CVV = req.getParameter("CVV");
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pmt", "root", "pank");
		PreparedStatement ps = con.prepareStatement("insert into paymentdetails values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, FirstName);
		ps.setString(2, lastName);
		ps.setString(3, Gender);
		ps.setString(4, Address);
		ps.setString(5, Email);
		ps.setString(6, Password);
		ps.setString(7, CardType);
		ps.setString(8, CardNumber);
		ps.setString(9, Expiration);
		ps.setString(10, CVV);	
		ps.execute();
		ps.close();
		con.close();

	} catch (SQLException | ClassNotFoundException e) {
		e.printStackTrace();
	}
	resp.sendRedirect("index.jsp");
}
}
