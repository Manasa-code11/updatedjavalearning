package constructors;

public class vechileconstructorchain {
    public static void main(String[] args)
    {
       RoyalEnfield b=new RoyalEnfield();

    }
}
class vehicle
{
    vehicle()
    {
        System.out.println("Vehicle is ready");
    }
}
class Bike extends vehicle
{
     Bike()
    {
        System.out.println("Bike is ready");
    }

}
class RoyalEnfield extends Bike
{
    RoyalEnfield()
    {
        System.out.println("RoyalEnfield is a bike");
    }

}