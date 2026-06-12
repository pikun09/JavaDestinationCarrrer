import java.util.Scanner;

public class duckNum {
    public static boolean isduckNumber(String word){
        if(word.charAt(0) == '0'){
            return false;
        }
        else if(word.contains("0")){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        String numString = sc.next().trim();
        sc.close();
        System.out.println(isduckNumber(numString)?"Duck Number":"Not Duck Number");
    }
}
