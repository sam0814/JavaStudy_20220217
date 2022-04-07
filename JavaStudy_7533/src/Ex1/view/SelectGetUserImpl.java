package Ex1.view;

import java.util.List;
import java.util.Scanner;

import Ex1.user.User;
import Ex1.user.UserData;

public class SelectGetUserImpl implements SelectGetUser{
	
	private Scanner scanner;
	private UserData userData;
	
	public SelectGetUserImpl() {
		scanner = new Scanner(System.in);
		userData = UserData.getinstance();
	}

	@Override
	public void show() {
		System.out.print("아이디: ");
		String userName = scanner.nextLine();
		
		System.out.print("비밀번호: ");
		int userPassword = scanner.nextInt();
						   scanner.nextLine();
		
		System.out.print("이름: ");
		String name = scanner.nextLine();
		
		System.out.print("나이: ");
		int userAge = scanner.nextInt();
					  scanner.nextLine();
		
		System.out.print("계좌번호: ");
		String userCode = scanner.nextLine();
					  
		
		System.out.print("계좌 비밀번호: ");
		int userCodePassword = scanner.nextInt();
							   scanner.nextLine();
							   
		System.out.println();
		
						 
		User user = new User();
		user.setUserName(userName);
		user.setPassword(userPassword);
		user.setName(name);
		user.setAge(userAge);
		user.setAccountCode(userCode);
		user.setAccountPassword(userCodePassword);
		
		List<User> userList = userData.getUserList();
		userList.add(user);
	}
	
	@Override
	public User login() {
		System.out.print("아이디: ");
		String userName = scanner.nextLine();
		
		System.out.print("비밀번호: ");
		int userPassword = scanner.nextInt();
						   scanner.nextLine();
		System.out.println();
		
		List<User> userList = userData.getUserList();
		for(int i = 0; i < userList.size(); i++) {
			User user = userList.get(i);
			if(user.getUserName().equals(userName)) {
				if(user.getPassword() == userPassword) {
					System.out.println(user.getName()+ "님 반갑습니다.");
					return user;
				
				}
			}
			System.out.println();
		}
		return null;
		
		
	}
	
	@Override
	public void deposit(User user) {
		
		System.out.print("입금 할 금액을 입력하세요: ");
		int userDepositMoney =scanner.nextInt(); 
							  scanner.nextLine();
		System.out.println("입금 한 금액: " + userDepositMoney);
		System.out.println("현재 계좌 잔액: " + user.deposit(userDepositMoney));
		System.out.println();
		
		
	}
	@Override
	public void withDrawal(User user) {
		System.out.print("출금 할 금액을 입력하세요: ");
		int withDrawal = scanner.nextInt();
						 scanner.nextLine();
		if(user.getAccountMoney() < withDrawal) {
			System.out.println("출금 할 수 없습니다.");
		}else {
			System.out.println("출금 한 금액" + withDrawal);
			System.out.println("현재 계좌 잔액:"  +  user.withDrawal(withDrawal));
			System.out.println();
		}
		
		
		
	}
	
	@Override
	public void sendMoney(User user) {
		List<User> userList = userData.getUserList();
		if(userList.size() < 2) {
			System.out.println("유저 수가 부족해서 송금 할 수 없습니다.");
			return;
		}
		System.out.print("송금 할 계좌번호를 입력하세요: ");
		String account = scanner.nextLine();
		if(user.getAccountCode().equals(account)) {
			System.out.println("본인 계좌에 송금 할 수 없습니다.");
			return;
		}
		User founded = null;
		for(int i =0; i < userList.size(); i++) {
			founded = userList.get(i);
			if(founded.getAccountCode().equals(account)) {
				break;
			}else {
				founded = null;
			}
		}
		if(founded == null) {
			System.out.println("없는 계좌입니다.");
			return;
		}
		System.out.print("송금 할 금액을 입력하세요: ");
		int UsersendMoney = scanner.nextInt();
							scanner.nextLine();
		System.out.println("송금 한 금액: " + UsersendMoney);
		System.out.println("현재 계좌 잔액: ");
		
	} 					
	

	

}

