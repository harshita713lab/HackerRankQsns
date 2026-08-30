class A extends Object{
    public A() {
        System.out.println("Hi, I am A");
    }
    public A(int n){
        System.out.println("Hii, I am A with par. Constructor");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("Hi, I am B");
    }
    public B(int n ){
        this();
        System.out.println("Hii, I am B with par. Constructor");
    }

}

public class Super{
    public static void main(String[] args) {
        B obj = new B(5);
        
    }
}
