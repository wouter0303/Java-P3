package s1_8;

public class Quiz3 
{
	public int w = 1;
	protected int x =2;
	int y =1;
	private int z = 4;
	
	public void mijnMethode()
	{
		System.out.print(w); 
		System.out.print(x); 
		System.out.print(y); 
		System.out.print(z); 
	}
}
package s1_8;

import s1_8.quiz2;

public class quiz1
{
	public static void main(String[] args)
	{
		Quiz2 kb = new Quiz2();
		kb.mijnMethode();
	}
}
