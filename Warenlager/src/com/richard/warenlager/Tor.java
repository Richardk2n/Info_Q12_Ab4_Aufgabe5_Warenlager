package com.richard.warenlager;

public class Tor {

	public synchronized void benutzen(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
