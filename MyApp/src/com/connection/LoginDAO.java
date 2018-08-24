package com.connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
public boolean checkLogin(String username, String password) {
	boolean success=false;
	String CHECK_USERNAME= "select * from login where username= ?";
	try {
		PreparedStatement ps= MyConnection.getMyConnection().prepareStatement(CHECK_USERNAME);
		ps.setString(1, username);
		ResultSet set=ps.executeQuery();
		int row= set.getRow();
		if(row!=0) {
			set.next();
			if(set.getString(2).equals(password)){
		   success= true;
		}
	}
//		if(set.next()) {
//			String actual   = set.getString(1);
//			if(actual.equals(password)) {
//				success = true;
//			}
//		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return success;
}
}
