package dao;

import java.sql.SQLException;

import dto.Product;

public interface CartDao {
	
	public boolean addToCart(Product product, int userId) throws SQLException;
	
	public boolean removeFromCart(int productId);

}
