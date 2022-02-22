package a05_입력;

import java.util.Scanner;

public class ScoreEx {

	public static void main(String[] args) {
		/**
		 * int score 입력
		 * score -점수이거나 100점을 넣으면 X출력
		 * 90이상 A
		 * 80이상 B
		 * 70이상 C
		 * 60이상 D
		 * 그외 F
		 * 성적을 입력해 주세요 :85
		 * 학생의 평점은 B등급입니다.
		 */

		Scanner scanner= new Scanner (System.in);
		int score = 0;
		String grade = null; 
		
		System.out.print("성적을 입력해 주세요 : ");
		score = scanner.nextInt();
		grade = score > -1 && score < 101 ? "A" : "오류";				
		
		System.out.println("학생의 평점은 " + grade + "입니다");
				
			
					
	}

}
