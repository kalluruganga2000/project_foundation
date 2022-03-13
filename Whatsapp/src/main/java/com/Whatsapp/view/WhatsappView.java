package com.Whatsapp.view;

import java.util.Scanner;

import com.Whatsapp.controller.WhatsappController;
import com.Whatsapp.controller.WhatsappControllerInterface;

public class WhatsappView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="y";
		while(s.equals("y")) {
		System.out.println("**********MAIN MENU***********");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to delete profile");
		System.out.println("press 4 to view All profiles");
		
		System.out.println("enter choice");
		
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		WhatsappControllerInterface wc=new WhatsappController();
		
		switch(ch) {
		case 1:wc.createProfileController();
			break;
		case 2:wc.viewProfileController();
			break;
		case 3:wc.deleteProfileController();
			break;
		case 4:wc.viewAllProfileController();
			break;
			default:System.out.println("wrong choice");
		}
		System.out.println("want to continue press y/n");
		s=sc.next();
		
	}
	}
		

}
	
