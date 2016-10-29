
public class KristeniKlassForTsükkel {
	
	public static void main(String[] args) {
		//2. ül. For-tsükkel.
		//Teha for-tüklid, mille sees teha väljaprint järgmiste tingimustega:
		
		//1) Arvud vahemikus 50 … 70
		//2) Arvud vahemikus 10 … 0
		//3) Paaritud arvud vahemikus 10 … 0
		//4) Viiega jaguvad arvud vahemikus 500 … 600
		//5) Täis sajalised vahemikus -1000 … 1000
		
		
		//1) Arvud vahemikus 50 … 70
		for (int i = 50; i <= 70; i++){
			System.out.println(i);
		}
		
		System.out.println();
		
		//2) Arvud vahemikus 10 … 0
		for (int i = 10; i >= 0; i--){
			System.out.println(i);
		}
		
		System.out.println();
		
		//3) Paaritud arvud vahemikus 10 … 0
		for (int i = 9; i > 0; i = i - 2){
			System.out.println(i);
		}
		System.out.println();
		
		//4) Viiega jaguvad arvud vahemikus 500 … 600
		for (int i = 500; i <= 600; i = i + 5){
			System.out.println(i);
		}
		System.out.println();
		
		//5) Täis sajalised vahemikus -1000 … 1000
		for (int i = -900; i <= 900; i = i + 100){
				if(i != 0){
					System.out.println(i);
				}
				
			}
		
		}
	
	}
	
		
		
	
	


