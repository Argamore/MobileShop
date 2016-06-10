package dto;

public class Product {
	
	private int productId;
	
	private String name;
	
	private String model;
	
	private String size;
	
	private String camera;

	
	public Product(int productId, String name, String model, String size, String camera) {
		super();
		this.productId = productId;
		this.name = name;
		this.model = model;
		this.size = size;
		this.camera = camera;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getCamera() {
		return camera;
	}


	public void setCamera(String camera) {
		this.camera = camera;
	}
	
	

}
