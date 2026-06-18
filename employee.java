public class employee{
    int id;
    String name;
    {
        //Non Static multiline INITIALIZER
        System.out.println("Employee object created");
        System.out.println(name);
    }
    employee(int id,String name){
        this.id = id ;
        this.name = name;

    }
    public static void main(String[] args){
        employee e1 = new employee(1, "Payal");
        System.out.println(e1.id);
        System.out.println(e1.name);
    }
}