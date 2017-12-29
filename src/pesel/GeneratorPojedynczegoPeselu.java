package pesel;

import java.util.Random;

public class GeneratorPojedynczegoPeselu {
	public static Integer[]  Pesel() {
		Integer[] pesel=new Integer[11];
		Random r=new Random();
		for(int i=0;i<11;i++) {
			if(i==2||i==3){
				pesel[i]=r.nextInt(2);
				if(pesel[2]==0) {
					pesel[3]=r.nextInt(2)+1;
				}
			}
			else if(i==4) {
				pesel[i]=r.nextInt(4);
				if(pesel[4]==3) {
					pesel[5]=r.nextInt(2);
				}
			}
			else {
				pesel[i]=r.nextInt(10);
			}	
		}
		return pesel;
	}


 
}
