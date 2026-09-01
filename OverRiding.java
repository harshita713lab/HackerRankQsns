class A{

    public int add (int n1 , int n2){
        return n1 + n2;
    }

}
class B extends A{
     public int add (int n1 , int n2){
        return n1 + n2 + 5;
    }

}
public class OverRiding {
    public static void main(String[] args) {
        B obj = new B();
        int ans = obj.add(5, 5);
        System.out.println(ans);
        
    }
    

}
