
public class SystemSpeaker {
	private static SystemSpeaker instance;
	private int volume;
	
	private SystemSpeaker() {
		volume=5;
	}
	
	public static SystemSpeaker getInstance() {
		if(instance == null) {  //instance가 null이면 생성.
			//시스템 스피커
			instance = new SystemSpeaker();
			System.out.println("새로 생성합니다.");
		}else {
			System.out.println("이미 생성되었습니다.");
		}
		return instance;
	}
	
	public void setVolume(int volume) {
		this.volume=volume;
	}
	public int getVolume() {
		return volume;
	}
}
