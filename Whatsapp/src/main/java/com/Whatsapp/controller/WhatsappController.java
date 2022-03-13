package com.Whatsapp.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.Whatsapp.entity.WhatsappUser;
import com.Whatsapp.service.WhatsappService;
import com.Whatsapp.service.WhatsappServiceInterface;

public class WhatsappController implements WhatsappControllerInterface {

	public void createProfileController() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter password");
		String password=sc.next();
		
		System.out.println("enter email");
		String email=sc.next();
		
		System.out.println("enter address");
		String address=sc.next();
		
		WhatsappUser wu=new WhatsappUser();
		wu.setName(name);
		wu.setPassword(password);
		wu.setEmail(email);
		wu.setAddress(address);
		
		WhatsappServiceInterface ws=new WhatsappService();
		int i=ws.createProfileService(wu);
		
		if(i>0) {
			System.out.println("profile created");
		}
		else {
			System.out.println("Profile not created");
		}
		
		

	}

	public void viewProfileController() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter email which u want to view");
		String email=sc.next();
		
		WhatsappUser wu=new WhatsappUser();
		wu.setEmail(email);
		
		WhatsappServiceInterface ws=new WhatsappService();
		WhatsappUser u1=ws.viewProfileService(wu);
		
		if(u1!=null) {
			System.out.println("Name is:"+u1.getName());
			System.out.println("Password is:"+u1.getPassword());
			System.out.println("Email is:"+u1.getEmail());
			System.out.println("Address is:"+u1.getAddress());
		}
		else {
			System.out.println("no profiles are found");
		}
		
		
		
	}

	public void deleteProfileController() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter email which u want to view");
		String email=sc.next();
		
		WhatsappUser wu=new WhatsappUser();
		wu.setEmail(email);
		
		WhatsappServiceInterface ws=new WhatsappService();
		int i=ws.deleteProfileService(wu);
		
		if(i>0) {
			System.out.println("profile deleted");
		}
		else {
			System.out.println("Profile not deleted");
		}
		
	}

	public void viewAllProfileController() {
		// TODO Auto-generated method stub
		WhatsappServiceInterface ws=new WhatsappService();
		ArrayList<WhatsappUser>ll=ws.viewAllProfileService();
		
		System.out.println(ll.size()+"  record found in database");
		for(WhatsappUser r:ll) {
			System.out.println("Name is:"+r.getName());
			System.out.println("Password is:"+r.getPassword());
			System.out.println("Email is:"+r.getEmail());
			System.out.println("Address is:"+r.getAddress());
			System.out.println("************************");
			
		}
		
		
		
	}

}
