package pac;

public class Point implements Cloneable {

	protected int x;
	protected int y;
	
	public Point (int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public Point clone() throws CloneNotSupportedException {
		return (Point)super.clone();
	}
	
	public Double distance(Point p) {
			int a= p.x - this.x; // la difference de labsice
			int b= p.y - this.y; // la difference de lordonnee
			
			return Math.sqrt(a*a+b*b); // racine carre de a*a + b*b 
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
}
