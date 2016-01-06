package com.richard.warenlager;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Lager lager = new Lager();
		Tor tor = new Tor();
		Lastwagen lastwagen = new Lastwagen(10, lager, tor);
		lastwagen.start();
		Lastwagen lastwagen1 = new Lastwagen(-10, lager, tor);
		lastwagen1.start();
		Lastwagen lastwagen2 = new Lastwagen(-10, lager, tor);
		lastwagen2.start();
		Lastwagen lastwagen3 = new Lastwagen(10, lager, tor);
		lastwagen3.start();
	}

}
