package a09_클래스;

public class student {
	//속성, 래퍼런스변수, 필드
	String schoolName;
	int studentYear;
	int studentGroup;
	int studentNumber;
	String studentName;
	String studentAdress;
	String studentPhone;
	boolean graduationFlag;
	
	public student() {//기본 생성자
		System.out.println("기본 생성자 호출");
	}
	
	
	
	public student(String schoolName, int studentYear, int studentGroup, int studentNumber, String studentName,
			String studentAdress, String studentPhone, boolean graduationFlag) {//전체 필드 생성자
		this();
		this.schoolName = schoolName;
		this.studentYear = studentYear;
		this.studentGroup = studentGroup;
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.studentAdress = studentAdress;
		this.studentPhone = studentPhone;
		this.graduationFlag = graduationFlag;
	}



	public void showStudentInfo() {
		
		student s1 = new student();
		System.out.println("학교명 : " + schoolName);
		System.out.println("학년: " + studentGroup );
		System.out.println("반:" + studentNumber);
		System.out.println("번호:"+ studentNumber);
		System.out.println("이름: " + studentName );
		System.out.println("주소 :" +  studentAdress);
		System.out.println("번호:" + studentPhone );
		System.out.println("졸업구분: " + (graduationFlag == true ? "졸업" : "재학중"));
	}
	
	public void incrementYear() {
		if(studentYear > 2 && graduationFlag == false) {
			graduationFlag  = true;
		}else {
			studentYear++;
		}
	
	}

}


