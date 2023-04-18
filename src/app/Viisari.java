package app;

public class Viisari implements Cloneable {
	private int koko;
	private int aikaMaara;
	
	public Viisari(String tyyppi) {
		if(tyyppi.equals("tunti")) {
			this.koko = 24;
		}
		else {
			this.koko = 60;
		}
		this.aikaMaara = 0;
	}
	
	public boolean tikita() {
		aikaMaara++;
		if(koko == 60) {
			if(aikaMaara == 60) {
				aikaMaara = 0;
				return true;
			}
		}
		else {
			if(aikaMaara == 24) {
				aikaMaara = 0;
				return true;
			}
		}
		return false;
	}
	
	public String getAikaMaara() {
		if(aikaMaara < 10) {
			return "0"+aikaMaara;
		}
		return ""+aikaMaara;
		
	}
	
	public Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
