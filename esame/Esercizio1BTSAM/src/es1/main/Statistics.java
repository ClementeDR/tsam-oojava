package es1.main;



/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Statistics {

	protected double perimeter;
	protected double area;
	
	public void add(Statistics st){
		this.perimeter += st.getPerimeter();
		this.area += st.getArea();
	}
	
	public  double perimeter(){
		return perimeter;
	}
	
	public double area(){
		return area;
	}
	
	public Statistics(){
		
	}
	
	public Statistics(double perimeter,double area){
		this.perimeter += perimeter;
		this.area += area;
		
	}
	
	
	
	
	
	public double getPerimeter() {
		return perimeter;
	}



	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}



	public double getArea() {
		return area;
	}



	public void setArea(double area) {
		this.area = area;
	}



}
