package demo;

import osoba.Vlasnik;
import zivotinje.Kuce;
import zivotinje.KucniLjubimac;
import zivotinje.Ribica;

public class Aplikacija {

	public static void main(String[] args) {
		Vlasnik vlasnik = new Vlasnik();
		Kuce ker = new Kuce("Zuca", true, "DOC", false);
		KucniLjubimac ribica = new Ribica("Milunka", false, true);
		KucniLjubimac ribic1 = new Ribica("Milunka", false, true);

//		System.out.println(ribic1.getNaziv()); ne raditi ovako!
		vlasnik.setaj(ker);
//		vlasnik.setaj(ribica);
		
		vlasnik.brigaOLjubimcu(ker);
		vlasnik.brigaOLjubimcu(ribica);
	}
}
