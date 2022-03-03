package a09_클래스_정보은닉;

public class Encapsulation {
	private String username; //아이디
	private String password; //비밀번호
	private String provider; //서비스 회사 google, kakao, naver
	
	public Encapsulation( String password, String provider) {
		
	
	
	this.password = password;
	this.provider = provider;
}
	
	public void setUsername(String username) {
		if(provider.equals("kakao")) {
			this.username = username + "@kakao.com";
		}else if(provider.equals("google")) {
			this.username = username + "@google.com";
		}else if(provider.equals("naver")) {
			this.username = username + "@naver.com";
		}else {
		this.username = username;
	}
	}
	
	public String getUsername() {
		return username;
	}
	
	public void showInfo() {
		System.out.println(username);
		System.out.println(password);
		System.out.println(provider);
	}

}
