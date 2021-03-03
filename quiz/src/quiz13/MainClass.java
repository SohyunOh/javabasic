package quiz13;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior me = new Warrior("나의케릭터");
		
		Warrior p1 = new Warrior("너의케릭터");
		Wizard p2 = new Wizard("남의케릭터");
		
		me.bash(p1);
		me.bash(p2);
		me.bash(p1);
		me.bash(p2);
		me.bash(p1);
		me.bash(p2);
		
		p1.info();
		p2.info();
		
		Player[] arr = {me, p1 };
		p2.blizzard(arr);
		p2.blizzard(arr);
		
		
		
		
	}
}
