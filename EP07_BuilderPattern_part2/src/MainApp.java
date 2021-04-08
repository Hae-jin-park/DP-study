
public class MainApp {
	public static void main(String[] args) {
		//Computer com = new Computer("256g ssd","i7","8g");
		//Computer(String cpu, String ram, String Storage)가 일반적인데...
		//위의 경우는 망한 사례.
		
		Computer com = ComputerBuilder
				.start()
				.setCpu("i5")
				.setRam("8g")
				.setStorage("256g SSD")
				.build(); //시작은 모든 멤버변수 값을 default로 하기에, setCpu, setRam, setStorage를 모두 한다.
		System.out.println(com.toString());
		System.out.println("-----------------------------------------------------");
		Computer com2 = ComputerBuilder
				.startWithCpu("i7")
				.setRam("16g")
				.setStorage("256g NVME SSD")
				.build(); //시작과 동시에 setCpu를 하기에, setRam과 setStorage만 해도 된다. 핵심메시지는 가독성이다.
		System.out.println(com2.toString());
	}
}
