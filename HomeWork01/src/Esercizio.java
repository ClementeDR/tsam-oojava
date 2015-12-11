
public class Esercizio {
	static int sumPos(int[] myarray){
		int sum = 0, i = 0;
		while(myarray[i] >= 0 && i <= myarray.length){
			sum += myarray[i];
			i++;
		}
		return sum;
	}
	static int sumOdd(int n){
		int sum = 0;
		int i = 0;
		 for(i = 0; i < n; ++i) {
		        sum += 1 + 2 *i;
		    }
		 return sum;
	}
	static double average(double[] myarray){
		double sum = 0;
		for(double x: myarray){
			sum += x;
		}
		return sum / myarray.length;
		
	}
	static int sumInterval(int a, int b){
		
		    int tot = 0;
		    for(int i = a; i <= b; i++) {
		        tot += i;
		    }
		    return tot;
	}

	static int sumRange(int a, int b) {
			if (a < b){
		        return sumInterval(a, b);
		    } else {
		        return sumInterval(b, a);
		    }
		}
	
	
	public static void main(String[] args){
		int[] intArr = new int[] {1,2,3,4,5,-6,7,8,9,10};
		System.out.println(sumPos(intArr));
		System.out.println(sumOdd(3));
		double[] douArr = new double[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println(average(douArr));
		System.out.println(sumRange(3, 5));
		
		
		
	}
	
	
}
