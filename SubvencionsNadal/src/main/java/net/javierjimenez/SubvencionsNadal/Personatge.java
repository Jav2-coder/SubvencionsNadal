package net.javierjimenez.SubvencionsNadal;

/**
 * 
 * @author alumne1daw
 *
 */
public class Personatge {
	
	/**
	 * Variable String que contindra l'identificador (nom) de l'objecte Personatge.
	 */
	private String nom;
	
	/**
	 * Variable int que conté el total de regals que te l'objecte Personatge
	 */
	private int regals;
	
	/**
	 * 
	 * 
	 * @param n
	 * @param r
	 */
	public Personatge(String n, int r){
		
		nom = n;
		regals = r;
		
	}
	public void sumarRegals(int r){
		regals = regals + r;
	}
	public int getRegals(){
		return regals;
	}
	public String getNom() {
		return nom;
	}
}
