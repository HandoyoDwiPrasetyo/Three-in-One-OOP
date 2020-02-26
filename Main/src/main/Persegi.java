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
public class Persegi extends BangunDatar{
    private float sisi;
    
    public float getSisi(){
        return sisi;
    }
    public void setSisi(int sisi){
        this.sisi = sisi;
    }

    @Override
    public float luas() {
        return this.sisi*this.sisi;
    }
    public float luas(float sisi){
        return sisi*sisi;
    }

    @Override
    public float keliling() {
        return this.sisi*4; 
    }
    
    
}
