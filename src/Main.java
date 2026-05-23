import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //Methods and Function
    public static void printJava(){
        System.out.println("Hello");

    }

    public static void printname(String name){
        System.out.println(name);

    }


    public static void sum(int a,int b){
        int sum = a+b;
        System.out.println(sum);

    }
    public static void main(String[] args) {


        sum(5,5);
        printname("Arjun");
        printname("FRIZN");
        printJava();
        printJava();
        printJava();



//        byte age =30;
//        int phone = 987779232;
//        long phone2 = 9387779232L;
//        float pi = 3.14F;
//        System.out.println(age);
//        System.out.println(phone);
//        System.out.println(phone2);
//        String Name = "ARJUN MANDAL";
//        String friend = new String("arjun");
//        System.out.println(Name.length());
//        System.out.println(friend);


//        String name= "Arjun";
//        System.out.println(name.charAt(2));
//        String name2=name.replace("A","Z");
//        System.out.println(name2);
//        String name3 = "Arjun and Karan";
//        System.out.println(name3.substring(6,9));


//        int age = 30;
//        int[] marks = new int[3];
//        marks[0] = 97;
//        marks[1] = 98;
//        marks[2] = 87;
//
//
//        System.out.println(marks.length);
//
//        //Sort
//        System.out.println(marks[0]);
//        Arrays.sort(marks);
//        System.out.println(marks[0]);

//        int[] marks = {88,62,97};
//
//        int[][] finalMarks = {{94,32,75},{64,85,26}};
//        System.out.println(finalMarks[0][2]);

        //CASTING(IMPLICIT AND EXPLICIT)
        //IMPLICIT
//        double price = 100;
//        double finalprice = price + 18;
//
//        System.out.println(finalprice);
//
//        //EXPLICIT
//        int p = 100;
//        int fp = p + (int)18.85887;
//        System.out.println(fp);

        //Constant
//
//        int age = 20;
//        age = 21;
//        age = 22;
//
//        final float PI = 3.14F;


        //OPERATORs
//        int a =5;
//        int b=3;
//        int sum = a+b;
//        System.out.println(sum);
//        int SUb = a-b;
//        System.out.println(SUb);
//        int mul= a*b;
//        System.out.println(mul);
//        int modulo = a%b;
//        System.out.println(modulo);
//
//        int num = 1;
//
//        System.out.println(--num);
//        System.out.println(num);



//        //MATHS
//        //5,6
//        System.out.println(Math.max(8,9));
//        System.out.println(Math.min(8,9));
//        System.out.println((int)(Math.random()*100));



//        //INPUT
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input your Name: ");
//        String name = sc.nextLine();
//
//        System.out.println(name);



        //Comparison Operators
        //a == b
        //a != b
        //a > b
        //a < b
        //a <= b
        //a >= b



        //conditional statement

//        boolean isSunUp = true;
//        if(isSunUp == true)
//            System.out.println("Day");
//            else
//            System.out.println("Night");
//
//
//            int age = 20;
//            if(age>18)
//                System.out.println("Can vote");
//            else
//                System.out.println("Cannot vote");
//
//
//            int a = 80;
//            int b = 20;

//            if(a <50 && b<50)
//                System.out.println("BOTH are Less Than 50");
//            else
//                System.out.println("BOTH Are Greater than 50");

//        if(a<50 || b<50)
//            System.out.println("Atleast one less than 50");
//
//        boolean isAdult = true;
//        if(!isAdult == true)
//            System.out.println("IS Adult");
//        else
//            System.out.println("Not adult");

        //Conditional Statement

//        Scanner sc = new Scanner(System.in);
//
//        int cash = sc.nextInt();
//        if (cash <= 10) {
//
//            System.out.println("Cannot buy Anything");
//            System.out.println("Get more cash");
//        }
//        else if(cash >10 && cash <40){
//            System.out.println("can get 1 thing");
//        }
//        else{
//            System.out.println("can get both");
//        }
//


//        //SWITCH
//        Scanner sc = new Scanner(System.in);
//
//        int day = sc.nextInt();
//
//        switch(day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thrusday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("Sunday");
//        }


        //LOOPS
//        //1-100
//        for(int i=0;i<100;i = i+1){
//            System.out.println(i);
//        }

//        //100-1
//        for(int i=100;i>=1;i = i-1){
//            System.out.println(i);
//        }

        //While loop
//        int i = 100;
//        while(i >= 1){
//            System.out.println(i);
//            i = i-1;
//        }

//        //Do while
//        int j = 100;
//        do{
//            System.out.println(j);
//            j = j -1;
//        } while(j>=1);


//        Scanner sc = new Scanner(System.in);
//        int number = 0;
//        do{
//            System.out.print("Enter a number: ");
//            number = sc.nextInt();
//            System.out.println("Here is your Number: " + number);
//
//        }while(number >= 0);
//        System.out.println("Number is less than 0");


//        //BREAK & CONTINUE
//        int i=0;
//        while(true){
//            if(i == 3){
//                i = i+1;
//                continue;
//            }
//            System.out.println(i);
//            i = i+1;
//            if(i>5){
//                break;
//            }
//
//        }


//        //TRY - CATCH in EXCEPTION HANDLING
//
//        int[] marks = {84,35,95};
//        try{
//            System.out.println(marks[5]);
//        }
//        catch(Exception exception){
//
//        }
//        System.out.println("The name is arjun");




    }
}