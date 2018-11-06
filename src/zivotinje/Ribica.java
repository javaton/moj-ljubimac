package zivotinje;

public class Ribica extends KucniLjubimac {

	private Boolean zlatna;

	public Ribica(String naziv, Boolean dlaka, Boolean zlatna) {
		super(naziv, dlaka);
		this.zlatna = zlatna;
	}

	public Boolean getZlatna() {
		return zlatna;
	}

	public void setZlatna(Boolean zlatna) {
		this.zlatna = zlatna;
	}

	@Override
	public String tipZabave() {
		return "Plivanje u akvarijumu.";
	}

	@Override
	public Integer preporucenoVremeZabave() {
		return 1440;
	}
}
