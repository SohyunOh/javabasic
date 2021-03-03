package quiz13;

public class Warrior extends Player {
	
	//1. 생성자 : name만 전달받아서 hp = 1000, mp = 500, attack = 10 초기화
	public Warrior(String name) {
		this.name = name;
		this.hp = 1000;
		this.mp = 500;
		this.attack = 10;
	}
	
	//2. bash스킬은 player타입을 받아서 각각의 직업의 따라 해당 객체의 hp를 다르게 감소.
	public void bash(Player p) {
		
		if(mp < 100) {
			System.out.println("mp가 부족합니다");
			return; //메서드 종료
		}
		
		System.out.println(p.name +"님이 스킬에 적중");
		mp -= 100; //나의 mp변수
		
		if(p instanceof Warrior) {
			p.hp -= 100; //넘어온 변수
		} else if(p instanceof Wizard) {
			p.hp -= 200;
		}
		
		
	}
}
