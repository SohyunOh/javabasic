package api.lang.wrapper;

public class Boxing {
	
	public static void main(String[] args) {
		int a = 100;
		double b  = 3.14;
		char c = 'A';
		boolean d = false;
		
		//boxing : 기본 타입을 -> 클래스형으로 변환 작업
		Integer val1 = new Integer(a) ;
		Double val2 = new Double(b);
		Character val3 = new Character(c) ;
		Boolean val4 = new Boolean(d);
		
		Object[] arr = {val1 ,val2,val3,val4 };
		
		//unboxing: 포장된 객체를 다시 기본탕비으로 변환
		a = val1.intValue();
		b = val2.doubleValue();
		c = val3.charValue();
		d = val4.booleanValue();
		
	}

}
