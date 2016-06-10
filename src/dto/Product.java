package dto;

public class Product {

	private int productId;

	private String name;

	private String model;

	private String size;

	private String camera;

	private double price;

	public Product() {
		super();
	}

	public Product(int id, String name, String model, String size, String camera, double price) {
		super();
		this.productId = id;
		this.name = name;
		this.model = model;
		this.size = size;
		this.camera = camera;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
