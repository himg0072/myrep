package com.heman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {
	 @Autowired  
	 DataSource dataSource; 
	
	@RequestMapping("home")
	public String home(HttpServletRequest request,HttpServletResponse response){
		  try {
			String sql = "INSERT INTO public.user "  
				    + " VALUES ("+" 'good' )";  
				  
				  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
				  jdbcTemplate.update(sql);
				/*  jdbcTemplate.update(  
						    sql,  
						    new Object[] {"names" });*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
					  
		/*
		System.out.println("-------- PostgreSQL "
				+ "JDBC Connection Testing ------------");
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your PostgreSQL JDBC Driver? "
					+ "Include in your library path!");
			e.printStackTrace();
		}
		System.out.println("PostgreSQL JDBC Driver Registered!");
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(
					"jdbc:postgresql://localhost:50000/mydb", "postgres",
					"ktmsjhgy");
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		}
		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		return "index";
	*/
		return "index";	
	}

}
