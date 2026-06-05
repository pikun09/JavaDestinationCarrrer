public class pow {
    public static int power(int a,int b){
        int power=1;
        for(int i=1;i<=b;i++){
            power*=a;

        }
        return power;
    }
    public static void main(String[] args){
        System.out.println(power(3, 2));
    }
}
