
public class Cylinder {

	    
		Circle m=new Circle();
		Rectangle r= new Rectangle(6.00, 2.00);
		
		
		public void areaCylinder() {
			
			double aoc;
			double aor;
			double areaOfCylinder;
			
			aoc=m.areaOfCircle();
			aor=r.areaRect();
			
			areaOfCylinder=(aoc)+(aor);
			
			System.out.println("area of cylinder:"+areaOfCylinder);
			
			
			
		}


	
	
	
	
}
