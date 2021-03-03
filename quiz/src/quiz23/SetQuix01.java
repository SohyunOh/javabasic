package quiz23;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetQuix01 {

	public static void main(String[] args) {
		/*
		 * 1. Random객체를 이용해서 1~45랜덤수 만들고
		 * 2. Set을 이용해서 6개의 로또번호 만들기
		 */

		Set<Integer> set= new HashSet<Integer>();
		Random ran = new Random();

		while(true) {
			if(set.size() == 6 ) {
				int a =(int)(Math.random()*45 )+1;
			}
		}
		
		



	}
}
