package anonymous.basic01;
/*
 인터페이스 타입으로 변수를 선언하고, 구현 객체를 초기값으로 대입하는 경우를 생각해보자.
인터페이스의 구현 클래스를 선언하고,
new 연산자를 이용해서 구현 객체를 생성한 후, 필드나 로컬 변수에 대입하는 것이 기본이다.
하지만,
구현 클래스가 매번 달라지거나, 한 번만 사용되는 경우, 굳이 구현 클래스를 생성하지 않고
익명 클래스로(이름 없는 클래스) 로 선언 할 수 있습니다
 */

interface Car{
	public void run();
}

//카를 상속받는 디코 
class Tico implements Car {

	@Override
	public void run() {
		System.out.println("티코");
		
	}
	
}
//------------ 클래스 안에 클래스  = 익명객체 구현-------------
public class Garage {

	//public Car car= new Tico(); 
	public Car car=  new Car() {
		
		@Override
		public void run() {
			System.out.println();
			
		}
	};
	

	public static void main(String[] args) {
		
		Garage g = new Garage();
		g.car.run();

	}
	
	
}
