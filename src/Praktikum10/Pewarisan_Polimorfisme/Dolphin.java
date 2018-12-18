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
class Animal {
}

class Mammal extends Animal{
}
class Cat extends Dolphin{
}
public class Dolphin extends Mammal{
    
    public static void main(String[] args){
        Mammal m = (Mammal) new Animal();
        Animal a = m;
        Dolphin d = (Dolphin) a;
    }
}
