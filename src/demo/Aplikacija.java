package demo;

import greska.GreskaAplikacije;
import osoba.Vlasnik;
import zivotinje.*;
import zivotinje.briga.BrigaOLjubimcu;

public class Aplikacija {

	public static void main(String[] args) {
		Vlasnik vlasnik = new Vlasnik();
		Kuce ker;
		try {
			ker = new Kuce("Zuca", true, "DOC", false);
			KucniLjubimac ribica = new Ribica("Milunka", false, true);
			KucniLjubimac ribic1 = new Ribica("Milunka", false, true);
			ribica.getNaziv(); 
//			System.out.println(ribic1.getNaziv()); ne raditi ovako!
			vlasnik.setaj(ker);
//			vlasnik.setaj(ribica);
			
			vlasnik.brigaOLjubimcu(ker);
			vlasnik.brigaOLjubimcu(ribica);
			
			vlasnik.staviOgrlicu(ribica);
			Kuce zuca  = new Kuce(null, true, "doz", false);
		} catch (GreskaAplikacije e) {
			System.out.println(e.getMessage());
		}

	}
}
