package a09_클래스_정보은닉;

public class CarTest {

	public static void main(String[] args) {
		Car c = new Car();
		c.setModel("K5");
		
		String companyAndModel = "KIA자동차" + c.getModel() + "차량";
		
		System.out.println(companyAndModel);

	}

}
