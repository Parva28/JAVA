import java.util.Scanner;

public class Lab3A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int a = sc.nextInt();
        System.out.println("enter a no.");
        int b = sc.nextInt();
        System.out.println("enter a no.");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("the largest no. is"+a);
        }
        else if(b>a && b>c){
            System.out.println("the largest no. is"+b);
        }
        else if(c>a && c> b){
            System.out.println("the largest no. is"+c);
        }
    }
}
