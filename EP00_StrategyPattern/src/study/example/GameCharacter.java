package study.example;

public class GameCharacter {
	
	//추상적인 접근점
	private Weapon weapon;
	
	
	//교환 가능
	public void setWeapon(Weapon weapon) {
		this.weapon=weapon;
	}
	
	
	public void attack() {
		if(weapon==null) {
			System.out.println("맨손으로 공격합니다.");
		}else {
			//delegate
			weapon.attack();
		}
	}
}
