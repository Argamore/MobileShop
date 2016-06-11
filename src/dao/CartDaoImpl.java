package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dto.Product;
import dto.User;

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
	public boolean removeFromCart(int productId) {

		String query = "delete from cart where productId = ?";

		try (PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setInt(1, productId);

			statement.executeUpdate();

		} catch (Exception e) {

		}
		return true;

	}

	public static void main(String[] args) throws SQLException {

		Product p = new Product();

		p = new ProductDaoImpl().searchByModel("3310");

		// new Product(1, "nokia", "3310", "2''", "8mp", 121);

		User u = new User();
		u = new UserDaoImpl().validateUser("Amila", "amila123");

		CartDaoImpl c = new CartDaoImpl();

		System.out.println(c.removeFromCart(p.getProductId()));

	}

}
