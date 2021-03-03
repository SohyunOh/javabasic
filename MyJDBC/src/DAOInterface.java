import java.util.ArrayList;

public interface DAOInterface {
   
   
   // 1.회원 조회 
   public void SearchMember(String id);
   
   
   //2 . 책 조회
   public void SearchBook(String title);
   
   
   //3. 대여중인 책 조회 
   public ArrayList<RentVO> SearchRentBook();
 
  
   
   // 4. 책대여하기
   
   public void RentBook(String title , int count);
   
   // 5. 책 등록하기
   
   public void bookInsert(int b_no,String id, int count ) ;
   
   
   // 6. 회원등록하기 
   public void MenmerInsert (String id, String pw, String name ,String phone_number);
   
   

}