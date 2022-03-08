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
public class Tabung extends Lingkaran implements MenghitungRuang{
    protected double tinggiTabung, luaspermukaanTabung, volumeTabung;
    
    public Tabung(){
        
    }

    public Tabung(double tinggiTabung, double jariLingkaran) {
        super(jariLingkaran);
        this.tinggiTabung = tinggiTabung;
    }

    public double getLuaspermukaanTabung() {
        return luaspermukaanTabung;
    }

    public double getVolumeTabung() {
        return volumeTabung;
    }

    public void setTinggiTabung(double tinggiTabung) {
        this.tinggiTabung = tinggiTabung;
    }
    
    @Override
    public void luaspermukaan() {
        this.luaspermukaanTabung = this.kelilingLingkaran * this.tinggiTabung + 2 * (this.getLuasLingkaran());
    }

    @Override
    public void volume() {
        this.volumeTabung = this.luasLingkaran * this.tinggiTabung;
    }
    
    public void setAll(double jariLingkaran, double tinggiTabung){
        this.setJariLingkaran(jariLingkaran);
        this.setTinggiTabung(tinggiTabung);
        
        this.keliling();
        this.luas();
        this.luaspermukaan();
        this.volume();
    }
}
