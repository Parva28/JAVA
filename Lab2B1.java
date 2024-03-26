import java.util.Scanner;

public class Lab2A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter + for addition - for subtraction * for multiplication / for dividion");
        String str = sc.next();
        int a,b=0,c=0;
        System.out.println("enter the first value");
             b = sc.nextInt();
            System.out.println("enter the second value");
             c = sc.nextInt();
        if(str.equals("+")){
            a = b + c;
            
            System.out.println("the addition is "+a);
        }
        else if(str.equals("-")){
            a = b - c;
           
            System.out.println("the subtraction is "+a);
        }
        else if(str.equals("*")){
            a = b * c;
           
            System.out.println("the multiplication is "+a);
        }
        else if(str.equals("/")){
            a = b / c;
            
            System.out.println("the division is "+a);
        }
        
    }
}
