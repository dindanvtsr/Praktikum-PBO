/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilih, pil, pilsatu;
        int nik, tulis, coding, wawancara, tulisW, codingW, wawancaraW;
        String nama;
        Scanner input = new Scanner(System.in);
        
        System.out.println("FORM PERNDAFTARAN PT.UDIN");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih Jenis Form : ");
        pilih = input.nextInt();
        
        switch(pilih) {
            case 1 :
                System.out.println("\nFORM PENDAFTARAN");
                System.out.println("----------------");
                System.out.print("Input NIK : "); nik = input.nextInt();
                System.out.print("Input Nama : "); nama = input.next();
                System.out.print("Input Nilai Tes Tulis : "); tulis = input.nextInt();
                System.out.print("Input Nilai Tes Coding : "); coding = input.nextInt();
                System.out.print("Input Nilai Tes Wawancara : "); wawancara = input.nextInt();
                System.out.println("\nMenu");
                System.out.println("1. Edit");
                System.out.println("2. Tampil");
                System.out.println("3. Exit");
                System.out.print("Pilih : ");
                pil = input.nextInt();
                if(pil == 2) {
                    PerhitunganAndro pht = new PerhitunganAndro(tulis,coding,wawancara);
                    System.out.println("Nilai Akhir : " + pht.totalAndroid);
                    if(pht.totalAndroid >= 85) {
                        System.out.println("KETERANGAN : LULUS");
                        System.out.println("Selamat kepada " + nama + " telah diterima sebagai Android");
                    } else {
                        System.out.println("KETERANGAN : GAGAL");
                        System.out.println("Mohon maaf kepada " + nama + " telah ditolak sebagai Android");
                    }
                }
            break;
            case 2 :
                System.out.println("\nFORM PENDAFTARAN");
                System.out.println("----------------");
                System.out.print("Input NIK : "); nik = input.nextInt();
                System.out.print("Input Nama : "); nama = input.next();
                System.out.print("Input Nilai Tes Tulis : "); tulisW = input.nextInt();
                System.out.print("Input Nilai Tes Coding : "); codingW = input.nextInt();
                System.out.print("Input Nilai Tes Wawancara : "); wawancaraW = input.nextInt();
                System.out.println("\nMenu");
                System.out.println("1. Edit");
                System.out.println("2. Tampil");
                System.out.println("3. Exit");
                System.out.print("Pilih : ");
                pilsatu = input.nextInt();
                if(pilsatu == 2) {
                    PerhitunganWeb pht = new PerhitunganWeb(tulisW,codingW,wawancaraW);
                    System.out.println("Nilai Akhir : " + pht.totalWeb);
                    if(pht.totalWeb >= 85) {
                        System.out.println("KETERANGAN : LULUS");
                        System.out.println("Selamat kepada " + nama + " telah diterima sebagai Web");
                    } else {
                        System.out.println("KETERANGAN : GAGAL");
                        System.out.println("Mohon maaf kepada " + nama + " telah ditolak sebagai Web");
                    }
                }
                break;
            default :
                System.out.println("Pilihan tidak tersedia!");
        }
    }
}
