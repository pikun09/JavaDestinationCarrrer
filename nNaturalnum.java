public class nNaturalnum {
    public static void printNum(int num){
        for(int i=1;i<=num;i++){
            System.out.print(i+" ");
        }
    }
    public static int sumNum(int num){
        int  sum = 0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        return sum;
    }
    public static int prodNum(int num){
        int  prod = 1;
        for(int i=1;i<=num;i++){
            prod*=i;
        }
        return prod;
    }


    public static void main(String[] args){
        printNum(67);
        System.out.println("Sum of numbers:"+sumNum(57));
        System.out.println("Product of numbers :"+prodNum(56));
    }
}
