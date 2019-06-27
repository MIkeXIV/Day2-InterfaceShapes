
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rect = new Rectangle();
		System.out.println(rect.calculateArea(5, 6));
		rect.display();
		
		Circle circle = new Circle();
		circle.calculateArea(5.0);
		circle.display();
		
		Triangle tri = new Triangle();
		tri.calculateArea(10.0, 8.0);
		tri.display();
	}

}
