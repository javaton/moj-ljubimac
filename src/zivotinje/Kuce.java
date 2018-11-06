package zivotinje;

import zivotinje.briga.Setnja;

public class Kuce extends KucniLjubimac implements Setnja{

	private String rasa;
	private Boolean pedigre;
	
	public Kuce(String naziv, Boolean dlaka, String rasa, Boolean pedigre) {
		super(naziv, dlaka);
		this.rasa = rasa;
		this.pedigre = pedigre;
	}

	public String getRasa() {
		return rasa;
	}

	public void setRasa(String rasa) {
		this.rasa = rasa;
	}

	public Boolean getPedigre() {
		return pedigre;
	}

	public void setPedigre(Boolean pedigre) {
		this.pedigre = pedigre;
	}

	@Override
	public String tipZabave() {
		return "Kuce zahteva setnju "
				+ "i igranje na otvorenom prostoru";
	}

	@Override
	public Integer preporucenoVremeZabave() {
		return 60;
	}
	
}
