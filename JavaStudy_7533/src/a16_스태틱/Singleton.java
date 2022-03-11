package a16_스태틱;
/**
 * 
 *싱글톤(singleton) 디자인 패턴
 *1.클래스 내부에서 자기 자신을 생성하여 private 인스턴스 변수에 대입한다.
 *2.생성자의 접근 지정자가 private이다.
 *3.생성 된 인스턴스를 반환해줄 수 있는 스태틱 메소드가 존재 해야한다.
 *
 */

public class Singleton {

	public static void main(String[] args) {
		//KIA kia = new KIA(); 생성 불가능
	
		KIA factory1 = KIA.getInstance();
		KIA factory2 = KIA.getInstance();
		KIA factory3 = KIA.getInstance();
		KIA factory4 = KIA.getInstance();
		
		Car[] cars = new Car[4];
		
		cars[0] =factory1.creatCar("K5");
		cars[1] =factory2.creatCar("K7");
		cars[2] =factory3.creatCar("K8");
		cars[3] =factory4.creatCar("K9");
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
