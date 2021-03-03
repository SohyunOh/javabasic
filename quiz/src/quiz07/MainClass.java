package quiz07;

public class MainClass {

	public static void main(String[] args) {
		
		//printArray메서드는 문자열 배열을 받아서, 배열요소를 문자열의 형태로 리턴
		
		
		ArrayPrint ap = new ArrayPrint();
		
		int[] arr = {1,2,34,100, 50};
		String[] arr2 = {"a", "b", "c", "d"};
		
		System.out.println(ap.printArray(arr)  );
		System.out.println(ap.printArray(arr2)  );
		
		
		
	}
}
