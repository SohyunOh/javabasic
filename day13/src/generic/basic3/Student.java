package generic.basic3;

public class Student {

	//생성자
	private String name;
	private int age;

	//생성자
	public Student(String name,int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Student() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	

}
