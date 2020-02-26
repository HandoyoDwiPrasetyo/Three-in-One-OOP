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
public class Segitiga extends BangunDatar{
    private int alas;
    private int tinggi;
    private int miring;

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getMiring() {
        return miring;
    }

    public void setMiring(int miring) {
        this.miring = miring;
    }

    @Override
    public float keliling() {
        return alas+miring*2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float luas() {
        return (alas*tinggi)/2; //To change body of generated methods, choose Tools | Templates.
    }

    
}
