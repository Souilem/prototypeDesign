package pac;

public abstract class Figure implements Cloneable {
	
	protected Point p1;
	protected Point p2;

	public Figure(Point p1, Point p2) {
		this.p1=p1;
		this.p2=p2;
	}
	
	@Override
	public Figure clone() throws CloneNotSupportedException {
		Figure f=(Figure) super.clone();
		f.p1=p1.clone();
		f.p2=p2.clone();
		return f;
	}
	
	public abstract double surface();
	
	@Override
	public String toString() {
		return "p1=" + p1 + ", p2=" + p2;
	}
	
}
