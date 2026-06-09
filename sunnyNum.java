public class sunnyNum {
    public static double isSunny(int num){
        double root = Math.sqrt(num+1);
        return root;
    }
    public static void main(String[] args){
        int num = 8;
        System.out.println(isSunny( num) == (int)isSunny(num)?"Sunny Number":"Not Sunny Number");
    }
}
