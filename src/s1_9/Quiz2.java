//gemaakt door marc
package s1_9;

public class Quiz2
{
  public static void main(String[] args)
  {
    int[] arr = new int[5];
    arr[0] = 3;
    arr[1] = 7;
    arr[4] = 3;
    arr[3] = 1;
    arr[1] = 8;
    for (int i = 0; i < arr.length; i++)
    {
     if (i >= 3)
     {
      System.out.println(arr[i]+ " dit is  positie "+i);
     }
    }
  }
}
