package inter.absic3;

public class MainClass {

	public static void main(String[] args) {
		
		
		Printed p = new LG(); 
					// = new Sumsung(); 로도 생성자 가능
		
		p.turtOn();
		p.print("안녕 디지몬~");
		p.ColorPrint("너와 함꼐하고 싶어~", "black");
		p.copy(10);
		p.turtOff();
		
		

	}

}
