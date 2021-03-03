package inter.absic2;

public class MainClass {
	
	public static void main(String[] args) {
		
		Animal babuk = new Dog();
		Animal nabi = new Cat();
		Animal hobol = new tiger();
		Fish 금붕어 = new GoldFish();
		
		//1. Animal 배열 생성해서 babuk,nabi ,hobol 저장하고 Animal 공통기능출력
		
		Animal[] arr = {babuk, nabi ,hobol };
		// *속성[] 배열이름    
		
		for(Animal a : arr ) {   // *for(대입 받는 변수정의 : 배열명)
			a.eat();
		}
		
		//2.IPet 배열을 생성 한 후 babuk,nabi ,금붕어 를 저장, 향상된 포문으로 IPet기능 사용
		//캐스팅해야함
		//babuk는 애니멀 타입, 하위클래스 
		
		System.out.println("=============");
		
		IPet[] arr2 = {(Dog) babuk, (Cat) nabi , (GoldFish) 금붕어};
		
		
		for(IPet i : arr2) {
			i.play();
		}
	
		
		IPet[] pets = new IPet[3]; 
		pets[0] = (IPet)babuk;
		pets[1] = (IPet)nabi;
		pets[2] = new GoldFish();
		for(IPet i : pets) {
			i.play();
		}
		
		System.out.println("=============");
		
		//3.  PetShop 기능
		
		PetShop.petplay(arr2);
		
		PetShop shop = new PetShop();
		shop.carePet(pets[0]);
		shop.carePet((IPet)nabi);
		shop.carePet(new GoldFish());
		
		shop.petplay(pets);
		
		
		
		
		
		
	}

}
