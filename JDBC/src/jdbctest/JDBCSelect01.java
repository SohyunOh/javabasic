package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class JDBCSelect01 {

	public static void main(String[] args) {
		
		//1. 연결할 주소, 아이디, 비밀번호를 변수로
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1"; //주소는 DB환경에 따라 변경
		String uid = "hr";
		String upw = "hr";

		String sql = "select employee_id, last_name, salary, hire_date "
					+ "from employees where employee_id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//2. java.sql패키지를 사용하게되는데, 해당 클래스는 전부 throws~Exception을 던지고 있기 때문에
		//   try구문안에서 실행을 시킵니다.
		try {
			
			//3. 사용할 드라이버를 클래스로더에 생성
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//4. 연결객체생성 (Connection객체)
			conn = DriverManager.getConnection(url, uid, upw);
			
			//5. SQL문 쿼리를 전달하기 위한 Statement객체를 Connection에서 얻음
			//   만약에 sql문의 전달할 값이 있다면, ?로 처리를 하고 순서대로 1번 인덱스 값을 갖습니다.
			//   숫자값은 setInt(index, 값) 을 통해 저장,
			//   문자값은 setString(index, 값)
			pstmt = conn.prepareStatement(sql); 
			pstmt.setString(1, "100");

			//6. SQL문을 실행
			//   - select구문일 경우는 executeQuery()
			//   - i, u , d구문일 경우는 executeUpdate()
			rs = pstmt.executeQuery();
			
			//7. rs를 반복문으로 돌려서 결과를 처리.
			//   -rs의 next()메서드를 통해 다음 행을 조회하는 형식으로 처리합니다.
			
			while(rs.next() ) {
				/*
				 * select의 결과를 하나씩 읽으려면
				 * 문자열은 getString(컬럼명)
				 * 숫자는 getInt(컬럼명)
				 * 날짜는 getTimstamp(컬럼명)
				 */
				
				int employee_id = rs.getInt("employee_id"); //숫자형
				String last_name = rs.getString("last_name"); //문자형
				int salary = rs.getInt("salary"); //숫자형
				Timestamp hire_date = rs.getTimestamp("hire_date"); //날짜형
				
				System.out.println("사원아이디:" + employee_id);
				System.out.println("이름:" + last_name);
				System.out.println("급여:" + salary);
				System.out.println("입사일:" + hire_date);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
