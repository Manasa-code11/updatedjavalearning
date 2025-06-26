package exam01;

public class exam02challenge02 {
    public static void main(String[] args)
    {
        String s1="java";
        String s2="programming";
        String s3="java";
        String s4="JAVA";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s4));
        System.out.println(s1.compareTo(s4));




    }
}
