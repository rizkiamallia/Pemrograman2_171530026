/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum10.Tugas;

/**
 *
 * @author ACER
 */
public class NilaiMatakuliah extends Matakuliah{
    Double bobot_uts;
    Double bobot_uas;
    Double bobot_lain2;
    Double nilai_uts;
    Double nilai_uas;
    Double nilai_lain2;
    Double nilai_akhir;
    String Grade;
    Mahasiswa mhs;
    
    public double hitungNilai(){
        this.bobot_uts = 0.3;
        this.bobot_uas = 0.3;
        this.bobot_lain2 = 0.4;
        this.nilai_uts = nilai_uts;
        this.nilai_uas = nilai_uas;
        this.nilai_lain2 = nilai_lain2;
        
        this.nilai_akhir = ((this.nilai_uts*this.bobot_uts)+(this.nilai_uas*this.bobot_uas)+(this.nilai_lain2*this.bobot_lain2));
        return this.nilai_akhir;
    }
    
    public void hitungGrade(){
        double nilai = this.nilai_akhir;
        if(nilai >80){
            System.out.println("Grade A");
            this.Grade = "A";
        }else if(nilai >=76 || nilai <79){
            System.out.println("Grade AB");
            this.Grade = "AB";
        }else if(nilai >=71 || nilai <75){
            System.out.println("Grade B");
            this.Grade = "B";
        }else if(nilai >=66 || nilai <70){
            System.out.println("Grade BC");
            this.Grade = "BC";
        }else if(nilai >=61 || nilai <65){
            System.out.println("Grade C");
            this.Grade = "C";
        }else if(nilai >=56 || nilai<60){
            System.out.println("Grade CD");
            this.Grade = "CD";
        }else if(nilai >=51 || nilai <55){
            System.out.println("Grade D");
            this.Grade = "D";
        }else if(nilai >=50){
            System.out.println("Grade E");
            this.Grade = "E";
        }
    }
}
