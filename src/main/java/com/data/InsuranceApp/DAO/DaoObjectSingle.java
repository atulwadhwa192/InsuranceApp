package com.data.InsuranceApp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class DaoObjectSingle {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/", "root","Sapiens@123");
		String query="select * from user_record.user_entry where username = ? and password = ?";
		PreparedStatement ps= con.prepareStatement(query);
		ps.setString(1, "user1@sapiens.com");
		ps.setString(2, "123");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(1)+ " "+rs.getString(2));
		}
	}

}
