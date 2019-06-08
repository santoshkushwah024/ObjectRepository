package com.locators;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PostPaidDatabase {
	public static long msisdn=919594101383L;
	public static long imsi=40405002201955L;
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
			//stmt.execute(query);
		
		// Query to Execute
		String query = "insert into SBSCR_MASTER ( sbscr_id,mobile_number,password,in_id,user_type,PLMN,status,sms_service,mms_service,wap_service,general_service,creation_date,created_by,updated_date,imsi)  values (NULL,"+msisdn+",'Test@123',NULL,1,'HAR','Active','Y','Y','Y','Y',now(),'dna',now(),"+imsi+");";

		// Create Statement Object
		Statement stmt = con.createStatement();
	
		stmt.execute(query);
		System.out.println("Inserted Successfully  "+msisdn);
		}
		
		con.close();
	}



}
