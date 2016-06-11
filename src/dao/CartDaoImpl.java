package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dto.Product;

public class CartDaoImpl implements CartDao {

	Connection connection = ConnManager.getInstance().getConnection();

	// adds product to cart using product id and user id as foreign keys
	@Override
	public boolean addToCart(Product p, int userId) throws SQLException {

		String query = "insert into cart (productId, userId, productname) values (?,?,?)";

		try (PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setInt(1, p.getProductId());
			statement.setInt(2, userId);
			statement.setString(3, p.getName());

			statement.executeUpdate();

		}

		return true;
	}

	@Override
	public boolean removeFromCart(int productId, int cartId) {

		String query = "delete from cart where productId = ? and cartId= ?";

		try (PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setInt(1, productId);
			statement.setInt(2, cartId);

			statement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;

	}

}
