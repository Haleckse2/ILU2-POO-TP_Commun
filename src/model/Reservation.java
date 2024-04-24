package model;

import model.CalendrierAnnuel.Mois;

public abstract class Reservation {
	private int jour; 
	private int mois; 
	
	public Reservation(int jour, int mois) {
		this.jour = jour; 
		this.mois = mois; 
	}
	
	@Override
	public String toString() {
		return "Le " + Integer.toString(jour) + "/" + Integer.toString(mois) + "\n" ;  
	}
	
	public int getJour() {
		return this.jour; 
	}
	
	public int getMois() {
		return this.mois; 
	}
	
}
