import java.util.*;
public class Lab3A4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int count=0;
        for(int i =1;i < a;i++){
            if(a % i==0){
                count++;
            }
        }
        if(count==1){
            System.out.println("the no. is prime");
        }
        else{
            System.out.println("the no is not prime");
        }
    }
}
