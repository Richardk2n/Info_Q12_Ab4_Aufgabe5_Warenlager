package com.richard.warenlager;

import com.richard.einfachVerketteteListe.EinfachVerketteteListe;

public class Lager {

	private final static int KAPAZIT�T = 20;
	private EinfachVerketteteListe<Ware> waren = new EinfachVerketteteListe<>();
	
	public synchronized boolean �ndern(Ware[] �nderung){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(�nderung[0]==null){
			if(waren.size()-�nderung.length<0){
				return false;
			}
			for(int i = 0; i<�nderung.length; i++){
				waren.remove(0);
			}
		}else{
			if(waren.size()+�nderung.length > KAPAZIT�T){
				return false;
			}
			for(Ware ware: �nderung){
				waren.add(ware);
			}
		}
		return true;
	}
}
