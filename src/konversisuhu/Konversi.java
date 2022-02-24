/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversisuhu;

/**
 *
 * @author Lenovo
 */
public class Konversi {
    double celcius;
    //constructor
    public Konversi(double celcius){
        this.celcius = celcius;
    }
    
    void sudahKonversi(){
        System.out.println("\nSuhu Dalam Celcius    : " + celcius + "°C");
        System.out.println("Dalam Fahreinheit     : " + hitungFahrenheit() + "°F");
        System.out.println("Dalam Reamur          : " + hitungReamur() + "°R");
        System.out.println("Dalam Kelvin          : " + hitungKelvin() + "K");
        
        if(celcius <= 0){
            System.out.println("Kondisi air beku");
        }else if(celcius > 0 && celcius < 100){
            System.out.println("Kondisi air normal");
        }else if(celcius >= 100){
            System.out.println("Kondisi air mendidih");
        }
    }
    
    //method
    double hitungFahrenheit(){
        return ((9 * celcius)/ 5) + 32;
    }
    
    double hitungKelvin(){
        return celcius + 273.15;
    }
    
    double hitungReamur(){
        return (4 * celcius) / 5;
    }
}
