package zadacaFileovi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Zadatak4 {

	public static void main(String[] args) throws IOException {

		//Deklaracija i inicijalizacija promjenjljivih
		File file = new File("Tekst4.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		ArrayList<String> listaRijeci = new ArrayList<>();
		
		//Citanje teksta iz fajla i ispisivanje recenica unazad
		String linija, rijec;
		while((linija = br.readLine()) != null) {
			listaRijeci.clear();
			rijec = "";
			for (int i = 0; i < linija.length(); i++) { //Ova petlja izdvaja rijeci iz citave linije
				if(linija.charAt(i) != ' ')
					rijec += linija.charAt(i);
				else {
					listaRijeci.add(rijec);
					rijec = "";
				}
			}
			listaRijeci.add(rijec);
			for (int i = listaRijeci.size()-1; i >= 0; i--) { //Ova petlja ispisuje rijeci u obrnutom redosljedu
				System.out.print(listaRijeci.get(i)+" ");			
			}
			//System.out.println(listaRijeci.get(0));
			System.out.println();
		}
		
		br.close();
	}

}
