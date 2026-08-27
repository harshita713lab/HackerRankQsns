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

    public Human(){
       age = 21;
       name = "Harshita";
       FatherName = "Trilok kumar";
    }

    public Human(int a , String n , String f){
        age = a;
        name = n;
        FatherName = f;
    }
}
public class Encapsulation{
    public static void main(String args[]){

        Human obj = new Human();
        Human obj1 = new Human(21 , "Navin" , "Param");

        // obj.setAge(31);
        // obj.setName("kartika");
        // obj.setFaterName("Trilok Kumar Rathore");

        System.out.println(obj.getAge() + " : " + obj.getName() + " : " + obj.getFaterName());
        System.out.println(obj1.getAge() + " : " + obj1.getName() + " : " + obj1.getFaterName());

    }
}