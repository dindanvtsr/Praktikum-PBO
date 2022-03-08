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
public class PersegiPanjang implements MenghitungBidang{
    double panjangPersegiPanjang, lebarPersegiPanjang, kelilingPersegiPanjang, luasPersegiPanjang;
    
    public PersegiPanjang(){
        
    };

    public PersegiPanjang(double panjangPersegiPanjang, double lebarPersegiPanjang) {
        this.panjangPersegiPanjang = panjangPersegiPanjang;
        this.lebarPersegiPanjang = lebarPersegiPanjang;
    }

    public double getPanjangPersegiPanjang() {
        return panjangPersegiPanjang;
    }

    public void setPanjangPersegiPanjang(double panjangPersegiPanjang) {
        this.panjangPersegiPanjang = panjangPersegiPanjang;
    }

    public double getLebarPersegiPanjang() {
        return lebarPersegiPanjang;
    }

    public void setLebarPersegiPanjang(double lebarPersegiPanjang) {
        this.lebarPersegiPanjang = lebarPersegiPanjang;
    }

    public double getKelilingPersegiPanjang() {
        return kelilingPersegiPanjang;
    }

    public double getLuasPersegiPanjang() {
        return luasPersegiPanjang;
    }

    @Override
    public void keliling() {
        kelilingPersegiPanjang = 2 * (panjangPersegiPanjang + lebarPersegiPanjang);
    }

    @Override
    public void luas() {
        luasPersegiPanjang = panjangPersegiPanjang * lebarPersegiPanjang;
    }
}
