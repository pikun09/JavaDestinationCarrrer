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
    public static void main(String[] args){
        System.out.println(digit(2343));
        System.out.println(rdigit(1));
        System.out.println(cdigit(2314));

    }
    
}
