class strongNum{
    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    public static int isStrong(int num){
        int sumFact =0;
        while(num>0){
            int rem = num%10;
            sumFact+=factorial(rem);
            num/=10;

        }
        return sumFact;
    }
    public static void main(String[] args){
        int num = 45;
        System.out.println(num == isStrong(num)?"Strong Number":"Not Strong Number");
    }
}