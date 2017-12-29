package pesel;

public class GeneratorPeseli {

	public static void main(String[] args) throws Throwable {
		System.out.println("nacisnij enter aby wygererowac pesel");
		
			int ile=System.in.read();
			
				String pesel=Sprawdzenie.Pesel();
				System.out.println("Twoj pesel: "+pesel.replace(", ",""));
			
	}

}
