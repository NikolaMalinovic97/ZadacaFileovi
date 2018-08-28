package zadacaFileovi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Zadatak1 {

	public static void main(String[] args) throws Exception {

		//Deklaracije i inicijalizacije promjenjljivih
		File file = new File("Tekst1.txt");
		
		//Provjera postojanja fajla
		if(! file.exists())
			file.createNewFile();			
		
		//Deklaracija i inicijalizacija BufferedReadera potrebnog za citanje fajla
		BufferedReader br = new BufferedReader(new FileReader(file));		
		
		//Dio programa koji ucitava tekst iz fajla i broji karaktere, rijeci i linije
		String linija;
		int brojKaraktera = 0, brojRijeci = 0, brojLinija = 0;
		while((linija = br.readLine()) != null) {
			brojLinija++;
			brojKaraktera += linija.length();
			for (int i = 0; i < linija.length(); i++) {
				if(linija.charAt(i) == ' ' || linija.charAt(i) == '\n')
					brojRijeci++;
			}
			brojRijeci++;
		}
		br.close();
		
		//Ispisivanje podataka u konzolu
		System.out.println("Broj karaktera: "+brojKaraktera);
		System.out.println("Broj rijeci: "+brojRijeci);
		System.out.println("Broj linija: "+brojLinija);
	}

}
