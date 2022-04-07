package a18_컬렉션.HashMap;

import java.util.HashMap;

public class StudentTest {

	public static void main(String[] args) {
		StudentService service = new StudentService(new HashMap<String, Student>());
		
		service.showStudentAll();
		
		service.addStudent("송새미1", "aaaa@gmail.com", "부산 북구");
		service.addStudent("송새미2", "bbbb@gmail.com", "부산 남구");
		service.addStudent("송새미3", "cccc@gmail.com", "부산 서구");
		service.showStudentAll();
		
		service.updateStudentByname("송새미", "ddd@kakao.com", "부산 북구");
		service.showStudentByname("송새미");
		
		service.deleteStudentByName("송새미2");
		service.showStudentAll();

	}

}
