package com.data.InsuranceApp.DAO;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.NativeWebRequest;

import com.data.InsuranceApp.InsuranceForm.InsuranceForm;

@Component
public class DaoImplementation extends DaoInterface {

	@Override
	public String getDriverName() {
		// TODO Auto-generated method stub
		return this.driverName;
	}

	@Override
	public void setDriverName(String driverName) {
		this.driverName=driverName;
		
	}

	@Override
	public void loadDriver(){
		
		try {
			Class.forName(driverName);
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
	}

	@Override
	public void setSQLConnection(String url,String username,String passowrd) {
		try {
			con=DriverManager.getConnection(url, username, passowrd);
			
		} catch (SQLException e) {
			System.out.println();
		}
		
	}

	@Override
	public Boolean validateStudent(String username,String password) {
		Boolean output=false;
		String query="select * from user_record.user_entry where username = ? and password = ?";
		try {
			PreparedStatement ps= con.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) 
				output=true;
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return output;		
		
	}
	
	public Boolean validateAdmin(String username,String password) {
		Boolean output=false;
		String query="select * from admin_record.admin_entry where username = ? and password = ?";
		try {
			PreparedStatement ps= con.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) 
				output=true;
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
		return output;		
		
	}
	public List<InsuranceForm> getData(){
		String query="select * from user_record.policy_record";
		List<InsuranceForm> list = new ArrayList<InsuranceForm>();
		try {
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while(rs.next()) {
				InsuranceForm Iform = new InsuranceForm();
				Iform.setPolicyId(rs.getInt(1));
//				Iform.policyId=rs.getInt(1);
				Iform.setFirstName(rs.getString(2));
				Iform.setLastName(rs.getString(3));
				Iform.setDob(rs.getDate(4));
				Iform.setEmailId(rs.getString(5));
				Iform.setMobileNo(rs.getString(6));
				Iform.setGender(rs.getString(7));
				Iform.setTobacoo(rs.getString(8));
				Iform.setIncome(rs.getInt(9));
				Iform.setLifeCoverAmount(rs.getInt(10));
				Iform.setLifeCoverAge(rs.getInt(11));
				Iform.setStatus(rs.getString(12));
				list.add(Iform);
	
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

	@Override
	public int addData(InsuranceForm iForm) {
		String query="insert into user_record.policy_record(FirstName, LastName, DOB, Email, Mobile, Gender, Tobacoo, Income, LifeCoverAmount, LifeCoverAge, Status) values(?,?,?,?,?,?,?,?,?,?,?)";
		int count=0;
		try {
			PreparedStatement ps= con.prepareStatement(query);
//			iForm.updateCount();
//			ps.setInt(1,iForm.getCount());
			ps.setString(1, iForm.getFirstName());
			ps.setString(2, iForm.getLastName());
			ps.setDate(3, iForm.getDob());
			ps.setString(4, iForm.getEmailId());
			ps.setString(5, iForm.getMobileNo());
			ps.setString(6, iForm.getGender());
			ps.setString(7, iForm.getTobacoo());
			ps.setInt(8, iForm.getIncome());
			ps.setInt(9, iForm.getLifeCoverAmount());
			ps.setInt(10, iForm.getLifeCoverAge());
			ps.setString(11, iForm.getStatus());
			count=ps.executeUpdate();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return count;
	}
}
	






