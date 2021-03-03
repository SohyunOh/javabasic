package inter.absic3;

public class Sumsung implements Printed{

	@Override
	public void turtOn() {
		System.out.println("삼성전자 ");
		System.out.println("▶전원을 켭니다");
		
	}

	@Override
	public void turtOff() {

		System.out.println("▶전원을 끕니다");
	}

	@Override
	public void print(String docment) {

		System.out.println("▶ 문서 정보:" + docment);
		
	}

	@Override
	public void ColorPrint(String docment, String color) {

		System.out.println("▶ 문서 정보:" + docment + " ▶ 색상 : " + color);
		
		
	}

	@Override
	public int copy(int n) {
	
		for(int i = 1; i <=n ; i++) {
		System.out.println( "▶  %d 장 복사" + n );
		}
		return n;
	}
	

}
