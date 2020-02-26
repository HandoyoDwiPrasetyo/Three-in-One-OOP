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
public class PersegiPanjang extends BangunDatar{
    private float panjang;
    private float lebar;

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    @Override
    public float keliling() {
        return 2*(panjang*lebar); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float luas() {
        return panjang*lebar; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
