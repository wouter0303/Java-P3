package Sorteren;
/*
 * UITWERKING  MET VEEL TYPECAST..ARRAY EN ARRAYLIST WRAPPERdingen..ZIT INTERESSANTE CODE TUSSEN D
 * VOORAL INTERESSANT DE OMZETTINGEN TUSSEN DATATYPEN EN DE ALGORITMES VOOR SORTEREN
 * 
 * @jgproode Maart 2019
 *  
 * 
 * 
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
 

public class SorteerTabelDemo {
	public static void main(String[] args) {

		final int MAXAANTALELEMENTEN= 300;
		final int MAXWAARDE=10000;
		//final int AANTALKOLOMMEN;
		//kolomnamen instellen :

		String[] kolomNamen = {"KOLOM 1","KOLOM 2","KOLOM 3","KOLOM 4","KOLOM5","KOLOM 6","KOLOM 7","KOLOM 8","KOLOM9","KOLOM 10"};
		//	int integerlijst[] = new int[MAXAANTALELEMENTEN];
		ArrayList tabelO = new ArrayList();

		Vector KolomNamenV = new Vector(Arrays.asList(kolomNamen));
		//ARRAY MAKEN VAN MAXAANTALELEMENTEN MET RANDOMWAARDEN TUSSEN 0 EN MAXWAARDE
		tabelO=createIntegerList(MAXAANTALELEMENTEN,MAXWAARDE);
		//ARRAY SORTEREN MET HET STANDAARD ALGORITME VAN JAVA
		tabelO.sort(null); //();
		// EVENTUEEL AFDRUKKEN IN CONSOLE VOOR TESTDOELEINDEN
		//   System.out.println(""+ tabelO);

		//RIJEN KLAARMAKEN GESCHIKT VOOR JTABEL
		//ARRAY OVERHEVELEN NAAR VECTOR
		//IF STATEMENT MOET ER SAMEN MET i<MAXAANTALELEMENET VOOR ZORGEN DAT ER OP TIJD GESTOPT WORDT
		Vector rowData = new Vector();
		for (int i=0; i<MAXAANTALELEMENTEN;i+=10){
			if (i%3==0){
				// DIT WERK NIET...WAAROM NIET ???
				// Vector rijGegevens = new Vector(Arrays.asList((String)tabelO.get(i),(String)tabelO.get(i+1),(String)tabelO.get(i+2))); //waarde kolom1, kolom 2, kolom 3
				Vector rijGegevens = new Vector(Arrays.asList(""+tabelO.get(i),""+tabelO.get(i+1),""+tabelO.get(i+2),""+tabelO.get(i+4),""+tabelO.get(i+5),""+tabelO.get(i+6),""+tabelO.get(i+7),""+tabelO.get(i+8),""+tabelO.get(i+9),""+tabelO.get(i+10)     )); //waarde kolom1, kolom 2, kolom 3
				rowData.add(rijGegevens);
			}
		}

		//TEST KIJKEN OF HET GELUKT IS
		//    for (Object o:rowData){
		//		System.out.println("x"+ rowData);
		//	   }
		//NU ROWDATA AAN EEN JTABLE KNOPEN EN KOLOMNAMEN INSTELLEN    
		JTable tabelVoorbeeld = new JTable(rowData,KolomNamenV);

		JFrame f = new JFrame();
		f.setSize(800, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//HIER KOMT DE JTABLE
		f.add(new JScrollPane(tabelVoorbeeld));

		f.setVisible(true);
	}

	//aantalelemente =aantal elementen in een tabel
	//maxwaarde = de maximale waarde van de elementen
	public static ArrayList createIntegerList(int aantalelementen, int maxwaarde){
		ArrayList list=new ArrayList();
		int getal;
		for (int i=0; i<aantalelementen;i++){
			getal=(int) (Math.random()*maxwaarde);
			list.add(getal);
			// TESTEN DAAROM VIA GETAL....
			// System.out.println(getal);
		} 
		//EEN ARRAYLIST TERUGGEVEN
		return list;	  
	}
	
	// EEN ARRALIST OMZETTEN NAAR EEN ARRAY
	// LASTIG IS DAT HET ARRAY DUS EEN VAST AANTAL ELEMENTEN HEEFT EN EEN ARRAYLIST IN PRINCIOE NIET
	// DAAROM WORDT DE SIZE VAN HET ARRAYLIST BEREKEND EN GEBRUIKT OM DE GROOTE VAN HET ARRAY TE BEPALEN
	public static int[] convertertoArray(ArrayList list){
		int lengte =list.size();
		int tabel[] = new int[lengte];

		for (int i=0;i<lengte;i++) {
			//LET OP TYPECAST IS NOODZAKELIJK ZIE PRESENTATIE 
			tabel[i]=(int)list.get(i);  
		}	 
		//EEN ARRAY TERUG GEVEN
		return tabel;
	}

}

