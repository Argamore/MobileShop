package dao;

import dto.Product;
import dto.User;

public interface UserDao {

	public User validateUser(String username, String pass);

	public boolean registerUser(User user);

	public boolean addProduct(Product product);

	public boolean deleteProduct(Product product);

	public boolean editProduct(Product product);

}
