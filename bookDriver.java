public class bookDriver {
    public static void main(String[] args){
        book b1 = new book();
        b1.author = "Balmiki";
        b1.title = "Rmayana";
        b1.price = 3000;
        book b2 = new book();
        b2.author = "Vedyabyash";
        b2.title = "Mahabharat";
        b2.price = 3000;
        book b3 = new book();
        b3.author = "Bhagavat Gita";
        b3.title = "Vedyabyash";
        b3.price = 3000;
        System.out.println(b1.author);
        System.out.println(b1.title);
        System.out.println(b1.price);
    }
}
