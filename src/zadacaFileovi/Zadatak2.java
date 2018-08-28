package zadacaFileovi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) throws IOException {

		
		//Deklaracija i inicijalizacija promjenljivih
		Scanner input = new Scanner(System.in);
		System.out.print("Unezite naziv fajla: ");
		String nazivFajla = input.nextLine();
		BufferedReader br = new BufferedReader(new FileReader(nazivFajla));
		
		//Ucitavanje teksta iz fajla
		String linija, tekst = "";
		while((linija = br.readLine()) != null) {
			tekst += linija;
		}
		
		//Brojanje velikih slova
		int brojac;
		for (int i = 65; i < 91; i++) {
			brojac = 0;
			for (int j = 0; j < tekst.length(); j++) {
				if(tekst.charAt(j) == ((char)i))
					brojac++;
			}
			System.out.println(((char)i)+": "+brojac);
		}
		
		//Brojanje malih slova
		for (int i = 97; i < 123; i++) {
			brojac = 0;
			for (int j = 0; j < tekst.length(); j++) {
				if(tekst.charAt(j) == ((char)i))
					brojac++;
			}
			System.out.println(((char)i)+": "+brojac);
		}
		
		input.close();
		br.close();
	}

}
