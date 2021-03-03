package quiz02;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student("홍길동", 1, 53, 66, 72)	;
		
		System.out.println("합계:" + s1.getTotal());
		System.out.println("평균:" + s1.getAvg());
		
		
	}
}
