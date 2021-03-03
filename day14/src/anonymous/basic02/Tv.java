package anonymous.basic02;

public class Tv {
	// Remote 타입을 Tv에 알맞게 익명객체로 초기화
	//main 에서 각각 실행
	private int sound;
	private RemoteControl remote;
	
	public Tv() {
		remote = new RemoteControl() {
			
			@Override
			public void volumeUp() {
				System.out.println("삐빅:" + sound++);
				
			}
			
			@Override
			public void volumeDown() {
				System.out.println("삐빅:" + sound--);
				
			}
			
			@Override
			public void turneOff() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
		};
	}

	public int getSound() {
		return sound;
	}

	public void setSound(int sound) {
		this.sound = sound;
	}

	public RemoteControl getRemote() {
		return remote;
	}

	public void setRemote(RemoteControl remote) {
		this.remote = remote;
	}
	
	
}
				
			

		
