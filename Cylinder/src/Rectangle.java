
	import java.lang.Math;

	public class Rectangle extends Circle {
		
		double h;  //height=6
		double r;  //radius=2    
		double areaOfRect;
		
	public Rectangle() {
		
	}
	
        public Rectangle(double h, double r) {
		super();
		this.h = h;
		this.r = r;
	}

		public void circumference() {
        	
        }
		public double areaRect() {   //are of rectangle= h(2*pi*r)
			
			double areaOfRect= (2*Math.PI*this.r) * this.h;
			
			System.out.println("area of rectangle:"+areaOfRect);
			return areaOfRect;
					
		}

		
		

	
	
}
