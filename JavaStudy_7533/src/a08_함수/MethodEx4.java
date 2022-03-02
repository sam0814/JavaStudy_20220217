package a08_함수;

import java.util.Scanner;

public class MethodEx4 {
	
	public static void printStar1(int startCount) {
		if(startCount < 1) {
			System.out.println("별의 개수는 1개 이상을 입력해야 합니다.");
		}else {
		for(int i =0; i < startCount; i++) {
		for(int j = 0; j < startCount-i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 0;  j < (i * 2) + 1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
	}
	public static void printStar2(int startCount2) {
		
	}
	public static void printStar3(int startCount3) {
		
	}
	public static void printStar4(int startCount4) {
		
	}
	public static void printStar5(int startCount5) {
		
	}

	public static void main(String[] args) {
		/*
		 * printStar(입력받은 별의 개수)
		 * 0보다 작은 음수가 들어왔을 때,
		 * 별의 개수는 1개 이상을 입력 하셔야합니다.
		 * 
		 * 
		 * 반복 횟수 입력 : 10
		 * 별 찍기 모양 선택(1 ~ 5):
		 * 만약 1 ~ 5의 수가 안들어 왔을때 정상적인 값이 들어올때까지 계속 입력 받기.
		 * 정상적인 값이 들어왔을 때에는 해당 별 찍기를 실행.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		int select = 0;
		System.out.println("반복 횟수를 입력 해주세요: ");
		n = scanner.nextInt();
		
		while(true ) {
		System.out.println("별 찍기 모양 선택(1 ~ 5): ");
		select = scanner.nextInt();
		
		if(select == 1) {
			printStar1(n);
			break;
		}else if(select == 2) {
			printStar2(n);
			break;
		}else if(select == 3) {
			printStar3(n);
			break;
		}else if(select == 4) {
			printStar4(n);
			break;
		}else if(select == 5) {
			printStar5(n);
			break;
		}else {
			System.out.println("별 찍기 모양은 1 ~ 5중 하나만 선택 할 수 있습니다.");
		}
			}
		
		
		
		

	}

}
