package quiz16;

public class Circle extends Shape {

	
	/*
	 * 원은 radius 변수를 가지고 
	 * 생선될 떄 이름과, 변의 길이를 받아서 생성됩니다,
	 * 상수 PI를 맴버 변수로 갖습니다.
	 * getArea() 원의 넓이를 계산하도록 처리합니다.
	 */


	private int radius;
	public static final double PI = 3.14;
	
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
		
	}
	
	
	@Override
	public double getArea() {
		return radius * radius * PI;
	}

}