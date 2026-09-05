package AccessModifiers;

public class ProtectedAccessModifier {
    protected int marks = 6;
}

class Lonch {
    public void abc() {
        ProtectedAccessModifier obj = new ProtectedAccessModifier();
        System.out.println(obj.marks);
    }

    public static void main(String[] args) {
        Lonch l = new Lonch();
        l.abc(); 
    }
}
