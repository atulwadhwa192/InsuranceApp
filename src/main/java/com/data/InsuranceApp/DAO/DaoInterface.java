package com.data.InsuranceApp.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.data.InsuranceApp.InsuranceForm.InsuranceForm;

public abstract class DaoInterface {
	
	protected String driverName="com.mysql.jdbc.Driver";
	protected Connection con;
	
	
	

	public  abstract String getDriverName(); 

	public abstract void setDriverName(String driverName);
	public abstract void loadDriver();
	public abstract void setSQLConnection(String url,String username,String passowrd);
//	public abstract void createSQLStatementDQL(String query);
	public abstract Boolean validateStudent(String username,String password);
	public abstract Boolean validateAdmin(String username,String password);
	public abstract void closeConnection();
	public abstract int addData(InsuranceForm iForm);

	public abstract List<InsuranceForm> getData();
	
	
	

}
