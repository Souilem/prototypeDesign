package pac;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Figure f1= new Cercle(new Point(10,10), new Point(20,20));	
		Figure f2= new Rectangle(new Point(30,30), new Point(40,40));
		
		
		System.out.println("Surface de F1 est :" + f1.surface());
		System.out.println("Surface de F2 est :" + f2.surface());
		
		System.out.println("---------Copie de F1 ");	
		Figure f3= f1.clone();
		System.out.println("Surface de F3 est :" + f3.surface());
		
		
		System.out.println("---------Copie de F2 ");
		Figure f4= f2.clone();
		System.out.println("Surface de F4 est :" + f4.surface());
		
		
		f1.p1.x=60;
		
		System.out.println("Surface de F1 est :" + f1.surface());
		System.out.println("Surface de F3 est :" + f3.surface());
		
		
	}

}
