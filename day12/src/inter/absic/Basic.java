package inter.absic;

public class Basic implements Inter1, Inter2 {
	
	/*
	 * 1. 인터페이스의 구현(상속) 키워드는  implements
	 * 2. 인터패이스의 선언된 추상메서드는 반드시 자식 클래스에서 오버라이딩 해야됩니다.
	 * 3. 인터페이스는 다중 상속이 됩니다.
	 */

	@Override
	public void method1() {
		System.out.println("재정의 된 1번 매서드 호출");
		
	}

	@Override
	public void method2() {
		System.out.println("재정의 된 2번 매서드 호출");
		
	}
	
	public void  method3() {
		System.out.println("Basic클래스의 매서드 호출");
	}
	

}
