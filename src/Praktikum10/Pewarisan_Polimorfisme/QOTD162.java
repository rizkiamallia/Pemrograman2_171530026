/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum10.Pewarisan_Polimorfisme;

/**
 *
 * @author ACER
 */
class QOTD162 {
    public int x = 5;
}

class Child extends QOTD162{
    public int x = 10;
    
    public void info(int x){
        System.out.println(x);
        System.out.println(this.x); //10
        System.out.println(super.x); //5
    }
}

class AksesNilai{
    public static void main(String args[]){
        Child c = new Child();
        c.info(15);
    }
}

/* 
    1. pada baris 26 seharusnya tidak usah memakai public cukup dengan class AksesNilai
*/