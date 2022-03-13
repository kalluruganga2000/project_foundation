package com.Whatsapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.Whatsapp.entity.WhatsappUser;

public class WhatsappDAO implements WhatsappDAOInterface {

	public int createProfileDAO(WhatsappUser wu) {
		// TODO Auto-generated method stub
		//dao layer want to interact with database so it will use jdbc
		int i=0;
		try {
			//step 1: Load driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step 2: create connection with database 
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ganga");
			//step3:how to write query using PreparedStatement
			PreparedStatement ps=con.prepareStatement("insert into WhatsappUser values(?,?,?,?)");
			
			ps.setString(1,wu.getName());
			ps.setString(2,wu.getPassword());
			ps.setString(3,wu.getEmail());
			ps.setString(4,wu.getAddress());
			
			//step4:how to execute query
			//if query is insert,update and delete then executeUpdate
			//if query is select then executeQuery
			i=ps.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	

}

	public WhatsappUser viewProfileDAO(WhatsappUser wu) {
		// TODO Auto-generated method stub
		WhatsappUser  u1=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ganga");
			PreparedStatement ps=con.prepareStatement("select *from WhatsappUser where email=?");
			ps.setString(1,wu.getEmail());
			
			ResultSet res=ps.executeQuery();
			if(res.next()) {
			
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				
				u1=new WhatsappUser();
				u1.setName(n);
				u1.setPassword(p);
				u1.setEmail(e);
				u1.setAddress(a);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return u1;
	}

	public int deleteProfileDAO(WhatsappUser wu) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ganga");
			PreparedStatement ps=con.prepareStatement("delete from WhatsappUser where email=?");
			
			ps.setString(1,wu.getEmail());
			
			i=ps.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public ArrayList<WhatsappUser> viewAllProfileDAO() {
		// TODO Auto-generated method stub
		WhatsappUser  u1=null;
		ArrayList<WhatsappUser> ll=new ArrayList<WhatsappUser>();
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ganga");
			PreparedStatement ps=con.prepareStatement("select *from WhatsappUser ");
			
			ResultSet res=ps.executeQuery();
			while(res.next()) {
			
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				
				u1=new WhatsappUser();
				u1.setName(n);
				u1.setPassword(p);
				u1.setEmail(e);
				u1.setAddress(a);
				
				ll.add(u1);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ll;
	}
}
