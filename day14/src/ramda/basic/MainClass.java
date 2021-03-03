package ramda.basic;

public class MainClass {

	public static void main(String[] args) {

		//1st -> say01인터페이스를 구형하는 클래스 만들고 실행
		//2st -> 익명객체

		Person p = new Person();
		p.greating(new Say01() {

			@Override
			public void talking() {
				System.out.println("한국말 : 안녕");

			}

		});



		//		3st -> 람다식 표현(실행시켜야 할 문장이 한줄이면 {} 가 생략가능)
		//		Person pp = new Person();
		//		pp.greating(() -> {
		//			System.out.println("그린티");
		//		});

		p.greating(()-> System.out.println("미국말: hi"));
		System.out.println("-----------------------");
		//매개변수가 있는 유형
		p.greating(new Say02() {

			@Override
			public void talking(String word) {
				System.out.println(word);
				
			}
			
		});
		//매개변수가 있는 유형 람다식 표현
		p.greating((word) -> System.out.println(word));
		
		System.out.println("--------------");
	
		p.greating(new Say03() {
			
			@Override
			public String talking() {
			
				return "finsh";
			}
		});
		//람다식 표현 () ->{}
		p.greating( () -> { //리턴이 있다면 중가로를 열음
			System.out.println("finish");
			return "finsh";
		}).greating( () -> {
			return "finish";
		});
		
	}
	
	
}
