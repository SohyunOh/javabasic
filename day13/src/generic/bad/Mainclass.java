package generic.bad;

public class Mainclass {

	public static void main(String[] args) {
		
		/*
		 * 맴버변수 오프젝트 형으로 선언하면 무엇이즌 저장할 수 있지만
		 * 저장하던 값을 사용할떄, 타입별로 형변환 해야하는 문제 발생
		 * 그리고 잘목 형변환 하면 예외 발생
		 * 
		 */
		
		
		ABC abc = new ABC(); //생성자
		
		abc.setObj("홍길자");
		String name = (String) abc.getObj();
		
		ABC p = new ABC(); //생성자
		p.setObj(new Person());
		
		Person person = (Person)p.getObj();
		
		

	}

}
