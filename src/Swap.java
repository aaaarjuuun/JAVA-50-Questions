import java.util.Scanner;
import java.util.InputMismatchException;


public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    try{
        System.out.print("Enter First Integer(a): ");
        int a = sc.nextInt();

        System.out.print("Enter Second integer(b): ");
        int b = sc.nextInt();

        System.out.println("\n---Before Swap---");
        System.out.println("a = "+a+",b= "+b);

        //1. Swapping
        a= a+b;
        b= a-b;
        a = a-b;

        System.out.println("\n---After Swap---");
        System.out.println("a= " + a + ",b = " + b);

        //2. Find the largest of the two
        int largest = Math.max(a,b);
        System.out.println("\nLargest numbr is : " + largest);

        //3.Calculate Factorial using recursion
        long fact = calculateFactorial(largest);
        System.out.println("Factorial of " + largest + " is: " + fact);

    }catch(InputMismatchException exception){
        System.out.println("\nError : Please Enter a valid integers only! ");
    }finally {
        sc.close();
    }
    }

    public static long calculateFactorial(int n){
        if (n <= 1){
            return 1;

        }
        return n*calculateFactorial(n-1);
    }
}
