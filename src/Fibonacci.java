import java.util.Scanner;
import java.util.InputMismatchException;


public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        try{
            System.out.print("Enter the number of terms(n) for fibonacci Series: ");
            int n = sc.nextInt();

            if(n<=0){
                System.out.println("Please Enter a Positive Number Greater Than 0.: ");
            }else{
                System.out.print("Fibonacci Series up to " + n + "terms: ");

                for(int i =0 ; i<n ;i++){
                    System.out.print(fibonacci(i) + " ");
                }
            }
        }catch (InputMismatchException exception){
            System.out.println("Error: Invalid input! ");
        }finally{
            sc.close();
        }

    }

    public static int fibonacci(int n){
        if(n <=1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
