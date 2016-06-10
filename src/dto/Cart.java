package dto;

public class Cart {
	
	private int cartId;
	
	private int productId;
	
	private int userId;

	private String ProductName;
	

	public Cart(int cartId, int productId, int userId, String productName) {
		super();
		this.cartId = cartId;
		this.productId = productId;
		this.userId = userId;
		ProductName = productName;
	}


	public int getCartId() {
		return cartId;
	}


	public void setCartId(int cartId) {
		this.cartId = cartId;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getProductName() {
		return ProductName;
	}


	public void setProductName(String productName) {
		ProductName = productName;
	}
	
	

}
