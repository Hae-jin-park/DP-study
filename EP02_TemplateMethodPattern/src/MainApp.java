
public class MainApp {
	public static void main(String[] args) {
		AbstGameConnectionHelper helper = new DefaultGameConnectHelper();
		
		helper.requestConnection("아이디 암호 등 접속 정보");
	}
}
