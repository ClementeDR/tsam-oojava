
public class Student {

	String name;
	String surname;
	int age;
	int[] marks;
	int marksAverage(){
		int tot = 0;
	    
        for(int x:marks)
                tot += x;
       
		return tot / marks.length;
	}
	
	
	/*
	public static void main(String[] args) {
		

	}
	 */
}
