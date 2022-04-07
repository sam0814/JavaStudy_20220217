package Ex1.view;

import Ex1.user.User;

public interface SelectGetUser {
	public void show();
	
	public User login();
	
	public void deposit(User user);
	
	public void withDrawal(User user);
	
	public void sendMoney(User user);
	

}
