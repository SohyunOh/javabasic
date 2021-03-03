package api.lang.object;

public class Person implements Cloneable {

	private String name;
	
	public Person(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 오버라이딩
	
	@Override
	public boolean equals(Object obj) {
		//Person 이름이 같은 사람있다면 true
		
		if(obj instanceof Person) {
			Person p = (Person)obj;
			if(p.getName().equals(this.name)) { //문자열.같은지(내꺼 이름이랑)
				System.out.println("이름이 같음");
				return true; // 이름이 같음
				
			}
		}
		
		return super.equals(obj);
	}

	//오버라이딩
	@Override
	public String toString() {
		
		return "맴버변수:" + name;
	}

	//오버라이딩
	//객체복사 메서드
	//protected 이기때문데 ,사용시 오버라이디을 통해 생성
	// Cloneable 또한 인터페이스를 구현해서 사용해야됨.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 접근제어자 + 반환유형 +클론메서드 
		
		return super.clone();
	}

	//메모리에서 사라지는 시점에서 동작
	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.name + "님 소멸했습니다.");
	}
	
	// 자바에서 소멸은 garbage collector(가비지 콜랙터)가 시킴 
	
	

	

}
