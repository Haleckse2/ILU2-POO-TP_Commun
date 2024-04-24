package model;

public class ReservationHotel extends Reservation{
	private int nbLitSimple;
	private int nbLitDouble; 
	private int numeroChambre; 
	
	public ReservationHotel(int jour, int mois, int nbLitSimple, int nbLitDouble, int numeroChambre) {
		super(jour, mois); 
		this.nbLitSimple = nbLitSimple; 
		this.nbLitDouble = nbLitDouble;
		this.numeroChambre = numeroChambre; 
	}
	
	@Override
	public String toString() { 
		return String.format("Le %d/%d la chambre %d avec %d lit simple et %d lit double", super.getJour(), super.getMois(), numeroChambre, nbLitSimple, nbLitDouble); 
	}


}
