/*import java.util.Random;

public class Preda {
	int round = 0;
	int posX;
	int posY;
	Preda(int x, int y){
		posX = x;
		posY = y;
	}
	//forse da inserire in celle ???
	void spostamento(int x, int y){
		int n = 3;
		int k = random.nextInt(n);
		switch (k){
		
		case 1: //spostare a destra
			if(x < 20){
				griglia[x + 1][y].animale = griglia[x][y].animale;
				griglia[x + 1][y].spostamento = true;
			}
			break;
		case 2: //spostare sotto
			if(y > 0){
				griglia[x][y - 1].animale = griglia[x][y].animale;
				griglia[x][y - 1].spostamento = true;
			}
			break;
		case 3: //spostare a sinistra
			if(x > 0){
				griglia[x - 1][y].animale = griglia[x][y].animale;
				griglia[x - 1][y].spostamento = true;
			}
			break;
			default: //spostare sopra
				if(y < 20){
					griglia[x][y + 1].animale = griglia[x][y].animale;
					griglia[x][y + 1].spostamento = true;
				}
				break;
		
		}
	}
	void generazione(){
		
	}
}
*/