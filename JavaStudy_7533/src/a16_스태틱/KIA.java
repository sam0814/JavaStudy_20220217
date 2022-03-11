package a16_스태틱;

import java.time.LocalDate;

public class KIA {
	private static KIA instance;
	private String companyName;
	private int serialNumber;
	
	public KIA() {
		companyName = getClass().getSimpleName();
		serialNumber = LocalDate.now().getYear() * 10000;
	}
	
	public static KIA getInstance() {
		if(instance == null) {
			instance = new KIA();
		}
		return instance;
	}
	
	public Car creatCar(String model) {
		return new Car(++serialNumber, companyName, model);
	}

}
