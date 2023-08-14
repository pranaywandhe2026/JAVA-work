import java.util.Scanner;
public class IfElse3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("n=");
        n=sc.nextInt();
        if(n%5==0 || n%3==0){
            if(n%15!=0) System.out.println("divisible by 5 or 3 and not by 15");
            else System.out.println("divisible by 15");
        }

    }
}
