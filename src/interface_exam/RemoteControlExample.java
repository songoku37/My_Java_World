package interface_exam;

public class RemoteControlExample  {

	public static void main(String[] args) {
		RemoteControl rc = new Television(); // interface 변수 선언
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();

	}

}
