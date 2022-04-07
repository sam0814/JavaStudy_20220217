package Ex1.user;

public class User {
	String userName;
	int password;
	String name;
	int age;
	String accountCode;
	int accountPassword;
	String userGrade;
	int money;
	int accountMoney;
	
	public User() {}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public int getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(int accountPassword) {
		this.accountPassword = accountPassword;
	}

	public String getUserGrade() {
		return userGrade;
	}

	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getAccountMoney() {
		return accountMoney;
	}

	public void setAccountMoney(int accountMoney) {
		this.accountMoney = accountMoney;
	}
	

	public int deposit(int money) {
		accountMoney += money;
		return accountMoney;
	}
	
	public int withDrawal(int money) {
		accountMoney -= money;
		return accountMoney;
	}
	
	public int sendMoney(int money) {
		accountMoney -= money;
		return accountMoney;
	}
	

}
