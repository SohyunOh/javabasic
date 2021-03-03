package quiz12;

public class Computer {
	//키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	private KeyBoard board;
	private Mouse mouse;
	private Monitor monitor;
	
	//기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	public Computer() {
		this.board = new KeyBoard();
		this.mouse = new Mouse();
		this.monitor = new Monitor();
	}
	//모든 멤버변수를 받는 생성자
	public Computer(KeyBoard board, Mouse mouse, Monitor monitor) {
		this.board = board;
		this.mouse = mouse;
		this.monitor = monitor;
	}

	//키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	public void computerInfo() {
		System.out.println("----시스템 정보----");
		board.info();
		mouse.info();
		monitor.info();
	}
	
	public KeyBoard getBoard() {
		return board;
	}
	public void setBoard(KeyBoard board) {
		this.board = board;
	}
	public Mouse getMouse() {
		return mouse;
	}
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	//키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
	
	

	
	//메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
	
	
	
}
