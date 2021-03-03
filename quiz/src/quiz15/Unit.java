package quiz15;

public abstract class Unit {
	// abstract 추상메서드 
	private int x;
	private int y;
	private int hp;
	
	public Unit(int x, int y, int hp) {
		this.x = x;
		this.y = y;
		this.hp = hp;
	
	}
	//각각 오버라이딩 해야하는 메서드는 추상메서드로 선언 = 오버라이딩 강제화 
	public abstract void lacation();
	public abstract void move(int x, int y);
	public void stpo() {
		System.out.println("정지");
	}
	
	// 게터, 세터 alt + 쉬프트 +s
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void lacation(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
	

}
