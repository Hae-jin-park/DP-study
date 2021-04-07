
public class MainApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Circle circle1 = new Circle(1,1,3);
		Circle circle2 = circle1.copy();
		System.out.println( 
					circle1.getX()+","+
					circle1.getY()+","+
					circle1.getR());
		System.out.println(
					circle2.getX()+","+
					circle2.getY()+","+
					circle2.getR());
	}

}
