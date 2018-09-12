public class TransaksiPenjualan {
    public static void main (String[] args){
        int A = 5000;
        int B = 15000;
        int C = 8000;
        int D = 2000;
        int E = 10000;
        float total = A + B + C + D + E;

        System.out.println("Barang 1 = "+ A);
        System.out.println("Barang 2 = "+ B);
        System.out.println("Barang 3 = "+ C);
        System.out.println("Barang 4 = "+ D);
        System.out.println("Barang 5 = "+ E);
        System.out.println("Total = "+ total);

        double bayar = 100000;
        int kembalian = (int) bayar - (int) total;
        System.out.println("Jumlah bayar = "+ bayar);
        System.out.println("Kembalian = "+kembalian);
    }
}