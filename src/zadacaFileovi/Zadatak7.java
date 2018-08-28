package zadacaFileovi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) throws IOException {

		//Deklaracija i inicijalizacija promjenjljivih
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite ime fajla: ");
		String imeFajla = input.nextLine();
		BufferedReader br = new BufferedReader(new FileReader(imeFajla));
		input.close();
		
		//Ucitavanje linija iz fajla i ispisivanje svake predzadnje rijeci
		String linija, rijec, ispravljenaRijec;
		while((linija = br.readLine()) != null) {
			rijec = "";
			ispravljenaRijec = "";
			int brojacSpaceova = 0;
			for (int i = linija.length()-1; i >= 0; i--) {
				if(linija.charAt(i) == ' ') {
					brojacSpaceova++;
					if(brojacSpaceova >= 2)
						break;
					rijec = "";
				}
				else
					rijec += linija.charAt(i);
			}
			for (int i = rijec.length()-1; i >= 0; i--) {
				ispravljenaRijec += rijec.charAt(i);
			}
			System.out.println(ispravljenaRijec);
		}
		
		br.close();
	}

}
