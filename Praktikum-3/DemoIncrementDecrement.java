public class DemoIncrementDecrement{

    public static void main(String[] args){
        int x=1, y=1, z=1;

        //nilai awal
        System.out.println("Nilai x : " + x); //1
        System.out.println("Nilai y : " + y); //1
        System.out.println("Nilai z : " + z); //1

        //Increment
        System.out.println("Nilai x : " + x); //2
        System.out.println("Nilai y : " + y++); //2 karena post ketika dijalankan memanggil lagi 
        System.out.println("Nilai z : " + ++z); //2

        System.out.println("Nilai y : " + y); //3

        //Decrement
        x--; y--;
        System.out.println("Nilai x : " + x); //1
        System.out.println("Nilai y : " + y--); //2
        System.out.println("Nilai z : " + --z); //1

        System.out.println("Nilai y : " + y);
    }
}