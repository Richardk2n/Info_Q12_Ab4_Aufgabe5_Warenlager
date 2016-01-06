package com.richard.warenlager;

import com.richard.einfachVerketteteListe.EinfachVerketteteListe;

public class Lager {

	private final static int KAPAZITÄT = 20;
	private EinfachVerketteteListe<Ware> waren = new EinfachVerketteteListe<>();
	
	public synchronized boolean ändern(Ware[] änderung){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(änderung[0]==null){
			if(waren.size()-änderung.length<0){
				return false;
			}
			for(int i = 0; i<änderung.length; i++){
				waren.remove(0);
			}
		}else{
			if(waren.size()+änderung.length > KAPAZITÄT){
				return false;
			}
			for(Ware ware: änderung){
				waren.add(ware);
			}
		}
		return true;
	}
}
