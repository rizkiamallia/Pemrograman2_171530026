public class ExForCount{

    public static void main(String[] args){
        int count=1;
        for(int i=0; i<9; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(count);
            }
            count++; System.out.println();
        }
    }
}

/* Analisa Sintak :
    pada baris ke-5 for yang pertama akan dijalankan 9 kali, dan
    pada baris ke-6 for yang akan dijalankan sekali.
*/