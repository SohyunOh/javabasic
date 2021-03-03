package api.lang.stringbuilder;

public class StrinfTest {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
//		String s = "A";
//		for(int i =1; i <= 3000000;i++ ) {
//			s += i ;
//		}
//		
//		long end = System.currentTimeMillis();
//		
//		System.out.println("소요시간:"+ (end-start)* 0.001);
//		
//	}
	
	StringBuffer sb = new StringBuffer("A");
	for(int i=0; i<300000; i++) {
		sb.append("A");
		}
		long end = System.currentTimeMillis();
		System.out.println("StringBuilder: " + (end-start)*0.001 + "초");
	
	}
}
