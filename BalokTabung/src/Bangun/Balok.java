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
public class Balok extends PersegiPanjang implements MenghitungRuang{
    protected double tinggiBalok, luaspermukaanBalok, volumeBalok;
    
    public Balok(){
        
    }
    
    public Balok(double tinggiBalok, double panjangPersegiPanjang, double lebarPersegiPanjang) {
        super(panjangPersegiPanjang, lebarPersegiPanjang);
        this.tinggiBalok = tinggiBalok;
    }

    public double getTinggiBalok() {
        return tinggiBalok;
    }

    public void setTinggiBalok(double tinggiBalok) {
        this.tinggiBalok = tinggiBalok;
    }

    public double getLuaspermukaanBalok() {
        return luaspermukaanBalok;
    }

    public double getVolumeBalok() {
        return volumeBalok;
    }
    
    @Override
    public void luaspermukaan() {
        this.luaspermukaanBalok = 2 * ((this.panjangPersegiPanjang * this.lebarPersegiPanjang) + (this.panjangPersegiPanjang * this.tinggiBalok) + (this.lebarPersegiPanjang * this.tinggiBalok));
    }

    @Override
    public void volume() {
        this.volumeBalok = this.panjangPersegiPanjang * this.lebarPersegiPanjang * this.tinggiBalok;
    }
    
    public void setAll(double panjangPersegiPanjang, double lebarPersegiPanjang, double tinggiBalok){
        this.setPanjangPersegiPanjang(panjangPersegiPanjang);
        this.setLebarPersegiPanjang(lebarPersegiPanjang);
        this.setTinggiBalok(tinggiBalok);
        
        this.keliling();
        this.luas();
        this.luaspermukaan();
        this.volume();
    }
}
