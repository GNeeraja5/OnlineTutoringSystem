package com.onlinetutoringsystem.dao;

import java.io.PrintWriter;

import com.onlinetutoringsystem.controllers.ResultSet;
import com.onlinetutoringsystem.controllers.Statement;
import com.onlinetutoringsystem.entity.User;

public class UserDAO {
	
	
	
	public User getUserDetails(User user)
	{
		System.out.println("do post of login servlet");
		     
		// start of dao implementation code
		java.sql.Connection currentCon = null;
		ResultSet rs = null;
		Statement stmt = null;
		// String searchQuery ="select * from users where username='"+ username+"' AND
		// password='"+ password+ "'";
		String searchQuery = "select * from user where username='" + req.getParameter("username")
				+ "' AND password='" + req.getParameter("password") + "'";
		try {
			currentCon = ConnectionManager.getConnection();
			stmt= currentCon.createStatement();
			rs = stmt.executeQuery(searchQuery);
			boolean more = rs.next();

			if (!more) {
				System.out.println("Sorry, you are not a registered user! Please sign up first");
				// bean.setValid(false);
				out.print("<p>User do not exit</p>");
			} else if (more) {
				out.print("user exists");
				out.write("<h1>Login successul</h1>");
				out.write(req.getParameter("username"));
				out.write("<br>");
				out.write(req.getParameter("password"));
			}

		} catch (Exception ex) {
			System.out.println("the request object"+req);
			System.out.println("Log In failed: An Exception has occurred! " + ex);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
				}
				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
				}
				stmt = null;
			}

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}

		// end of dao implementations code

//		out.write("<h1>Login successul</h1>");
//		out.write(req.getParameter("username"));
//		out.write("<br>");
//		out.write(req.getParameter("password"));

	}

}
