package study.example;

public class MainApp {
	public static void main(String[] args) {
		Adapter adp = new AdapterImpl();
		
		System.out.println(adp.twiceOf(100f));
		System.out.println(adp.halfOf(88f));
		System.out.println(adp.halfOf(88f));
		System.out.println(adp.halfOf(88f));
		System.out.println(adp.halfOf(88f));
		System.out.println(adp.halfOf(88f));
	}
}
