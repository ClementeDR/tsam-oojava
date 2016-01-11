
public class ChangeCoin {
	static void main(String[] args){
		int coin = 123888;
		int[] banconote = new int[9];
		
		while(coin != 0){
			if(coin >= 500){
				banconote[0]++;
				coin -= 500;
				
			}else if(coin >= 200){
				banconote[1]++;
				coin -= 200;
			}else if (coin >= 100){
				banconote[2]++;
				coin -= 100;
			}else if(coin >= 50){
				banconote[3]++;
				coin -= 50;
			}else if(coin >= 20){
				banconote[4]++;
				coin -= 20;
			}else if(coin >= 10){
				banconote[5]++;
				coin -= 10;
			}else if(coin >= 5){
				banconote[6]++;
				coin -= 5;
			}else if(coin >= 2){
				banconote[7]++;
				coin -= 2;
			}else if(coin == 1){
				banconote[8]++;
				coin -= 1;
			
			}
		}
		
		System.out.println("Banconote da 500€: " + banconote[0] + ", Banconote da 200€: " + banconote[1] + ", Banconote da 100€: " + banconote[2] + ", Banconote da 50€: " + banconote[3] + ", Banconote da 20€: " + banconote[4] + ", Banconote da  10€: " + banconote[5] + ", Banconote da 5€: " + banconote[6] + ", Monete da 2€: " + banconote[7] + ", Monete da 1€: " + banconote[8]);
		System.out.println("----------------------------------------------------------------");
	}
}
