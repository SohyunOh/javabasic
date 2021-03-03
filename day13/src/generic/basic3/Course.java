package generic.basic3;

public class Course<T> {

	private String num;
	private T Student;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public T getStudent() {
		return Student;
	}
	public void setStudent(T student) {
		Student = student;
	}
	
	
}
