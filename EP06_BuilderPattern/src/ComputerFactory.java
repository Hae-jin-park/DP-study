
public class ComputerFactory {

	private BluePrint blueprint;
	
	public void setBlueprint(BluePrint blueprint) {
		// TODO Auto-generated method stub
		this.blueprint=blueprint;
	}
	
	public void make() {
		blueprint.setCpu();
		blueprint.setRam();
		blueprint.setStorage();
	}
	
	public Computer getComputer() {
		return blueprint.getComputer();
	}

}
