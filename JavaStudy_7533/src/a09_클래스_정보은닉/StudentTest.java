package a09_클래스_정보은닉;

/*
 * Student 클래스 정의
 * 속성
 * SchoolName
 * studentCode(학번) 20220000
 * studentYear
 * studentName
 * 
 * 생성자(기본, 전체)
 * getter, setter
 * 
 * 메소드 showStudentInfo
 * 학교명:코리아아이티아카데미
 * 학번:20220000
 * 학년: 1
 * 이름: 송새미
 * 
 * 학교명:코리아아이티아카데미
 * 학번:20220001
 * 학년: 1
 * 이름: 송새미2
 */

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student("코리아아이티아카데미",20220000,1,"송새미" );
		Student student2 = new Student("코리아아이티아카데미",20220001, 3, "송새미2" );
		
		
		student1.showStudentInfo();
		student2.showStudentInfo();
		
		

	}

}
