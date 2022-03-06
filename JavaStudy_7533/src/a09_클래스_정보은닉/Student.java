package a09_클래스_정보은닉;

public class Student {
	
	private String SchoolName;
	private int StudentCode;
	private int StudentYear;
	private String StudentName;
	
	
	
	public Student(String schoolName, int studentCode, int studentYear, String studentName) {
		super();
		SchoolName = schoolName;
		StudentCode = studentCode;
		StudentYear = studentYear;
		StudentName = studentName;
	}
	public String getSchoolName() {
		return SchoolName;
	}
	public void setSchoolName(String schoolName) {
		this.SchoolName = schoolName;
	}
	public int getStudentCode() {
		return StudentCode;
	}
	public void setStudentCode(int studentCode) {
		this.StudentCode = studentCode;
	}
	public int getStudentYear() {
		return StudentYear;
	}
	public void setStudentYear(int studentYear) {
		this.StudentYear = studentYear;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		this.StudentName = studentName;
	}
	
	public void showStudentInfo() {
		System.out.println("학교명: " + SchoolName);
		System.out.println("학번: " + StudentCode);
		System.out.println("학년: " + StudentYear);
		System.out.println("이름: " + StudentName);
		System.out.println();
	}

}
