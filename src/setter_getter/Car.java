package setter_getter;

public class Car {
	// punlic int speed;
	private int speed;
	private int price;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price >= 0) {
			this.price = price;
		}else {
			throw new IllegalArgumentException("가격은 음수가 될 수 없습니다.");
		}
		
	}
}
