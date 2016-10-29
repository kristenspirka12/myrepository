
public class KristeniKlassTsükliTingimuslause {
	
	public static void main(String[] args) {
		//3. ül. Tsüklis tingimuslause.

		//Teha tsükkel, mis käiks läbi arvud nullist sajani. 
		//Printida välja ainult need arvud, mis ruutu võttes annavad paarisarvulise väärtuse.
		
		for (int i = 0; i <= 100; i++) {
		
			boolean square = (i * i) % 2 == 0 && i != 0;
			
			if(square) {
				
					System.out.println(i);
			
			}
		
		}
	
	}

}
