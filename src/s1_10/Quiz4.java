package s1_10;

public class Quiz4
{
  static int x = 2;
  Quiz4()
  {
    x ++;
  }
  static void methodeA(int i)
  {
    x = x - i;
  }
  int methodeB(int i)
  {
    return x + i;
  }
  public static void main(String[] args)
  {
    Quiz4 mk1 = new Quiz4();
    Quiz4.methodeA(2);
    Quiz4 mk2 = new Quiz4();
    System.out.print(mk2.methodeB(3));
  }
}
//als je de de code uitvoer met x += 4; dan krijg je: 11 en met x ++; krijg je:5
