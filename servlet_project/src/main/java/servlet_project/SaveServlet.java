package servlet_project;

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

@WebServlet("/save") // WebServlet will map the request from web page to back end
public class SaveServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String salary = req.getParameter("salary");
		String password = req.getParameter("password");

//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(email);
//		System.out.println(salary);
//		System.out.println(password);
//
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "pank");
			PreparedStatement ps = con.prepareStatement("insert into empl values(?, ?, ?, ?, ?)");
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setString(4, salary);
			ps.setString(5, password);
			ps.execute();
			ps.close();
			con.close();

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		resp.sendRedirect("index.jsp");
	}
}
