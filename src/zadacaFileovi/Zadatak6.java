package zadacaFileovi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) throws IOException {

		//Deklaracija i inicijalizacija promjenjljivih
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite ime fajla: ");
		String imeFajla = input.nextLine();
		BufferedReader br = new BufferedReader(new FileReader(imeFajla));
		input.close();
		
		//Ispisivanje najduze rijeci u svakoj liniji tekstualnog fajla
		String linija, rijec, najduzaRijec;
		while((linija = br.readLine()) != null) {
			rijec = "";
			najduzaRijec = "";
			for (int i = 0; i < linija.length(); i++) {
				if(linija.charAt(i) != ' ') 
					rijec += linija.charAt(i);
				else {
					if(rijec.length() > najduzaRijec.length())
						najduzaRijec = rijec;
					rijec = "";
				}
			}
			if(rijec.length() > najduzaRijec.length())
				najduzaRijec = rijec;
			System.out.println(najduzaRijec);
		}
		
		br.close();
	}

}
