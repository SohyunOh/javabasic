package overriding.basic2;

public class Student extends Person {

	String studentId;
	//info메서드 오버라이딩 (학번 정보를 포함해서 리턴) 
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 학번:" + studentId;
	}
	
}
