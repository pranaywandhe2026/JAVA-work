import java.util.Scanner;
public class loops1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the value of n=");
        n=sc.nextInt();
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                System.out.println("composite number");
                break;
            }
            else if(n%i!=0){
                if(n==25){
                    System.out.println("composite number");
                    break;
                }

                System.out.println("prime number");
                break;
            }

        }
//        double a=100;
//        for(int i=1;i<=n;i++){
//            System.out.println(a);
//            a=a/2;
//        }
//        for(int i=100;i>0;i=i-3){
//            System.out.println(i);
//        }
//        for(int i=1;i<=n;i++){
//            System.out.println(a);
//            a=a*2;
//        }
//        for(int i=4;i<=3*n+1;i=i+3){
//            System.out.println(i);
//        }
//        for(int i=1;i<=n;i++){
//            System.out.println(a);
//            a=a+3;
//        }
//        for(int i=1;i<=2*n-1;i=i+2){
//
//            System.out.println(i);
//            }

        }
    }

