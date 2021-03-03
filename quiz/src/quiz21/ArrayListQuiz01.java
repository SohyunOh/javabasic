package quiz21;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQuiz01 {

	public static void main(String[] args) {

		// list에 1~20번 까지 정수 저장
		
		//저장한 값을 반복적으로 출력
		
		List<Integer> list = new ArrayList<>();

		for(int i= 1 ; i <= 20; i++  ) {
		
			list.add(i);
		}
		
		System.out.println(list.toString());

	}

}
