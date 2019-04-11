package s1_10;

public class Quiz3
{
  static int x = 6;
  int y = 3;
  Quiz3()
  {
    x += 3;
    y += 2;
  }
  void mijnMethode(int i)
  {
    this.y = y - i;
    x++;
  }
  public static void main(String[] args)
  {
    Quiz3 mk1 = new Quiz3();
    Quiz3 mk2 = new Quiz3();
    Quiz3 mk3 = new Quiz3();
    Quiz3 mk4 = new Quiz3();
    Quiz3 mk5 = new Quiz3();
    Quiz3 mk6 = new Quiz3();
    Quiz3 mk7 = new Quiz3();
    Quiz3 mk8 = new Quiz3();
// de eerste uitslag was 16, 2 & na de nieuwe objectreferenties is het 31, 2
 
    mk1.mijnMethode(3);
    System.out.print(mk2.x + ", " + mk1.y);
  }
}
