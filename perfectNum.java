public class perfectNum {
    public static int isPerfect(int num){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int num = 7;
        System.out.println(isPerfect(num) == num?"Prefect Number":"Not Perfect Number");

    }
}
