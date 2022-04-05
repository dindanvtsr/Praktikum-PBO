/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Divisi.Web;

/**
 *
 * @author Lenovo
 */
public class PerhitunganWeb implements Web{
    String nama;
    int tulisW, codingW, wawancaraW;
    int menulisW, mengkodingW, mengwawancaraW;
    double totalWeb;
    
    public PerhitunganWeb(String nama) {
        this.nama = nama;
    }
    
    public PerhitunganWeb(int tulisW, int codingW, int wawancaraW){
        this.tulisW = tulisW;
        this.codingW = codingW;
        this.wawancaraW = wawancaraW;
    }
    
    @Override
    public double menulisW() {
        menulisW = (20/100)*tulisW;
        return menulisW;
    }
    
    @Override
    public double mengkodingW() {
        mengkodingW = (50/100)*codingW;
        return mengkodingW;
    } 
    
    
    public double mengwawancaraW() {
        mengwawancaraW = (30/100)*wawancaraW;
        return mengwawancaraW;
    }
    
    @Override
    public void totalWeb() {
        totalWeb = menulisW+mengkodingW+mengwawancaraW;
    }
}
