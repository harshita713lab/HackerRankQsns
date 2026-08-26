class Human{
    private int age;
    private String name;
    private String FatherName;

    void setAge(int a){
        age = a;
    }
    int getAge(){
        return age;
    }

    void setName(String n){
        name = n;
    }
    String getName(){
        return name;
    }

    void setFaterName(String f){
        FatherName = f;
    }
    String getFaterName(){
        return FatherName;
    }
}
public class Encapsulation{
    public static void main(String agrs[]){
        Human obj = new Human();
        obj.setAge(31);
        obj.setName("Dolly");
        obj.setFaterName("Trilok");


        System.out.println(obj.getFaterName());
    }
}