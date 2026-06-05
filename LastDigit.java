public class LastDigit {
    /*Return Last Digit of any number*/
    public static int digit(int num){
        

        return num%10;
    }
    /*Delete last digit of any number */
    public static int rdigit(int num){
        return num/10;
    }
    /*Count total digit */
    public static int cdigit(int num){
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }
    /*Maximum between 2 number */
    public static int max(int a,int b){
        return a>b?a:b;
    }
    /*Divisible by 5 and 11 */
    public static void div(int a){
        if(a%5 ==0 && a%11 ==0 ){
            System.out.println("Number is divisible by 5 and 11.");
        }
        else
            System.out.println("Number is not divisible by 5  and 11.");
    }
    public static void main(String[] args){
        System.out.println(digit(2343));
        System.out.println(rdigit(1));
        System.out.println(cdigit(2314));
        System.out.println(max(12,34));
        div(34);

    }
    
}
