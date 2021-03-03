package quiz10;

public class MyCart extends Cart {

	//1. MyCart의 생성자에서는 int매개변수를 하나 받으며, 금액을 초기화합니다. tv=300원, com=400원, radio=500원 으로 초기화
	MyCart(int money) {
		super();//생략
		this.money = money;
		this.tv = 300;
		this.com = 400;
		this.radio = 500;
	}
	
	//2. buy(), add(), info() 메서드를 오버라이딩 합니다.
	/*
	 * buy()의 기능
	 * 1. money가 300보다 작으면 "금액부족" 출력후 메서드를 종료.
	 *    매개변수가 tv, com, radio가 아니더라도 "상품없음" 출력 후 종료
	 * 2. 매개변수 tv라면 금액에서 tv가격을 빼고 add(상품)을 호출
	 *    매개변수 com라면 금액에서 com가격을 빼고 add(상품)를 호출
	 *    매개변수 radio라면 금액에서 radio를 빼고 add(상품)을 호출
	 */
	
	void buy(String product) {
		
		if(this.money < 300) {
			System.out.println("금액부족");
			return;
		} else if(  !( product.equals("tv") || product.equals("com") || product.equals("radio") )   ) {
			System.out.println("상품없음");
			return;
		} else { //tv거나, com거나, radio인 경우
			
			switch (product) {
			case "tv":
				money -= tv; //300
				break;
			case "com":
				money -= com; //400
				break;
			case "radio":
				money -= radio; //500
				break;
			default:
				break;
			}
			add(product); //상품 추가 메서드 호출
		}
		
	}


	/*
	 * add()의 기능
	 * 1. 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 *    -기존의 장바구니보다 크기가 * 2큰 배열을 생성.
	 *    -기존의 장바구니 값을 새로운 배열에 복사.
	 *    -새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 2. product를 장구니에 담는다.
	 * 3. info() 메서드를 호출
	 */
	void add(String product) {

		if(this.i >= cart.length) {
			String[] newCart = new String[cart.length * 2]; //두배 크기의 배열
			
			for(int i = 0; i < cart.length; i++) { //배열에 복사
				newCart[i] = cart[i];
			}
			
			cart = newCart; //장바구니 교체
		}
		
		cart[i] = product; //상품을 담는 작업
		i++; //개수 증가
		
		info();
	}
	/*
	 * info()의 기능
	 * 
	 * 2. 장바구니에 담긴 물건 목록을 + 금액을 더해서 출력
	 * 3. 메인에서 buy()를 실행 시킨다.
	 */

	void info() {
		System.out.print("장바구니목록:");
		for(int j = 0; j < i; j++) {
			System.out.print(cart[j] + " ");
		}
		System.out.println("\n남은금액:" + money);
		
	}
	
}
