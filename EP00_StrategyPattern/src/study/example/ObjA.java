package study.example;

public class ObjA {
	
	AInterface ainterface;
	
	public ObjA() {
		ainterface = new AInterfaceImpl();
	}
	
	public void funcAA() {
		
//		이 코드는 복잡하다.
//		System.out.println("AA");
//		System.out.println("AA");
//		
		//고로, 이러한 기능이 필요합니다. 개발 please~
		
		//위임한다.
		ainterface.funcA();
		ainterface.funcA();
		
	}
}
