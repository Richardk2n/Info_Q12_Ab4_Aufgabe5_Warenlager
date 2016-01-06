package com.richard.warenlager;

public class Lastwagen extends Thread{

	private Ware[] ware;
	private Lager lager;
	private Tor tor;
	
	public Lastwagen(Ware[] ware, Lager lager, Tor tor){
		this.ware = ware;
		this.lager = lager;
		this.tor = tor;
	}
	
	public void run(){
		tor.benutzen();
		while(!lager.ändern(ware)){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		tor.benutzen();
	}
}
