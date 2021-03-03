import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BoardDAO  implements DAOInterface{

   
   
   private String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
   private final String uid = "user01";
   private final String upw = "user01";
   
   
   //생성자
   public BoardDAO() {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   
   
   public void SearchMember(String id) {
      Connection conn = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      
      String sql = "select * from member where id = ?";
      
      
      try {
         conn = DriverManager.getConnection(url , uid,upw);
         pstmt = conn.prepareStatement(sql);
         
         pstmt.setString(1, id);
         
         rs = pstmt.executeQuery();
         
         while(rs.next()) {
        
            System.out.println("id:" + rs.getString("id") );
            System.out.println("pw:" + rs.getString("pw") );
            System.out.println("name:" + rs.getString("name") );
            System.out.println("phone:" + rs.getInt("phone_number") );
            
         }
         
         
         
      } catch (Exception e) {
         e.printStackTrace();
      }       
      
   
   }


   
   public void SearchBook(String title) {
      Connection conn = null; 
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      
      String sql = "select * from book where title = ?";
      try {
         
         conn = DriverManager.getConnection(url,uid,upw);
         pstmt = conn.prepareStatement(sql);
         
         rs = pstmt.executeQuery();
         
         while(rs.next()) {
            
            System.out.println("책 번호:" + rs.getInt("b_no"));
            System.out.println("책 번호:" + rs.getInt("b_no"));
            System.out.println("책 번호:" + rs.getInt("b_no"));
            System.out.println("책 번호:" + rs.getInt("b_no"));
            System.out.println("책 번호:" + rs.getInt("b_no"));
            
            
         }
         
      } catch (Exception e) {
         e.printStackTrace();
      }
      
      
      
      
      
      
      
   }

//대여책 조회
@Override
public  ArrayList<RentVO> SearchRentBook() {
	

	Connection conn =null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	ArrayList<RentVO> list = new ArrayList<RentVO>();
	
	String sql = "select * from book_rent ";
	
	try {
		
		conn = DriverManager.getConnection(url ,uid, upw);
		
		pstmt = conn.prepareStatement(sql);
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			RentVO vo = new RentVO();
			
			vo.setRent_no(rs.getInt("rent_no"));
			vo.setB_number(rs.getInt("b_number"));
			vo.setId(rs.getString("id"));
			vo.setCount(rs.getInt("count"));
			vo.setRegdate(rs.getTimestamp("regdate"));
			
			list.add(vo);
			
			
		}
		
		
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}try {
		pstmt.close();
		conn.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return list;
	
	
}

//책대여하기
@Override
public void RentBook(String title, int count) {
	// TODO Auto-generated method stub
	
}

// 5. 책 등록하기
@Override
public void bookInsert(int b_no, String id, int count) {
	// TODO Auto-generated method stub
	
}

//6. 회원등록하기 
@Override
public void MenmerInsert(String id, String pw, String name, String phone_number) {
	// TODO Auto-generated method stub
	
}
   
   
   
   
   
   
   
   
}