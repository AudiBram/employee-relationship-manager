package com.project.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// setup connection
		String username = "root";
		String password = "qwertyuiop14";
		String jdbcUrl = "jdbc:mysql://localhost:3306/project1crud";
		String driver = "com.mysql.jdbc.Driver";
		
		// get connection
		try {
			PrintWriter out = response.getWriter();
			out.println("Connect database: " + jdbcUrl);
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
			out.println("SUKSES");
			
		} catch(Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
	}
}






