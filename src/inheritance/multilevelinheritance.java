package inheritance;

import java.lang.classfile.Superclass;

public class multilevelinheritance {
    public static void main(String[] args)
    {
        SuperAdmin sd=new SuperAdmin();
        sd.login();
        sd.accessAdminpanel();
        sd.shutdownSystem();
    }
}
class User
{
    void login()
    {
        System.out.println("Login to App");
    }
}
class Adminuser extends User
{
    void accessAdminpanel()
    {
        System.out.println("Can access Admin panel");
    }
}
class SuperAdmin extends Adminuser
{
    void shutdownSystem()
    {
        System.out.println("Shutting down the system");
    }
}