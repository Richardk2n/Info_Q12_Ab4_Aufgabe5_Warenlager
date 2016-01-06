package com.richard.warenlager;

public class Ablauf {

	public static void main(String[] args) {
		Lager lager = new Lager();
		Tor tor = new Tor();
		Lastwagen lastwagen = new Lastwagen(new Ware[]{new Ware("Tisch"), new Ware("Stuhl")}, lager, tor);
		lastwagen.start();
		Lastwagen lastwagen1 = new Lastwagen(new Ware[2], lager, tor);
		lastwagen1.start();
		Lastwagen lastwagen2 = new Lastwagen(new Ware[2], lager, tor);
		lastwagen2.start();
		Lastwagen lastwagen3 = new Lastwagen(new Ware[]{new Ware("Teller"), new Ware("Gabel")}, lager, tor);
		lastwagen3.start();
	}

}
