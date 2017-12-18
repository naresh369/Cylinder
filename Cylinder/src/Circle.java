
public class Circle {

	double r=2;
	
	public Circle() {
		
	}
	public Circle(double r) {
		super();
		this.r = r;
	}
	 
	public double areaOfCircle() {
		double areaOfCircle= 2*Math.PI * (this.r*this.r);
		System.out.println("area of Circle:"+areaOfCircle);
		return areaOfCircle;
	}
	
	public void Circumference() {  //Circumference of Circle=2*pi*r
		double circumference=2*Math.PI*this.r;
		System.out.println("Circumference of Circle:"+circumference);
	}
		
	
	
}
