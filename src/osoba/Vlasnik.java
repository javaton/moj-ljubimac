package osoba;

import zivotinje.Hrcak;
import zivotinje.Kuce;
import zivotinje.KucniLjubimac;
import zivotinje.briga.BrigaOLjubimcu;
import zivotinje.briga.Setnja;

public class Vlasnik {

	public void staviOgrlicu(KucniLjubimac kucniLjubimac) {
		try {
			Kuce pas = (Kuce) kucniLjubimac;
			System.out.println("Stavljena je ogrlica na " + pas.getNaziv());
		} catch(ClassCastException e) {
			System.out.println("ne moze da stavite ogrlicu na ljubimca!");
		}
	}

	public void setaj(Setnja setnja) {
		Kuce kuce = (Kuce) setnja;
//		Hrcak h = (Hrcak) setnja;
		System.out.println("Setam " + kuce.getNaziv() + " "+ 
					setnja.preporucenoVremeZabave() +
					" minuta dnevno");
	}
	
	public void brigaOLjubimcu(BrigaOLjubimcu oLjubimcu) {
		KucniLjubimac kl = (KucniLjubimac) oLjubimcu;
		System.out.println("O svom ljubimcu " + kl.getNaziv() +" se brinem na sledeci nacin: ");
		System.out.println(oLjubimcu.tipZabave());
		System.out.println("Najmanje " + 
				oLjubimcu.preporucenoVremeZabave() + 
				" minuta dnevno");
		

	}
}
