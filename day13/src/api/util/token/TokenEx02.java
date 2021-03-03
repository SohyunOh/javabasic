package api.util.token;

import java.util.StringTokenizer;

public class TokenEx02 {

	public static void main(String[] args) {

		String log = "2020.09.23, /bno=30, user=홍길동";
		
		// ,./ 기준으로 잘림
		StringTokenizer token1 = new StringTokenizer(log, ",./");

		while(token1.hasMoreTokens()) {
			System.out.println(token1.nextToken());
		}
		System.out.println("==================");
		
		// , 도 토큰으로 간주
		StringTokenizer token2 = new StringTokenizer(log, ",",true);

		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
	}

}
