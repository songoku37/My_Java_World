package class_exam;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car(); // 클래스 변수명은 다 소문자
		
		System.out.println("제작회사 : " + car.company);
		System.out.println("모델명 : " + car.model);
		System.out.println("색깔 : " + car.color);
		System.out.println("최고속도 : " + car.maxspeed);
		System.out.println("현재속도 : " + car.speed);
	
		//필드값 변경
		car.speed = 60;
		System.out.println("수정된 속도 : " + car.speed);
	}

}
