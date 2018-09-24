public class DemoAritmatika{

    public static void main(String[] args){
        //sedikit angka
        int i=37;
        int j=42;
        double x=27.475;
        double y=7.22;
        System.out.println("Nilai dari variabel...");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("x = " + x);
        System.out.println("j = " + j);

        //penjumlahan angka
        System.out.println("Adding...");
        System.out.println("i + j = " + (i + j)); //79
        System.out.println("x + y = " + (x + y));

        //pengurangan angka
        System.out.println("Subtrancing...");
        System.out.println("i - j = " + (i - j));
        System.out.println("x - y = " + (x - y));

        //perkalian angka
        System.out.println("Multiplaying...");
        System.out.println("i * j = " + (i * j));
        System.out.println("x * y = " + (x * y));

        //pembagian angka
        System.out.println("Diving...");
        System.out.println("i / j = " + (i / j));
        System.out.println("x / y = " + (x / y));

        //menghitung hasil modulus dari pembagian
        System.out.println("Computing the remainder...");
        System.out.println("i % j = " + (i % j));
        System.out.println("x % y = " + (x % y));

        //tipe penggabungan
        System.out.println("Mixing tipes...");
        System.out.println("j + y = " + (j + y));
        System.out.println("i * x = " + (i * x));
    }
}