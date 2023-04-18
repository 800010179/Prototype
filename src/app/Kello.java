package app;

public class Kello implements Cloneable{
	private Viisari tuntiViisari;
	private Viisari sekuntiViisari;
	private Viisari minuuttiViisari;
	
	public Kello() {
		tuntiViisari = new Viisari("tunti");
		minuuttiViisari = new Viisari("minuutti");
		sekuntiViisari = new Viisari("sekunti");
	}
	
	public void tikita() {
		boolean onkoSekunnit60 = sekuntiViisari.tikita();
		if(onkoSekunnit60) {
			boolean onkoMinuutit60 = minuuttiViisari.tikita();
			if(onkoMinuutit60) {
				tuntiViisari.tikita();
			}
		}
		System.out.println("Kello on: " + tuntiViisari.getAikaMaara() + ":" + minuuttiViisari.getAikaMaara() + ":" + sekuntiViisari.getAikaMaara());
	}
	
	/* Matalakopio
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	 */
	
	public Kello clone() {
		Kello k = null;
		try {
			k = (Kello)super.clone();
			k.tuntiViisari = (Viisari)tuntiViisari.clone();
			k.minuuttiViisari = (Viisari)minuuttiViisari.clone();
			k.sekuntiViisari = (Viisari)sekuntiViisari.clone();
		} catch (CloneNotSupportedException e) {}
			return k;
		}
	
}
