package topic09exception.examples;

public class RadiusApp {

	public static void main(String[] args) {
		
		
		Radius radius = new Radius();
		
		try {
			
			double area = radius.getCircleArea(-2);
			area = radius.getCircleArea(3);
			
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
