package net.javierjimenez.SubvencionsNadal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Hello world!
 *
 */
public class App {
	
	private static String NOM_FITXER = "/Llista.txt";
	
	public static void main(String[] args) {
		
		BufferedReader llista = null;
		
		try {

			String llistaRegals = null;

			llista = new BufferedReader(new InputStreamReader(App.class.getResource(NOM_FITXER).openStream()));

			Recompte R = new Recompte();
			
			while ((llistaRegals = llista.readLine()) != null) {

				R.percentatgeRegals(llistaRegals);
				
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (llista != null)
					llista.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}	
	}
}