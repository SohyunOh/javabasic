package inter.absic3;

public class LG implements Printed  {

	@Override
	public void turtOn() {
	System.out.println("Life is good");
	System.out.println("전원을 켭니다");
		
	}

	@Override
	public void turtOff() {
		System.out.println("Life is good");
		System.out.println("전원을 끕니다");
			
		
	}

	@Override
	public void print(String docment) {
		System.out.println("Life is good");
		System.out.println("문서내용 : " + docment );
			
	}

	@Override
	public void ColorPrint(String docment, String color) {
		System.out.println("Life is good");
		System.out.println("문서내용 : " + docment + ", 색상: " + color );
	}

	@Override
	public int copy(int n) {
		System.out.println("Life is good");
		for(int i = 1; i <= n; i++) {
			System.out.println(i + "장 복사");
		}
		return n;
	}

}
