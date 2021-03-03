package ramda.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MainClass02 {

	public static void main(String[] args) {
		
		//stream의 중간처리
		Random r = new Random();
		List<Integer> list = new ArrayList<>();

		for(int i = 0; i < 100 ; i++) {
			list.add(r.nextInt(100 )+1 );
			//1~100 까지 랜덤수

		}

		System.out.println("처음:"+ list.toString());

		System.out.println("-------------------");
		//중복제어 distinct() -stream()의 중간처리 네서드는 처리 결과를 다시 stream타입으로 반환
		list.stream().distinct().forEach( (s) -> System.out.println(s+" "));
		System.out.println("\n-------------------");

		//정렬 sort
		list.stream().distinct().sorted().forEach( (s) -> System.out.println(s+" "));

		System.out.println("\n-------------------");

		//필터링filter
		list.stream().distinct().sorted().filter( (t) -> {
			return t % 2 ==0;
		})
		.forEach( (t) -> System.out.println( t + " "));

		System.out.println("\n-------------------");
		//map() - 람다안에 정의된 새로운 stream 타입으로 반환
		//		Stream<String> s2= 
		list.stream().distinct().sorted().map(new Function<Integer, String>() {

			@Override
			public String apply(Integer t) {

				return t % 2 == 0 ? "짝수" : "홀수";
			}

		})
		.forEach( (t) -> System.out.println( t + " "));


		System.out.println("\n-------------------");

		list.stream().distinct().sorted().map( (i) -> {
			return i % 2 == 0 ? "짝수" : "홀수";
		})
		.forEach( (t) -> System.out.println(t + " "));

		System.out.println("\n-------------------");
		//최종처리 - cllect() 스트림의 처리괸 결과를 list 로 반환
		List<Integer> result = list.stream().sorted().filter( (t) -> t % 3 == 0)
		.collect(Collectors.toList()); //리스트로 반환 받겠다는 의미
		System.out.println(result.toString());
		
		//최종처리 - max 큰값
//		list.stream().distinct().max( (a,b) -> {
//			
//		}
//		

	}

}
