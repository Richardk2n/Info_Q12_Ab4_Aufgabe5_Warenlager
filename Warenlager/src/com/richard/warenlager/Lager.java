package com.richard.warenlager;

public class Lager {

	private int f�llmenge = 0;
	private final static int KAPAZIT�T = 20;
	
	public synchronized boolean �ndern(int �nderung){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(f�llmenge+�nderung > KAPAZIT�T || f�llmenge+�nderung<0){
			return false;
		}
		f�llmenge+=�nderung;
		return true;
	}
}
