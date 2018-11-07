package zivotinje;

import greska.GreskaAplikacije;

public class Hrcak extends KucniLjubimac {

	private String boja;

	public Hrcak(String naziv, Boolean dlaka, String boja) throws GreskaAplikacije {
		super(naziv, dlaka);
		this.boja = boja;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	@Override
	public String tipZabave() {
		return "Hrcak zahteva: "
				+ "Igra u akvarijumu i "
				+ "trcanje po tocku";
	}

	@Override
	public Integer preporucenoVremeZabave() {
		return 120;
	}
	
	
}
