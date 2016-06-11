package bo;

import java.sql.SQLException;

import dao.CartDaoImpl;
import dto.Product;

public class CartBoImpl implements CartBo {
	CartDaoImpl cart = new CartDaoImpl();

	@Override
	public boolean addToCart(Product product, int userId) throws SQLException {
		if ((Helper.isProductNull(product)) && (!Helper.isValidUserId(userId))) {
			return false;
		} else {
			return cart.addToCart(product, userId);
		}
	}

	@Override
	public boolean removeFromCart(int productId, int cartId) {
		if ((!Helper.isValidUserId(productId))) {
			return false;
		} else {
			return cart.removeFromCart(productId, cartId);
		}
	}

}
