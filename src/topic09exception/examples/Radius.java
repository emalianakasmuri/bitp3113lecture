package topic09exception.examples;

public class Radius {
	
	
	public double getCircleArea (double radius) /*throws Exception*/ {
		
		double area = 0;
		
		if (radius < 1) {
			//throw new Exception("Radius should be more than 0");*/
			System.out.println("Invalid value");
		}
		
		// Some calculation happens here
		
		return area;
	}

}
