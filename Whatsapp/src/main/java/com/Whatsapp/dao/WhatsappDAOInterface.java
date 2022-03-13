package com.Whatsapp.dao;

import java.util.ArrayList;

import com.Whatsapp.entity.WhatsappUser;

public interface WhatsappDAOInterface {

	int createProfileDAO(WhatsappUser wu);

	WhatsappUser viewProfileDAO(WhatsappUser wu);

	int deleteProfileDAO(WhatsappUser wu);

	ArrayList<WhatsappUser> viewAllProfileDAO();

	

}
