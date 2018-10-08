import javax.swing.JOptionPane;

public class GetInputJOptionPane2{
    public static void main(String[] args){

        String nim="", nama="", tempat="", tgllahir="";
        
        nim = JOptionPane.showInputDialog("Masukkan NIM Anda : ");
        nama = JOptionPane.showInputDialog("Masukkan Nama Anda : ");
        tempat = JOptionPane.showInputDialog("Masukkan Tempat Lahir Anda : ");
        tgllahir = JOptionPane.showInputDialog("Masukkan Tanggal Lahir Anda : ");

        String msg ="Selamat datang" + nama + "\nNIM : " + nim + "\nTempat Lahir : " + tempat + "\nTanggal Lahir : " + tgllahir;
        JOptionPane.showMessageDialog(null, msg);
    }
}
