package zivotinje;

import zivotinje.briga.BrigaOLjubimcu;

public abstract class KucniLjubimac implements BrigaOLjubimcu{

	private String naziv;
	private Boolean	dlaka;
	
	public KucniLjubimac(String naziv, Boolean dlaka) {
		super();
		this.naziv = naziv;
		this.dlaka = dlaka;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Boolean getDlaka() {
		return dlaka;
	}

	public void setDlaka(Boolean dlaka) {
		this.dlaka = dlaka;
	}
}
