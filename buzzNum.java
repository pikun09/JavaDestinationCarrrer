public class buzzNum {
    public static void buzzNumber(int num){
        System.out.println(num%10 == 7 || num/10 == 0?"Buzz Number":"Not Buzz number");
    }
    public static void main (String[] args){
        buzzNumber(37);
    }
}
