package zadacaFileovi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) throws IOException {

		//Deklaracija i inicijalizacija promjenjljivih
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite ime fajla: ");
		String imeFajla = input.nextLine();
		BufferedReader br = new BufferedReader(new FileReader(imeFajla));
		input.close();
		
		//Ucitavanje iz tekstualnog fajla i ispis teksta bez razmaka (space-a)
		String linija, novaLinija;
		while((linija = br.readLine()) != null) {
			novaLinija = "";
			for (int i = 0; i < linija.length(); i++) {
				if(linija.charAt(i) != ' ')
					novaLinija += linija.charAt(i);
			}
			System.out.println(novaLinija);
		}
		
		br.close();
	}

}
