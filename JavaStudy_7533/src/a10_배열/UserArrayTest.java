package a10_배열;

public class UserArrayTest {

	public static void main(String[] args) {
		User[] users = new User[5];
		
		users[0] = new User("junil", "1234");
		
		for(int i = 0; i < users.length; i++) {
			/*
			if(users[i] != null) {
				users[i].showInfo();
			}
			*/
			if(users[i] == null) {
				continue;
			}
			users[i].showInfo();
		}
		System.out.println("=======================");
		
		int[] numbers = new int[5];
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
