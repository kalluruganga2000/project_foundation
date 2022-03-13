package com.Whatsapp.service;

import java.util.ArrayList;

import com.Whatsapp.dao.WhatsappDAO;
import com.Whatsapp.dao.WhatsappDAOInterface;
import com.Whatsapp.entity.WhatsappUser;

public class WhatsappService implements WhatsappServiceInterface {

	public int createProfileService(WhatsappUser wu) {
		// TODO Auto-generated method stub
		WhatsappDAOInterface wd=new WhatsappDAO();
		int i=wd.createProfileDAO(wu);
		return i;
	}

	public WhatsappUser viewProfileService(WhatsappUser wu) {
		// TODO Auto-generated method stub
		WhatsappDAOInterface wd=new WhatsappDAO();
		WhatsappUser u1=wd.viewProfileDAO(wu);
		return u1;
	}

	public int deleteProfileService(WhatsappUser wu) {
		// TODO Auto-generated method stub
		WhatsappDAOInterface wd=new WhatsappDAO();
		int i=wd.deleteProfileDAO(wu);
		return i;
	}

	public ArrayList<WhatsappUser> viewAllProfileService() {
		// TODO Auto-generated method stub
		WhatsappDAOInterface wd=new WhatsappDAO();
		ArrayList<WhatsappUser> i=wd.viewAllProfileDAO();
		return i;
	}

}
