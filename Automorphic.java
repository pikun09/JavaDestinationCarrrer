public class Automorphic {
    public static int power10(int num){
        int count = 1;
        while(num!=0){
            num/=10;
            count*=10;
        }
        return count;
    }
    public static void main(String[] args){
        int num = 25;
        System.out.println(num == num*num%(power10(num))?"Automorphic Number ":"Not Automerphic Number");
    }
      
}
