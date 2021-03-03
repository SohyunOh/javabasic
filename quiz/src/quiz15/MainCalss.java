package quiz15;

import java.util.Arrays;

public class MainCalss  {

	public static void main(String[] args) {
	
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Marine m3 = new Marine();
		Marine m4 = new Marine();
		
		Tank t1  = new Tank();
		Tank t2 = new Tank();
		
		Dropship d = new Dropship();
		
		d.ride(m1);
		d.ride(m2);
		d.ride(m3);
		d.ride(m4);
		d.ride(t2);
		
		d.move(10, 10);
		m1.lacation();
		m2.lacation();
		m3.lacation();
		t2.lacation();
		
		
	}

}
