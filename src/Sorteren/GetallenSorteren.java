package Sorteren;
// even op regel twee commentaar toevoegen
public class GetallenSorteren {
	public static void main(String[] args) {
		int[] lijstb = { 4,15,3,9, 1 }; 
		int[] lijstc;
		
		lijstc=tabelSorteren(lijstb);
		for (int teller = 0; teller < lijstc.length; teller++) {
			System.out.print(lijstc[teller]+" ");
		}
	}
	//dit is een branch
	//regel14 dit is dus de test
	//heb branch aangemaakt en via eclipse een commit gedaan
	
	public static int[] tabelSorteren(int[] lijst){
		int kleinste;
		double precies;
    	int indexkleinste;
    	int huidigepositie; 
		 for(huidigepositie = 0; huidigepositie < lijst.length; huidigepositie++) { 
			kleinste = lijst[huidigepositie]; 
			indexkleinste = huidigepositie;
			for (int teller = huidigepositie+1; teller < lijst.length; teller++) {
				if (lijst[teller] < kleinste) {
					kleinste = lijst[teller];
					indexkleinste = teller;
				}
			}
			
			
			int hulp = lijst[huidigepositie];
			lijst[huidigepositie] = lijst[indexkleinste];
			lijst[indexkleinste] = hulp;
    	} 	
		 return lijst;
	
	}
	
	
	
	
}
