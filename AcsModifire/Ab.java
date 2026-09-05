package AcsModifire;

public class Ab {
protected int marks = 6;
}

class Lonch {
    public void abc() {
        Ab obj = new Ab();
        System.out.println(obj.marks);
    }

    public static void main(String[] args) {
        Lonch l = new Lonch();
        l.abc(); 
    
}
}