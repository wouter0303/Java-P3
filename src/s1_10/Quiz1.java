package s1_10;

public class Quiz1 {
	int nr;
	static int stNr;
	
	public Quiz1 ()
	{
		nr++;
		stNr++;
	}
	public static void main(String[] args)
	{
		Quiz1 wn1 = new Quiz1();
		Quiz1 wn2 = new Quiz1();
		Quiz1 wn3 = new Quiz1();
		Quiz1 wn4 = new Quiz1();
		Quiz1 wn5 = new Quiz1();
		System.out.print(Quiz1.stNr + ", ");
		System.out.print(wn1.nr + ", ");
	    System.out.print(wn2.nr + ", ");
	    System.out.print(wn3.nr);
	}

}
//als je de de code uitvoer zonder wn4 en wn5 dan krijg je: 3,1,1,1 en met krijg je:5,1,1,1
