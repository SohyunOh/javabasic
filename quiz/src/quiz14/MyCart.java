package quiz14;

public class MyCart {
	//1. 모든 변수와 메서드에 적절한 접근제한자를 선언하세요.
	private int money;
	private Product[] cart = new Product[1]; //상품을 저장할 배열
	private int i = 0;
	
	//2. MyCart의 생성자는 money만 받아서 초기화
	public MyCart(int money) {
		this.money = money;
	}
	
	/*
	 * 3. buy(모든 상품을 받도록 선언)
	 * 
	 * 가진돈과 전달된 물건의 가격을 비교해서 돈이 적으면 "금액부족" 출력후 종료
	 * 가진돈이 충분하면 물건의 가격을 money에 빼고  add(상품) 메서드를 호출
     	 */ 	
	public void buy(Product pro) {
		
		if(this.money < pro.price) {
			System.out.println("금액부족");
			return;
		}
		
		this.money -= pro.price;
		add(pro);
		
	}
	/*
	 * 4. add(모든 상품을 받도록 선언)
	 * 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 * 기존의 장바구니보다 크기가 * 2큰 배열을 생성.
	 * 기존의 장바구니 값을 새로운 배열에 복사.
	 * 새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 
	 * 상품을 장바구니에 담는다.
	 * 
	 * info()메서드 호출
	 */
	
	private void add(Product pro) {
		
		if(this.i >= cart.length) {
			Product[] newCart = new Product[cart.length * 2]; //새로운 카드
			for(int i = 0; i < cart.length; i++) { //복사
				newCart[i] = cart[i];
			}
			cart = newCart;
		}
		cart[i] = pro;
		i++;
		
		info(); //결과 확인 메서드
	}
	
	/*
	 * 5.info()
	 * 장바구니 안에 담긴 물건의 목록(name)을 출력한다.
	 * 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력
	 * 남은금액 출력
	 * 메인에서 buy메서드 실행 
	 * 
	 */
	
	public void info() {
		
		System.out.println("----현재 장바구니----");
		int sum = 0; //총 합계
		for(int index = 0; index < i; index++) { //i가 상품의 개수 
			
			if(cart[index] instanceof Tv) {
				
				System.out.print(cart[index].name + " ");
				sum += cart[index].price;
				
			} else if(cart[index] instanceof Radio) {
				
				System.out.print(cart[index].name + " ");
				sum += cart[index].price;
				
			} else if(cart[index] instanceof Computer) {
				
				System.out.print(cart[index].name + " ");
				sum += cart[index].price;
			
			}
			
		} //end for
		
		System.out.println("금액합계:" + sum);
		System.out.println("남은금액:" + this.money);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
