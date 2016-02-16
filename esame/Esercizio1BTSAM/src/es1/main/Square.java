package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Square extends Shape{

	private double side;
	
	public Square(){
		
	}
	
	public double perimeter() {
		// TODO Auto-generated method stub
		super.setPerimeter(this.side * 4);
		return this.side * 4;
	}

	public double area(){
		// TODO Auto-generated method stub
		super.setArea(this.side * this.side);
		return this.side * this.side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	

	
}
