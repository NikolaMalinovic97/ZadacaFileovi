package zadacaFileovi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) throws IOException {

		//Deklaracija i inicijalizacija promjenjljivih
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite ime fajla: ");
		String imeFajla = input.nextLine();
		BufferedReader br = new BufferedReader(new FileReader(imeFajla));
		input.close();
		
		//Ucitavanje iz tekstualnog fajla i ispis teksta bez razmaka (space-a)
		String linija, novaLinija;
		char c;
		int a;
		while((linija = br.readLine()) != null) {
			novaLinija = "";	
			if(linija.charAt(0) > 96) {
				a = linija.charAt(0);
				c =  (char) (a - 32);
				novaLinija += c;
			}
			else
				novaLinija += linija.charAt(0);
			for (int i = 1; i < linija.length(); i++) {
				novaLinija += linija.charAt(i);
				if(linija.charAt(i) == ' ') {
					i++;
					a = linija.charAt(i);
					c =  (char) (a - 32);
					novaLinija += c;
				}
					
			}
				
			System.out.println(novaLinija);
		}
		
		br.close();
	}

}
