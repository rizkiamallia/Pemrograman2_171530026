import java.io.*;

public class CaseLogin{

    public static void main(String[] args) throws IOException{
        String id_user="", password="";
        boolean status= true;

        BufferedReader dataInput= new BufferedReader(new InputStreamReader(System.in));
        do{

            System.out.print("Masukkan ID. User : ");
            id_user=dataInput.readLine();

            System.out.print("Masukkan Password : ");
            password=dataInput.readLine();

            if(!id_user.equals("171530026")){
                System.out.println("ID. User yang Anda masukkan salah!");
            }else{
                if(!password.equals("mahasiswa123")){
                    System.out.println("Password yang Anda masukkan salah!");
                }else{
                    status = false;
                }
            }
        }while(status);
        System.out.println("Selamat datang : " + id_user);
    }    
}