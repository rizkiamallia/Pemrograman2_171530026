public class DemoArray2{

    public static void main(String[] args){
        //Contoh program pencarian

        String names[] = {"Adi", "Aji", "Abbi", "Abdul", "Hasif"};
        String searchName = "Abbi";
        boolean foundName = false; //deklarasi variabel array dengan nama foundName tipe boolean diberi nilai false
        for(int i=0; i<names.length; i++){
            if(names[i].equals(searchName)){
                foundName = true;
                break;
            }
        }
        if(foundName){ //jika foundName benar maka nama akan dicetak
            System.out.println(searchName + "found!");
        }else{
            System.out.println(searchName + "not found.");
        }
    }
}

// baris 10 jika menggunakan equals case sensitif tapi jika menggunkan equalsIgnoreCase tidak akan case sensitif