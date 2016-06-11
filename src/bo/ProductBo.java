package bo;

import java.util.ArrayList;

import dto.Product;

public interface ProductBo {
	// searches the products by specific model

	public Product searchByModel(String model);

	// list all products

	public ArrayList<Product> listProducts();

	// list products by name

	public ArrayList<Product> searchProducts(String name);

}
