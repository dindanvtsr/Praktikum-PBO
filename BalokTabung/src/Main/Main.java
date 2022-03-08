/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Bangun.Balok;
import Bangun.Tabung;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {
    static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Balok blk = new Balok();
        Tabung tbg = new Tabung();
        
        int ulang = 1;
        
        do{
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Balok\n2. Hitung Tabung\n0. Exit");
            System.out.print("Pilih : ");
            int pilih = input.nextInt();
            
            switch(pilih){
                case 0 :
                    System.exit(0);
                    break;
                    
                case 1 :
                    System.out.print("Input Panjang : ");
                    double panjangPersegiPanjang = input.nextDouble();
                    System.out.print("Input Lebar : ");
                    double lebarPersegiPanjang = input.nextDouble();
                    System.out.print("Input Tinggi : ");
                    double tinggiBalok = input.nextDouble();
                    
                    blk.setAll(panjangPersegiPanjang, lebarPersegiPanjang, tinggiBalok);
                    
                    System.out.println("Luas Persegi Panjang : " + blk.getLuasPersegiPanjang());
                    System.out.println("Keliling Persegi Panjang : " + blk.getKelilingPersegiPanjang());
                    System.out.println("Volume Balok : " + blk.getVolumeBalok());
                    System.out.println("Luas Permukaan Balok : " + blk.getLuaspermukaanBalok());
                    
                    ulang = pilihan();
                    break;
                    
                case 2 :
                    System.out.print("Input Tinggi : ");
                    double tinggiTabung = input.nextDouble();
                    System.out.print("Input Jari-jari : ");
                    double jariLingkaran = input.nextDouble();
                    
                    tbg.setAll(jariLingkaran, tinggiTabung);
                    
                    System.out.println("Luas Lingkaran : " + tbg.getLuasLingkaran());
                    System.out.println("Keliling Lingkaran : " + tbg.getKelilingLingkaran());
                    System.out.println("Volume Tabung : " + tbg.getVolumeTabung());
                    System.out.println("Luas Permukaan Tabung : " + tbg.getLuaspermukaanTabung());
                    
                    ulang = pilihan();
                    break;
                default :
                    System.out.println("Menu yang Anda Masukkan Tidak Tersedia");
                    break;
            }
        }while(ulang == 1);
    }
    
    public static int pilihan(){
        System.out.print("Ulangi? (Ya: 1 || Tidak: 0)");
        return input.nextInt();
    }
}
