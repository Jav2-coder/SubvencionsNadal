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
	 * Constructor de l'objecte Personatge
	 * 
	 * @param n Variable String que conte el nom de l'objecte Personatge
	 * @param r Variable int que conte el total de regals que conte l'objecte
	 */
	public Personatge(String n, int r){
		
		nom = n;
		regals = r;
		
	}
	
	/**
	 * Metode per augmentar el nombre total de regals de l'objecte
	 * 
	 * @param r Variable Int que conte un nou numero de regals a afegir.
	 */
	public void sumarRegals(int r){
		regals = regals + r;
	}
	
	/**
	 * Metode que retorna el valor de la variable regals de l'objecte.
	 * 
	 * @return
	 */
	public int getRegals(){
		return regals;
	}
	
	/**
	 * Metode que retorna el valor de la variable nom de l'objecte.
	 * 
	 * @return
	 */
	public String getNom() {
		return nom;
	}
}
