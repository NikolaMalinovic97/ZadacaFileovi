package zadacaFileovi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) throws IOException {

		//Deklaracija i inicijalizacija promjenjljivih
		File file = new File("Tekst6.txt");
		Scanner input = new Scanner(System.in);
		System.out.print("Koliko brojeva zelite da program generise? ");
		int n = input.nextInt();
		input.close();
		PrintWriter pw = new PrintWriter(file);
		
		//Generisanje brojeva i upis u fajl
		int[] broj = new int[n];
		for (int i = 0; i < broj.length; i++) {
			broj[i] = (int) (Math.random() * 100 + 1);
			pw.println(broj[i]);
		}
		pw.close();
		
		//Ucitavanje brojeva iz fajla i ispis neparnih brojeva
		BufferedReader br = new BufferedReader(new FileReader(file));
		String linija;
		while((linija = br.readLine()) != null) {
			if(Integer.parseInt(linija) % 2 == 1)
				System.out.println(Integer.parseInt(linija));
		}
		br.close();
	}

}
