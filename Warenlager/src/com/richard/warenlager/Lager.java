package com.richard.warenlager;

public class Lager {

	private int füllmenge = 0;
	private final static int KAPAZITÄT = 20;
	
	public synchronized boolean ändern(int änderung){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(füllmenge+änderung > KAPAZITÄT || füllmenge+änderung<0){
			return false;
		}
		füllmenge+=änderung;
		return true;
	}
}
