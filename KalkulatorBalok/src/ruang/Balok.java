/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang;

import bidang.Persegi;

/**
 *
 * @author Lenovo
 */
public class Balok extends Persegi implements MenghitungRuang {
    private double height;
    
    public Balok(double height, double length, double width) {
        super(length, width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double volume() {
        return area() * height;
    }

    @Override
    public double surfaceArea() {
        return (area()+(getLength()*height+getWidth()*height))*2;
    }
}
