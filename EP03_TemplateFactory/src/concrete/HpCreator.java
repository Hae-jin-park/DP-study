package concrete;

import java.util.Date;

import framework.Item;
import framework.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		// TODO Auto-generated method stub
		System.out.println("DB에서 체력 회복 물약의 정보를 가져옵니다.");
	}

	@Override
	protected void createItemLog() {
		// TODO Auto-generated method stub
		System.out.println("체력 회복 물약을 새로 생성했습니다."+new Date());
	}

	@Override
	protected Item createItem() {
		// 작업
		return new HpPotion();
	}
	
}
