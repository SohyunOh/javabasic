package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		
		//Arraylist 객체생성
		//ArrayList<String> list =  new ArrayList<>();
//		Collection<String> list = new ArrayList<>(); 
		List<String> list = new ArrayList<>();  // 많이 쓰는 타입
		
		//lsit 의 값 추가 add()
		list.add("JAVA");
		list.add("DataBase");
		list.add("jsp");
		list.add("SPRING");
		list.add("JAVA");
		
		
		//list크기 의 size()
		System.out.println("list의 그키:"+ list.size());
		
		//list의 저장된 객체를 문자열로 확인 toString()
		System.out.println(list.toString());
		
		//list 의 중간에 추가 add (index, 값)
		list.add(2,"ORACLE");
		System.out.println(list.toString());
		
		//list의 값의 얻기  get(index)
		String value = list.get(2);
		System.out.println("2번째 인덱스 :" + value);
		
		//list의 특정값 포함여부 contains(값)
		if(list.contains("jsp")) { //있으면 true, 없으면 flase
			System.out.println("jsp가 포함되 있음");
			
		}
		//list삭제 remove(값),remove(isdex)
		list.remove(0);
		System.out.println(list.toString());
		
		list.remove("jsp");
		System.out.println(list.toString());
		
		
		//list에 컬렉션을 전체추가 addAll(리스트)
		
		String[] arr = {"Reacr", "AWS"};
		List<String> list2 = Arrays.asList(arr); // asList : list로 바꿔줌
		list.addAll(list2 );
		System.out.println(list.toString());
		
	}

}
