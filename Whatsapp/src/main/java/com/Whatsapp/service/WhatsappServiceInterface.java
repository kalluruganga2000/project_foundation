package com.Whatsapp.service;

import java.util.ArrayList;

import com.Whatsapp.entity.WhatsappUser;

public interface WhatsappServiceInterface {

	int createProfileService(WhatsappUser wu);

	WhatsappUser viewProfileService(WhatsappUser wu);

	int deleteProfileService(WhatsappUser wu);

	ArrayList<WhatsappUser> viewAllProfileService();

}
