
public class KristeniKlassMuutujad {

	public static void main(String[] args) {
		//1. �l. Muutujate loomine ja nende kasutamine teistes muutujate v��rtustes.
		
		//Luua muutuja, mis hoiab endas �hte t�isarvu
		//Luua muutuja, mis hoiab endas t�ev��rtust, kas eelnevalt loodud muutuja on paaritu arv.
		//Teha if-tingimuslause, millega tr�kkida v�lja eelnevat kasutades lause �Tegemist on paarisarvuga�, 
		//kui esimesena loodud muutuja oli paarisarv. 
		//(Kes soovib, v�ib kirjutada ka loogika juhuks, kui 1. muutuja peaks olema paarisarv.)
		
		int a = 4;
		
		boolean paaritu = a % 2 != 0;
		
		if (paaritu ) {

			System.out.println("Paaritu");

		} else {

			System.out.println("Paaris");

		}
		
	}

}
