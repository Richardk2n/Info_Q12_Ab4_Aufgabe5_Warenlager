package com.richard.warenlager;

public class Lastwagen extends Thread{

	private int ware;
	private Lager lager;
	private Tor tor;
	
	public Lastwagen(int ware, Lager lager, Tor tor){
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
		System.out.println(ware+" done");
	}
}
