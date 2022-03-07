package a10_배열;

/**
 * 
 * 배열(Array)
 * 연관된 데이터를 하나의 변수에 그룹핑해서 관리하는 기법.
 * 
 * 자료형[] 배열변수명 = new 자료형[배열공간의 개수];
 * int[] numbers = new int[5];
 *  User[] users = new User[3];
 *  
 */
public class ArrayTest {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		numbers[1] = 100;
		
		
		
		for(int i =0; i < 10; i++) {
			System.out.println(numbers[i]);
			
		}
		System.out.println();
		
		/*
		 * String 배열 10개의 공간을 생성
		 * 가나다라마바사아자차
		 */
		
		String[] words = new String[11];
		
		words[0] = "가";
		words[1] = "나";
		words[2] = "다";
		words[3] = "라";
		words[4] = "마";
		words[5] = "바";
		words[6] = "사";
		words[7] = "아";
		words[8] = "자";
		words[9] = "차";
							//+ 1 하면 오류발생
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		
		int[] numArray = {1, 5, 4, 3, 2, 6, 9};
		int[] numArray2 = new int[100];
		
		for(int i =0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
		

	}

}
