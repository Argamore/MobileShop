package bo;

import dto.Product;
import dto.User;

public interface UserBo {

	//checks if user exists and returns user if it does
	
	public User validateUser(String name, String pass);
	
	//registers users if the  user name is valid
	
	public boolean registerUser(User user);
	
	//methods for administrator uses
	
	public boolean addProduct(Product p);
	
	public boolean editProduct(Product p);
	
	public boolean deleteProduct(Product p);
	
}
