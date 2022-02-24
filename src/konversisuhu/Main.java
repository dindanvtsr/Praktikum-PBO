/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversisuhu;

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
        double celcius, fahrenheit, reamur, kelvin;
        int pilih;
        boolean pilihan = true;
        Scanner input = new Scanner(System.in); //buat input
        
        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+---------------------------+");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu Dalam Celcius : ");
        celcius = input.nextDouble();
        Konversi kvs = new Konversi(celcius); //instansiasi
        
        do{
            System.out.println("\nOpsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih   : ");
            pilih = input.nextInt();
            
            switch(pilih){
                case 1 :
                    kvs.sudahKonversi();
                    break;
                case 2 :
                    System.out.println("\nInput Data");
                    System.out.println("----------");
                    System.out.print("Suhu Dalam Celcius : ");
                    kvs.celcius = input.nextDouble();
                    break;
                case 3 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar.");
                }
        }while(pilihan = true);
    }
}
