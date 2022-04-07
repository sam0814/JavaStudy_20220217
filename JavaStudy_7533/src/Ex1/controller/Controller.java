package Ex1.controller;

import java.util.Scanner;

import Ex1.user.User;
import Ex1.view.SelectGetUser;
import Ex1.view.SelectGetUserImpl;
import Ex1.view.View;
import Ex1.view.ViewImpl;

public class Controller {
	
	private Scanner scanner;
	private View view;
	private SelectGetUser selectGetUser; 
	private User user;
	public Controller() {
		scanner = new Scanner(System.in);
		view = new ViewImpl();
		selectGetUser = new SelectGetUserImpl();
		
	}
	
	
	public void Start() {
		while(true) {
			view.show();
			System.out.print("설정을 선택하세요: ");
			int start = scanner.nextInt();
						scanner.nextLine();
			System.out.println();
			if(start == 1) {
				selectGetUser.show();
			}else if(start == 2) {
				if(user == null) {
					user = selectGetUser.login();
					if(user == null) {
						System.out.println("로그인에 실패했습니다.");
					}
				}else {
					System.out.println("이미 로그인 되어있습니다.");
				}
				
			}else if(start == 3) {
				if(user == null) {
					System.out.print("로그인 후 이용 가능합니다.");
				}else {
					selectGetUser.deposit(user);

				}
				
			}else if(start == 4) {
				if(user == null) {
					System.out.print("로그인 후 이용 가능합니다.");
				}else {selectGetUser.withDrawal(user);
				}
				
			}else if(start == 5) {
				if(user == null) {
					System.out.print("로그인 후 이용 가능합니다.");
				}else {
					selectGetUser.sendMoney(user);
				}
				
			}else if(start == 6) {
				if(user == null) {
					System.out.print("로그인 후 이용 가능합니다.");
				}else {
					
				}
				
			}else {
				System.out.println("잘못된 정보 입니다.");
			}
		}
		
		
		
		
		
	
		
		
		
	}

}
