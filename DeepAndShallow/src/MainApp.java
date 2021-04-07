
public class MainApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Cat navi = new Cat();
		navi.setName("navi");
		navi.setAge(new Age(2012, 3));
		
		Cat yo = navi.copy();
		yo.setName("yo");
		yo.getAge().setYear(2013);
		yo.getAge().setValue(2);
		
		System.out.println(navi.getName());
		System.out.println(yo.getName());
	
		System.out.println(navi.getAge().getYear());
		System.out.println(yo.getAge().getYear());

		System.out.println(navi.getAge().getValue());
		System.out.println(yo.getAge().getValue());
	}

}
