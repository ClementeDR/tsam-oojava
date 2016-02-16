package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Circle extends Shape{
	private double radius;

	public Circle(){
		
	}
	
	public double perimeter(){
		super.setPerimeter(this.radius * 2 * Math.PI);
		return (this.radius * 2 * Math.PI);
	}
	
	public double area(){
		// Nota: utilizza il valore di pi greco pari a:
				// Math.PI
		super.setArea(this.radius * this.radius * Math.PI);
		return this.radius * this.radius * Math.PI;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	

}
