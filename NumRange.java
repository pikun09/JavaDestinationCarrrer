
public class NumRange {
    public static void Range(int num1, int num2){
        if(num1<num2)
            for(int i=num1;i<=num2;i++){
            System.out.println(i+" ");
        }
    }
    public static void main(String[] args){
        Range(32,45);
    }
}
