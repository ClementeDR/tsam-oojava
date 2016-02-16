package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Display {
	private Shape[] shapes;

	
	
	
	public double totalArea(){
		double tot = 0;
		for(Shape statistics : shapes){
			tot += statistics.area();
		}
		return Math.round(tot);
		
	}
	
	public double totalPerimeter(){
		double tot = 0;
		for(Shape statistics : shapes){
			tot += statistics.perimeter();
		}
		return tot;
	}
	

	public Shape[] getShapes() {
		return shapes;
	}

	public void setShapes(Shape[] shapes) {
		this.shapes = shapes;
	}
	
	
}
