package inter.absic;

public interface Inter1 {

	
	//상수와 추상 메서드가 정의됩니다.
	double PI =3.141; //인터페이스 변수를 선언하면 저동으로 상수 취급됩니다.
	public void method1();  //인터페이스 메서드를 선언하면 자동으로 추상메서드가 됩니다.

	//1.8버전 이후 인터페이스에  static 사용가능
//	public static void method2();
	
	
}
