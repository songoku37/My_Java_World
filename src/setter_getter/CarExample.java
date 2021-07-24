package setter_getter;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
//		myCar.speed = 0;
//		myCar.price = 100;

//		System.out.println(price);
		myCar.setSpeed(-50);
		
		System.out.println("현재속도 : " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		System.out.println("현재속도 : " + myCar.getSpeed());
		
		myCar.setPrice(-500);

	}


}

