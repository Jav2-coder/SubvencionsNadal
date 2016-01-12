package net.javierjimenez.SubvencionsNadal;

public class Personatge {
	
	private String nom;
	
	private int regals;
	
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
