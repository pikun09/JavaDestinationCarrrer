class powerSeries{
    public static void square(int num ){
        for(int i=1;i<=num;i++){
            System.out.println(i*i);
        }
    }
    public static void cube(int num ){
        for(int i=1;i<=num;i++){
            System.out.println(i*i*i);
        }
    }

    public static void main(String[] args) {
        square(5);
        cube(5);
    }
}