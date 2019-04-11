package s1_10;

public class Quiz5
{
	int x;
	StringBuffer sb = new StringBuffer();
	
	public Quiz5()
	{
		mijnMethode();
	}
	public void mijnMethode()
	{
	    x += 3;
	    sb.append(x);
	}
	  public static void main(String[] args)
	  {
	    Quiz5 mk = new Quiz5();
	    Quiz5 mk2 = new Quiz5();
	    Quiz5 mk3 = new Quiz5();
	    System.out.println(mk.sb);
	  }
}

//de standaarduitvoer is 369
//2. ja het geeft nu de uitvoer van 333
//3. voltooid
//5. ja ik denk wel dat het gaat veranderen
//6. ja mijn antwoord klopt
