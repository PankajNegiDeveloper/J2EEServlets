package servlet_project;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class Delete_servelet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "pank");
			PreparedStatement ps = con.prepareStatement("delete from empl where id=?");
			ps.setString(1, id);
			ps.execute();
			ps.close();
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "pank");
			PreparedStatement ps = con.prepareStatement("select * from empl");
			ps.execute();

			ResultSet rs = ps.getResultSet();

			req.setAttribute("rs", rs);

			req.getRequestDispatcher("home.jsp").forward(req, resp);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}