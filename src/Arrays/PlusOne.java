package Arrays;

import java.util.Arrays;

public class PlusOne {
    public static  int[] plusOne(int[] digits) {
        int integer = 0;
        if(digits.length != 1){
            for(int i =0; i< digits.length -1; i++){
                integer = integer * 10 + digits[i];
            }
            integer = integer*10 + digits[digits.length-1]+1;
            int[] arr = new int[digits.length];
            for(int i =digits.length -1;i>=0;i--){
                arr[i] = integer % 10;
                integer = integer / 10;
            }
            return arr;
        }
        integer =  digits[digits.length-1]  + 1;
        System.out.println(integer);
        int[] arr = new int[digits.length +1];
        for(int i =arr.length -1;i>=0;i--){
            arr[i] = integer % 10;
            integer = integer / 10;
        }


        return arr;

    }
    public static void main(String[] args) {
        int[] digits = {0};
        int [] arr = plusOne(digits);
        for(int i : arr){
            System.out.println(i);
        }



    }
}
