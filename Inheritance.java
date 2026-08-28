class calc{
    public int add(int a , int b){
        return a+b;
    }
    public int sub(int a , int b){
        return a-b;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        calc obj = new calc();
        int r1 = obj.add(30,20);
        int r2 = obj.sub(30, 10);

        System.out.println(r1 + " : " + r2);
        
    }
    
}
