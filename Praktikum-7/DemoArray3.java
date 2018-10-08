public class DemoArray3{ //membuat class baru dengan nama DemoArray dengan modifier public

    public static void main(String[] args){ //membuat method main yang berfungsi sebagai method yg pertama kali dijalankan
        int nilai[] = new int[3];
        nilai[0] = 70; //memberikan nilai pada variabel array nama elemen 0 dengan nilai "Andi Novianto"
        nilai[1] = 80;
        nilai[2] = 65;

        double ratarata = 0.0;
        for(int i=0; i<nilai.length; i++){
            ratarata+=nilai[i]; //ratarata = rtarata +nilai[i]
        }
        ratarata/=nilai.length; //ratarata = ratarata/nilai.length
        System.out.println("Nilai rata-rata = " + ratarata);
        System.out.println("Nilai rata-rata = " + Math.ceil(ratarata));
    }
}