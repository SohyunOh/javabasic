package inter.absic2;


//implements  키워드는 extends 보다 뒤에 있어야합니다.
public class Cat extends Animal implements IPet {

	@Override
	public void eat() {
		System.out.println("냥냥이는 생선을 좋아해요");
	}

	@Override
	public void play() {
		System.out.println("냥냥이는 방에서 뛰어 놀아요");
		
	}
	

}