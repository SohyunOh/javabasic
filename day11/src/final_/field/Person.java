package final_.field;

public class Person {
	
	/*
	 * final 변수는 값이 대입되면 변경 할 수 없기; 때문에
	 * 직접 초기화 하거나, 생성자를 통해서 잔드시 초기화 해야한다.
	 * 
	 */
	
	public final String nation = "대한민국";
	public final String ssn; //주민번호
	public String name;

	public Person (String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
		
	}

}
