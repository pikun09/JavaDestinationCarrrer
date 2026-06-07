public class sumDigit {
    public static int sumOfDigit(int num){
        int sum =0;
        while(num>0){
              sum += num%10;
              num/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println("Sum of digit:"+sumOfDigit(234));
    }
}
