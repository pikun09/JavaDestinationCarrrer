public class happyNum {
    public static int square(int digit){
        return digit*digit;
    }
    public static int sumofDigit(int num){
        int sum = 0;
        while(num!=0){
            int last = num%10;
            sum += square(last);
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args){
        int num = 19;
        while ( num !=1 && num !=4){
            num = sumofDigit(num);
        }
        System.out.println(num == 1 ? "Happy Number":"Given number Is not Happy number");
    }
}
