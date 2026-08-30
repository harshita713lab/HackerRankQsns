public class Demo{
    public static void main(String[] args) {
        Inheritance2 obj = new Inheritance2();
        int r1 = obj.add(20, 10);
        int r2 = obj.sub(20, 10);
        int r3 = obj.divide(10, 2);
        int r4 = obj.mul(10, 3);
        System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4);
    }
}