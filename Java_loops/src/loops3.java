import java.util.Scanner;
public class loops3 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the value of n=");
        n=sc.nextInt();
       int i=0;
       while(n>0){

           n=n/10;
           i=i+1;

       }

//        for(int i=1;i<=10;i++){
//            if(i==5){
//
//                System.out.println(i);
//              continue;
//            }
//            System.out.println(i);
//        }
    }

}
