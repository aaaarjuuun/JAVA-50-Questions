import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number or a string to cheack for palindrome: ");
        String input = sc.nextLine();

        try{
            int number = Integer.parseInt(input);
            boolean result = isNumberpalindrome(number);
            System.out.println("It is a Number. ");
            System.out.println("Is it a palindrome? " + result);
        }catch (NumberFormatException e) {
            boolean result = isStringPalindrome(input);
            System.out.println("It is a String. ");
            System.out.println("Is it a Palindrome? " + result);
        }finally{
            sc.close();
        }

    }

    public static boolean isNumberpalindrome(int num){
        int originalNumber = num;
        int reversedNumber = 0;

        while(num != 0){
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }
        return originalNumber == reversedNumber;
    }

    public static boolean isStringPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
