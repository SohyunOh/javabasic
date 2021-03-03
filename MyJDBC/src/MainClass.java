import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
   
   public static void main(String[] args) {
      
      /*
       도서관리 , 제고관리 , 물품관리  들들 간단한 주제를 선택해서 JDBC프로그램을 연습합니다 
       
       단 , 테이블은 3개 이상 
       인터페이스르 반드시 사용합니다  
       
       ArrayList를 반드시 사용해서 
       사용 메서드는 6개 이상  --> DB구축 --> 코드작성
       
       
       */
      Scanner sc = new Scanner(System.in);
      
      DAOInterface dao = new BoardDAO();
      
      while(true) {
         
         System.out.println("1. 회원조회   2.책 조회  3.대여중인 책 조회  ");
         String menu = sc.next();
         
         
         switch (menu) {
         case "1":
            
            System.out.println("조회할 회원의 id>");
            String id = sc.next();
             
            MemberVO vo = new MemberVO();        
            vo.setId(id);
            
            dao.SearchMember(id);
                        
            
            
            break;
            
         case "2" :
        	 
        	 System.out.println("책 조회>");
        	 String title  = sc.next();
        	 
        	
        	 break;
        	 
        	 
        	 // 대여중인 책 조회
         case "3":
        	 
        	 ArrayList<RentVO> list = new ArrayList<RentVO>();
        	 list = dao.SearchRentBook();
        	 
        	 for(RentVO r : list) {
        		 System.out.println(r.getRent_no());
        		 System.out.println(r.getB_number());
        		 System.out.println(r.getId());
        		 System.out.println(r.getCount());
        		 System.out.println(r.getRegdate());
        	 }
        	 
        	 
        	 
        	 
        	 break;
        	 
     case "4":
        	 
        	 break;
            
        	 
     case "5":
    	 
    	 break;
        
    	 
     case "6":
    	 
    	 break;
        
  
            
         default:
        	 
      
        	 
        	 
        	 
        	 
        	 
        	 
        	 
            break;
         }
         
         
         
         
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
   }

}