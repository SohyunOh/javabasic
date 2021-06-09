package overriding.basic2;

public class Teacher extends Person {
	// 선생님 클래스 에 사람을 상속 
	String subject;

	String info() {
		return "이름:" + name + ", 나이:" + age + ", 과목:" + subject;
	}
	
	
}
