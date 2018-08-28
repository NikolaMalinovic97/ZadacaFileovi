package zadacaFileovi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) throws IOException {

		//Deklaracija i inicijalizacija promjenjljivih
		Scanner input = new Scanner(System.in);
		File file = new File("Tekst3.txt");
		ArrayList<String> lista = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		//Ucitavanje stringova iz fajla u listu
		String linija;
		while((linija = br.readLine()) != null)
			lista.add(linija);
		br.close();
		
		//Upisivanje novog stringa
		String novaLinija;
		System.out.print("Unesite vas string: ");
		novaLinija = input.nextLine();
		lista.add(novaLinija);
		input.close();
		
		//Ispisivanje stringova naopako
		System.out.println();
		for (int i = lista.size()-1; i >= 0; i--) {
			System.out.println(lista.get(i));
		}
		
		//Upisivanje u fajl
		PrintWriter pw = new PrintWriter(file);
		for (int i = 0; i < lista.size(); i++) {
			pw.println(lista.get(i));
		}
		pw.close();
	}

}
