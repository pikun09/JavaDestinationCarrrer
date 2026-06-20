import java.time.LocalDateTime;

public class student1 {
    int id;
    int age;
    String name;

    {
        System.out.println("Student account creation time:-");
        printDateandTime();
    }
    student1(){
        System.out.println("Student Object Got Created");
    }

    student1(int id){
        this();
        this.id = id;
        
    }
    student1(int id,int age){
        this(id);
        this.age = age;
        
    }
    student1(int id,int age,String name){
        this(id,age);
        this.name = name;
    }
    public static void printDateandTime(){
        System.out.println(LocalDateTime.now());
    }
    public static void main(String[] args){
        student1 s1 = new student1();
        System.out.println(s1.id);
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println("------------");
        student1 s2 = new student1(1);
        System.out.println(s2.id);
        System.out.println(s2.age);
        System.out.println(s2.name);
        System.out.println("------------");
        student1 s3 = new student1(2,23);
        System.out.println(s3.id);
        System.out.println(s3.age);
        System.out.println(s3.name);
        System.out.println("------------");
        student1 s4 = new student1(3,22,"Payal");
        System.out.println(s4.id);
        System.out.println(s4.age);
        System.out.println(s4.name);
        System.out.println("------------");

    }
}
