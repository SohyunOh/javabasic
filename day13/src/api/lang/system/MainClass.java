package api.lang.system;

public class MainClass {

	public static void main(String[] args) {
//		System.out.print("~");
		
//		1970년 1월 1일 오전 0시부터 현재 시간까지 경과시간을 밀리초로 환산
		long start = System.currentTimeMillis();
		
//		System.out.println(start);
		long sum =0;
		for(long i = 1 ; i <=1000000000L; i++) {
			sum +=i;
			
		}
		long end = System.currentTimeMillis();
		
		System.out.println("경과시간:"+ (end-start) * 0.001 +"초");
		
		String os = System.getProperty("os.name");
		System.out.println(os);
		
	}
}
