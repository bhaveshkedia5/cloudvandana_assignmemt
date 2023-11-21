import java.util.*;
public class roman_to_integer {
   public static void main(String args[]) {
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter a Roman Number in capital letters: ");
      String inputRoman= obj.nextLine();
      System.out.println("The Integer value of given Roman number is:"+ romanToInt(inputRoman));
      obj.close();
   }
   static int NumValue(char r){
      if (r == 'I')
         return 1;
      if (r == 'V')
         return 5;
      if (r == 'X')
         return 10;
      if (r == 'L')
         return 50;
      if (r == 'C')
         return 100;
      if (r == 'D')
         return 500;
      if (r == 'M')
         return 1000;
      return -1;
   } 
   static int romanToInt(String str) {
      int sum = 0;
      for (int i=0; i<str.length(); i++) {
         int s1 = NumValue(str.charAt(i));
         if (i+1 <str.length()) {
            int s2 = NumValue(str.charAt(i+1));
            if (s1 >= s2) {
               sum = sum + s1;
            }
            else {
               sum = sum - s1;
            } 
         }
         else {
            sum = sum + s1;
         } 
      }
      return sum;
   } 
} 