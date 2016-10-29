
public class KristeniKlassMuutujad {

	public static void main(String[] args) {
		//1. ül. Muutujate loomine ja nende kasutamine teistes muutujate väärtustes.
		
		//Luua muutuja, mis hoiab endas ühte täisarvu
		//Luua muutuja, mis hoiab endas tõeväärtust, kas eelnevalt loodud muutuja on paaritu arv.
		//Teha if-tingimuslause, millega trükkida välja eelnevat kasutades lause „Tegemist on paarisarvuga“, 
		//kui esimesena loodud muutuja oli paarisarv. 
		//(Kes soovib, võib kirjutada ka loogika juhuks, kui 1. muutuja peaks olema paarisarv.)
		
		int a = 4;
		
		boolean paaritu = a % 2 != 0;
		
		if (paaritu ) {

			System.out.println("Paaritu");

		} else {

			System.out.println("Paaris");

		}
		
	}

}
