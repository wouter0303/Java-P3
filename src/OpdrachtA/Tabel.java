package OpdrachtA;

import java.util.Random;

public class Tabel {
	public static void main(String[] args) {

				for (int rij=0;rij<=9999;rij++) {


					for (int kolom=0;kolom<=9;kolom++) {
						Random rand = new Random();
						int n = rand.nextInt(10000);
						System.out.print(String.format("%8d,", n += 1));
						
					}
					System.out.println(" ");
					
					}

				}
	}