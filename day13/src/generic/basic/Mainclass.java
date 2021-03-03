package generic.basic;

public class Mainclass {

	public static void main(String[] args) {
		
		/*
		 * 제네릭 클래스를 이용하면, 객체를 생성할 때 타입을 저장할 수 있고,
		 * 다목적 형태의 클래스를 안정하게 사용이 가능합니다.
		 */

		ABC<String> abc = new ABC<String>(); // 생성저의 제네릭타입은 생략이 가능
		
		abc.setT("홍길자");
		String name = abc.getT();
		System.out.println(name);

//		ABC<int> abc2 = new ABC<>(); //제네릭에는 기본형이 저장될수 없습니다.
		ABC<Integer> abc2 = new ABC<>(); 
		abc2.setT(1);
		
		int num = abc2.getT(); // 사용할때는 기본형으로 사용가능
		System.out.println(num);
		
		//Person타입을 저장하는 ABC클래스
		ABC<Person> abc3 = new ABC<>(); 
		abc3.setT(new Person());
		Person p  = abc3.getT();

	}

}
