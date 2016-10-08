package com.heman.services;  
/** 
 * 
 * @author Nagesh Chauhan 
 */  
  
import javax.sql.DataSource;
import javax.xml.registry.infomodel.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.heman.dao.UserDao;
  
public class UserDaoImpl implements UserDao {  
  
 @Autowired  
 DataSource dataSource;  
  
@Override
public void insertData(int user) {
	  String sql = "INSERT INTO user "  
		    + "(first_name,last_name, gender, city) VALUES (?, ?, ?,?)";  
		  
		  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
		  jdbcTemplate.update(  
				    sql,  
				    new Object[] {"names" });  
				  
				 }  
		  
	
}
