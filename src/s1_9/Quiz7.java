package s1_9;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz7 
{
	public static void main(String[] args) 
	{
		ArrayList<String> landen = new ArrayList<String>();
		landen.add("Duitsland");
		landen.add("Verenigde Staten");
		landen.add("Rusland");
		landen.add("Verenigd Koninkrijk");
		landen.add(2,"India");
		
		landen.remove(0);
		
		for(int i = 0; i < landen.size(); i ++)
		
		{
			System.out.println(" " + landen.get(i));
			
		}
		System.out.print("De index van Rusland is :" + " ");
		System.out.println(landen.indexOf("Rusland"));
		System.out.println(landen.size());

		if (landen.contains("Spanje")) {
            System.out.println("Spanje" + " was found in the list.");
        } else
            System.out.println("Spanje" + " was not found in the list.");
		
		if (landen.contains("India")) {
			System.out.println("India" + " was found in the list.");
		} else
			System.out.println("India" + " was not found in the list.");
	}	
}
//1. als je hem uitvoert zie je dat die wel degelijk landen print.