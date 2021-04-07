package framework;

public abstract class ItemCreator {
	
	//Factory 메소드
	public Item create() {
		Item item;
		
		//step1
		requestItemsInfo();
		
		//step2
		item = createItem();
		
		//step3
		createItemLog();
		
		return item;
	}
	
	//아이템 생성전에 DB에서 아이템정보 요청
	protected abstract void requestItemsInfo();
	
	//생성 후 복제 등의 불법을 방지하기 위해 DB에 저장.
	protected abstract void createItemLog();
	
	//아이템 생성
	protected abstract Item createItem();
}
