public class ExContinueUnlabel{

    public static void main(String[] args){
        String names [] = {"Beah", "Bianca", "Lance", "Beah"};
        int count = 0;
        for(int i=0; i<names.length; i++){
            if(!names[i].equals("Beah")){
                continue; //skip next statement
            }
            count++;
        }
        System.out.println("There are" + count + "Beahs in the list");
    }
}

/**
    Analisa Sintak :
    1. looping akan berjalan sebanyak 4 kali
    2. jika kondisi if bernilai true maka statement continue akan dijalankan
        tapi jika bernilai false tidak akan mengeksekusi count++
 */
    
