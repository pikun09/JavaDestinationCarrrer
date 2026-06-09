public class altPrime {
    public static boolean isPrime(int num){
        if (num == 1 || num == 0){
            return false;
        } 
        for(int i = 2 ;i*i<=num;i++){
            if(num  % i ==0 ){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int count = 0;
        int i = 2;
        int range = 10;
        while(range!=0){
            if(isPrime(i)){
                if(count == 0){
                    System.out.println(i);
                    
                    count = 1;
                    range -- ;
                }else{
                    count = 0;
                }
            }
            i++;

        }

    }
}
