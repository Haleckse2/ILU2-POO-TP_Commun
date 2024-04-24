package model;

import java.util.Arrays;
public class CalendrierAnnuel {
	private Mois mois[] = new Mois[12]; 
	
	public CalendrierAnnuel() {
		
		this.mois[0] = new Mois("Janvier", 31); 
		this.mois[1] = new Mois("Février", 29);
		this.mois[2] = new Mois("Mars", 31);
		this.mois[3] = new Mois("Avril", 30);
		this.mois[4] = new Mois("Mai", 31);
		this.mois[5] = new Mois("Juin", 30);
		this.mois[6] = new Mois("Juillet", 31);
		this.mois[7] = new Mois("Aout", 31);
		this.mois[8] = new Mois("Septembre", 30);
		this.mois[9] = new Mois("octobre", 31);
		this.mois[10] = new Mois("Novembre", 30);
		this.mois[11] = new Mois("Decembre", 31);
		
	}
	
	public boolean estLibre(int jour, int mois) {
		return this.mois[mois-1].estLibre(jour); 
	}
	
	public boolean reserver(int jour, int mois) {
		return (this.mois[mois-1].reserver(jour));
	}
	
	public class Mois {
		private String nom;
		private boolean jours[]; 
		
		public Mois(String nom, int nbJours) {
			this.nom = nom; 
			jours = new boolean[nbJours];
			for (int i = 0; i < nbJours; i++) {
				jours[i] = false;
			}
		}
		
		public boolean estLibre(int jour) {
			System.out.println((this.jours[jour-1]));
			if (this.jours[jour-1]) return false; 
			return true; 
		 
		}
		
		public boolean reserver(int jour) {
			if (estLibre(jour)) {
				this.jours[jour-1] = true;
				return true; 
			}
			else return false; 
		}
	}
}

