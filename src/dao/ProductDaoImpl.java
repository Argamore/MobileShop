package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Product;

public class ProductDaoImpl implements ProductDao {

	Connection connection = ConnManager.getInstance().getConnection();

	@Override
	public ArrayList<Product> listProducts() {
		ArrayList<Product> products = new ArrayList<>();
		Product p = null;
		String query = " select * from product";

		try (PreparedStatement statement = connection.prepareStatement(query);
				ResultSet rs = statement.executeQuery()) {

			while (rs.next()) {
				p = new Product();
				p.setProductId(rs.getInt("productId"));
				p.setName(rs.getString("name"));
				p.setModel(rs.getString("model"));
				p.setCamera(rs.getString("camera"));
				p.setSize(rs.getString("size"));
				p.setPrice(rs.getDouble("price"));
				products.add(p);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return products;
	}

	@Override
	public ArrayList<Product> searchProducts(String name) {
		Product p = null;
		ArrayList<Product> products = new ArrayList<>();

		String query = "select * from product where name =?";
		ResultSet rs = null;
		try (PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setString(1, name);

			rs = statement.executeQuery();

			if (rs.next()) {
				p = new Product();
				p.setProductId(rs.getInt("productId"));
				p.setName(rs.getString("name"));
				p.setModel(rs.getString("model"));
				p.setCamera(rs.getString("camera"));
				p.setSize(rs.getString("size"));
				p.setPrice(rs.getDouble("price"));
				products.add(p);

			}

		} catch (Exception e) {
		}

		return products;
	}

	@Override
	public Product searchByModel(String model) {

		Product p = null;

		String query = "select * from product where model =?";
		ResultSet rs = null;
		try (PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setString(1, model);

			rs = statement.executeQuery();

			if (rs.next()) {
				p = new Product();
				p.setProductId(rs.getInt("productId"));
				p.setName(rs.getString("name"));
				p.setModel(rs.getString("model"));
				p.setCamera(rs.getString("camera"));
				p.setSize(rs.getString("size"));
				p.setPrice(rs.getDouble("price"));

			}

		} catch (Exception e) {
		}

		return p;

	}

}
