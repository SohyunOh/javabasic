package collection.map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class HashMapEx {

	public static void main(String[] args) {
		
		
//		HashMap<Integer, String> MAP = new HashMap<>();
		Map <Integer, String> map = new HashMap<>();
		
		//map에 저장 put (키, 값)
		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길자");
		map.put(4, "홍길동");
		
		System.out.println("맵 크기: "+ map.size());
		System.out.println(map.toString());
		
		//맵에 같은 key를 저장할 경우, key에 잇는 value를 수정
		map.put(4, "신사임단");
		System.out.println(map.toString());
		
		
		//map에 저장된 value 값을 얻기 get(키)
		String val = map.get(3);
		System.out.println("3번에 키에 저장된 값: " + val);
		
		//map늬 검색 containsKey(key)
		if(map.containsKey(1)) {
			System.out.println("1번 키가 존재함."); //key 있다면, true, 없다면 false
		}
		
		
		//map에 지정된 값을 순서대로 출력, keySet, EntrySet
		Set<Integer> set = map.keySet(); //key만 뽑아 set으로 바꿈
		for(int key : set) {
			System.out.println(map.get(key));
		}
		
		/////////////반복자/////////////////
		Set<Integer> keySet = map.keySet(); //key만 뽑아 set으로 바꿈
		System.out.println(keySet.toString());
		
		Iterator<Integer> iter = keySet.iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			System.out.println(map.get(key));
		}
	///////////////////////////////////////////////////
		Set<Entry<Integer, String>> en = map.entrySet();
		
		for(Entry<Integer, String> e : en) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
				
		//map 데이터 삭제 remove(키)
		map.remove(3);
		System.out.println(map.toString());
	}

}
