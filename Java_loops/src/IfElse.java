import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n;
        System.out.println("enter the number=");
        n=sc.nextInt();
        int count=0;
      while(n>0){
         count++;
         n=n/10;
      }
      if(count>2 && count<=3) System.out.println("three digit number");
      else if(count>3) System.out.println("four digit number");
        System.out.println("satisfied");
    }
}
