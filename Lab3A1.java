import java.util.Scanner;

public class Lab3A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter mark of subject1");
        int s1 = sc.nextInt();
        System.out.println("enter mark of subject2");
        int s2 = sc.nextInt();
        System.out.println("enter mark of subject3");
        int s3 = sc.nextInt();
        System.out.println("enter mark of subject4");
        int s4 = sc.nextInt();
        System.out.println("enter mark of subject5");
        int s5 = sc.nextInt();
        int sum = s1+s2+s3+s4+s5;
        sum = sum * 100;
        sum = sum/500;
        System.out.println("the percentage is "+sum);
        if(sum>=60){
            System.out.println("first division");
        }
        else if (sum>=50) {
            System.out.println("second division");
        }
        else if(sum>=40){
            System.out.println("third division");
        }
        else if(sum<=39){
            System.out.println("fail");
        }

    }
}
