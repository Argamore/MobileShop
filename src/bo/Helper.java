package bo;

import dto.Product;
import dto.User;

public class Helper {

	public static boolean isUserNull(User user) {

		if (user == null) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isValidUsername(String name) {

		if ((name.length() < 4) || name.trim() == "") {

			return false;
		} else {
			return true;
		}
	}

	public static boolean isValidPass(String pass) {

		if ((pass.length() < 6) || pass.trim() == "") {

			return false;
		} else {
			return true;
		}
	}

	public static boolean isProductNull(Product p) {

		if (p == null) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isValidUserId(int userId) {
		if (userId > 0) {
			return true;
		} else {
			return false;
		}
	}

}
