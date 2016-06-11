package bo;

import java.sql.SQLException;

import dto.Product;

public interface CartBo {

	public boolean addToCart(Product product, int userId) throws SQLException;

	public boolean removeFromCart(int productId, int cartId);

}
