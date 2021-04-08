
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComputerFactory factory = new ComputerFactory();
		factory.setBlueprint(new LgGramBlueprint());
//		factory.setBlueprint(new MacAirBlueprint());
//		factory.setBlueprint(new SamsungAtivBlueprint());
		//Computer com = factory.makendGet();
		factory.make();
		Computer com = factory.getComputer();
		
		//Computer com = new Computer("i7","16g","256g SSD");
		
		System.out.println(com.toString());
	}

}
