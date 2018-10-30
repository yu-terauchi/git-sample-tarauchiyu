package practice;

public class Car {
	private int speed;
	private String bodyColor;
	
	public Car() {
		speed = 0;
		bodyColor = null;
	}
	
	public Car(int speed, String bodyColor) {
		super();
		this.speed = speed;
		this.bodyColor = bodyColor;
	}
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", bodyColor=" + bodyColor + "]";
	}
	public int getSpeed() {
		speed += 30;
		System.out.println("スピードが上がったよ");
		System.out.println("ただ今のスピードは" + speed + "です");
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getBodyColor() {
		return bodyColor;
	}
	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}
}
	