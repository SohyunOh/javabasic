package static_.singleton;

public class MainClass {

	public static void main(String[] args)  {
		
		//Singleton s1 = new Singleton();
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1.getName());
		
		System.out.println(s1 == s2);
		
		
	}
}
