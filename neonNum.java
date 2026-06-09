public class neonNum {
    public static int square(int num){
        return num*num;
    }
    public static int isNeon(int num){
        int square = square(num);
        int sum =0;
        while(square!=0){
            sum += square%10;
            square/=10;
        }
        return sum;
    }
    public static void Main(String[] args){
        int num = 9;
        System.out.println(isNeon(num) == num ?"Neon Number":"Not Neon Number");
    }
}
