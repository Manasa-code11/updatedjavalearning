package exam01;
import java.util.Scanner;

public class challenge11 {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter nth number to print from 1 to n");
        int n= obj.nextInt();
        for(int i=1;i<=n;i++)
        {
           System.out.print(i+" ");
        }
    }
}
