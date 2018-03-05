package BL;

import DAL.UserDAL;
import models.User;

public class UserBL extends BaseBL<User> {
	public UserBL() {
		super(new UserDAL());
	}
}
