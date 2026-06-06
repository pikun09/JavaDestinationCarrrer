import java.util.Scanner;

public class CountNote {
    public static void  noteCount(int num){
        while(num > 0){
            int countNote = num/2000;
            num = num%2000;
            System.out.println("2000 notes = "+countNote);
            countNote = num/500;
            num = num%500;
            System.out.println("500 notes = "+countNote);
            countNote = num/200;
            num = num%200;
            System.out.println("200 notes = "+countNote);
            countNote = num/100;
            num = num%100;
            System.out.println("100 notes = "+countNote);

            countNote = num/50;
            num = num%50;
            System.out.println("50 notes = "+countNote);
            countNote = num/20;
            num = num%20;
            System.out.println("20 notes = "+countNote);
            countNote = num/10;
            num = num%10;
            System.out.println("10 notes = "+countNote);
            countNote = num/5;
            num = num%5;
            System.out.println("5 coin = "+countNote);
            countNote = num/2;
            num = num%2;
            System.out.println("2 coin = "+countNote);
            countNote = num/1;
            num = num%1;
            System.out.println("1 coin = "+countNote);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        noteCount(num);
        sc.close();
    }
}
