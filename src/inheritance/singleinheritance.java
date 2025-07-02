package inheritance;

public class singleinheritance {
    public static void main(String[] args) {
        cat c = new cat();
        c.makesound();
        c.meow();
    }
}
    class Animal {
        void makesound() {
            System.out.println(" Animals makes sound");
        }
    }

    // Animal animal= new Animal();
    class cat extends Animal {
        void meow() {
            System.out.println("Cat makes meow sound");
        }
    }

