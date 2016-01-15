package net.javierjimenez.SubvencionsNadal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Recompte {

	private static HashMap<String, Personatge> totalRegals = new HashMap<String, Personatge>();
	
	private static List<Personatge> personatges = new ArrayList<Personatge>();
	
	public Recompte() {
		
	}
	
	public void recompteRegals(String nen){
		
		Pattern p = Pattern.compile(".*?: (.*)"); 
		Matcher m = p.matcher(nen);
		m.matches();
		String n = m.group(1);
		
		Pattern p1 = Pattern.compile("([^:]+): ([^-]+)( - |$)");
		Matcher m1 = p1.matcher(n);
		
		while(m1.find()){
			
			String nom = m1.group(1);
			String regals = m1.group(2);
			
			if (totalRegals.containsKey(nom)) {

				Pattern p2 = Pattern.compile(",");
				Matcher m2 = p2.matcher(regals);
				int contador = 1;
				
				while (m2.find()) {
					contador++;
				}
				
				totalRegals.get(nom).sumarRegals(contador);

			} else {

				Pattern p2 = Pattern.compile(",");
				Matcher m2 = p2.matcher(regals);
				int contador = 1;
				
				while (m2.find()) {
					contador++;
				}
				
				totalRegals.put(nom, new Personatge(nom, contador));

			}
		}	
	}
	
	public void percentatgeRegals() {
		
		for (Personatge p : totalRegals.values()) {

			personatges.add(p);
		}
		
		double total = 0;
		
		for (int i = 0; i < personatges.size(); i++) {
			
			total = total + personatges.get(i).getRegals();
			
		}
		
		for (int i = 0; i < personatges.size(); i++) {
			
			double percent = Math.round(((personatges.get(i).getRegals() *100) / total) * 100.0) / 100.0;
			
			System.out.println(personatges.get(i).getNom() + ": " + percent + "% ");
			
		}
	}
}
