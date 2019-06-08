package com.locators;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	public static long msisdn=917400900000L;
	public static long imsi=404052052201955L;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
		String dbUrl = "jdbc:mysql://172.16.27.162:3306/sdpdb";

		// Database Username
		String username = "sdp1";

		// Database Password
		String password = "Sdp_1234";
		Class.forName("com.mysql.jdbc.Driver");

		// Create Connection to DB
		Connection con = DriverManager.getConnection(dbUrl, username, password);

		for (int i=1;i<=10000000;i++) {
			msisdn++;
			imsi++;

		// Query to Execute
		String query = "insert into SBSCR_MASTER ( sbscr_id,mobile_number,password,in_id,user_type,PLMN,status,sms_service,mms_service,wap_service,general_service,creation_date,created_by,updated_date,imsi)  values (NULL,"+msisdn+",'Test@123',2,0,'HAR','Active','Y','Y','Y','Y',now(),'dna',now(),"+imsi+");";

		
		// Create Statement Object
		Statement stmt = con.createStatement();

		stmt.execute(query);
		System.out.println("Inserted Successfully  "+msisdn);
		}
	
		con.close();
	}

}
