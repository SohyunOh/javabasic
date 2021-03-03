package quiz15;

public class Marine extends Unit {

	public Marine() {
		super(0,0,60); //x,y,hp
	}
	/*
	 * lacation()의 기능
	 * 마린의 현재 위치 x,y 를 출력
	 */

	@Override
	public void lacation () {
		System.out.println ("현재위치 의 x 좌표:" + this.getX() +" , y좌표 :" + getY());
		// this 는 부모가 상속받은 값을 가져왔기에 사용가능
	}
	
	/*
	 * move()의 기능
	 * 1. 현재좌표값에서 매개 변수의 좌표만큼의 이동한 거리를 구한다. 
	 * 루트근사값은 Math.sqrt(제곱근) 을 이용하면 됩니다. 
	 * 2. 현재의 좌표값으로 매개변수값으로 변경
	 * 3. 이동한 거리를 정수형으로 출력
	 */
	
	
	@Override
	public void move(int x, int y) { //이동 할려는 값
		
		int length  = (this.getX()-x)*(this.getX()-x) + (this.getY()-y)*(this.getY()-y);
		int distane = (int)Math.sqrt(length); // sqrt의 반환 유형이 double형이기에 형변환
		
		this.setX(x);//위치변경
		this.setY(y);
		System.out.println("이동거리:"+ distane);
		
//		
//		int wayX = getX()-x ;
//		int wayY = getY()-y ;
//		int way = (int)Math.sqrt(Math.pow(wayX, 2) + Math.pow(wayY, 2));
//		
//		setX(x);
//		setY(y);
//		
//		System.out.println( getX() +","+ getY() + "로 이동 ");
//		System.out.println("이동 거리 :" + way);


	}


}
