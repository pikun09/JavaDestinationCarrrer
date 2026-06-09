import java.util.Scanner;

public class twistedPrime {
    public static int rev(int num){
        int rev = 0;
        while(num!=0){
            int last = num % 10;
            rev = rev*10 + last;
            num /= 10;
        }
        return rev;
    }
    public static boolean isPrime(int num){
        if(num ==1 || num ==0){
            return false;
        }
        for(int i=2;i*i<=num;i++ ){
            if(num %i ==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if(isPrime(num)){
            System.out.println(num == rev(num)?"Twisted Prime Number":"Not Twisted Prime Number");
        }
        else
            System.out.println("Enter a Prime Number");
    }
}
