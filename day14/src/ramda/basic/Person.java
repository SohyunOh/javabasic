package ramda.basic;

public class Person {

	public void greating(Say01 say) {
		say.talking();

	}
	
	public void greating(Say02 say) {
		say.talking("bye");

	}
	
	public Person greating (Say03 say) {
		say.talking();
	
		Person p = new Person() ;
		return p;
	}
	

}
