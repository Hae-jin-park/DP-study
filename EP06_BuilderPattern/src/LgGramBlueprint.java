
public class LgGramBlueprint extends BluePrint {

	private Computer com;
		
	public LgGramBlueprint() {
		com = new Computer("default","default","default");
	}

	@Override
	public void setCpu() {
		// TODO Auto-generated method stub
		com.setCpu("i7");
	}

	@Override
	public void setRam() {
		// TODO Auto-generated method stub
		com.setRam("16g");
	}

	@Override
	public void setStorage() {
		// TODO Auto-generated method stub
		com.setStorage("256g SSD");
	}

	@Override
	public Computer getComputer() {
		// TODO Auto-generated method stub
		return com;
	}

}
