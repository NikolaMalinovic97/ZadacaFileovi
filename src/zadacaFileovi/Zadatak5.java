package zadacaFileovi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) throws IOException {

		//Deklaracija i inicijalizacija promjenjljivih
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite ime fajla: ");
		String imeFajla = input.nextLine();
		BufferedReader br = new BufferedReader(new FileReader(imeFajla));
		input.close();
		
		//Ucitavanje linija teksta i ispisivanje
		String linija, novaLinija;
		while((linija = br.readLine()) != null) {
			novaLinija = "";
			if(linija.length() < 55)
				System.out.println(linija);
			else {
				for (int i = 0; i < 40; i++) {
					novaLinija += linija.charAt(i);
				}
				novaLinija += "...<READ MORE>";
				System.out.println(novaLinija);
			}
		}
		br.close();
	}

}
