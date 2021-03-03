package quiz22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass  {

	public static void main(String[] args) {
	
		//List<Student 객체> 변수명 = 리스트배열 new ArrayList<Student 객체>();
		List<Student> a = new ArrayList<Student>();
		
		Scanner sc = new Scanner(System.in);
		
		point po = new point(); 
		
		
		
		while(true) {
			InterPoint.menuInfo();
			System.out.println("선택 번호 입력:");
		
			int menu = sc.nextInt();
			
			if(menu == 1 ) {
			po.input(a);
				System.out.println(a.toString());
			}else if (menu == 2){
				
				po.showAll(a);
				
			}else if (menu == 3){
				po.search(a);
			}else if (menu == 4){
				po.showAll(a);
			}else if (menu == 5){
				po.modify(a);
			}else if (menu ==6 ){
				po.delete(a);
			}else {
				System.out.println("메뉴에 있는 번호를 입력해주세요");
				
			}
			
			
			
		}
		
		
		
		
	}

}
