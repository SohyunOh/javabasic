package quiz15;

public class Tank extends Unit {

	public Tank() { //기본 생성자
		super(0, 0, 220);
	
	}

	@Override
	public void lacation() {
		
		 System.out.println (" x 좌표:" + getX() +"y좌표 :" + getY());
			
	}

	
	@Override
	public void move(int x, int y) { //이동 할려는 값
		
		int length  = (this.getX()-x)*(this.getX()-x) + (this.getY()-y)*(this.getY()-y);
		int distane = (int)Math.sqrt(length); // sqrt의 반환 유형이 double형이기에 형변환
		
		this.setX(x);//위치변경
		this.setY(y);
		System.out.println("이동거리:"+ distane);
	}

	
	//changMode()
	
}
