package app;

public class Main {

	public static void main(String[] args) {
		Kello kello1 = new Kello();
		Kello kello2 = kello1.clone();
		//matalakopiointi
		//Kello kello2 = (Kello)kello1.clone();
		//tulostuksessa näkyy, että kello2 tikitys jatkaa kello1 tikitystä
		
		
		for (int i = 0; i < 10; i++) {
			kello1.tikita();
		}
		
		for (int i = 0; i < 10; i++) {
			kello2.tikita();
		}
		
		
	}

}
