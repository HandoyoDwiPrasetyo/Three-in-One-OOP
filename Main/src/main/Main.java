/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Lab Informatika
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Persegi
        Persegi persegi = new Persegi();
        persegi.setSisi(10);
        System.out.println("\n=== Persegi : ");
        System.out.println("Luas Overide : " + persegi.luas());
        System.out.println("Luas Overload : " + persegi.luas(20));
        System.out.println("Keliling Persegi Overide : " + persegi.keliling());
        
        //Lingkaran
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJari(100);
        System.out.println("\n=== Lingkaran : ");
        System.out.println("Luas Lingkaran : " + lingkaran.luas());
        System.out.println("Keliling Lingkaran : " + lingkaran.keliling());
        
        //Persegi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setPanjang(6);
        persegiPanjang.setLebar(4);
        System.out.println("\n=== Persegi Panjang : ");
        System.out.println("Luas PersegiPanj : " + persegiPanjang.luas());
        System.out.println("Keliling PersegiPanj : " + persegiPanjang.keliling());
        
        //Segitiga
        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(3);
        segitiga.setTinggi(4);
        segitiga.setMiring(5);
        System.out.println("\n=== Segitiga : ");
        System.out.println("Luas Segitiga : " + segitiga.luas());
        System.out.println("Keliling Segitiga : " + segitiga.keliling());
    }
    
}
