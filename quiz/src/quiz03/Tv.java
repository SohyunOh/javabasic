package quiz03;

public class Tv {

	int channel;
	boolean power;
	
	void power() {
		
		if(power) {
			power = true;
			System.out.println("전원을 끕니다");
		} else {
			power = false;
			System.out.println("전원을 켭니다");
		}
	}
	
	//채널변경
	int changeChannel(int ch) {
		channel = ch;
		System.out.println(channel + "번 변경");
		return channel;
	}
	
	
}
