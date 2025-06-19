package exam01;
import java.util.Scanner;


public class challenge6 {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int x=obj.nextInt();
        if(x>0)
            System.out.println(x+" is a Positive number");
        else if (x==0)
            System.out.println(x +"->zero");
        else
            System.out.println(x +" is a negative number");
    }

}
