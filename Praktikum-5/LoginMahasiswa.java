import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LoginMahasiswa{

    public static void main(String[] args){
        String nim="", password="";
        

        BufferedReader dataInput= new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            System.out.print("Masukkan ID. User : ");

            try{
                nim = dataInput.readLine();
            }catch(IOException ex){
                System.out.print("Error " + ex);
            }

            System.out.print("Masukkan Password : ");

            try{
                password = dataInput.readLine();
            }catch(IOException ex){
                System.out.print("Error " + ex);
            }

            if(nim.equals("171530026") && password.equals("mahasiswa123")){
                System.out.println("Selamat datang " + nim);
                break;
            }else if(nim.equals("171530026") == false){
                System.out.println("Password Salah");
            }
        }
    }
}