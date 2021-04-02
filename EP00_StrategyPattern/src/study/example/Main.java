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
		
		//맨손공격 Weapon값이 null 즉 아무도 없기에.
		character.attack();
		
		//칼로 공격
		character.setWeapon(new Knife());
		character.attack();

		//검으로 공격
		character.setWeapon(new Sword());
		character.attack();
		
		//도끼로 공격
		character.setWeapon(new Axe());
		character.attack();
	}

}
