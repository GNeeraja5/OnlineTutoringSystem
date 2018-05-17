package com.onlinetutoringsystem.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlinetutoringsystem.entity.User;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		// now go pass these values to the user services and find the users genuinity
		//for now redirect to login successful page
		RequestDispatcher reqdispatcher= request.getRequestDispatcher("loginsuccessful.jsp");
		reqdispatcher.forward(request, response);
        User user = new User();
        String temp_username = request.getParameter("username");
        String temp_password = request.getParameter("password");
        System.out.println("user object here: "+user);
        
        
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
			
//		}
	}

}
