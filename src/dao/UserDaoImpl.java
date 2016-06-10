package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.Product;
import dto.User;

public class UserDaoImpl implements UserDao {

	Connection connection = ConnManager.getInstance().getConnection();

	@Override
	public User validateUser(String username, String pass) {
		User user = null;
		ResultSet rs = null;

		String query = "select * from user where username =? and password = ?";

		try (PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setString(1, username);
			statement.setString(2, pass);

			rs = statement.executeQuery();

			if (rs.next()) {

				user = new User();

				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setRole(rs.getString("role"));

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return user;
	}

	@Override
	public boolean registerUser(User user) {
		String query = "insert into mobile_shop user (username, password, email, role) values (?,?,?,?)";

		try (PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getEmail());
			statement.setString(4, user.getRole());

			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return true;
	}

	@Override
	public boolean addProduct(Product product) {
		String query = "insert into product (name, model, size, camera, price) values (?,?,?,?,?)";

		try (PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setString(1, product.getName());
			statement.setString(2, product.getModel());
			statement.setString(3, product.getSize());
			statement.setString(4, product.getCamera());
			statement.setDouble(5, product.getPrice());

			statement.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return true;
	}

	@Override
	public boolean deleteProduct(Product product) {

		String query = "delete from product where productId = ?";
		try (PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setInt(1, product.getProductId());

			statement.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}
		return true;
	}
	

	@Override
	public boolean editProduct(Product product) {
		String query = "update product set name =?, model = ?, size = ?, camera= ?, price = ? where productId = ?";

		try (PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setString(1, product.getName());
			statement.setString(2, product.getModel());
			statement.setString(3, product.getSize());
			statement.setString(4, product.getCamera());
			statement.setDouble(5, product.getPrice());

			statement.setInt(6, product.getProductId());

			statement.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}
		return true;
	}

}
