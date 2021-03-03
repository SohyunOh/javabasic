package ramda.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<>();

		list.add("홍길도");
		list.add("이순신");
		list.add("박찬호");
		list.add("김유신");
		list.add("홍길자");
		
		Iterator<String> iter = list.iterator(); //컬렉션 -> 반복자
		while (iter.hasNext()) {
		System.out.println(iter.next());
		
		}
		
		System.out.println("---------익명객체--------------");
		Stream<String> stream =list.stream(); //컬렉션 -> 스트림]
		
		stream.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
			System.out.println(t);
				
			} // forEach Consumer를 씀  Consumer은 알정하지 않음-> 익명객체 방법
		});
		
		System.out.println("---------람다식---------");
		//forEach 메서드는 최종처리 메서드이고, 람다식 표현을 쓸수있음
		list.stream().forEach( (t) -> System.out.println(t) );
		
	}

}
