package increanddecrement;

public class lab004 {
    public static void main(String[] args)
    {
        int a=5;
        int b=a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println("a:"+a+"b:"+b);
        int i=1;
        i=i++ + ++i;
        System.out.println(i);
        int x=5;
        System.out.println(x++ + ++x);
        int x1 = 5;

        System.out.println(++x1);

        System.out.println(x1++);

        System.out.println(x1);

        int x2 = 5;

        int y2 = x2++ + ++x2 + x2++ + ++x2;

        System.out.println("x2 = " + x2 + ", y2 = " + y2);
    }
}
