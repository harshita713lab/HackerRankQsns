package AnonymousInnerClass;

/**
 * Anonymous Inner Class Demo
 */
interface Greeting {
    void sayHello();
}

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        Greeting english = new Greeting() {
            public void sayHello(){
                System.out.println("Hello Buetyful Dolly");
            }
        };
        Greeting hindi = new Greeting() {
            public void sayHello(){
                System.out.println("Namste Doll");
            }
        };

        english.sayHello();
        hindi.sayHello();
    }
}
