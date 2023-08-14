import java.util.Scanner;
public class IfElse2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("a=");
        int a=sc.nextInt();

        System.out.println("b=");
        int b=sc.nextInt();

        System.out.println("c=");
        int c=sc.nextInt();
        if(a>b){
            if(a>c) System.out.println("a is greatest");
            else System.out.println("c is greatest");
        }
        else if(b>a){
            if(b>c) System.out.println("b is greatest");
            else System.out.println("c is greatest");
        }
    }
}
