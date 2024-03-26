import java.util.Scanner;

public class Lab2A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the farenheit");
        double f = sc.nextDouble();
        double c = (f - 32) * 5/9;
        System.out.println("the temp in celsius is  "+c);
    }
}
