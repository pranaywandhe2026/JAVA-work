import java.util.Scanner;
public class loops2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the value of n=");
        n=sc.nextInt();
        int a=1;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                a=2;
                break;
            }
        }
        if(a==1) System.out.println("prime number");
        else if(a==2) System.out.println("composite number");
        else if(n==1) System.out.println("prime number");
        else if(n==2) System.out.println("prime number");
    }
}
