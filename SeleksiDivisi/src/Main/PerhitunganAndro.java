/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Divisi.Andro;

/**
 *
 * @author Lenovo
 */
public class PerhitunganAndro implements Andro{
    String nama;
    int tulis, coding, wawancara;
    int menulis, mengkoding, mengwawancara;
    double totalAndroid;
    
    public PerhitunganAndro(String nama) {
        this.nama = nama;
    }
    
    public PerhitunganAndro(int tulis, int coding, int wawancara){
        this.tulis = tulis;
        this.coding = coding;
        this.wawancara = wawancara;
    }
    
    @Override
    public double menulis() {
        menulis = (20/100)*tulis;
        return menulis;
    }
    
    @Override
    public double mengkoding() {
        mengkoding = (50/100)*coding;
        return mengkoding;
    } 
    
    public double mengwawancara() {
        mengwawancara = (30/100)*wawancara;
        return mengwawancara;
    }
    
    @Override
    public void totalAndroid() {
        totalAndroid = menulis+mengkoding+mengwawancara;
    }
}
