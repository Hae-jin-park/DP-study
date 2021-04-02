package study.example;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AInterface ainterface = new AInterfaceImpl();
		
		//통로
		ainterface.funcA();
		
		System.out.println("================");
		ObjA objA = new ObjA();
		objA.funcAA();
	}

}
