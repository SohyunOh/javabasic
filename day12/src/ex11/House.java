package ex11;

public class House {
	
	private Person[] person;
	
	public House() {
		super();
		this.person = new Person [10];
	}
	
	 public void getIn(Person p) {
		 
		 int count = 0 ;
		 for (int i = count ; count < person.length; i++) {
			 if(person[i] == null ) {
				 person[i] = p;
			 }else {
				 count++;				 
			 }
		 }
		 
	 }

	 public void print () {
		 for(int i = 0 ;  i < person.length ; i++) {
			 if(person[i] != null) {
				 System.out.println(person[i].getName());
				 System.out.println(person[i].getAge());
			 }
		 }
	 }
	
	
	 public Person[] getter() {
		 return person ;
		 
	 }
	
	 
	 
}
