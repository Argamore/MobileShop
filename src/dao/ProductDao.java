package dao;

import java.util.ArrayList;

import dto.Product;


public interface ProductDao {
	
	public ArrayList<Product> listProducts();

	public ArrayList<Product> searchProducts(String name);
	
	public Product searchByModel(String model);
	

}
