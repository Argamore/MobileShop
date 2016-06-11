package bo;

import java.util.ArrayList;

import dto.Product;

//metode za biznis logiku proizvoda

public interface ProductBo {
	
	//metoda koja provjerava da li postoji model 
	
	public Product searchByModel(String model);
	
	//metoda koja provjerava i izlistava sve proizvode
	
	public ArrayList<Product> listProducts();
	
	//metoda koja provjerava da li postoje i izlistava proizode sa odredjenim imenom
	
	public ArrayList<Product> searchProducts(String name);
	


}
