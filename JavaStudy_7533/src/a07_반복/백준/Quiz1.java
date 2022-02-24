package a07_반복.백준;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int num = 0;
		System.out.println("숫자를 입력하세요: ");
		num = scanner.nextInt();
		
		for(int i =0; i < num; i++ ) {
			
			System.out.println(++i);
		}

	}

}
