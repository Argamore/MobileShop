package bo;

import java.util.ArrayList;

import dao.ProductDaoImpl;
import dto.Product;

public class ProductBoImpl implements ProductBo {

	ProductDaoImpl product = new ProductDaoImpl();

	@Override
	public Product searchByModel(String model) {
		Product p = new Product();
		p = product.searchByModel(model);
		if (Helper.isProductNull(p)) {
			return null;
		} else {
			return p;

		}
	}

	@Override
	public ArrayList<Product> listProducts() {

		ArrayList<Product> products = new ArrayList<>();

		products = product.listProducts();

		if (product.listProducts() == null) {
			return null;
		} else {

			return products;
		}
	}

	@Override
	public ArrayList<Product> searchProducts(String name) {
		ArrayList<Product> products = new ArrayList<>();

		products = product.searchProducts(name);
		if (product.searchProducts(name) == null) {
			return null;
		} else {
			return products;
		}

	}

}
