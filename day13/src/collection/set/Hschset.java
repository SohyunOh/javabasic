package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hschset {

	public static void main(String[] args) {
	
		//set 계열은 순서 x, 중복 x
		
//		Hschset<String> set = new Hschset<>();
		
		Set<String> set = new HashSet<String>();
		
		//set 추가 add()
		set.add("JAVA");
		set.add("JSP");
		set.add("SPRING");
		set.add("ORACLE");
		set.add("JAVA");
		
		//set에 저장 된 크키 size()
		System.out.println("set의 크기:"+ set.size());
		System.out.println(set.toString());
		
		//set에 저장된 객체를 확인하려면 , 반복자를 통해 한번씩  확인
		Iterator<String> iter = set.iterator();
		

		while(iter.hasNext()) {		 //있는지 확인후 다음으로 넘김
			System.out.println(iter.next()); //다음접근
		}
		
		//set의 검색
		if(set.contains("JSP")) {
			System.out.println("JSP가 포함");
			
		}
		
		set.remove("JAVA");
		System.out.println(set.toString());
		
	}

}
