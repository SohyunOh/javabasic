package abs.good;

public abstract class HeadStore { //부모클래스 (본점)
	
	/*
	 * 1. 매서드의 abstract를 붙이면 추상메서드가 됩니다. 이 메서드는 
	 * 상속을 통해서 반드시 오버라이딩 되어야 합니다.
	 * 2. 추상메서드는  {} 가 없는 매서드의 선언 입니다.
	 *  추상메서드가 하나라도 있다며느 클래스도 추상클래스가 되어야 합니다. 
	 * 3. 추상메서드는 일반메서드, 생성자, 맴버변수를 모두 사용할 수 있습니다.
	 *  
	 */
	
	private String name = "호식이 두마리 과일가게";
	
	public HeadStore() {
		
	}
	public String getName() {
		return name;
	}
	
	public abstract void apple() ;
	public abstract void banana() ;
	public abstract void melon() ;
	public abstract void orange() ;
	


}
