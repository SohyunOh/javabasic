package encap.obj;

public class MainClass {

	public static void main(String[] args) {
		
		Hotel h = new Hotel();
		
//		Chef c = h.getChef();
//		c.cooking();
		h.getChef().cooking();
		
		
//		Chef cc = new Chef();
//		h.setChef(cc);
		h.setChef(new Chef());
		
		
		
		
	}
}
