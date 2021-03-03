package quiz15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Dropship extends Unit {

	public Unit[] unit  = new Unit[8] ; //수송선의 공간
	public int index =  0; //Unit 배열의 index

	public Dropship() {
		super(0, 0, 200);
	}

	/*
	 * lacation()의 기능은 동일함.
	 * 
	 */

	@Override
	public void lacation() {
		System.out.println (" x 좌표:" + getX() +"y좌표 :" + getY());	
	}


	/*
	 * move()는 마린과 동일함
	 * 단, 수송선이 이동하면, 수송선 배열에 있는 모든 유닛의 위치가 수송선위치로 바꿉니다.
	 */

	
	@Override
	public void move(int x, int y) { //이동 할려는 값
		
		int length  = (this.getX()-x)*(this.getX()-x) + (this.getY()-y)*(this.getY()-y);
		int distane = (int)Math.sqrt(length); // sqrt의 반환 유형이 double형이기에 형변환
		
		this.setX(x);//위치변경
		this.setY(y);
		
		//배열안의 값을 모두 변경
		for(int i=0; i<unit.length; i++) {
			if(unit[i] != null) { //값이 존재 할 때
				unit[i].setX(x);
				unit[i].setY(y);
			}
		}
		
		
		
		System.out.println("이동거리:"+ distane);
	}
	
//	@Override
//	public void move(int x, int y) {
//		int wayX = getX()-x ;
//		int wayY = getY()-y ;
//		int way = (int)Math.sqrt(Math.pow(wayX, 2) + Math.pow(wayY, 2));
//
//		setX(x);
//		setY(y);
//
//		System.out.println( getX() +","+ getY() + "로 이동 ");
//		System.out.println("이동 거리 :" + way);
//	}


	/*
	 * ride(모든 유닛을 받을 수 있도록 선언)
	 * 1. 배열이 크키는 8이고, 수송선 배열에는 탱크[4]와 마린[1]이 탈수있다
	 * 탱크는 배열을 4칸씩 사용한다. 마린은 배열 1칸씩 사용

	 * 2. 배열에 유닛이 탈 수 있으면 유닛을 배열에 저장합니다.
	 * 배열에 전부 차지하거나, 탈수 있는 공간이 없으면 "공간이부족합니다 " 를 출력

	 * 3.수송선에 탄 유닛을 가로로 출력하면 됩니다.
	 * 
	 * 
	 * instanceof 는 개체 유형 비교
	 */
		
		
		public void ride(Unit unit) {
			//마린이 들어갈 수 있는 조건
			if(unit instanceof Marine && index <=7) { //마린이 들어갈수 있는 조건
				this.unit[index] = unit;
				index ++; //배열 위치 하나 증가
			}else if (unit instanceof Tank &&  index <=4) { // 탱크가 들어갈수있는 조건
				this.unit[index] = unit;
				index +=4; //배열 위치 4 증가
			}else { // 공간이 없는 경우
				System.out.println("수송 공간이 부족합니다.");
				return; //함수 종료
			}
			
			//수송선 정보 출력
			System.out.print("수송정보[");
			for(int i =0;  i< this.unit.length; ++i ) {
				if(this.unit[i] instanceof Marine) {
					System.out.print("M");
				}else if(this.unit[i] instanceof Tank){ 
					System.out.print("T");
				}
			}
			
			System.out.println("]");
		}
			
		
		
		
//
//	public void ride(Unit u) {
//
//		if(u instanceof Marine) {
//			if(index+1 <= unit.length) {
//				unit[index] = u ; 
//				index ++;
//			}else {
//				System.out.println( "공간이부족합니다 " );
//			}
//
//		}else if(u instanceof Tank){
//			if(index +4 <= unit.length) {
//				unit[index] = u;
//				index += 4; 
//			}else {
//				System.out.println( "공간이부족합니다 " );
//			}
//
//
//		}else {
//			System.out.println("마린과 탱크만 탑승이 가능합니다.");
//		}
//
//
//		for(int i = 0; i <unit.length; i++) {
//			if(unit[i] != null ) {
//				if(unit[i] instanceof Marine) {
//					System.out.print("마린");
//				}else {
//					System.out.print("탱크");
//				}
//
//			}
//			
//		}
//		System.out.println();
//	}




}
