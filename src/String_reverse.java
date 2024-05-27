//Write a function that reverses a string. The input string is given as an array of characters s.
//
//You must do this by modifying the input array in-place with O(1) extra memory.

public class String_reverse {
   public static void reverseString(char[] s) {
       int left  = 0;
       int right = s.length - 1;
       while(left<right){

           char temp = s[left];
           s[left] = s[right];
           s[right] = temp;
           left++;
           right--;

       }
       System.out.println(s);

   }
   public static void main(String[] args) {
       String text = "hello";
       char[] s = text.toCharArray();
        reverseString(s);

   }



    }

