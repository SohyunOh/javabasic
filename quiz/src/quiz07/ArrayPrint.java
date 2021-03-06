package quiz07;

public class ArrayPrint {

	//1. 외부에서 객체를 생성하지 못하도록 접근제어자를 선언.
	//2. static메서드로 변경해서 사용.
	

	
	String printArray(String[] arr) {
		
		String result = "[";
		for(int i = 0; i < arr.length; i++) {
			
			result += arr[i];
			if( i == arr.length - 1) break;
			result += ",";
		}
		result += "]";
		return result;
	}
	
	String printArray(int[] arr) {
		
		String result = "[";
		for(int i = 0; i < arr.length; i++) {
			
			result += arr[i];
			if( i == arr.length - 1) break;
			result += ",";
		}
		result += "]";
		return result;
	}
	
	
}
