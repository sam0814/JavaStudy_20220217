package a06_조건;

public class SwitchEx {

	public static void main(String[] args) {
		int select = 2;
		
		switch(select) {
		case 1 : 
			System.out.println("1을 선택 하셨습니다.");
		case 2 : 
			System.out.println("2를 선택 하셨습니다.");
		case 3 : 
			System.out.println("3를 선택 하셨습니다.");
		}
		
		String select2 = "송새미";
		
		switch(select) {
		case 1 :
			System.out.println("선택하신 이름은 송새미입니다.");
			break;
		case 2 :
			System.out.println("선택하신 이름은 송새미1입니다.");
			break;
		case 3 :
			System.out.println("선택하신 이름은 송새미2입니다.");
			break;
			default :
				System.out.println("해당 case는 없습니다.");
		}
			
			
		  switch(select) {
		  case 1 :
				System.out.println("선택하신 이름은 송새미입니다.");
				break;
			case 2 :
				System.out.println("선택하신 이름은 송새미1입니다.");
				break;
			case 3 :
				System.out.println("선택하신 이름은 송새미2입니다.");
				break;
				}
		  		int num = 21;
		  		
			   switch(num ==0 ? 2 : num % 2) {
		  		case 0 : System.out.println("짝수입니다.");
		  		break;
		  		case 1 : System.out.println("홀수입니다.");
		  		break;
		  		default : 
		  			System.out.println("num이 0입니다.");
		  			
		  }
		  
		  
			  
		

	}

}
