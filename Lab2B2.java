import java.util.Scanner;

public class Lab2A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius");
        int r = sc.nextInt();
        double area = Math.PI * r * r;
        System.out.println("the area of circle is  "+area);
    }
}
