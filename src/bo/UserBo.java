package bo;

import dto.Product;
import dto.User;

//neke od metoda koje trebaju u biznis logici, dodaj jos ako mislis da treba..
public interface UserBo {

	//metoda koja provjerava da li user postoji i vraca usera ukoliko postoji 
	
	public User validateUser();
	
	//metoda koja registruje usera, ukoliko ne postoji
	
	public boolean registerUser();
	
	//dodaj ostale
	
	
	
}
