package s1_9;

import java.util.ArrayList;

public class Quiz8
{
  ArrayList<Quiz9> Quiz9enlijst = new ArrayList<Quiz9>();
  public void Quiz9Toevoegen()
  {
    Quiz9 st1 = new Quiz9("Lars", 24, "lars@itmail.com");
    Quiz9 st2 = new Quiz9("Isa ", 22, "isa@dzork.com");
    Quiz9 st3 = new Quiz9("Thomas", 33, "thomas@ysmail.com");
    Quiz9 st4 = new Quiz9("Susan", 25, "susan@rzmail.com");
    Quiz9 st5 = new Quiz9("Rita", 28, "rita@online.com");
    Quiz9enlijst.add(st1);
    Quiz9enlijst.add(st2);
    Quiz9enlijst.add(st3);
    Quiz9enlijst.add(st4);
    Quiz9enlijst.add(st5);
  }
  public static void main(String[] args)
  {
    Quiz8 cl = new Quiz8();
    //cl.Quiz9Toevoegen();
    for (int i = 0; i < cl.Quiz9enlijst.size(); i++)
    {
      //if (i == 2)
      {
        System.out.println(cl.Quiz9enlijst.get(i).naam + ", "
            + cl.Quiz9enlijst.get(i).leeftijd + ", "
            + cl.Quiz9enlijst.get(i).email);
      }
    }
  }
}

//2. Als je regel 27 if (i == 2) weghaald dan laat de standaartuitvoer alle Quiz9en uit de arraylist zien.
//3. Als je regel 24 cl.Quiz9Toevoegen(); weghaald dan laat de standaartuitvoer niks meer zien.