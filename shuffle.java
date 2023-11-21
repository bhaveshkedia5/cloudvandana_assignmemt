import java.util.Random;

public class shuffle
{
  public static void main(String args[])
  {
    int[] Array_temp = { 1, 2, 3, 4, 5, 6, 7 };

    shufflearray(Array_temp);
    for (int i = 0; i < Array_temp.length; i++)
    {
      System.out.print(+ Array_temp[i] + " ");
    }
    System.out.println();
  }

  static void shufflearray(int[] a)
  {
    Random rand = new Random();
    for (int i = 0; i < a.length; i++)
    {
      int n = rand.nextInt(a.length);
      int b = a[n];
      a[n] = a[i];
      a[i] = b;
    }
  }
}