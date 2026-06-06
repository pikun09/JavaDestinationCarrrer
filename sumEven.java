public class sumEven {
    public static void evenSum(int limit){
        int i = 2;
        int sum = 0;
        do{
            if(i%2 == 0){
                sum+=i;
            }
            i++;

        }
        while(i<=limit);
        System.err.println("Sum of even numbers "+sum);
    }
    public static void main (String[] args){
        evenSum(34);
    }
}
