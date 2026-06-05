public class RevNum {
    public static int Reverse(int num){
        int rev =0;
        while(num >0){
            int digit = num % 10;
            rev = (rev*10)+digit;
            num/=10;
        }
        return rev;
    }
    public static boolean NumeriPaliCheck(int num){
        return num == Reverse(num)?true:false;
    }
    public static void main(String[] args) {
        System.out.println(Reverse(231));
        System.out.print(NumeriPaliCheck(342)?"Palindrome":"Not Palindrome");
    }
}
