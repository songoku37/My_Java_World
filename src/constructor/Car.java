package constructor;

public class Car {
	String model; // this.model임
	int speed;
	
	//생성자
	Car(String model){
		this.model = model; // model은 매개변수
       // Car 클래스 형태를 가진 model과 클래스안에 model 과 구분짓기위해
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for (int i = 10 ; i <= 50 ; i = i + 10) {
			//this.setSpeed(i);
			setSpeed(i);
			System.out.println(this.model + "가 달립니다. (시속 : " 
			+ this.speed + "km/h)");
		}
	}
}
	