public class xylemPloyemnum {
    public static void xylemPloyem(int num){
        if(num<99){
            System.out.println("Enter 3-digit Number.");
        }else{
            int outerLoop = num % 10; num/=10;
        int innerLoop = 0;
        while(num >9){
            innerLoop += num % 10;
            num /= 10;
        }
        outerLoop += num;
        System.out.println(outerLoop == innerLoop ?"Xylem ":"Ployem");
        }
        

    }
    public static void main(String[] args){
        xylemPloyem(7443);
    }
}
