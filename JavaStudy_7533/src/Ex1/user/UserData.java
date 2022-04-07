package Ex1.user;

import java.util.ArrayList;
import java.util.List;

public class UserData {
	private static UserData instance;
	private List<User> userList;
	 
	private UserData() {
		userList = new ArrayList<User>();
	}
	
	public static UserData getinstance() {
		if(instance == null) {
			instance = new UserData();
		}
		return instance;
	}
	
	public List<User> getUserList() {
		return userList;
	}
}
