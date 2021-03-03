package generic.basic3;

public class ITBank {
	
	//제네릭 클래스를 매개변수로 받을 수 있는 매서드
	//	public void info(Course<?> t) { //?로 표기할 경우 제약 사항이 매우 안좋음
	
	public void info(Course<Student> t) { 
	
		String num = t.getNum();
		Student s = t.getStudent();
		
		System.out.println("번호:" + num + ", 이름:" + s.getName());
		
	}
	
	// 제네릭 클래스를 반환유형 돌려주는 매서드
	
	public /*<V>*/ Course<Student> get(){
		
		Student s = new Student(); // 정장하기 위한 객체
		s.setAge(10);
		s.setName("홍길동");
		
		
		Course<Student> c  = new Course<Student>();
		c.setNum("1");
		c.setStudent(s);
		
		
		return c; 
	}

}
