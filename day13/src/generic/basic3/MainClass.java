package generic.basic3;

public class MainClass {

	public static void main(String[] args) {
		
		//ITBank 안에 있는 두가지 매서드 사용
		

		ITBank itb = new ITBank();
		
		Course<Student> couse = new Course<>();
		couse.setNum("1");
		couse.setStudent(new Student("홍길동", 20));
		
		//매개변수가 제네릭타입인 메서드 실행
		itb.info(couse);
	
		// 반환유형이 제네릭타입인 메서드를 실행
		Course<Student> c =itb.get();
		System.out.println("번호:"+ c.getNum() 
				+ ", 이름:"+ c.getStudent().getName());
	}

}
