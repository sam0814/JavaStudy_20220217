package a06_조건;

import java.util.Scanner;

public class IfElseEx6 {
	/*
	 * x , y
	 * 
	 * x축: 10
	 * y축: 5
	 * 
	 * 3사분면입니다.
	 * 원점입니다.
	 */

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int x=0;
		int y=0;
		int result = 0;
		
		System.out.print("x축을 입력하세요: ");
		x= scanner.nextInt();
		System.out.print("y축을 입력하세요: ");
		y= scanner.nextInt();
		
		if (x==0 && y==0)
		{
			System.out.println("원점입니다.");
		}
		else {
			if(x > 0 && y > 0) {
				result = 1;
			
			}else if( x < 0 && y < 0) {
				result = 2;
			}else if(x < 0 && y < 0) {
				result = 3;
		}else {
			result = 4;
		}
			System.out.println(result + "사분면입니다.");
	
	}
}


	}


