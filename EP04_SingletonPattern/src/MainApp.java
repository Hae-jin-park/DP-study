
public class MainApp {

	public static void main(String[] args) {
		SystemSpeaker sp1 = SystemSpeaker.getInstance();
		SystemSpeaker sp2 = SystemSpeaker.getInstance();
		//이와같이 한 경우 sp1과 sp2는 같은 instance이다.
		
		//5,5
		System.out.println(sp1.getVolume());
		System.out.println(sp2.getVolume());
		
		sp1.setVolume(11);
		System.out.println(sp1.getVolume());
		System.out.println(sp2.getVolume());
		
		sp1.setVolume(22);
		System.out.println(sp1.getVolume());
		System.out.println(sp2.getVolume());
	}

}
