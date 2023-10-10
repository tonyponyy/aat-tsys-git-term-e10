package unidad103;

import java.util.Random;

public class Num {
	int num;
	public Num(int min, int max) {
		Random random = new Random();
		this.num = (random.nextInt(max - min + 1) + min);
	}
	
	public boolean es_par() {
		boolean res = false;
		if (this.num%2 ==0) {
			res= true;
		}
		return res;
		
	}

}
