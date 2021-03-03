package Ex10;

public class Tv {

	private boolean power;
	private int channel;
	private int prevchannel;
	private int volume;
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
		if(power) {
			System.out.println("전원을 킵니다.");
		}else {
			System.out.println("전원을 끕니다");
		}
		
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
		if(this.channel != channel) {
			setPrevchannel(this.channel);
			this.channel = channel;
		}
		System.out.println(channel + "로 바꿉니다.");
		System.out.println("이전채널 :"+ getPrevchannel() );
	}
	public int getPrevchannel() {
		return prevchannel;
	}
	public void setPrevchannel(int prevchannel) {
		this.prevchannel = prevchannel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
		if(0 < volume && volume>= 100) {
			System.out.println(volume + "으로 볼륨을 변경합니다.");
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		
	}
	
}
