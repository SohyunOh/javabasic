package quiz;

public class Quiz12 {

	public static void main(String[] args) {
		
		String[] arr = {"안녕", "hello", "니하오", "@#$"};
		
		/*
		 * Math.random()을 이용해서 0~3까지 랜덤수를 만듭니다.
		 * 해당 랜덤수를 배열에 index에 적용해서
		 * 선택된 단어가 한국어, 영어, 중국어 인지 처리하세요.
		 * 
		 */
		
		int ran = (int)(Math.random() * arr.length);
		
		System.out.println("선택된 단어:" +  arr[ran]  );
		
		
		switch ( arr[ran] ) {
		case "안녕":
			System.out.println("한국어 입니다");
			break;
		case "hello":
			System.out.println("영어 입니다");
			break;
		case "니하오":
			System.out.println("중국어 입니다");
			break;
		default:
			System.out.println("알 수 없는 언어");
			break;
		}
		
		
		
		
		
				
		
	}
}
