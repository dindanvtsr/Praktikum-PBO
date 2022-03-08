/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bangun;

/**
 *
 * @author Lenovo
 */
public class Lingkaran implements MenghitungBidang{
    protected double jariLingkaran, kelilingLingkaran, luasLingkaran;
    
    public Lingkaran(){
        
    };
    
    public Lingkaran(double jariLingkaran){
        this.jariLingkaran = jariLingkaran;
    }

    public double getJariLingkaran() {
        return jariLingkaran;
    }

    public void setJariLingkaran(double jariLingkaran) {
        this.jariLingkaran = jariLingkaran;
    }

    public double getKelilingLingkaran() {
        return kelilingLingkaran;
    }

    public void setKelilingLingkaran(double kelilingLingkaran) {
        this.kelilingLingkaran = kelilingLingkaran;
    }

    public double getLuasLingkaran() {
        return luasLingkaran;
    }

    public void setLuasLingkaran(double luasLingkaran) {
        this.luasLingkaran = luasLingkaran;
    }
    
    @Override
    public void keliling() {
        kelilingLingkaran = 3.14 * (2*jariLingkaran);
    }

    @Override
    public void luas() {
        luasLingkaran = 3.14 * jariLingkaran * jariLingkaran;
    }
    
}
