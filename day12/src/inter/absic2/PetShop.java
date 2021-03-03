package inter.absic2;

public class PetShop  {
	
	//1. carePet() 메서드 선언
	// 기능 - 모든 IPet 타입(클래스 구분)을 전달 받을 수 있고, 어떤 펫타입인지 각각 확인하는 메서드
	
	public static void carePet(IPet pets) {
		// static : 객체 생성 없이 사용기 위해 사용
		if(pets instanceof Dog) {  // instanceof 안전하게 캐스팅하기 위해
			Dog d = (Dog)pets;  // 하위 클래스로 캐스팅
			d.eat();
			
		}else if(pets instanceof Cat) {
			Cat c  = (Cat)pets;
			c.eat();
	
		}else if (pets instanceof GoldFish ){
			GoldFish g = (GoldFish)pets;
			
		}
	}
	
	
	//2. IPet 배열을 받아서 Pet 배열안에 있는 기능 반복문으로 수행
	public static void petplay(IPet[] IpetArr) {
		for(IPet i : IpetArr ) {
			i.play();
		}
	}

	
}
