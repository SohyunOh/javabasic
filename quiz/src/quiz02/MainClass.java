package quiz02;

public class MainClass {

	public static void main(String[] args) {
		
		Person park = new Person("홍길동", 20, 180);
		park.info();
		
		Person kim = new Person();
		kim.age = 30;
		kim.name = "홍길자";
		kim.tall = 170;
		
		kim.info();
	
	}
}
