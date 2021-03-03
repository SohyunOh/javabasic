package generic.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Basic<Integer, String> basic = new Basic< >();  // 뒤 매개부분 생략가능
		
		basic.put(1, "홍길동"); // 집어넣을땐 2개 지정
		basic.get(1); // 불러올때 숫자 값 
		String name = basic.get(1);
		
		System.out.println(basic.toString());
		
		

	}

}
