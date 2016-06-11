package bo;

import dao.ProductDaoImpl;
import dao.UserDaoImpl;
import dto.Product;
import dto.User;

public class UserBoImpl implements UserBo {

	UserDaoImpl u = new UserDaoImpl();
	ProductDaoImpl product = new ProductDaoImpl();

	@Override
	public User validateUser(String username, String pass) {
		User user = u.validateUser(username, pass);

		if (Helper.isUserNull(user)) {
			user = null;

		}
		return user;
	}

	@Override
	public boolean registerUser(User user) {

		if (Helper.isValidPass(user.getPassword()) && Helper.isValidUsername(user.getUsername())) {
			return u.registerUser(user);
		} else {
			return false;
		}
	}

	@Override
	public boolean addProduct(Product p) {
		if (Helper.isProductNull(p)) {
			return false;
		} else {
			return u.addProduct(p);

		}
	}

	@Override
	public boolean editProduct(Product p) {
		if (Helper.isProductNull(p)) {
			return false;
		} else {
			return u.editProduct(p);

		}
	}

	@Override
	public boolean deleteProduct(Product p) {
		if (Helper.isProductNull(p)) {
			return false;
		} else {
			return u.deleteProduct(p);

		}
	}

}
