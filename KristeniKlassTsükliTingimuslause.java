
public class KristeniKlassTs�kliTingimuslause {
	
	public static void main(String[] args) {
		//3. �l. Ts�klis tingimuslause.

		//Teha ts�kkel, mis k�iks l�bi arvud nullist sajani. 
		//Printida v�lja ainult need arvud, mis ruutu v�ttes annavad paarisarvulise v��rtuse.
		
		for (int i = 0; i <= 100; i++) {
		
			boolean square = (i * i) % 2 == 0 && i != 0;
			
			if(square) {
				
					System.out.println(i);
			
			}
		
		}
	
	}

}
