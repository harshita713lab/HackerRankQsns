class Human{
    private int age;
    private String name;
    private String FatherName;

    void setAge(int age, Human obj){
        Human obj1 = obj;
        obj1.age = age;
    }
    int getAge(){
        return age;
    }

    void setName(String name){
        this.name = name;
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
        obj.setAge(31, obj);
        obj.setName("Dolly");
        obj.setFaterName("Trilok");


        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}