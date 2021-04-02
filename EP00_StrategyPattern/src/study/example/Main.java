package study.example;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		1) 인터페이스와 델리게이트		
//		AInterface ainterface = new AInterfaceImpl();
//		
//		//통로
//		ainterface.funcA();
//		
//		System.out.println("================");
//		ObjA objA = new ObjA();
//		objA.funcAA();
		
//		2) Strategy 패턴 예제
		GameCharacter character = new GameCharacter();
		
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();

		character.setWeapon(new Sword());
		character.attack();
		
		character.setWeapon(new Axe());
		character.attack();
	}

}
