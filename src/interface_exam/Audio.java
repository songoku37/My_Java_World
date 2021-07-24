package interface_exam;

public class Audio implements RemoteControl{
	public void turnOn() {
		System.out.println("Audio를 킵니다");
	}
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}
}
