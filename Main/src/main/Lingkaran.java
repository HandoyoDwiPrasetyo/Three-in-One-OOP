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
public class Lingkaran extends BangunDatar{
    final double pi = 3.14;
    private float jari;

    public double getPi(){
        return pi;
    }
    public float getJari() {
        return jari;
    }

    public void setJari(float jari) {
        this.jari = jari;
    }
    
    @Override
    public float luas() {
        return (float) (pi*Math.pow(this.jari, 2)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float keliling() {
        return (float) (pi*(2*jari)); //To change body of generated methods, choose Tools | Templates.
    }
    
}
