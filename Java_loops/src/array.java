import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n;
        System.out.println("enter the value of n=");
        n=sc.nextInt();
        int marks[]=new int[n];
        for(int i=0;i<marks.length;i++){
            System.out.println("enter the marks of "+ (i+1) +" "+"subject=");
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<marks.length;i++){
            System.out.println("marks of "+(i+1)+" "+"student is="+marks[i]);
        }

    }
}
