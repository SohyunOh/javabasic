package collection.list;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.IntegerSyntax;

public class Generic {

	//List<?> - 타입상관없이 무엇이든 들어갈 수 있음.
	//List<? extends String ? - String의자식클래스는 전달가능.
	//List <? super Integer> - Integer 의 형태를 가지고 있다면, 전달가능

	private static void add(List<?> list) {

	}
	private static void add2(List<? extends String >list) {

	}
	private static void add3(List<? super Integer >list) {

	}

	public static void main(String[] args) {
		List<String> list1= new ArrayList<>();
		List<Integer> list2= new ArrayList<>(); // 오브젝트는 스트링의 자식이 아님
		List<Object> list3= new ArrayList<>(); 
		
		
		add(list1);
		add(list2);
		add(list3);
		
		add2(list1);
//		add2(list2);//Integer x
//		add2(list3);//String 의 자식타입이 아니기 때문 x

//		add3(list1);
		add3(list2);
		add3(list3);

		
		
		
		
	}


}
