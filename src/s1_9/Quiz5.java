package s1_9;



import java.util.Arrays;

public class Quiz5
{
  public static void main(String[] args)
  {
    char[] arrCharA = new char[4];
    arrCharA[0] = 'w';
    arrCharA[1] = 'k';
    arrCharA[2] = 'd';
    arrCharA[3] = 'r';
    
    char[] arrayChar = new char[8];
    arrayChar[0] = 'R';
    arrayChar[1] = 'N';
    arrayChar[2] = 'B';
    arrayChar[3] = 'S';
    arrayChar[4] = 'M';
    arrayChar[5] = 'O';
    arrayChar[6] = 'A';
    arrayChar[7] = 'C';
    
   
    
    char[] arrCharB = Arrays.copyOf(arrCharA, arrCharA.length);
   
    
    int i = Arrays.binarySearch(arrCharA, 'k');

        
    boolean b = Arrays.equals(arrCharA, arrCharB);
    if (arrCharA == arrayChar) System.out.println("equal"); 
    Arrays.sort(arrayChar);
    System.out.print(i + " " + b);
    
    System.out.println(" "+ "The sorted char array is:");
    for (char number : arrayChar) {
       System.out.println("Number = " + number);

    }
  }
}
