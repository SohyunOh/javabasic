package quiz17;

public class BugsMusic implements SongList {
	
	private String[] list = new String[100];
	private int count = 0;
	
	@Override
	public void insertList(String song) {
		list[count] = song;
		count++;
		
	}
	@Override
	public void playList() {
		
		for(int i = 0 ; i < count; i++) {
			int ran = (int) (Math.random()*count);
			System.out.println(list[count]);
		}
		
	}
	@Override
	public int playLength() {
		System.out.println("음악 저장 개수:" + count);
		return count;
	}
	
	/* SongList인터페이스를 상속받습니다.
	 * 마음대로~
	 * 
	 */
	
	
	
	
}
