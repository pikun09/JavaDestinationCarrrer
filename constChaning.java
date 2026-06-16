public class constChaning{
    constChaning(){
        System.out.println("No Parameter Method");

    }
    constChaning(int a , int b){
        this();
        System.out.println("Parameter Method");

    }
    public static void main(String[] args){
        new constChaning(10,20);
    }
}