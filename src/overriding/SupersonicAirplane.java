package overriding;

public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC =2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다");
		}else {
			super.fly(); // 부모 메소드 불러옴 부모에서 정의된 필드도 가져올 수 있음[전역만]
		}
	}
}
