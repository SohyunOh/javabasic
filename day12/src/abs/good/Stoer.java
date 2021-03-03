package abs.good;

import abs.bad.stoer;

public  class Stoer extends HeadStore {

	
	//생략
//	public stoer() {
//		super();
//	}
	
	@Override
	public void apple() {
		System.out.println("서울지점에 사과는 500원");
		
	}

	@Override
	public void banana() {
		System.out.println("서울지점에 바나나는 700원");
	}

	@Override
	public void melon() {
		System.out.println("서울지점에 멜론는 800원");
		
	}

	@Override
	public void orange() {
		System.out.println("서울지점에 오랜지는 1000원");
		
	}

	
}
