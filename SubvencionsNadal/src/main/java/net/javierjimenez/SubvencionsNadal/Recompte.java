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
	
	public void percentatgeRegals(String nen){
		
		Pattern p = Pattern.compile(".*?: (.*)"); 
		Matcher m = p.matcher(nen);
		m.matches();
		String n = m.group(1);
		//(.+?):(.+)($|-)
		
	}
}
