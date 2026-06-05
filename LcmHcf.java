public class LcmHcf {
    public static int hcf(int num1,int num2){
        int hcf=0;
        for(int i =1;i<=num1 && i<=num2;i++){
            if(num1%i == 0 && num2%i == 0){
                hcf=i;
            }
        }
        return hcf;
    }
    public static int lcm(int num1,int num2){
        
        return (num1*num2)/hcf(num1,num2);
    }
    public static void main(String[] args){
        System.out.println(hcf(25, 30));
        System.out.println(lcm(10, 15));
    }
}
