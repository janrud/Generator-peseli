package pesel;

import java.util.Arrays;

public class Sprawdzenie {
	public static String Pesel() {
		Integer[] sprawdzenie=new Integer[11];
		sprawdzenie=GeneratorPojedynczegoPeselu.Pesel();
		int suma=(sprawdzenie[0]*1)+(sprawdzenie[1]*3)+(sprawdzenie[2]*7)+(sprawdzenie[3]*9)+(sprawdzenie[4]*1)+(sprawdzenie[5]*3)+(sprawdzenie[6]*7)+(sprawdzenie[8]*9)+(sprawdzenie[9]*1)+(sprawdzenie[10]*3);
		if(sprawdzenie[10]==(10-(suma%10)));
		return Arrays.toString(sprawdzenie);
	}

}
