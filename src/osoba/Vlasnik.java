package osoba;

import java.util.ArrayList;
import java.util.List;

import greska.GreskaAplikacije;
import zivotinje.Hrcak;
import zivotinje.Kuce;
import zivotinje.KucniLjubimac;
import zivotinje.briga.BrigaOLjubimcu;
import zivotinje.briga.Setnja;

public class Vlasnik {
	
	private List<KucniLjubimac> mojiLjubimci;

	public Vlasnik() {
		super();
		this.mojiLjubimci = new ArrayList<>();
	}
	
	public void dodajLjubimca(KucniLjubimac ljubimac) throws GreskaAplikacije {
		if(mojiLjubimci.isEmpty()) {
			mojiLjubimci.add(ljubimac);
		} else {
			for(KucniLjubimac k : mojiLjubimci) {
				if(k.getNaziv().equals(ljubimac.getNaziv())) {
					throw new GreskaAplikacije("Postoji kucni ljubimac sa imenom " + ljubimac.getNaziv());
				} 
			}
			mojiLjubimci.add(ljubimac);
		}
		
	}
	
	public void ukloniLjubimca(KucniLjubimac ljubimac) throws GreskaAplikacije {
		if(mojiLjubimci.isEmpty()) {
			throw new GreskaAplikacije("Nemas ljubimce");
		}
		if(!mojiLjubimci.contains(ljubimac)) {
			throw new GreskaAplikacije("Ljubimac ne postoji u Listi");
		}
		mojiLjubimci.remove(ljubimac);
		System.out.println("Uspesno uklonjen ljubimac " + ljubimac.getNaziv());
	}

	public void staviOgrlicu(KucniLjubimac kucniLjubimac) {
		try {
			Kuce pas = (Kuce) kucniLjubimac;
			System.out.println("Stavljena je ogrlica na " + pas.getNaziv());
		} catch(ClassCastException e) {
			System.out.println("ne moze da stavite ogrlicu na ljubimca!");
		}
		
	}

	public void setaj(Setnja setajLjubimca) {
		Kuce pas = (Kuce) setajLjubimca;
//		Hrcak h = (Hrcak) setnja;
		System.out.println("Setam " + pas.getNaziv() + " "+ 
				setajLjubimca.preporucenoVremeZabave() +
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
