package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCInsert {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("id>");
		String id = scan.next();
		
		System.out.print("pw>");
		String pw = scan.next();
		
		System.out.print("name>");
		String name = scan.next();
		
		System.out.print("email>");
		String email = scan.next();
		
		//1. 필요한 변수를 선언
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "user01";
		String upw = "user01";
		
		//i, u, d 는 받아올 결과가 없기 때문에 ResultSet이 필요가 없습니다
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "insert into member(id, pw, name, email) values(?, ?, ?, ?)";
		
		try {
			//2.드라이버로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//3. conn생성
			conn = DriverManager.getConnection(url, uid, upw);
			//4. pstmt생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id );
			pstmt.setString(2, pw );			
			pstmt.setString(3, name );
			pstmt.setString(4, email );
			
			//5. sql문실행 - i, u, d는 executeUpdate()
			//업데이트 성공시 1을 반환, 실패시 0을반환
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("DB입력 성공");
			} else {
				System.out.println("DB입력 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
